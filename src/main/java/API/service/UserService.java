package API.service;

import API.model.User;

public interface UserService {

    public User findById(Long id);

    public User create(User userToCreate);

}
