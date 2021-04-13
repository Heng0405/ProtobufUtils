package com.example.dtoutils.kafka.serialization;

import com.example.dtoutils.kafka.KafkaConstants;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;

import java.util.Optional;
import java.util.UUID;

public class HeaderDeSerialization {

    protected UUID parseProcessId(Headers headers) {

        return Optional.ofNullable(headers.lastHeader(KafkaConstants.HEADER_PROCESS_ID))
                       .map(Header::value)
                       .map(String::new)
                       .map(UUID::fromString)
                       .orElse(null);


    }

}
