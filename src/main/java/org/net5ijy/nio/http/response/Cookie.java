package org.net5ijy.nio.http.response;

public class Cookie {

	private String name;
	private String value;
	private long age;
	private String path = "/";
	private String domain;

	public Cookie() {
		super();
	}

	public Cookie(String name, String value, long age) {
		super();
		this.name = name;
		this.value = value;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Cookie [name=" + name + ", value=" + value + ", age=" + age
				+ ", path=" + path + ", domain=" + domain + "]";
	}
}
