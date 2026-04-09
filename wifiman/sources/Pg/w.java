package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class w extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f58011a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f58012b;

    static final class a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f58013a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f58014b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58015c;

        a(InterfaceC5914d interfaceC5914d, kg.n nVar) {
            this.f58013a = interfaceC5914d;
            this.f58014b = nVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f58013a.a();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            if (this.f58015c) {
                this.f58013a.onError(th2);
                return;
            }
            this.f58015c = true;
            try {
                Object objApply = this.f58014b.apply(th2);
                Objects.requireNonNull(objApply, "The errorMapper returned a null CompletableSource");
                ((gg.f) objApply).e(this);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f58013a.onError(new CompositeException(th2, th3));
            }
        }
    }

    public w(gg.f fVar, kg.n nVar) {
        this.f58011a = fVar;
        this.f58012b = nVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d, this.f58012b);
        interfaceC5914d.c(aVar);
        this.f58011a.e(aVar);
    }
}
