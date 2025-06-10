package shoping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shoping.domain.*;
import shoping.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ShippingRieturned extends AbstractEvent {

    private Long id;

    public ShippingRieturned(Delivery aggregate) {
        super(aggregate);
    }

    public ShippingRieturned() {
        super();
    }
}
//>>> DDD / Domain Event
