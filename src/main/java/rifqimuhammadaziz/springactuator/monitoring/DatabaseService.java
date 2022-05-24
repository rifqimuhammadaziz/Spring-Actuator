package rifqimuhammadaziz.springactuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        if (isDatabaseHealthGood()) {
            return Health.up()
                    .withDetail("DatabaseService", "Service is running")
                    .build();
        }
        return Health.down()
                .withDetail("DatabaseService", "Service is not available")
                .build();
    }

    public boolean isDatabaseHealthGood() {
        // TODO Logic for checking database health
        return true;
    }
}
