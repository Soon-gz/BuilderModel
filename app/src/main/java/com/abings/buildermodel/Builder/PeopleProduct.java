package com.abings.buildermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/7.
 */
public class PeopleProduct {
    private String name;
    private String sex;
    private String age;
    private String weight;

    @Override
    public String toString() {
        return "PeopleProduct{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
