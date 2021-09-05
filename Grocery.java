public abstract class Grocery implements Energy {
    String company;
    String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }


    public String getId(){
        return getId();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Grocery x = (Grocery) obj;
        if (this.name.equals(x.name) && this.company.equals(x.company)) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return name;
    }
}
