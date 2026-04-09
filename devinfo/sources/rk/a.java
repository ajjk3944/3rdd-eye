package rk;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends qk.a {
    @Override // qk.d
    public final int b() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }

    @Override // qk.a
    public final Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        k.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
