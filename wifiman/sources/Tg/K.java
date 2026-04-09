package tg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class K extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final gg.y f62162a;

    /* renamed from: b, reason: collision with root package name */
    final long f62163b;

    /* renamed from: c, reason: collision with root package name */
    final long f62164c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f62165d;

    static final class a extends AtomicReference implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62166a;

        /* renamed from: b, reason: collision with root package name */
        long f62167b;

        a(gg.x xVar) {
            this.f62166a = xVar;
        }

        public void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == EnumC6592b.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != EnumC6592b.DISPOSED) {
                gg.x xVar = this.f62166a;
                long j10 = this.f62167b;
                this.f62167b = 1 + j10;
                xVar.h(Long.valueOf(j10));
            }
        }
    }

    public K(long j10, long j11, TimeUnit timeUnit, gg.y yVar) {
        this.f62163b = j10;
        this.f62164c = j11;
        this.f62165d = timeUnit;
        this.f62162a = yVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        a aVar = new a(xVar);
        xVar.c(aVar);
        gg.y yVar = this.f62162a;
        if (!(yVar instanceof wg.p)) {
            aVar.a(yVar.g(aVar, this.f62163b, this.f62164c, this.f62165d));
            return;
        }
        y.c cVarC = yVar.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f62163b, this.f62164c, this.f62165d);
    }
}
