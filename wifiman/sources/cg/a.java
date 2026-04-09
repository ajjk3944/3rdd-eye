package Cg;

import gg.x;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.AbstractC8753f;

/* loaded from: classes4.dex */
public abstract class a implements x, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f2744a = new AtomicReference();

    protected void b() {
    }

    @Override // gg.x
    public final void c(InterfaceC6043c interfaceC6043c) {
        if (AbstractC8753f.c(this.f2744a, interfaceC6043c, getClass())) {
            b();
        }
    }

    @Override // hg.InterfaceC6043c
    public final void dispose() {
        EnumC6592b.dispose(this.f2744a);
    }

    @Override // hg.InterfaceC6043c
    public final boolean isDisposed() {
        return this.f2744a.get() == EnumC6592b.DISPOSED;
    }
}
