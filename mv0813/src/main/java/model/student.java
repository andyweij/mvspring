package model;

public class student {
private int age;
private String name;
public student() {
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "student [age=" + age + ", name=" + name + "]";
}

}
