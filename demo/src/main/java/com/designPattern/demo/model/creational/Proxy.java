package com.designPattern.demo.model.creational;

interface DbOperations {
    void runQuery(String query) throws Exception;
}

class ActualQueryOperation implements DbOperations {
    @Override
    public void runQuery(String query) {
        System.out.println("Running query: " + query);
    }
}

class DbOperationsProxy implements DbOperations {
    boolean isAdmin;
    ActualQueryOperation actualQueryOperation;

    public DbOperationsProxy(String username, String password) {
        this.isAdmin = username.equals("admin") && password.equals("admin");
        this.actualQueryOperation = new ActualQueryOperation();
    }

    @Override
    public void runQuery(String query) throws Exception {
        if(isAdmin) {
            actualQueryOperation.runQuery(query);
        } else {
            if(query.contains("delete")) {
                throw new Exception("delete not allowed for non-admin user");
            } else {
                actualQueryOperation.runQuery(query);
            }
        }
    }
}


public class Proxy {
}
