public class AdminUser extends User implements Viewable, Editable, AdminWorks{
    public AdminUser(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void viewData() {

    }

    @Override
    public void editData(String data) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void modifySettings(String setting) {

    }
}
