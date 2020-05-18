package com.go2it.education.entity.dto;

public class Result {
    private String name;
    private Double sum;
    private Long count;
    public Result(){ }
    public Result(String name, Double sum, Long count){
        this.name = name;
        this.sum = sum;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
