package ra;

import Y0.h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ra.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7581b {

    /* renamed from: a, reason: collision with root package name */
    private final a.C2095b f60193a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C2094a f60194b;

    /* renamed from: ra.b$a */
    public static abstract class a {

        /* renamed from: ra.b$a$a, reason: collision with other inner class name */
        public static final class C2094a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final float f60195a;

            /* renamed from: b, reason: collision with root package name */
            private final float f60196b;

            /* renamed from: c, reason: collision with root package name */
            private final float f60197c;

            /* renamed from: d, reason: collision with root package name */
            private final float f60198d;

            public /* synthetic */ C2094a(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
                this(f10, f11, f12, f13);
            }

            @Override // ra.C7581b.a
            protected float b() {
                return this.f60195a;
            }

            public float c() {
                return this.f60197c;
            }

            public float d() {
                return this.f60198d;
            }

            public float e() {
                return this.f60196b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2094a)) {
                    return false;
                }
                C2094a c2094a = (C2094a) obj;
                return Float.compare(this.f60195a, c2094a.f60195a) == 0 && h.n(this.f60196b, c2094a.f60196b) && h.n(this.f60197c, c2094a.f60197c) && h.n(this.f60198d, c2094a.f60198d);
            }

            public int hashCode() {
                return (((((Float.hashCode(this.f60195a) * 31) + h.p(this.f60196b)) * 31) + h.p(this.f60197c)) * 31) + h.p(this.f60198d);
            }

            public String toString() {
                return "Horizontal(dimensMultiplier=" + this.f60195a + ", small=" + h.r(this.f60196b) + ", default=" + h.r(this.f60197c) + ", large=" + h.r(this.f60198d) + ")";
            }

            private C2094a(float f10, float f11, float f12, float f13) {
                super(null);
                this.f60195a = f10;
                this.f60196b = f11;
                this.f60197c = f12;
                this.f60198d = f13;
            }
        }

        /* renamed from: ra.b$a$b, reason: collision with other inner class name */
        public static final class C2095b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final float f60199a;

            /* renamed from: b, reason: collision with root package name */
            private final float f60200b;

            /* renamed from: c, reason: collision with root package name */
            private final float f60201c;

            /* renamed from: d, reason: collision with root package name */
            private final float f60202d;

            public /* synthetic */ C2095b(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
                this(f10, f11, f12, f13);
            }

            @Override // ra.C7581b.a
            protected float b() {
                return this.f60199a;
            }

            public float c() {
                return this.f60201c;
            }

            public float d() {
                return this.f60202d;
            }

            public float e() {
                return this.f60200b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2095b)) {
                    return false;
                }
                C2095b c2095b = (C2095b) obj;
                return Float.compare(this.f60199a, c2095b.f60199a) == 0 && h.n(this.f60200b, c2095b.f60200b) && h.n(this.f60201c, c2095b.f60201c) && h.n(this.f60202d, c2095b.f60202d);
            }

            public int hashCode() {
                return (((((Float.hashCode(this.f60199a) * 31) + h.p(this.f60200b)) * 31) + h.p(this.f60201c)) * 31) + h.p(this.f60202d);
            }

            public String toString() {
                return "Vertical(dimensMultiplier=" + this.f60199a + ", small=" + h.r(this.f60200b) + ", default=" + h.r(this.f60201c) + ", large=" + h.r(this.f60202d) + ")";
            }

            private C2095b(float f10, float f11, float f12, float f13) {
                super(null);
                this.f60199a = f10;
                this.f60200b = f11;
                this.f60201c = f12;
                this.f60202d = f13;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(float f10) {
            return h.j(f10 * b());
        }

        protected abstract float b();

        private a() {
        }
    }

    public C7581b(a.C2095b v10, a.C2094a h10) {
        AbstractC6492s.i(v10, "v");
        AbstractC6492s.i(h10, "h");
        this.f60193a = v10;
        this.f60194b = h10;
    }

    public final a.C2094a a() {
        return this.f60194b;
    }

    public final a.C2095b b() {
        return this.f60193a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7581b)) {
            return false;
        }
        C7581b c7581b = (C7581b) obj;
        return AbstractC6492s.d(this.f60193a, c7581b.f60193a) && AbstractC6492s.d(this.f60194b, c7581b.f60194b);
    }

    public int hashCode() {
        return (this.f60193a.hashCode() * 31) + this.f60194b.hashCode();
    }

    public String toString() {
        return "UiWindowMargin(v=" + this.f60193a + ", h=" + this.f60194b + ")";
    }
}
