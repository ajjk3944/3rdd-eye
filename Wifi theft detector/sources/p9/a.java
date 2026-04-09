package p9;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a extends o9.a {
    @Override // kotlin.random.Random
    public int i(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // kotlin.random.Random
    public long k(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // o9.a
    public Random l() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        p.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
