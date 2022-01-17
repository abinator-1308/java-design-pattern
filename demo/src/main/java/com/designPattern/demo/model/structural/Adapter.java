package com.designPattern.demo.model.structural;

interface Browser {
    public void getUserData();
    public void setCookies();
}

class ChromeBrowser implements Browser {
    @Override
    public void getUserData() {
        System.out.println("Chrome get user data");
    }

    @Override
    public void setCookies() {
        System.out.println("Chrome set cookies");
    }
}

class InternetExplorer {
    public void getCustomerData() {
        System.out.println("IE get user data");
    }

    public void addCookies() {
        System.out.println("IE set cookies");
    }
}

public class Adapter implements Browser {
    InternetExplorer internetExplorer;

    public Adapter(InternetExplorer internetExplorer) {
        this.internetExplorer = internetExplorer;
    }

    @Override
    public void getUserData() {
        internetExplorer.getCustomerData();
    }

    @Override
    public void setCookies() {
        internetExplorer.addCookies();
    }

}
