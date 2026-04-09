package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes4.dex */
public final class t extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f63033a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f63034b;

    /* renamed from: c, reason: collision with root package name */
    final Object f63035c;

    final class a implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        private final gg.B f63036a;

        a(gg.B b10) {
            this.f63036a = b10;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f63036a.c(interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            Object objApply;
            t tVar = t.this;
            kg.n nVar = tVar.f63034b;
            if (nVar != null) {
                try {
                    objApply = nVar.apply(th2);
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    this.f63036a.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                objApply = tVar.f63035c;
            }
            if (objApply != null) {
                this.f63036a.onSuccess(objApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f63036a.onError(nullPointerException);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f63036a.onSuccess(obj);
        }
    }

    public t(D d10, kg.n nVar, Object obj) {
        this.f63033a = d10;
        this.f63034b = nVar;
        this.f63035c = obj;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f63033a.a(new a(b10));
    }
}
