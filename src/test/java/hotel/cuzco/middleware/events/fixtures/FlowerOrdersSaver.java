package hotel.cuzco.middleware.events.fixtures;

import common.ddd.patterns.EventHandler;

public class FlowerOrdersSaver implements EventHandler<FlowersDeliveryOrdered> {
    private final FlowerOrdersRepository flowerOrdersRepository;

    public FlowerOrdersSaver(FlowerOrdersRepository flowerOrdersRepository) {
        this.flowerOrdersRepository = flowerOrdersRepository;
    }

    @Override
    public void handle(FlowersDeliveryOrdered event) {
        this.flowerOrdersRepository.save(event);
    }

    @Override
    public Class listenTo() {
        return FlowersDeliveryOrdered.class;
    }

}
