package id.co.ricky.template.web;


import id.co.ricky.template.domain.User;
import id.co.ricky.template.exception.UserNotFound;
import id.co.ricky.template.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author Ricky (ricky.tirta@cimbniaga.co.id)
 * @created 1/20/2020 2:04 PM
 */

@Controller
@RequestMapping(value = "/api/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ResponseBody
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    //TODO: Add additional service calls here
    // TODO: Some method may be moved to a sevice class


    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User post(@RequestBody(required = false) User user) {
        throw new RuntimeException("Not Implemented");
    }

    @ResponseBody
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User get(@PathVariable("id") Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new UserNotFound());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User put(@PathVariable("id") Integer id, @RequestBody(required = false) User user) {
        throw new RuntimeException("Not Implemented");
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        throw new RuntimeException("Not Implemented");
    }

    private void verifyUsersExists(Integer id) {
        throw new RuntimeException("Not Implemented");
    }

    private void verifyCorrectPayload(User user) {
        throw new RuntimeException("Not Implemented");
    }
}