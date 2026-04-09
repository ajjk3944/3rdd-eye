package rh;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC6492s;
import qh.AbstractC7508a;

/* renamed from: rh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7609a extends AbstractC7508a {
    @Override // qh.AbstractC7508a
    public Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC6492s.h(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
