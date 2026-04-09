package o0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.V0;
import m0.k1;
import m0.l1;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7044k extends AbstractC7040g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f55039f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final int f55040g = k1.f52924a.a();

    /* renamed from: h, reason: collision with root package name */
    private static final int f55041h = l1.f52930a.b();

    /* renamed from: a, reason: collision with root package name */
    private final float f55042a;

    /* renamed from: b, reason: collision with root package name */
    private final float f55043b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55044c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55045d;

    /* renamed from: e, reason: collision with root package name */
    private final V0 f55046e;

    /* renamed from: o0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C7044k.f55040g;
        }

        private a() {
        }
    }

    public /* synthetic */ C7044k(float f10, float f11, int i10, int i11, V0 v02, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, v02);
    }

    public final int b() {
        return this.f55044c;
    }

    public final int c() {
        return this.f55045d;
    }

    public final float d() {
        return this.f55043b;
    }

    public final V0 e() {
        return this.f55046e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7044k)) {
            return false;
        }
        C7044k c7044k = (C7044k) obj;
        return this.f55042a == c7044k.f55042a && this.f55043b == c7044k.f55043b && k1.e(this.f55044c, c7044k.f55044c) && l1.e(this.f55045d, c7044k.f55045d) && AbstractC6492s.d(this.f55046e, c7044k.f55046e);
    }

    public final float f() {
        return this.f55042a;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f55042a) * 31) + Float.hashCode(this.f55043b)) * 31) + k1.f(this.f55044c)) * 31) + l1.f(this.f55045d)) * 31;
        V0 v02 = this.f55046e;
        return iHashCode + (v02 != null ? v02.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f55042a + ", miter=" + this.f55043b + ", cap=" + ((Object) k1.g(this.f55044c)) + ", join=" + ((Object) l1.g(this.f55045d)) + ", pathEffect=" + this.f55046e + ')';
    }

    public /* synthetic */ C7044k(float f10, float f11, int i10, int i11, V0 v02, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f55040g : i10, (i12 & 8) != 0 ? f55041h : i11, (i12 & 16) != 0 ? null : v02, null);
    }

    private C7044k(float f10, float f11, int i10, int i11, V0 v02) {
        super(null);
        this.f55042a = f10;
        this.f55043b = f11;
        this.f55044c = i10;
        this.f55045d = i11;
        this.f55046e = v02;
    }
}
