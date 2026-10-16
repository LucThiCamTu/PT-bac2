package com.codegym;

public class QuadraticResult {
    public enum Status {
        NO_SOLUTION,
        INFINITE_SOLUTIONS,
        ONE_SOLUTION,
        TWO_SOLUTIONS
    }

    private Status status;
    private Double x1;
    private Double x2;

    public QuadraticResult(Status status) {
        this.status = status;
    }

    public QuadraticResult(Status status, double x1) {
        this.status = status;
        this.x1 = x1;
    }

    public QuadraticResult(Status status, double x1, double x2) {
        this.status = status;
        this.x1 = x1;
        this.x2 = x2;
    }

    public Status getStatus() { return status; }
    public Double getX1() { return x1; }
    public Double getX2() { return x2; }

    @Override
    public String toString() {
        switch (status) {
            case NO_SOLUTION:
                return "Phương trình vô nghiệm.";
            case INFINITE_SOLUTIONS:
                return "Phương trình có vô số nghiệm.";
            case ONE_SOLUTION:
                return "Phương trình có 1 nghiệm: x = " + x1;
            case TWO_SOLUTIONS:
                return "Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
            default:
                return "";
        }
    }
}
