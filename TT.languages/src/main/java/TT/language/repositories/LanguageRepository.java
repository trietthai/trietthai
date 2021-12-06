package TT.language.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import TT.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

	public List<Language> findAll() ;
}
