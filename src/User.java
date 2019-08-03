class User {
    private String userName;
    private String password;

    User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    String getPassword() {
        return password;
    }

    String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
