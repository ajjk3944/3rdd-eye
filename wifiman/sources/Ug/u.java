package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class u extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f63038a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f63039b;

    static final class a extends AtomicReference implements gg.B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63040a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f63041b;

        a(gg.B b10, kg.n nVar) {
            this.f63040a = b10;
            this.f63041b = nVar;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f63040a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            try {
                Object objApply = this.f63041b.apply(th2);
                Objects.requireNonNull(objApply, "The nextFunction returned a null SingleSource.");
                ((D) objApply).a(new og.k(this, this.f63040a));
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f63040a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f63040a.onSuccess(obj);
        }
    }

    public u(D d10, kg.n nVar) {
        this.f63038a = d10;
        this.f63039b = nVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f63038a.a(new a(b10, this.f63039b));
    }
}
