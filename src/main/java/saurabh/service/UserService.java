package saurabh.service;

import lombok.extern.slf4j.Slf4j;
import saurabh.entity.JournalEntry;
import saurabh.entity.User;
import saurabh.repository.JournalEntryRepository;
import saurabh.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    private static final PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();


    public void saveUser(User user){

        userRepository.save(user);
    }

    public void saveNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));
        userRepository.save(user);
    }
    public void saveAdmin(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER","ADMIN"));
        userRepository.save(user);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }
    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    @Transactional
    public void deleteByUsername (String username){
        try{
            User user=findByUserName(username);
            List<JournalEntry> journalEntryList=user.getJournalEntries();
            for (JournalEntry entry : journalEntryList) {
                journalEntryRepository.deleteById(entry.getId());
            }
            userRepository.deleteByUserName(username);
        } catch(Exception e){
            log.error("Error occured  :",e);
        }
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
