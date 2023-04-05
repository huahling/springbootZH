package comyz.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

//@Cacheable(true)
@Entity
@Table(name = "gongsi")
public class Gs {


	private int sid;
	private String yuangong;

	private Set<User> users=new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getYuangong() {
		return yuangong;
	}

	public void setYuangong(String yuangong) {
		this.yuangong = yuangong;
	}

	@OneToMany(mappedBy="gs",fetch = FetchType.LAZY) /* ,cascade = CascadeType.REMOVE */
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Gs{" +
				"sid=" + sid +
				", yuangong='" + yuangong + '\'' +
				'}';
	}
}
