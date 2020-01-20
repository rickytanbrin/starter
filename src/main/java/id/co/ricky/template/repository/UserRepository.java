package id.co.ricky.template.repository;


import id.co.ricky.template.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
