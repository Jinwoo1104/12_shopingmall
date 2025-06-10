package shoping.domain;

import java.util.*;
import lombok.*;
import shoping.domain.*;
import shoping.infra.AbstractEvent;

@Data
@ToString
public class ShippingRieturned extends AbstractEvent {

    private Long id;
}
