package com.rainand.util.page;

/**
 * <p>HTMP 페이지 네비게이션</p>
 * 	- 페이지 네비게이션 HTML과 JavaScript를 생성한다.
 *  
 * @version	1.0.0
 * @since	2012-04-17
 * @author	Daehong, Lim
 */
public interface HtmlPageNavigation extends PageNavigation {
	
	/**
	 * 페이지 네비게이션을 위한 HTML을 생성 
	 * @param curentPage (페이지 번호)
	 * @param grandTotal (전체 갯수)
	 * @return
	 */
	public String getPageNavigationForHTML(int curentPage, int grandTotal);
	
	/**
	 * 페이지 이동을 위한 JavaScript 생성
	 * @return
	 */
	public String getPageNavigationForJavaScript();
}
