package jg;

import gg.i;
import gg.y;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import mg.AbstractC6823b;
import qg.c0;

/* renamed from: jg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6327a extends i {
    public abstract void h2(InterfaceC6469f interfaceC6469f);

    public i i2() {
        return Eg.a.o(new c0(this));
    }

    public final i j2(int i10, long j10, TimeUnit timeUnit, y yVar) {
        AbstractC6823b.b(i10, "subscriberCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new c0(this, i10, j10, timeUnit, yVar));
    }

    public final i k2(long j10, TimeUnit timeUnit) {
        return j2(1, j10, timeUnit, Gg.a.a());
    }

    public abstract void l2();
}
