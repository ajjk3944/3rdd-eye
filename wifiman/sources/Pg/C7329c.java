package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import lg.C6595e;

/* renamed from: pg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7329c extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f[] f57934a;

    /* renamed from: pg.c$a */
    static final class a extends AtomicInteger implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57935a;

        /* renamed from: b, reason: collision with root package name */
        final gg.f[] f57936b;

        /* renamed from: c, reason: collision with root package name */
        int f57937c;

        /* renamed from: d, reason: collision with root package name */
        final C6595e f57938d = new C6595e();

        a(InterfaceC5914d interfaceC5914d, gg.f[] fVarArr) {
            this.f57935a = interfaceC5914d;
            this.f57936b = fVarArr;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            d();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57938d.a(interfaceC6043c);
        }

        void d() {
            if (!this.f57938d.isDisposed() && getAndIncrement() == 0) {
                gg.f[] fVarArr = this.f57936b;
                while (!this.f57938d.isDisposed()) {
                    int i10 = this.f57937c;
                    this.f57937c = i10 + 1;
                    if (i10 == fVarArr.length) {
                        this.f57935a.a();
                        return;
                    } else {
                        fVarArr[i10].e(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57935a.onError(th2);
        }
    }

    public C7329c(gg.f[] fVarArr) {
        this.f57934a = fVarArr;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d, this.f57934a);
        interfaceC5914d.c(aVar.f57938d);
        aVar.d();
    }
}
