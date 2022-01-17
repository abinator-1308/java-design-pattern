package com.designPattern.demo.model.structural;

interface Dress {
    public void assemble();
}

class BasicDress implements Dress {
    public BasicDress() {
        super();
    }

    @Override
    public void assemble() {
        System.out.println("BasicDress assemble");
    }
}

class DressDecorator implements Dress {
    protected Dress dress;
    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}

class FancyDress extends DressDecorator {
    public FancyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("FancyDress assemble");
    }
}


class SportyDress extends DressDecorator {
    public SportyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("SportyDress assemble");
    }
}

class NightDress extends DressDecorator {
    public NightDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("NightDress assemble");
    }
}


public class Decorator {
    Dress NightSportyDress = new NightDress(new SportyDress(new BasicDress()));
}
