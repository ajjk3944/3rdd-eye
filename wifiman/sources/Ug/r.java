package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class r extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f63023a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f63024b;

    static final class a implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63025a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f63026b;

        a(gg.B b10, kg.n nVar) {
            this.f63025a = b10;
            this.f63026b = nVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f63025a.c(interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f63025a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f63026b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f63025a.onSuccess(objApply);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                onError(th2);
            }
        }
    }

    public r(D d10, kg.n nVar) {
        this.f63023a = d10;
        this.f63024b = nVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f63023a.a(new a(b10, this.f63024b));
    }
}
