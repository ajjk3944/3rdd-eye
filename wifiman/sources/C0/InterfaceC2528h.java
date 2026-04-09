package C0;

import l0.C6537m;

/* renamed from: C0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2528h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2145a = a.f2146a;

    /* renamed from: C0.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f2146a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC2528h f2147b = new C0079a();

        /* renamed from: c, reason: collision with root package name */
        private static final InterfaceC2528h f2148c = new e();

        /* renamed from: d, reason: collision with root package name */
        private static final InterfaceC2528h f2149d = new c();

        /* renamed from: e, reason: collision with root package name */
        private static final InterfaceC2528h f2150e = new d();

        /* renamed from: f, reason: collision with root package name */
        private static final InterfaceC2528h f2151f = new f();

        /* renamed from: g, reason: collision with root package name */
        private static final C2531k f2152g = new C2531k(1.0f);

        /* renamed from: h, reason: collision with root package name */
        private static final InterfaceC2528h f2153h = new b();

        /* renamed from: C0.h$a$a, reason: collision with other inner class name */
        public static final class C0079a implements InterfaceC2528h {
            C0079a() {
            }

            @Override // C0.InterfaceC2528h
            public long a(long j10, long j11) {
                float f10 = AbstractC2529i.f(j10, j11);
                return T.a(f10, f10);
            }
        }

        /* renamed from: C0.h$a$b */
        public static final class b implements InterfaceC2528h {
            b() {
            }

            @Override // C0.InterfaceC2528h
            public long a(long j10, long j11) {
                return T.a(AbstractC2529i.h(j10, j11), AbstractC2529i.e(j10, j11));
            }
        }

        /* renamed from: C0.h$a$c */
        public static final class c implements InterfaceC2528h {
            c() {
            }

            @Override // C0.InterfaceC2528h
            public long a(long j10, long j11) {
                float fE = AbstractC2529i.e(j10, j11);
                return T.a(fE, fE);
            }
        }

        /* renamed from: C0.h$a$d */
        public static final class d implements InterfaceC2528h {
            d() {
            }

            @Override // C0.InterfaceC2528h
            public long a(long j10, long j11) {
                float fH = AbstractC2529i.h(j10, j11);
                return T.a(fH, fH);
            }
        }

        /* renamed from: C0.h$a$e */
        public static final class e implements InterfaceC2528h {
            e() {
            }

            @Override // C0.InterfaceC2528h
            public long a(long j10, long j11) {
                float fG = AbstractC2529i.g(j10, j11);
                return T.a(fG, fG);
            }
        }

        /* renamed from: C0.h$a$f */
        public static final class f implements InterfaceC2528h {
            f() {
            }

            @Override // C0.InterfaceC2528h
            public long a(long j10, long j11) {
                if (C6537m.i(j10) <= C6537m.i(j11) && C6537m.g(j10) <= C6537m.g(j11)) {
                    return T.a(1.0f, 1.0f);
                }
                float fG = AbstractC2529i.g(j10, j11);
                return T.a(fG, fG);
            }
        }

        private a() {
        }

        public final InterfaceC2528h a() {
            return f2147b;
        }

        public final InterfaceC2528h b() {
            return f2148c;
        }

        public final InterfaceC2528h c() {
            return f2151f;
        }
    }

    long a(long j10, long j11);
}
