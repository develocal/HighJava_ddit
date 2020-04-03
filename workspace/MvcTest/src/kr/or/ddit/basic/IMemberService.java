package kr.or.ddit.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.or.ddit.util.DBUtil;

/**
 * Service객체는 DAO에 설정된 메서드를 원하는 작업에 맞게 호출하여 결과를 받아오고, 
 * 받아온 자료를 Controller에게 보내주는 역할을 수행한다.
 * 보통 DAO 의 메서드와 같은 구조를 갖는다.
 * 
 * @author PC-16
 *
 */
public interface IMemberService {

/**
 * 실제 DB와 연결해서 SQL문을 수행하여 결과를 작성하여 service에 전달하는 DAO의 interface
 * @author PC-16
 *
 */

	/**
	 * MemberVO에 담겨진 자료를 DB에 insert하는 메서드
	 * 
	 * @param mv DB에 insert할 자료가 저장된 MemberVO객체
	 * @return DB작업이 성공하면 1이상의 값이 반환되고 실패하면 0이 반환된다.
	 */
	public int insertMember(MemberVO mv);
	
	/**
	 * 주어진 회원 ID가 존재하는지 여부를 알아내는 메서드
	 * @param memId 검색할 회원ID
	 * @return 해당회원 ID가 있으면 true, 없으면 false.
	 */
	public boolean getMember(String memId);
	
	/**
	 * DB의 mymember테이블의 전체 레코드를 가져와서 List에 담아서 반환하는 메서드
	 * @return MemberVO객체를 담고있는 List객체
	 */
	public List<MemberVO> getAllMemberList();
	/**
	 * 하나의 MemberVO자료를 이용하여 DB를 update하는 메서드
	 * @param mv update할 회원정보가 들어있는 MemberVO객체
	 * @return 작업 성공 : 1, 작업 실패 : 0
	 */
	public int updateMember(MemberVO mv);
	
	
	/**
	 * 회원 ID를 매개변수로 받아서 그 회원 정보를 삭제하는 메서드
	 * @param memId 삭제할 회원 ID 
	 * @return 작업성공 : 1, 작업 실패 : 0.
	 */
	public int deleteMember(String memId);
	
	/**
	 * MemberVO에 담긴 자료를 이용하여 회원을 검색하는 메서드
	 * 
	 * @param mv 검색할 자료가 들어있는 MemberVO객체
	 * @return 검생된 결과를 담은 List객체
	 */
	public List<MemberVO> getSearchMember(MemberVO mv);
	//메서드시그니쳐를 정의했습니다. 시그니처가 뭠까
}
