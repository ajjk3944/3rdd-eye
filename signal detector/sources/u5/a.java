package u5;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import q5.i;

/* loaded from: classes3.dex */
public final class a extends t5.a {
    @Override // t5.a
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        i.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
