package API.service.impl;

import API.model.User;
import API.repository.UserRepository;
import API.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class UserServiceImpl implements UserService {

    //implementando o repositorio
    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //metodo que busca por id

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    //metodo que cria um usuario na aplicação

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){

            throw new IllegalArgumentException("This account number already exists.");

        }
        return userRepository.save(userToCreate);
    }
}
