package id.co.ricky.template.repository;

import id.co.ricky.template.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ricky (rickyanwart@gmail.com)
 * @created 1/20/2020 2:04 PM
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
