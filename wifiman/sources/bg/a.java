package Bg;

import gg.s;
import gg.y;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;
import mg.AbstractC6823b;
import tg.C8092c;
import tg.U;

/* loaded from: classes4.dex */
public abstract class a extends s {
    public s i1(int i10) {
        return j1(i10, AbstractC6822a.e());
    }

    public s j1(int i10, InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "connection is null");
        if (i10 > 0) {
            return Eg.a.q(new C8092c(this, i10, interfaceC6469f));
        }
        k1(interfaceC6469f);
        return Eg.a.m(this);
    }

    public abstract void k1(InterfaceC6469f interfaceC6469f);

    public s l1() {
        return Eg.a.q(new U(this));
    }

    public final s m1(int i10, long j10, TimeUnit timeUnit, y yVar) {
        AbstractC6823b.b(i10, "observerCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new U(this, i10, j10, timeUnit, yVar));
    }

    public final s n1(long j10, TimeUnit timeUnit) {
        return m1(1, j10, timeUnit, Gg.a.a());
    }

    public abstract void o1();
}
