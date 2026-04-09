package gr;

import br.l;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends fr.a {
    @Override // fr.d
    public final int c(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // fr.a
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
