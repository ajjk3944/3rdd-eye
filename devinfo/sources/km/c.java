package km;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends a {
    @Override // km.a
    public final List a(Executor executor) {
        return Arrays.asList(new k(), new q(executor));
    }

    @Override // km.a
    public final List b() {
        return Collections.singletonList(new b(1));
    }
}
