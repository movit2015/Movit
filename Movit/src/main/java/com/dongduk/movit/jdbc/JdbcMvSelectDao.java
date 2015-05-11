package com.dongduk.movit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.dongduk.movit.dao.MvSelectDao;
import com.dongduk.movit.domain.Member;
import com.dongduk.movit.domain.StorageMv;
import com.dongduk.movit.domain.TasteGenre;
import com.dongduk.movit.domain.WishMv;


public class JdbcMvSelectDao implements MvSelectDao{
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	static final String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	static final String jdbc_url="jdbc:oracle:thin:@202.20.119.117:1521:orcl";
	static final String INSERT_SQL = 
			"insert into StorageMv (s_storageIdx, memberIdx, s_title, s_director, s_img, s_nation, s_time, s_rating, s_pubYear, s_actor, s_genre) values (1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	// getConnection 메서드 1개를 옮겨 옵니다.
		void connect() {
			try {
				System.out.println("여기까지오긴오냐");
				Class.forName(jdbc_driver);
				conn =	DriverManager.getConnection(jdbc_url, "movie", "movie");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

//		public static void disconnect(Connection conn, PreparedStatement pstmt,
//				ResultSet rs) {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			close(conn, pstmt);
//		}

		void disconnect(Connection conn, PreparedStatement pstmt) {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	
	
	
	public void insertStorage(StorageMv s_mv) {
		System.out.println("JdbcMvSelectDao");
		connect();
		System.out.println("connec성공");
		try {
			pstmt = conn.prepareStatement(INSERT_SQL);
			System.out.println(pstmt); 
			
			pstmt.setInt(1, s_mv.getMemberIdx());
			pstmt.setString(2, s_mv.getS_title());
			pstmt.setString(3, s_mv.getS_director());
			pstmt.setString(4, s_mv.getS_img());
			pstmt.setString(5, s_mv.getS_nation());
			pstmt.setString(6, s_mv.getS_time());
			pstmt.setString(7, s_mv.getS_rating());
			pstmt.setString(8, s_mv.getS_pubYear());
			pstmt.setString(9, s_mv.getS_actor());
			pstmt.setString(10, s_mv.getS_genre());
			
			pstmt.executeUpdate();	
			System.out.println("insertStorage 성공");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		finally {
			disconnect(conn, pstmt);
		}
	
	}

	public void updateUser(Member mem) {
		
	}
	
	public void insertWish(WishMv w_mv) {
		
	}

	public void updateTasteGenre(TasteGenre t_genre) {
		
	}

	public WishMv getWish(int memberIdx) {
		return null;
	}

	public List<StorageMv> getStorageList(int memberIdx) {
		return null;
	}

}
