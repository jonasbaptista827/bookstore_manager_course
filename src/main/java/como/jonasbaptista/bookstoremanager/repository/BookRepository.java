package como.jonasbaptista.bookstoremanager.repository;

import como.jonasbaptista.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
