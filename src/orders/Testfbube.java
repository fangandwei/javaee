package orders;

import java.io.IOException;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import crudutil.Util;

public class Testfbube {
	@Test
	public void testorder() throws IOException{
//		��һ��   �����ֶκ�ʵ�����Ա������һ��
	         SqlSessionFactory factory=  	Util.getSession();
	           SqlSession session=       factory.openSession(true);
		     String state="orders"+".selectOrder";
		   Orders   order=  session.selectOne(state,1);
		    System.out.println(order);
	}
}
