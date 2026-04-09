package rg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class c extends AbstractC7607a {

    /* renamed from: b, reason: collision with root package name */
    final long f60510b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f60511c;

    /* renamed from: d, reason: collision with root package name */
    final y f60512d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f60513e;

    static final class a extends AtomicReference implements gg.p, InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60514a;

        /* renamed from: b, reason: collision with root package name */
        final long f60515b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f60516c;

        /* renamed from: d, reason: collision with root package name */
        final y f60517d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f60518e;

        /* renamed from: f, reason: collision with root package name */
        Object f60519f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f60520g;

        a(gg.p pVar, long j10, TimeUnit timeUnit, y yVar, boolean z10) {
            this.f60514a = pVar;
            this.f60515b = j10;
            this.f60516c = timeUnit;
            this.f60517d = yVar;
            this.f60518e = z10;
        }

        @Override // gg.p
        public void a() {
            d(this.f60515b);
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f60514a.c(this);
            }
        }

        void d(long j10) {
            EnumC6592b.replace(this, this.f60517d.f(this, j10, this.f60516c));
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60520g = th2;
            d(this.f60518e ? this.f60515b : 0L);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60519f = obj;
            d(this.f60515b);
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f60520g;
            if (th2 != null) {
                this.f60514a.onError(th2);
                return;
            }
            Object obj = this.f60519f;
            if (obj != null) {
                this.f60514a.onSuccess(obj);
            } else {
                this.f60514a.a();
            }
        }
    }

    public c(gg.r rVar, long j10, TimeUnit timeUnit, y yVar, boolean z10) {
        super(rVar);
        this.f60510b = j10;
        this.f60511c = timeUnit;
        this.f60512d = yVar;
        this.f60513e = z10;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar, this.f60510b, this.f60511c, this.f60512d, this.f60513e));
    }
}
