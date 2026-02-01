package pandey.saurabh.journalApp.repository;

import pandey.saurabh.journalApp.entity.ConfigJournalAppEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity,ObjectId> {


}
//controller----> service---->repository
//bean call repo repo call mongo
