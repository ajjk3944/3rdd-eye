package Cg;

import gg.B;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.AbstractC8753f;

/* loaded from: classes4.dex */
public abstract class b implements B, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f2745a = new AtomicReference();

    protected void a() {
    }

    @Override // gg.B
    public final void c(InterfaceC6043c interfaceC6043c) {
        if (AbstractC8753f.c(this.f2745a, interfaceC6043c, getClass())) {
            a();
        }
    }

    @Override // hg.InterfaceC6043c
    public final void dispose() {
        EnumC6592b.dispose(this.f2745a);
    }

    @Override // hg.InterfaceC6043c
    public final boolean isDisposed() {
        return this.f2745a.get() == EnumC6592b.DISPOSED;
    }
}
