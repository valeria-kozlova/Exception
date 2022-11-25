class SimpleException extends Exception {

    public SimpleException() {
    }

    public SimpleException(String message) {
        super("Ошибка. Слово из 10 букв.");
    }

}