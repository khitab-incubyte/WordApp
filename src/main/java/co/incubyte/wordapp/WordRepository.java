package co.incubyte.wordapp;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface WordRepository extends CrudRepository<Word, Long> {
    Iterable<Word> findAllOrderById();
}
