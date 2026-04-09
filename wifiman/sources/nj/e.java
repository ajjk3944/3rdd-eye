package Nj;

import Mj.w;
import gg.s;
import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes2.dex */
final class e extends s {

    /* renamed from: a, reason: collision with root package name */
    private final s f16643a;

    private static class a implements x {

        /* renamed from: a, reason: collision with root package name */
        private final x f16644a;

        a(x xVar) {
            this.f16644a = xVar;
        }

        @Override // gg.x
        public void a() {
            this.f16644a.a();
        }

        @Override // gg.x
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void h(w wVar) {
            this.f16644a.h(d.b(wVar));
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f16644a.c(interfaceC6043c);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            try {
                this.f16644a.h(d.a(th2));
                this.f16644a.a();
            } catch (Throwable th3) {
                try {
                    this.f16644a.onError(th3);
                } catch (Throwable th4) {
                    AbstractC6152a.b(th4);
                    Eg.a.v(new CompositeException(th3, th4));
                }
            }
        }
    }

    e(s sVar) {
        this.f16643a = sVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        this.f16643a.d(new a(xVar));
    }
}
