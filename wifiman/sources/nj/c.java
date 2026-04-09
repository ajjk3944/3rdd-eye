package Nj;

import Mj.w;
import gg.s;
import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes2.dex */
final class c extends s {

    /* renamed from: a, reason: collision with root package name */
    private final Mj.d f16638a;

    private static final class a implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        private final Mj.d f16639a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f16640b;

        a(Mj.d dVar) {
            this.f16639a = dVar;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f16640b = true;
            this.f16639a.cancel();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f16640b;
        }
    }

    c(Mj.d dVar) {
        this.f16638a = dVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        Mj.d dVarM1clone = this.f16638a.m1clone();
        a aVar = new a(dVarM1clone);
        xVar.c(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        boolean z10 = false;
        try {
            w wVarG = dVarM1clone.g();
            if (!aVar.isDisposed()) {
                xVar.h(wVarG);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                xVar.a();
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                AbstractC6152a.b(th);
                if (z10) {
                    Eg.a.v(th);
                    return;
                }
                if (aVar.isDisposed()) {
                    return;
                }
                try {
                    xVar.onError(th);
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    Eg.a.v(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
