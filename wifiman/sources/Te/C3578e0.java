package Te;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* renamed from: Te.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3578e0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21819a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21820b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7929a f21821c;

    /* renamed from: d, reason: collision with root package name */
    private final a f21822d;

    /* renamed from: e, reason: collision with root package name */
    private final C5969a f21823e;

    /* renamed from: f, reason: collision with root package name */
    private final S8.l f21824f;

    /* renamed from: g, reason: collision with root package name */
    private final S8.c f21825g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21826h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21827i;

    /* renamed from: Te.e0$a */
    public static abstract class a {

        /* renamed from: Te.e0$a$a, reason: collision with other inner class name */
        public static final class C0803a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final s9.d f21828a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0803a(s9.d value) {
                super(null);
                AbstractC6492s.i(value, "value");
                this.f21828a = value;
            }

            public s9.d a() {
                return this.f21828a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0803a) && AbstractC6492s.d(this.f21828a, ((C0803a) obj).f21828a);
            }

            public int hashCode() {
                return this.f21828a.hashCode();
            }

            public String toString() {
                return "Recognized(value=" + this.f21828a + ")";
            }
        }

        /* renamed from: Te.e0$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f21829a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2139309161;
            }

            public String toString() {
                return "Unknown";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3578e0(String id2, boolean z10, InterfaceC7929a image, a name, C5969a mac, S8.l lVar, S8.c band, boolean z11, boolean z12) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(band, "band");
        this.f21819a = id2;
        this.f21820b = z10;
        this.f21821c = image;
        this.f21822d = name;
        this.f21823e = mac;
        this.f21824f = lVar;
        this.f21825g = band;
        this.f21826h = z11;
        this.f21827i = z12;
    }

    public final S8.c a() {
        return this.f21825g;
    }

    public final boolean b() {
        return this.f21827i;
    }

    public final boolean c() {
        return this.f21826h;
    }

    public final String d() {
        return this.f21819a;
    }

    public final InterfaceC7929a e() {
        return this.f21821c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3578e0)) {
            return false;
        }
        C3578e0 c3578e0 = (C3578e0) obj;
        return AbstractC6492s.d(this.f21819a, c3578e0.f21819a) && this.f21820b == c3578e0.f21820b && AbstractC6492s.d(this.f21821c, c3578e0.f21821c) && AbstractC6492s.d(this.f21822d, c3578e0.f21822d) && AbstractC6492s.d(this.f21823e, c3578e0.f21823e) && AbstractC6492s.d(this.f21824f, c3578e0.f21824f) && this.f21825g == c3578e0.f21825g && this.f21826h == c3578e0.f21826h && this.f21827i == c3578e0.f21827i;
    }

    public final C5969a f() {
        return this.f21823e;
    }

    public final a g() {
        return this.f21822d;
    }

    public final boolean h() {
        return this.f21820b;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f21819a.hashCode() * 31) + Boolean.hashCode(this.f21820b)) * 31) + this.f21821c.hashCode()) * 31) + this.f21822d.hashCode()) * 31) + this.f21823e.hashCode()) * 31;
        S8.l lVar = this.f21824f;
        return ((((((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f21825g.hashCode()) * 31) + Boolean.hashCode(this.f21826h)) * 31) + Boolean.hashCode(this.f21827i);
    }

    public final S8.l i() {
        return this.f21824f;
    }

    public String toString() {
        return "Model(id=" + this.f21819a + ", selected=" + this.f21820b + ", image=" + this.f21821c + ", name=" + this.f21822d + ", mac=" + this.f21823e + ", signal=" + this.f21824f + ", band=" + this.f21825g + ", enabled=" + this.f21826h + ", connected=" + this.f21827i + ")";
    }
}
