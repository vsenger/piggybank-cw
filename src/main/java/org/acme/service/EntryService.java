package org.acme.service;

import org.acme.model.Entry;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import io.quarkus.logging.Log;
@ApplicationScoped
public class EntryService extends AbstractService {

    @Inject
    DynamoDbClient dynamoDB;

    public List<Entry> findAll() {
        //TODO: implement
        return null;

    }
    public List <Entry> findByCategory(String category) {
        //TODO: implement
        return null;

    }
    public List<Entry> replaceCategory(String oldCategory, String newCategory) {
        //TODO: implement
        return null;

    }
    public List <Entry> findByAccountIDAndCategory(String accountID, String category) {
        //TODO: implement
        return null;

    }
    public List <Entry> findByAccountID(String accountID) {
        //TODO: implement
        return null;

    }
    public List <Entry> findByAccountIDAndDates(String accountID, Long init, Long end) {
        //TODO: implement
        return null;

    }
    public Entry findByTimestamp(Long timestamp) {
        //TODO: implement
        return null;
   }

    public void addEntry(Entry entry) {
        //TODO: implement
    }
    
}

