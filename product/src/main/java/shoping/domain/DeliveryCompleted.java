package shoping.domain;

import java.util.*;
import lombok.*;
import shoping.domain.*;
import shoping.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
}
