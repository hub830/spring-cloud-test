package top.lemna.product.base.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import top.lemna.product.base.repository.BaseRepository;
import top.lemna.product.exceptions.RecordNotExistException;


public abstract class BaseService<T> {
	
  @Autowired
  private BaseRepository<T, Long> repository;


  public void delete(Long id) {
    repository.deleteById(id);
  }

  public void delete(T entity) {
    repository.delete(entity);
  }

  public void delete(Iterable<? extends T> entities) {
    repository.deleteAll(entities);
  }

  public void exists(Long id) {
    repository.existsById(id);
  }

  public Iterable<T> findAll() {
    return repository.findAll();
  }

  public T findById(Long id) {
    Optional<T> t = repository.findById(id);
    return t.orElseThrow(() -> new RecordNotExistException(id));
  }

  @Transactional
  public T save(T entity) {
    return repository.save(entity);
  }

}
