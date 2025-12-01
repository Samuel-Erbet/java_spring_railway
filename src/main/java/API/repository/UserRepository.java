package API.repository;

import API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// repositorio para o banco de dados

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
