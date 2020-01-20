package id.co.ricky.template.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Ricky (rickyanwart@gmail.com)
 * @created 1/20/2020 6:55 PM
 */
@Service
@Slf4j
public class ActiveMQService {

    @Value("${queueName}")
    private String queueName;

    @Autowired
    private JmsTemplate jmsTemplate;

    private void send() {
        try {
            jmsTemplate.convertAndSend(queueName,"");
        }catch (Exception e){
            log.error("Error sending Request via JMS /n"+ e);
        }
    }
}
