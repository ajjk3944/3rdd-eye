package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7871g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f60894a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f60895b;

    /* renamed from: s0.g$a */
    public static final class a extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60896c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60897d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60898e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f60899f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f60900g;

        /* renamed from: h, reason: collision with root package name */
        private final float f60901h;

        /* renamed from: i, reason: collision with root package name */
        private final float f60902i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f60896c = f10;
            this.f60897d = f11;
            this.f60898e = f12;
            this.f60899f = z10;
            this.f60900g = z11;
            this.f60901h = f13;
            this.f60902i = f14;
        }

        public final float c() {
            return this.f60901h;
        }

        public final float d() {
            return this.f60902i;
        }

        public final float e() {
            return this.f60896c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f60896c, aVar.f60896c) == 0 && Float.compare(this.f60897d, aVar.f60897d) == 0 && Float.compare(this.f60898e, aVar.f60898e) == 0 && this.f60899f == aVar.f60899f && this.f60900g == aVar.f60900g && Float.compare(this.f60901h, aVar.f60901h) == 0 && Float.compare(this.f60902i, aVar.f60902i) == 0;
        }

        public final float f() {
            return this.f60898e;
        }

        public final float g() {
            return this.f60897d;
        }

        public final boolean h() {
            return this.f60899f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f60896c) * 31) + Float.hashCode(this.f60897d)) * 31) + Float.hashCode(this.f60898e)) * 31) + Boolean.hashCode(this.f60899f)) * 31) + Boolean.hashCode(this.f60900g)) * 31) + Float.hashCode(this.f60901h)) * 31) + Float.hashCode(this.f60902i);
        }

        public final boolean i() {
            return this.f60900g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f60896c + ", verticalEllipseRadius=" + this.f60897d + ", theta=" + this.f60898e + ", isMoreThanHalf=" + this.f60899f + ", isPositiveArc=" + this.f60900g + ", arcStartX=" + this.f60901h + ", arcStartY=" + this.f60902i + ')';
        }
    }

    /* renamed from: s0.g$b */
    public static final class b extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        public static final b f60903c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    /* renamed from: s0.g$c */
    public static final class c extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60904c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60905d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60906e;

        /* renamed from: f, reason: collision with root package name */
        private final float f60907f;

        /* renamed from: g, reason: collision with root package name */
        private final float f60908g;

        /* renamed from: h, reason: collision with root package name */
        private final float f60909h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f60904c = f10;
            this.f60905d = f11;
            this.f60906e = f12;
            this.f60907f = f13;
            this.f60908g = f14;
            this.f60909h = f15;
        }

        public final float c() {
            return this.f60904c;
        }

        public final float d() {
            return this.f60906e;
        }

        public final float e() {
            return this.f60908g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f60904c, cVar.f60904c) == 0 && Float.compare(this.f60905d, cVar.f60905d) == 0 && Float.compare(this.f60906e, cVar.f60906e) == 0 && Float.compare(this.f60907f, cVar.f60907f) == 0 && Float.compare(this.f60908g, cVar.f60908g) == 0 && Float.compare(this.f60909h, cVar.f60909h) == 0;
        }

        public final float f() {
            return this.f60905d;
        }

        public final float g() {
            return this.f60907f;
        }

        public final float h() {
            return this.f60909h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f60904c) * 31) + Float.hashCode(this.f60905d)) * 31) + Float.hashCode(this.f60906e)) * 31) + Float.hashCode(this.f60907f)) * 31) + Float.hashCode(this.f60908g)) * 31) + Float.hashCode(this.f60909h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f60904c + ", y1=" + this.f60905d + ", x2=" + this.f60906e + ", y2=" + this.f60907f + ", x3=" + this.f60908g + ", y3=" + this.f60909h + ')';
        }
    }

    /* renamed from: s0.g$d */
    public static final class d extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60910c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60910c = f10;
        }

        public final float c() {
            return this.f60910c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f60910c, ((d) obj).f60910c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f60910c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f60910c + ')';
        }
    }

    /* renamed from: s0.g$e */
    public static final class e extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60911c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60912d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60911c = f10;
            this.f60912d = f11;
        }

        public final float c() {
            return this.f60911c;
        }

        public final float d() {
            return this.f60912d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f60911c, eVar.f60911c) == 0 && Float.compare(this.f60912d, eVar.f60912d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f60911c) * 31) + Float.hashCode(this.f60912d);
        }

        public String toString() {
            return "LineTo(x=" + this.f60911c + ", y=" + this.f60912d + ')';
        }
    }

    /* renamed from: s0.g$f */
    public static final class f extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60913c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60914d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60913c = f10;
            this.f60914d = f11;
        }

        public final float c() {
            return this.f60913c;
        }

        public final float d() {
            return this.f60914d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f60913c, fVar.f60913c) == 0 && Float.compare(this.f60914d, fVar.f60914d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f60913c) * 31) + Float.hashCode(this.f60914d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f60913c + ", y=" + this.f60914d + ')';
        }
    }

    /* renamed from: s0.g$g, reason: collision with other inner class name */
    public static final class C2129g extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60915c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60916d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60917e;

        /* renamed from: f, reason: collision with root package name */
        private final float f60918f;

        public C2129g(float f10, float f11, float f12, float f13) {
            super(false, true, true ? 1 : 0, null);
            this.f60915c = f10;
            this.f60916d = f11;
            this.f60917e = f12;
            this.f60918f = f13;
        }

        public final float c() {
            return this.f60915c;
        }

        public final float d() {
            return this.f60917e;
        }

        public final float e() {
            return this.f60916d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2129g)) {
                return false;
            }
            C2129g c2129g = (C2129g) obj;
            return Float.compare(this.f60915c, c2129g.f60915c) == 0 && Float.compare(this.f60916d, c2129g.f60916d) == 0 && Float.compare(this.f60917e, c2129g.f60917e) == 0 && Float.compare(this.f60918f, c2129g.f60918f) == 0;
        }

        public final float f() {
            return this.f60918f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f60915c) * 31) + Float.hashCode(this.f60916d)) * 31) + Float.hashCode(this.f60917e)) * 31) + Float.hashCode(this.f60918f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f60915c + ", y1=" + this.f60916d + ", x2=" + this.f60917e + ", y2=" + this.f60918f + ')';
        }
    }

    /* renamed from: s0.g$h */
    public static final class h extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60919c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60920d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60921e;

        /* renamed from: f, reason: collision with root package name */
        private final float f60922f;

        public h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f60919c = f10;
            this.f60920d = f11;
            this.f60921e = f12;
            this.f60922f = f13;
        }

        public final float c() {
            return this.f60919c;
        }

        public final float d() {
            return this.f60921e;
        }

        public final float e() {
            return this.f60920d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f60919c, hVar.f60919c) == 0 && Float.compare(this.f60920d, hVar.f60920d) == 0 && Float.compare(this.f60921e, hVar.f60921e) == 0 && Float.compare(this.f60922f, hVar.f60922f) == 0;
        }

        public final float f() {
            return this.f60922f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f60919c) * 31) + Float.hashCode(this.f60920d)) * 31) + Float.hashCode(this.f60921e)) * 31) + Float.hashCode(this.f60922f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f60919c + ", y1=" + this.f60920d + ", x2=" + this.f60921e + ", y2=" + this.f60922f + ')';
        }
    }

    /* renamed from: s0.g$i */
    public static final class i extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60923c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60924d;

        public i(float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f60923c = f10;
            this.f60924d = f11;
        }

        public final float c() {
            return this.f60923c;
        }

        public final float d() {
            return this.f60924d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f60923c, iVar.f60923c) == 0 && Float.compare(this.f60924d, iVar.f60924d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f60923c) * 31) + Float.hashCode(this.f60924d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f60923c + ", y=" + this.f60924d + ')';
        }
    }

    /* renamed from: s0.g$j */
    public static final class j extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60925c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60926d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60927e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f60928f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f60929g;

        /* renamed from: h, reason: collision with root package name */
        private final float f60930h;

        /* renamed from: i, reason: collision with root package name */
        private final float f60931i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f60925c = f10;
            this.f60926d = f11;
            this.f60927e = f12;
            this.f60928f = z10;
            this.f60929g = z11;
            this.f60930h = f13;
            this.f60931i = f14;
        }

        public final float c() {
            return this.f60930h;
        }

        public final float d() {
            return this.f60931i;
        }

        public final float e() {
            return this.f60925c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f60925c, jVar.f60925c) == 0 && Float.compare(this.f60926d, jVar.f60926d) == 0 && Float.compare(this.f60927e, jVar.f60927e) == 0 && this.f60928f == jVar.f60928f && this.f60929g == jVar.f60929g && Float.compare(this.f60930h, jVar.f60930h) == 0 && Float.compare(this.f60931i, jVar.f60931i) == 0;
        }

        public final float f() {
            return this.f60927e;
        }

        public final float g() {
            return this.f60926d;
        }

        public final boolean h() {
            return this.f60928f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f60925c) * 31) + Float.hashCode(this.f60926d)) * 31) + Float.hashCode(this.f60927e)) * 31) + Boolean.hashCode(this.f60928f)) * 31) + Boolean.hashCode(this.f60929g)) * 31) + Float.hashCode(this.f60930h)) * 31) + Float.hashCode(this.f60931i);
        }

        public final boolean i() {
            return this.f60929g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f60925c + ", verticalEllipseRadius=" + this.f60926d + ", theta=" + this.f60927e + ", isMoreThanHalf=" + this.f60928f + ", isPositiveArc=" + this.f60929g + ", arcStartDx=" + this.f60930h + ", arcStartDy=" + this.f60931i + ')';
        }
    }

    /* renamed from: s0.g$k */
    public static final class k extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60932c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60933d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60934e;

        /* renamed from: f, reason: collision with root package name */
        private final float f60935f;

        /* renamed from: g, reason: collision with root package name */
        private final float f60936g;

        /* renamed from: h, reason: collision with root package name */
        private final float f60937h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f60932c = f10;
            this.f60933d = f11;
            this.f60934e = f12;
            this.f60935f = f13;
            this.f60936g = f14;
            this.f60937h = f15;
        }

        public final float c() {
            return this.f60932c;
        }

        public final float d() {
            return this.f60934e;
        }

        public final float e() {
            return this.f60936g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f60932c, kVar.f60932c) == 0 && Float.compare(this.f60933d, kVar.f60933d) == 0 && Float.compare(this.f60934e, kVar.f60934e) == 0 && Float.compare(this.f60935f, kVar.f60935f) == 0 && Float.compare(this.f60936g, kVar.f60936g) == 0 && Float.compare(this.f60937h, kVar.f60937h) == 0;
        }

        public final float f() {
            return this.f60933d;
        }

        public final float g() {
            return this.f60935f;
        }

        public final float h() {
            return this.f60937h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f60932c) * 31) + Float.hashCode(this.f60933d)) * 31) + Float.hashCode(this.f60934e)) * 31) + Float.hashCode(this.f60935f)) * 31) + Float.hashCode(this.f60936g)) * 31) + Float.hashCode(this.f60937h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f60932c + ", dy1=" + this.f60933d + ", dx2=" + this.f60934e + ", dy2=" + this.f60935f + ", dx3=" + this.f60936g + ", dy3=" + this.f60937h + ')';
        }
    }

    /* renamed from: s0.g$l */
    public static final class l extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60938c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60938c = f10;
        }

        public final float c() {
            return this.f60938c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f60938c, ((l) obj).f60938c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f60938c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f60938c + ')';
        }
    }

    /* renamed from: s0.g$m */
    public static final class m extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60939c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60940d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60939c = f10;
            this.f60940d = f11;
        }

        public final float c() {
            return this.f60939c;
        }

        public final float d() {
            return this.f60940d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f60939c, mVar.f60939c) == 0 && Float.compare(this.f60940d, mVar.f60940d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f60939c) * 31) + Float.hashCode(this.f60940d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f60939c + ", dy=" + this.f60940d + ')';
        }
    }

    /* renamed from: s0.g$n */
    public static final class n extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60941c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60942d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60941c = f10;
            this.f60942d = f11;
        }

        public final float c() {
            return this.f60941c;
        }

        public final float d() {
            return this.f60942d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f60941c, nVar.f60941c) == 0 && Float.compare(this.f60942d, nVar.f60942d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f60941c) * 31) + Float.hashCode(this.f60942d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f60941c + ", dy=" + this.f60942d + ')';
        }
    }

    /* renamed from: s0.g$o */
    public static final class o extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60943c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60944d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60945e;

        /* renamed from: f, reason: collision with root package name */
        private final float f60946f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, true ? 1 : 0, null);
            this.f60943c = f10;
            this.f60944d = f11;
            this.f60945e = f12;
            this.f60946f = f13;
        }

        public final float c() {
            return this.f60943c;
        }

        public final float d() {
            return this.f60945e;
        }

        public final float e() {
            return this.f60944d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f60943c, oVar.f60943c) == 0 && Float.compare(this.f60944d, oVar.f60944d) == 0 && Float.compare(this.f60945e, oVar.f60945e) == 0 && Float.compare(this.f60946f, oVar.f60946f) == 0;
        }

        public final float f() {
            return this.f60946f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f60943c) * 31) + Float.hashCode(this.f60944d)) * 31) + Float.hashCode(this.f60945e)) * 31) + Float.hashCode(this.f60946f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f60943c + ", dy1=" + this.f60944d + ", dx2=" + this.f60945e + ", dy2=" + this.f60946f + ')';
        }
    }

    /* renamed from: s0.g$p */
    public static final class p extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60947c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60948d;

        /* renamed from: e, reason: collision with root package name */
        private final float f60949e;

        /* renamed from: f, reason: collision with root package name */
        private final float f60950f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f60947c = f10;
            this.f60948d = f11;
            this.f60949e = f12;
            this.f60950f = f13;
        }

        public final float c() {
            return this.f60947c;
        }

        public final float d() {
            return this.f60949e;
        }

        public final float e() {
            return this.f60948d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f60947c, pVar.f60947c) == 0 && Float.compare(this.f60948d, pVar.f60948d) == 0 && Float.compare(this.f60949e, pVar.f60949e) == 0 && Float.compare(this.f60950f, pVar.f60950f) == 0;
        }

        public final float f() {
            return this.f60950f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f60947c) * 31) + Float.hashCode(this.f60948d)) * 31) + Float.hashCode(this.f60949e)) * 31) + Float.hashCode(this.f60950f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f60947c + ", dy1=" + this.f60948d + ", dx2=" + this.f60949e + ", dy2=" + this.f60950f + ')';
        }
    }

    /* renamed from: s0.g$q */
    public static final class q extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60951c;

        /* renamed from: d, reason: collision with root package name */
        private final float f60952d;

        public q(float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f60951c = f10;
            this.f60952d = f11;
        }

        public final float c() {
            return this.f60951c;
        }

        public final float d() {
            return this.f60952d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f60951c, qVar.f60951c) == 0 && Float.compare(this.f60952d, qVar.f60952d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f60951c) * 31) + Float.hashCode(this.f60952d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f60951c + ", dy=" + this.f60952d + ')';
        }
    }

    /* renamed from: s0.g$r */
    public static final class r extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60953c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60953c = f10;
        }

        public final float c() {
            return this.f60953c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f60953c, ((r) obj).f60953c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f60953c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f60953c + ')';
        }
    }

    /* renamed from: s0.g$s */
    public static final class s extends AbstractC7871g {

        /* renamed from: c, reason: collision with root package name */
        private final float f60954c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f60954c = f10;
        }

        public final float c() {
            return this.f60954c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f60954c, ((s) obj).f60954c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f60954c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f60954c + ')';
        }
    }

    public /* synthetic */ AbstractC7871g(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f60894a;
    }

    public final boolean b() {
        return this.f60895b;
    }

    private AbstractC7871g(boolean z10, boolean z11) {
        this.f60894a = z10;
        this.f60895b = z11;
    }

    public /* synthetic */ AbstractC7871g(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
