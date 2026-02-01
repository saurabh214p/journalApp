package pandey.saurabh.journalApp.repository;

import pandey.saurabh.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry,ObjectId> {


}
//controller----> service---->repository
