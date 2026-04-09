package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class g extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57946a;

    /* renamed from: b, reason: collision with root package name */
    final long f57947b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f57948c;

    /* renamed from: d, reason: collision with root package name */
    final gg.y f57949d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f57950e;

    static final class a extends AtomicReference implements InterfaceC5914d, Runnable, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57951a;

        /* renamed from: b, reason: collision with root package name */
        final long f57952b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f57953c;

        /* renamed from: d, reason: collision with root package name */
        final gg.y f57954d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f57955e;

        /* renamed from: f, reason: collision with root package name */
        Throwable f57956f;

        a(InterfaceC5914d interfaceC5914d, long j10, TimeUnit timeUnit, gg.y yVar, boolean z10) {
            this.f57951a = interfaceC5914d;
            this.f57952b = j10;
            this.f57953c = timeUnit;
            this.f57954d = yVar;
            this.f57955e = z10;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            EnumC6592b.replace(this, this.f57954d.f(this, this.f57952b, this.f57953c));
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f57951a.c(this);
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

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57956f = th2;
            EnumC6592b.replace(this, this.f57954d.f(this, this.f57955e ? this.f57952b : 0L, this.f57953c));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f57956f;
            this.f57956f = null;
            if (th2 != null) {
                this.f57951a.onError(th2);
            } else {
                this.f57951a.a();
            }
        }
    }

    public g(gg.f fVar, long j10, TimeUnit timeUnit, gg.y yVar, boolean z10) {
        this.f57946a = fVar;
        this.f57947b = j10;
        this.f57948c = timeUnit;
        this.f57949d = yVar;
        this.f57950e = z10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57946a.e(new a(interfaceC5914d, this.f57947b, this.f57948c, this.f57949d, this.f57950e));
    }
}
