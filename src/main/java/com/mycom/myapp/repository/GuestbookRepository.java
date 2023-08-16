package com.mycom.myapp.repository;

import com.mycom.myapp.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GuestbookRepository extends JpaRepository<Guestbook, Long> {


}
