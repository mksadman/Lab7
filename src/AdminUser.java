public class AdminUser extends User implements AdminWorks{
    public AdminUser(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void viewData() {

    }

    @Override
    public void editUserData(String data) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUserPrivileges(String userID, String privilege) {
    }

    @Override
    public void modifySettings(String setting) {

    }

    @Override
    public void performActions(String action) {

    }
}
