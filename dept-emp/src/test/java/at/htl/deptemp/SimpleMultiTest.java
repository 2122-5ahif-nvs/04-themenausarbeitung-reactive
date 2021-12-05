package at.htl.deptemp;

import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.helpers.test.AssertSubscriber;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class SimpleMultiTest {

    @Test
    public void testMulti() {
        Multi<Integer> multi = Multi.createFrom().range(1, 5)
                .onItem().transform(n -> n * 10);

        AssertSubscriber<Integer> subscriber = multi.subscribe().withSubscriber(AssertSubscriber.create(10));

        subscriber.assertCompleted()
                .assertItems(10, 20, 30, 40);
    }
}
