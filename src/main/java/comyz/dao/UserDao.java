package comyz.dao;

import comyz.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDao{

	@Autowired
	private UserImpl userimpl;

	public List<User> userquery(int pageno, int pagesize){

		int start=(pageno)*pagesize;

		List<User> userqu=userimpl.userquery(start,pagesize);

		for (User user : userqu) {
			System.out.println("userquery---------"+user.toString());
		}

		return  userqu;

	}



	public int counts(int pagesize) {

		Object a=userimpl.counts(pagesize);
		System.out.println(a);
//		Object a= session.createQuery(sql).uniqueResult();
		int c  = Integer.parseInt(a.toString());
//
//		int cc=0;
//		if( c % pagesize ==0) {
//
//			 cc=(int) (c/pagesize);
//		}else {
//
//			 cc=(int) (c/pagesize);
////			 System.out.println(cc);
//			cc++;
//		}
//
//		int a1=(int) Math.ceil(cc);

		return c;
	}


	public int count(int pagesize,int pageno) {

		Object a=	userimpl.count(pagesize,pageno);
//
//		session=getSession();
//		String sql="select count(*) from User";
//
//
//		Object a= session.createQuery(sql).uniqueResult();
		int c  = Integer.parseInt(a.toString());
//
		if( c % pagesize ==0) {
			pageno--;
		}

		return pageno;
	}



	public void userdelete(int id){
		userimpl.userdelete(id);
	}

	public void userupdate(User user) {

		userimpl.userupdate(user);

	}

	public void addlist(List<User> user) {

		for (User user1 : user) {
			userimpl.userinsert(user1);
		}

//	 	 String sql="insert into us(name,addr,sex,password,gs_id,birth,hand) value(?,?,?,?,?,?,?)";
	}




	public void userinsert(User user) {

		userimpl.userinsert(user);

	}


	public User queryid(int id) {

		User user= userimpl.queryid(id);

		return user;


	}

	public List<User> queryUser() {

		List<User> user= userimpl.queryUser();

		System.out.println("queryuser---------"+user.toString());
		return user;


	}
	//
//
//
//
	public List<User> querygs_id() {
//		session=getSession();
//		String jpql = "select gs_id from User";
//		Query query= session.createQuery(jpql);
//
//		return query.list();
//
		return null;
	}

	public List<User> ss(int pageno,int pagesize){
//
//			session=getSession();
//			String jpql = "from User";
//
//			int start= (pageno)*pagesize;
//			Query query= session.createQuery(jpql).setFirstResult(start).setMaxResults(pagesize);
//
//			return query.list();
//
		return null;
	}



}
