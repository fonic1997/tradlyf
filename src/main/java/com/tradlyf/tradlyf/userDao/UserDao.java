package com.tradlyf.tradlyf.userDao;
import com.tradlyf.tradlyf.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserDao extends JpaRepository<users,Long> {
}
