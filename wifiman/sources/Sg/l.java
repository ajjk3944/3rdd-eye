package sg;

import gg.B;
import gg.D;
import gg.s;
import gg.v;
import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    final D f61606a;

    /* renamed from: b, reason: collision with root package name */
    final n f61607b;

    static final class a extends AtomicReference implements x, B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final x f61608a;

        /* renamed from: b, reason: collision with root package name */
        final n f61609b;

        a(x xVar, n nVar) {
            this.f61608a = xVar;
            this.f61609b = nVar;
        }

        @Override // gg.x
        public void a() {
            this.f61608a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f61608a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f61608a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f61609b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                v vVar = (v) objApply;
                if (isDisposed()) {
                    return;
                }
                vVar.d(this);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f61608a.onError(th2);
            }
        }
    }

    public l(D d10, n nVar) {
        this.f61606a = d10;
        this.f61607b = nVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        a aVar = new a(xVar, this.f61607b);
        xVar.c(aVar);
        this.f61606a.a(aVar);
    }
}
