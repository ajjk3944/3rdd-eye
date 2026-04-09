package tg;

import hg.InterfaceC6043c;
import java.util.NoSuchElementException;
import lg.EnumC6592b;

/* renamed from: tg.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8105p extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62522b;

    /* renamed from: c, reason: collision with root package name */
    final Object f62523c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f62524d;

    /* renamed from: tg.p$a */
    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62525a;

        /* renamed from: b, reason: collision with root package name */
        final long f62526b;

        /* renamed from: c, reason: collision with root package name */
        final Object f62527c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f62528d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC6043c f62529e;

        /* renamed from: f, reason: collision with root package name */
        long f62530f;

        /* renamed from: g, reason: collision with root package name */
        boolean f62531g;

        a(gg.x xVar, long j10, Object obj, boolean z10) {
            this.f62525a = xVar;
            this.f62526b = j10;
            this.f62527c = obj;
            this.f62528d = z10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62531g) {
                return;
            }
            this.f62531g = true;
            Object obj = this.f62527c;
            if (obj == null && this.f62528d) {
                this.f62525a.onError(new NoSuchElementException());
                return;
            }
            if (obj != null) {
                this.f62525a.h(obj);
            }
            this.f62525a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62529e, interfaceC6043c)) {
                this.f62529e = interfaceC6043c;
                this.f62525a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62529e.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62531g) {
                return;
            }
            long j10 = this.f62530f;
            if (j10 != this.f62526b) {
                this.f62530f = j10 + 1;
                return;
            }
            this.f62531g = true;
            this.f62529e.dispose();
            this.f62525a.h(obj);
            this.f62525a.a();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62529e.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62531g) {
                Eg.a.v(th2);
            } else {
                this.f62531g = true;
                this.f62525a.onError(th2);
            }
        }
    }

    public C8105p(gg.v vVar, long j10, Object obj, boolean z10) {
        super(vVar);
        this.f62522b = j10;
        this.f62523c = obj;
        this.f62524d = z10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62522b, this.f62523c, this.f62524d));
    }
}
