class Exercise extends College {
    void display() {
        System.out.println("Dhaka Bigyan College?");
    }

    public static void main(String[] args) {
        new Exercise().display();
    }

}

class College {
    void display() {
        System.out.println("Dhaka College?");
    }
}