package com.rainand.util.page;

import java.util.ArrayList;
import java.util.List;

public class SimplePageNavigation implements PageNavigation {
	private int PageSize = 10;
	

	@Override
	public void setPageSize(int pageSize) {
		this.PageSize= pageSize;
	}

	@Override
	public List<String> getNavigation(int pageSize, int grandTotal) {
		this.setPageSize(pageSize);
		
		int totalPage = grandTotal / PageSize;
		if(grandTotal % PageSize != 0 || totalPage < 1) totalPage++;  //나머지 페이지
		
		List<String> list = new ArrayList<String>();
		
		for(int i=1;i<=totalPage;i++){
			list.add(String.valueOf(i));
		}
		
		return list;
	}

	@Override
	public void getCurrentPage(int currentPage, int grandTotal) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public int getCurrentPageStartNum(int currentPage, int grandTotal) {
		// TODO Auto-generated method stub
		int i=1;
		
		int totalPage = grandTotal / PageSize;
		if(grandTotal % PageSize != 0 || totalPage < 1) totalPage++;  //나머지 페이지
		
		if(totalPage >= currentPage && currentPage > 1){
			i = (currentPage - 1) * PageSize;
			i++;
		}else{
			i = -1;
		}
		
		return i;
	}

	@Override
	public int getCurrentPagePageLastNum(int currentPage, int grandTotal) {
		// TODO Auto-generated method stub
		int i=1;
		
		int totalPage = grandTotal / PageSize;
		if(grandTotal % PageSize != 0 || totalPage < 1) totalPage++;  //나머지 페이지
		
		if(totalPage > currentPage && currentPage > 1){
			i = currentPage * PageSize;
		}else{
			i = grandTotal;
		}
		
		return i;
	}
	
	

}
