package maktab74.security;

import maktab74.base.domain.BaseEntity;
import maktab74.domain.User;

public class UserSecurity extends BaseEntity<Long> {
    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void logout() {
        this.currentUser = null;
    }
}
