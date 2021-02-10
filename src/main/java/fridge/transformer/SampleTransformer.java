package fridge.transformer;

import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Transform message, counter to String.
 */
public class SampleTransformer implements Transformer {

    /**
     * Transform payload and return it with greeting.
     *
     * @param message object before transform.
     * @return transformed message.
     */
    @Override
    public Message<?> transform(Message<?> message) {
        return MessageBuilder.withPayload("Hello world![" + message.getPayload() + "]")
                .copyHeaders(message.getHeaders())
                .build();
    }
}
