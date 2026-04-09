package s0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6697d0;
import m0.AbstractC6713l0;
import m0.C6733v0;
import org.conscrypt.PSKKeyManager;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7868d {

    /* renamed from: k, reason: collision with root package name */
    public static final b f60839k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    private static int f60840l;

    /* renamed from: a, reason: collision with root package name */
    private final String f60841a;

    /* renamed from: b, reason: collision with root package name */
    private final float f60842b;

    /* renamed from: c, reason: collision with root package name */
    private final float f60843c;

    /* renamed from: d, reason: collision with root package name */
    private final float f60844d;

    /* renamed from: e, reason: collision with root package name */
    private final float f60845e;

    /* renamed from: f, reason: collision with root package name */
    private final m f60846f;

    /* renamed from: g, reason: collision with root package name */
    private final long f60847g;

    /* renamed from: h, reason: collision with root package name */
    private final int f60848h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f60849i;

    /* renamed from: j, reason: collision with root package name */
    private final int f60850j;

    /* renamed from: s0.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f60851a;

        /* renamed from: b, reason: collision with root package name */
        private final float f60852b;

        /* renamed from: c, reason: collision with root package name */
        private final float f60853c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60854d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60855e;

        /* renamed from: f, reason: collision with root package name */
        private final long f60856f;

        /* renamed from: g, reason: collision with root package name */
        private final int f60857g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f60858h;

        /* renamed from: i, reason: collision with root package name */
        private final ArrayList f60859i;

        /* renamed from: j, reason: collision with root package name */
        private C2128a f60860j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f60861k;

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        private final m d(C2128a c2128a) {
            return new m(c2128a.c(), c2128a.f(), c2128a.d(), c2128a.e(), c2128a.g(), c2128a.h(), c2128a.i(), c2128a.j(), c2128a.b(), c2128a.a());
        }

        private final void g() {
            if (this.f60861k) {
                B0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final C2128a h() {
            return (C2128a) AbstractC7869e.d(this.f60859i);
        }

        public final a a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list) {
            g();
            AbstractC7869e.f(this.f60859i, new C2128a(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        public final a c(List list, int i10, String str, AbstractC6713l0 abstractC6713l0, float f10, AbstractC6713l0 abstractC6713l02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            g();
            h().a().add(new r(str, list, i10, abstractC6713l0, f10, abstractC6713l02, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final C7868d e() {
            g();
            while (this.f60859i.size() > 1) {
                f();
            }
            C7868d c7868d = new C7868d(this.f60851a, this.f60852b, this.f60853c, this.f60854d, this.f60855e, d(this.f60860j), this.f60856f, this.f60857g, this.f60858h, 0, 512, null);
            this.f60861k = true;
            return c7868d;
        }

        public final a f() {
            g();
            h().a().add(d((C2128a) AbstractC7869e.e(this.f60859i)));
            return this;
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.f60851a = str;
            this.f60852b = f10;
            this.f60853c = f11;
            this.f60854d = f12;
            this.f60855e = f13;
            this.f60856f = j10;
            this.f60857g = i10;
            this.f60858h = z10;
            ArrayList arrayList = new ArrayList();
            this.f60859i = arrayList;
            C2128a c2128a = new C2128a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f60860j = c2128a;
            AbstractC7869e.f(arrayList, c2128a);
        }

        /* renamed from: s0.d$a$a, reason: collision with other inner class name */
        private static final class C2128a {

            /* renamed from: a, reason: collision with root package name */
            private String f60862a;

            /* renamed from: b, reason: collision with root package name */
            private float f60863b;

            /* renamed from: c, reason: collision with root package name */
            private float f60864c;

            /* renamed from: d, reason: collision with root package name */
            private float f60865d;

            /* renamed from: e, reason: collision with root package name */
            private float f60866e;

            /* renamed from: f, reason: collision with root package name */
            private float f60867f;

            /* renamed from: g, reason: collision with root package name */
            private float f60868g;

            /* renamed from: h, reason: collision with root package name */
            private float f60869h;

            /* renamed from: i, reason: collision with root package name */
            private List f60870i;

            /* renamed from: j, reason: collision with root package name */
            private List f60871j;

            public C2128a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
                this.f60862a = str;
                this.f60863b = f10;
                this.f60864c = f11;
                this.f60865d = f12;
                this.f60866e = f13;
                this.f60867f = f14;
                this.f60868g = f15;
                this.f60869h = f16;
                this.f60870i = list;
                this.f60871j = list2;
            }

            public final List a() {
                return this.f60871j;
            }

            public final List b() {
                return this.f60870i;
            }

            public final String c() {
                return this.f60862a;
            }

            public final float d() {
                return this.f60864c;
            }

            public final float e() {
                return this.f60865d;
            }

            public final float f() {
                return this.f60863b;
            }

            public final float g() {
                return this.f60866e;
            }

            public final float h() {
                return this.f60867f;
            }

            public final float i() {
                return this.f60868g;
            }

            public final float j() {
                return this.f60869h;
            }

            public /* synthetic */ C2128a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? n.d() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? C6733v0.f52951b.e() : j10, (i11 & 64) != 0 ? AbstractC6697d0.f52884a.z() : i10, (i11 & 128) != 0 ? false : z10, null);
        }
    }

    /* renamed from: s0.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int i10;
            synchronized (this) {
                i10 = C7868d.f60840l;
                C7868d.f60840l = i10 + 1;
            }
            return i10;
        }

        private b() {
        }
    }

    public /* synthetic */ C7868d(String str, float f10, float f11, float f12, float f13, m mVar, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, f12, f13, mVar, j10, i10, z10, i11);
    }

    public final boolean c() {
        return this.f60849i;
    }

    public final float d() {
        return this.f60843c;
    }

    public final float e() {
        return this.f60842b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7868d)) {
            return false;
        }
        C7868d c7868d = (C7868d) obj;
        return AbstractC6492s.d(this.f60841a, c7868d.f60841a) && Y0.h.n(this.f60842b, c7868d.f60842b) && Y0.h.n(this.f60843c, c7868d.f60843c) && this.f60844d == c7868d.f60844d && this.f60845e == c7868d.f60845e && AbstractC6492s.d(this.f60846f, c7868d.f60846f) && C6733v0.m(this.f60847g, c7868d.f60847g) && AbstractC6697d0.E(this.f60848h, c7868d.f60848h) && this.f60849i == c7868d.f60849i;
    }

    public final int f() {
        return this.f60850j;
    }

    public final String g() {
        return this.f60841a;
    }

    public final m h() {
        return this.f60846f;
    }

    public int hashCode() {
        return (((((((((((((((this.f60841a.hashCode() * 31) + Y0.h.p(this.f60842b)) * 31) + Y0.h.p(this.f60843c)) * 31) + Float.hashCode(this.f60844d)) * 31) + Float.hashCode(this.f60845e)) * 31) + this.f60846f.hashCode()) * 31) + C6733v0.s(this.f60847g)) * 31) + AbstractC6697d0.F(this.f60848h)) * 31) + Boolean.hashCode(this.f60849i);
    }

    public final int i() {
        return this.f60848h;
    }

    public final long j() {
        return this.f60847g;
    }

    public final float k() {
        return this.f60845e;
    }

    public final float l() {
        return this.f60844d;
    }

    private C7868d(String str, float f10, float f11, float f12, float f13, m mVar, long j10, int i10, boolean z10, int i11) {
        this.f60841a = str;
        this.f60842b = f10;
        this.f60843c = f11;
        this.f60844d = f12;
        this.f60845e = f13;
        this.f60846f = mVar;
        this.f60847g = j10;
        this.f60848h = i10;
        this.f60849i = z10;
        this.f60850j = i11;
    }

    public /* synthetic */ C7868d(String str, float f10, float f11, float f12, float f13, m mVar, long j10, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, f11, f12, f13, mVar, j10, i10, z10, (i12 & 512) != 0 ? f60839k.a() : i11, null);
    }
}
