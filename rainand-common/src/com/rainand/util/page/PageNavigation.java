package com.rainand.util.page;

import java.util.List;

/**
 * <p>페이지 네비게이션</p>
 * 	- 데이타를 일정한 단위로 묶어 페이지를 생성하고, 그 페이지 간의 이동을 할 수 있는 네비게이션 기능을 한다.
 * 
 * @version	1.0.0
 * @since	2012-04-17
 * @author	Daehong, Lim
 */
public interface PageNavigation {
	/**
	 * 페이지 크기를 설정한다	
	 */
	public void setPageSize(int pageSize);
	
	/**
	 * 페이지 네비게이션
	 * @param pageSize (페이지 크기)
	 * @param grandTotal (전체 갯수)
	 * @return
	 */
	public List<String> getNavigation(int pageSize, int grandTotal);
	
	
	/**
	 * 현재 페이지 정보
	 * @param currentPage
	 * @param grandTotal
	 */
	public void getCurrentPage(int currentPage, int grandTotal);
	
	/**
	 * 현재 페이지의 시작 번호를 생성한다
	 * @param curentPage (페이지 번호)
	 * @param grandTotal (전체 갯수)
	 * @return
	 */
	public int getCurrentPageStartNum(int currentPage, int grandTotal);
	
	/**
	 * 현재 페이지의 마지막 번호를 생성한다
	 * @param curentPage (페이지 번호)
	 * @param grandTotal (전체 갯수)
	 * @return
	 */
	public int getCurrentPagePageLastNum(int currentPage, int grandTotal);
}
