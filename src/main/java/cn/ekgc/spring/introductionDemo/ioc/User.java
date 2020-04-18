package cn.ekgc.spring.introductionDemo.ioc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class User {
	private Long userId;
	private List<String> cityList;
	private Map<String, String> countryMap;
	// spring 中的属性实质是是一对 getter 、setter 方法，
	// 而不是上面的 private Long userId ;

	public void cityList(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void show() {
		System.out.println("userId :" + userId);
		System.out.println("cityList :" + cityList);
		// 循环map 集合
		Iterator iterator = countryMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			String keyString = entry.getKey();
			String valueString = entry.getValue();
			System.out.println("keyString  :" + keyString +"  "+"valueString :"+   valueString);
		}

	}

	public List<String> getCityList() {
		return cityList;
	}

	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}

	public Map<String, String> getCountryMap() {
		return countryMap;
	}
}
