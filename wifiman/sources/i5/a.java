package I5;

import gg.i;
import gg.m;
import gg.s;
import gg.w;
import gg.x;
import hg.InterfaceC6043c;

/* loaded from: classes3.dex */
public final class a implements w, m {

    /* renamed from: b, reason: collision with root package name */
    private static final a f8625b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f8626a;

    /* renamed from: I5.a$a, reason: collision with other inner class name */
    static final class C0351a implements x, Dj.b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f8627a;

        /* renamed from: b, reason: collision with root package name */
        volatile Object f8628b;

        C0351a(Object obj) {
            this.f8627a = obj;
            this.f8628b = obj;
        }

        @Override // gg.x
        public void a() {
            this.f8628b = this.f8627a;
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f8628b = obj;
        }

        @Override // Dj.b, gg.l
        public void j(Dj.c cVar) {
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f8628b = this.f8627a;
        }
    }

    static final class b extends i {

        /* renamed from: b, reason: collision with root package name */
        private final i f8629b;

        /* renamed from: c, reason: collision with root package name */
        private final C0351a f8630c;

        b(i iVar, C0351a c0351a) {
            this.f8629b = iVar;
            this.f8630c = c0351a;
        }

        @Override // gg.i
        protected void E1(Dj.b bVar) {
            this.f8629b.b(new e(bVar, this.f8630c));
        }
    }

    static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        private final s f8631a;

        /* renamed from: b, reason: collision with root package name */
        private final C0351a f8632b;

        c(s sVar, C0351a c0351a) {
            this.f8631a = sVar;
            this.f8632b = c0351a;
        }

        @Override // gg.s
        protected void L0(x xVar) {
            this.f8631a.d(new d(xVar, this.f8632b));
        }
    }

    static final class d implements x {

        /* renamed from: a, reason: collision with root package name */
        private final x f8633a;

        /* renamed from: b, reason: collision with root package name */
        private final C0351a f8634b;

        d(x xVar, C0351a c0351a) {
            this.f8633a = xVar;
            this.f8634b = c0351a;
        }

        @Override // gg.x
        public void a() {
            this.f8633a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f8633a.c(interfaceC6043c);
            Object obj = this.f8634b.f8628b;
            if (obj == null || interfaceC6043c.isDisposed()) {
                return;
            }
            this.f8633a.h(obj);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f8633a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f8633a.onError(th2);
        }
    }

    static final class e implements Dj.b, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        private final Dj.b f8635a;

        /* renamed from: b, reason: collision with root package name */
        private final C0351a f8636b;

        /* renamed from: c, reason: collision with root package name */
        private Dj.c f8637c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f8638d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8639e = true;

        e(Dj.b bVar, C0351a c0351a) {
            this.f8635a = bVar;
            this.f8636b = c0351a;
        }

        @Override // Dj.b
        public void a() {
            this.f8635a.a();
        }

        @Override // Dj.c
        public void cancel() {
            Dj.c cVar = this.f8637c;
            this.f8638d = true;
            cVar.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f8635a.h(obj);
        }

        @Override // Dj.b, gg.l
        public void j(Dj.c cVar) {
            this.f8637c = cVar;
            this.f8635a.j(this);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f8635a.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
            if (j10 == 0) {
                return;
            }
            if (this.f8639e) {
                this.f8639e = false;
                Object obj = this.f8636b.f8628b;
                if (obj != null && !this.f8638d) {
                    this.f8635a.h(obj);
                    if (j10 != Long.MAX_VALUE) {
                        j10--;
                        if (j10 == 0) {
                            return;
                        }
                    }
                }
            }
            this.f8637c.request(j10);
        }
    }

    private a(Object obj) {
        this.f8626a = obj;
    }

    public static a e(Object obj) {
        if (obj != null) {
            return new a(obj);
        }
        throw new NullPointerException("defaultValue == null");
    }

    public static a f() {
        return f8625b;
    }

    @Override // gg.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i a(i iVar) {
        C0351a c0351a = new C0351a(this.f8626a);
        return new b(iVar.b0(c0351a).t1(), c0351a);
    }

    @Override // gg.w
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s b(s sVar) {
        C0351a c0351a = new C0351a(this.f8626a);
        return new c(sVar.B(c0351a).D0(), c0351a);
    }
}
