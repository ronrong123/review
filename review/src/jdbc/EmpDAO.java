package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * VO : value Object(값을 저장하는 객체) == EmpDTO, EmpDO, Emp
 * DAO : Data Access Object
 */
public class EmpDAO {
	Connection conn;
	PreparedStatement psmt;
	
	//전체조회 select * from employees	
	public ArrayList<EmpVO> selectList(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "select EMPLOYEE_ID, "
					+ "FIRST_NAME, "
					+ "LAST_NAME, "
					+ "EMAIL, "
					+ "PHONE_NUMBER, "
					+ "HIRE_DATE, "
					+ "JOB_ID, "
					+ "SALARY, "
					+ "COMMISSION_PCT, "
					+ "MANAGER_ID, "
					+ "DEPARTMENT_ID "
					+ "from employees"
					+ " ORDER BY FIRST_ID";
			psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhone_number(rs.getString("phone_number"));
				vo.setHire_date(rs.getString("hire_date"));
				vo.setJob_id(rs.getString("job_id"));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			JdbcUtil.disconnect(conn);
		}		
		return list;
	}
	
	//단건조회 select * from employees where employee_id =?
	public EmpVO selectOne(String id) {
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "select EMPLOYEE_ID, "
					+ "FIRST_NAME, "
					+ "LAST_NAME, "
					+ "EMAIL, "
					+ "PHONE_NUMBER, "
					+ "HIRE_DATE, "
					+ "JOB_ID, "
					+ "SALARY, "
					+ "COMMISSION_PCT, "
					+ "MANAGER_ID, "
					+ "DEPARTMENT_ID "
					+ "from employees where employee_id =?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhone_number(rs.getString("phone_number"));
				vo.setHire_date(rs.getString("hire_date"));
				vo.setJob_id(rs.getString("job_id"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			JdbcUtil.disconnect(conn);
		}
		return vo;		
	}	
	
	public void insert(EmpVO vo) {
		try {		
		//jdbc처리과정
		// 1. connect(연결)
		JdbcUtil.connect();		
		//2. statement(구문)
		String sql = "INSERT INTO EMPLOYEES(EMPLOYEE_ID, "
						+ "LAST_NAME, "
						+ "EMAIL, "
						+ "HIRE_DATE, "
						+ "JOB_ID) "
					+ "VALUES(?, ?, ?, ?, ?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		//3. execute(실행)
		psmt.setString(1, vo.getEmployee_id());
		psmt.setString(2, vo.getLast_name());
		psmt.setString(3, vo.getEmail());
		psmt.setString(4, vo.getHire_date());
		psmt.setString(5, vo.getJob_id());
		int r = psmt.executeUpdate();
		System.out.println(r + "건이 등록됨");
		//4. resultset(select라면 조회결과처리) 없으면 건너뜀
		}catch(Exception e){
			e.printStackTrace();
		}finally {
		//5. close(연결해제)		
			JdbcUtil.disconnect(conn);
		}
	}
	
	public void update(EmpVO vo) {
		try {		
		//jdbc처리과정
		// 1. connect(연결)
		JdbcUtil.connect();		
		//2. statement(구문)
		
		//3. execute(실행)
		
		//4. resultset(select라면 조회결과처리) 없으면 건너뜀
		}catch(Exception e){
			e.printStackTrace();
		}finally {
		//5. close(연결해제)		
			JdbcUtil.disconnect(conn);
		}
	}
}
