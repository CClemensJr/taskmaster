package com.clmen.taskmaster;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.clmen.taskmaster.models.Task;
import com.clmen.taskmaster.repositories.TaskRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TaskmasterApplication.class)
@WebAppConfiguration
@ActiveProfiles("local")
@TestPropertySource(properties = {
        "amazon.dynamodb.endpoint=",
        "amazon.aws.accesskey=${ACCESS_KEY}",
        "amazon.aws.secretkey=${SECRET_KEY}" })
public class TaskmasterApplicationTests {

//    private DynamoDBMapper dynamoDBMapper;
//
//    @Autowired
//    private AmazonDynamoDB amazonDynamoDB;
//
//    @Autowired
//    TaskRepository taskRepository;
//
//    private static final String EXPECTED_TITLE = "Do the Dishes";
//    private static final String EXPECTED_DESCRIPTION = "The dishes have been sitting in the sink for weeks and need to be done stat.";
//
//    @Before
//    public void setup() throws Exception {
//        dynamoDBMapper = new DynamoDBMapper(amazonDynamoDB);
//
//        CreateTableRequest tableRequest = dynamoDBMapper
//                .generateCreateTableRequest(Task.class);
//        tableRequest.setProvisionedThroughput(
//                new ProvisionedThroughput(1L, 1L));
//        amazonDynamoDB.createTable(tableRequest);
//
//
//        dynamoDBMapper.batchDelete(
//                (List<Task>)taskRepository.findAll());
//    }
//
//    @Test
//    public void sampleTestCase() {
//        Task task = new Task(EXPECTED_TITLE, EXPECTED_DESCRIPTION);
//        taskRepository.save(task);
//
//        List<Task> result
//                = (List<Task>) taskRepository.findAll();
//
//        assertTrue("Not empty", result.size() > 0);
//        assertTrue("Contains item with expected cost",
//                result.get(0).getTitle().equals(EXPECTED_TITLE));
//    }
}
