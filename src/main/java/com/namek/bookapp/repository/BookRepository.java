package com.namek.bookapp.repository;

import com.namek.bookapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    // Ajouter des methodes si besoin, en respectant la syntaxe JPQL et les conventions de nommage des methodes Spring Data JPA
    // Par defaut, l'interface heritera de toutes les methodes essentielles pour notre tutoriel.
}
