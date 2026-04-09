package u9;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.l;
import t9.AbstractC5614a;

/* compiled from: PlatformThreadLocalRandom.kt */
/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5639a extends AbstractC5614a {
    @Override // t9.c
    public final int c(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // t9.AbstractC5614a
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
