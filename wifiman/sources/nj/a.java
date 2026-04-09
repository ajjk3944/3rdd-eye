package Nj;

import Mj.w;
import gg.s;
import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.adapter.rxjava3.HttpException;

/* loaded from: classes2.dex */
final class a extends s {

    /* renamed from: a, reason: collision with root package name */
    private final s f16630a;

    /* renamed from: Nj.a$a, reason: collision with other inner class name */
    private static class C0596a implements x {

        /* renamed from: a, reason: collision with root package name */
        private final x f16631a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16632b;

        C0596a(x xVar) {
            this.f16631a = xVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f16632b) {
                return;
            }
            this.f16631a.a();
        }

        @Override // gg.x
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void h(w wVar) {
            if (wVar.f()) {
                this.f16631a.h(wVar.a());
                return;
            }
            this.f16632b = true;
            HttpException httpException = new HttpException(wVar);
            try {
                this.f16631a.onError(httpException);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(new CompositeException(httpException, th2));
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f16631a.c(interfaceC6043c);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (!this.f16632b) {
                this.f16631a.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            Eg.a.v(assertionError);
        }
    }

    a(s sVar) {
        this.f16630a = sVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        this.f16630a.d(new C0596a(xVar));
    }
}
