package TT.language.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import TT.languages.models.Languages;

@Repository
public interface LanguageRepository extends CrudRepository<Languages, Long> {

	public List<Languages> findAll() ;
}
