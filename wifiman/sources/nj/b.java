package Nj;

import Mj.w;
import gg.s;
import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes2.dex */
final class b extends s {

    /* renamed from: a, reason: collision with root package name */
    private final Mj.d f16633a;

    private static final class a implements InterfaceC6043c, Mj.f {

        /* renamed from: a, reason: collision with root package name */
        private final Mj.d f16634a;

        /* renamed from: b, reason: collision with root package name */
        private final x f16635b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f16636c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16637d = false;

        a(Mj.d dVar, x xVar) {
            this.f16634a = dVar;
            this.f16635b = xVar;
        }

        @Override // Mj.f
        public void a(Mj.d dVar, w wVar) {
            if (this.f16636c) {
                return;
            }
            try {
                this.f16635b.h(wVar);
                if (this.f16636c) {
                    return;
                }
                this.f16637d = true;
                this.f16635b.a();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                if (this.f16637d) {
                    Eg.a.v(th2);
                    return;
                }
                if (this.f16636c) {
                    return;
                }
                try {
                    this.f16635b.onError(th2);
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    Eg.a.v(new CompositeException(th2, th3));
                }
            }
        }

        @Override // Mj.f
        public void b(Mj.d dVar, Throwable th2) {
            if (dVar.v()) {
                return;
            }
            try {
                this.f16635b.onError(th2);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                Eg.a.v(new CompositeException(th2, th3));
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f16636c = true;
            this.f16634a.cancel();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f16636c;
        }
    }

    b(Mj.d dVar) {
        this.f16633a = dVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        Mj.d dVarM1clone = this.f16633a.m1clone();
        a aVar = new a(dVarM1clone, xVar);
        xVar.c(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        dVarM1clone.K0(aVar);
    }
}
