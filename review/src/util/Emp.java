package util;

import lombok.Data;

@Data
public class Emp {
		int id;
		String name;
		String dept;
		
			// TODO Auto-generated constructor stub
		
		public Emp() {
			// TODO Auto-generated constructor stub
		}
		public Emp(int id, String name, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		
		
}
