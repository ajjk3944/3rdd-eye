package Cc;

import com.ui.wifiman.model.vendor.d;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Cc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2558b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.vendor.d f2479a;

    /* renamed from: Cc.b$a */
    public static abstract class a extends AbstractC2558b {

        /* renamed from: Cc.b$a$a, reason: collision with other inner class name */
        public static final class C0118a extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final C0118a f2480b = new C0118a();

            private C0118a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0118a);
            }

            public int hashCode() {
                return 1555257870;
            }

            public String toString() {
                return "Phone";
            }
        }

        /* renamed from: Cc.b$a$b, reason: collision with other inner class name */
        public static final class C0119b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final C0119b f2481b = new C0119b();

            private C0119b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0119b);
            }

            public int hashCode() {
                return 1076016582;
            }

            public String toString() {
                return "Tablet";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* renamed from: Cc.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0120b extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        private final d.c f2482b;

        /* renamed from: Cc.b$b$a */
        public static final class a extends AbstractC0120b {

            /* renamed from: c, reason: collision with root package name */
            public static final a f2483c = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1120365850;
            }

            public String toString() {
                return "Mac";
            }
        }

        /* renamed from: Cc.b$b$b, reason: collision with other inner class name */
        public static final class C0121b extends AbstractC0120b {

            /* renamed from: c, reason: collision with root package name */
            public static final C0121b f2484c = new C0121b();

            private C0121b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0121b);
            }

            public int hashCode() {
                return -1998222589;
            }

            public String toString() {
                return "Macbook";
            }
        }

        /* renamed from: Cc.b$b$c */
        public static final class c extends AbstractC0120b {

            /* renamed from: c, reason: collision with root package name */
            public static final c f2485c = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 372420831;
            }

            public String toString() {
                return "iPad";
            }
        }

        /* renamed from: Cc.b$b$d */
        public static final class d extends AbstractC0120b {

            /* renamed from: c, reason: collision with root package name */
            public static final d f2486c = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1414355642;
            }

            public String toString() {
                return "iPhone";
            }
        }

        public /* synthetic */ AbstractC0120b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Cc.AbstractC2558b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d.c a() {
            return this.f2482b;
        }

        private AbstractC0120b() {
            super(null);
            this.f2482b = d.EnumC1510d.APPLE.asVendor();
        }
    }

    /* renamed from: Cc.b$c */
    public static final class c extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final c f2487b = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1704041222;
        }

        public String toString() {
            return "Camera";
        }
    }

    /* renamed from: Cc.b$d */
    public static abstract class d extends AbstractC2558b {

        /* renamed from: Cc.b$d$a */
        public static final class a extends d {

            /* renamed from: b, reason: collision with root package name */
            public static final a f2488b = new a();

            /* renamed from: c, reason: collision with root package name */
            private static final d.c f2489c = d.EnumC1510d.MICROSOFT.asVendor();

            private a() {
                super(null);
            }

            @Override // Cc.AbstractC2558b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d.c a() {
                return f2489c;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 585185649;
            }

            public String toString() {
                return "XBOX";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
            super(null);
        }
    }

    /* renamed from: Cc.b$e */
    public static abstract class e extends AbstractC2558b {

        /* renamed from: Cc.b$e$a */
        public static final class a extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final a f2490b = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -443476075;
            }

            public String toString() {
                return "Light";
            }
        }

        /* renamed from: Cc.b$e$b, reason: collision with other inner class name */
        public static final class C0122b extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final C0122b f2491b = new C0122b();

            private C0122b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0122b);
            }

            public int hashCode() {
                return -146386314;
            }

            public String toString() {
                return "Unspecified";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
            super(null);
        }
    }

    /* renamed from: Cc.b$f */
    public static final class f extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final f f2492b = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -968962113;
        }

        public String toString() {
            return "MediaStreaming";
        }
    }

    /* renamed from: Cc.b$g */
    public static abstract class g extends AbstractC2558b {

        /* renamed from: Cc.b$g$a */
        public static final class a extends g {

            /* renamed from: b, reason: collision with root package name */
            public static final a f2493b = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -950029720;
            }

            public String toString() {
                return "AP";
            }
        }

        /* renamed from: Cc.b$g$b, reason: collision with other inner class name */
        public static final class C0123b extends g {

            /* renamed from: b, reason: collision with root package name */
            public static final C0123b f2494b = new C0123b();

            private C0123b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0123b);
            }

            public int hashCode() {
                return -854478965;
            }

            public String toString() {
                return "Gateway";
            }
        }

        /* renamed from: Cc.b$g$c */
        public static final class c extends g {

            /* renamed from: b, reason: collision with root package name */
            public static final c f2495b = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -218199795;
            }

            public String toString() {
                return "Switch";
            }
        }

        /* renamed from: Cc.b$g$d */
        public static final class d extends g {

            /* renamed from: b, reason: collision with root package name */
            public static final d f2496b = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1064696062;
            }

            public String toString() {
                return "Unspecified";
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
            super(null);
        }
    }

    /* renamed from: Cc.b$h */
    public static final class h extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final h f2497b = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 397999668;
        }

        public String toString() {
            return "PC";
        }
    }

    /* renamed from: Cc.b$i */
    public static final class i extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final i f2498b = new i();

        private i() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1595382419;
        }

        public String toString() {
            return "Phone";
        }
    }

    /* renamed from: Cc.b$j */
    public static final class j extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final j f2499b = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 421588057;
        }

        public String toString() {
            return "Printer";
        }
    }

    /* renamed from: Cc.b$k */
    public static final class k extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final k f2500b = new k();

        private k() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public int hashCode() {
            return -1647699395;
        }

        public String toString() {
            return "Scanner";
        }
    }

    /* renamed from: Cc.b$l */
    public static final class l extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final l f2501b = new l();

        private l() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return -1272216514;
        }

        public String toString() {
            return "Speaker";
        }
    }

    /* renamed from: Cc.b$m */
    public static final class m extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final m f2502b = new m();

        private m() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return -546906851;
        }

        public String toString() {
            return "Toy";
        }
    }

    /* renamed from: Cc.b$n */
    public static final class n extends AbstractC2558b {

        /* renamed from: b, reason: collision with root package name */
        public static final n f2503b = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 2060657567;
        }

        public String toString() {
            return "Weareable";
        }
    }

    public /* synthetic */ AbstractC2558b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public com.ui.wifiman.model.vendor.d a() {
        return this.f2479a;
    }

    private AbstractC2558b() {
    }
}
