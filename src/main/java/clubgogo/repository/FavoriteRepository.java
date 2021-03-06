package clubgogo.repository;

// import clubgogo.domain.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import clubgogo.domain.Favorite;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface FavoriteRepository extends CrudRepository<Favorite, Integer> {

}