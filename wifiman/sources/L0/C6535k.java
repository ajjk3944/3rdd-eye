package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6535k {

    /* renamed from: i, reason: collision with root package name */
    public static final a f52346i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final C6535k f52347j = AbstractC6536l.d(0.0f, 0.0f, 0.0f, 0.0f, AbstractC6525a.f52329a.a());

    /* renamed from: a, reason: collision with root package name */
    private final float f52348a;

    /* renamed from: b, reason: collision with root package name */
    private final float f52349b;

    /* renamed from: c, reason: collision with root package name */
    private final float f52350c;

    /* renamed from: d, reason: collision with root package name */
    private final float f52351d;

    /* renamed from: e, reason: collision with root package name */
    private final long f52352e;

    /* renamed from: f, reason: collision with root package name */
    private final long f52353f;

    /* renamed from: g, reason: collision with root package name */
    private final long f52354g;

    /* renamed from: h, reason: collision with root package name */
    private final long f52355h;

    /* renamed from: l0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C6535k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f52351d;
    }

    public final long b() {
        return this.f52355h;
    }

    public final long c() {
        return this.f52354g;
    }

    public final float d() {
        return this.f52351d - this.f52349b;
    }

    public final float e() {
        return this.f52348a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6535k)) {
            return false;
        }
        C6535k c6535k = (C6535k) obj;
        return Float.compare(this.f52348a, c6535k.f52348a) == 0 && Float.compare(this.f52349b, c6535k.f52349b) == 0 && Float.compare(this.f52350c, c6535k.f52350c) == 0 && Float.compare(this.f52351d, c6535k.f52351d) == 0 && AbstractC6525a.c(this.f52352e, c6535k.f52352e) && AbstractC6525a.c(this.f52353f, c6535k.f52353f) && AbstractC6525a.c(this.f52354g, c6535k.f52354g) && AbstractC6525a.c(this.f52355h, c6535k.f52355h);
    }

    public final float f() {
        return this.f52350c;
    }

    public final float g() {
        return this.f52349b;
    }

    public final long h() {
        return this.f52352e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f52348a) * 31) + Float.hashCode(this.f52349b)) * 31) + Float.hashCode(this.f52350c)) * 31) + Float.hashCode(this.f52351d)) * 31) + AbstractC6525a.f(this.f52352e)) * 31) + AbstractC6525a.f(this.f52353f)) * 31) + AbstractC6525a.f(this.f52354g)) * 31) + AbstractC6525a.f(this.f52355h);
    }

    public final long i() {
        return this.f52353f;
    }

    public final float j() {
        return this.f52350c - this.f52348a;
    }

    public String toString() {
        long j10 = this.f52352e;
        long j11 = this.f52353f;
        long j12 = this.f52354g;
        long j13 = this.f52355h;
        String str = AbstractC6527c.a(this.f52348a, 1) + ", " + AbstractC6527c.a(this.f52349b, 1) + ", " + AbstractC6527c.a(this.f52350c, 1) + ", " + AbstractC6527c.a(this.f52351d, 1);
        if (!AbstractC6525a.c(j10, j11) || !AbstractC6525a.c(j11, j12) || !AbstractC6525a.c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC6525a.g(j10)) + ", topRight=" + ((Object) AbstractC6525a.g(j11)) + ", bottomRight=" + ((Object) AbstractC6525a.g(j12)) + ", bottomLeft=" + ((Object) AbstractC6525a.g(j13)) + ')';
        }
        if (AbstractC6525a.d(j10) == AbstractC6525a.e(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC6527c.a(AbstractC6525a.d(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC6527c.a(AbstractC6525a.d(j10), 1) + ", y=" + AbstractC6527c.a(AbstractC6525a.e(j10), 1) + ')';
    }

    private C6535k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f52348a = f10;
        this.f52349b = f11;
        this.f52350c = f12;
        this.f52351d = f13;
        this.f52352e = j10;
        this.f52353f = j11;
        this.f52354g = j12;
        this.f52355h = j13;
    }
}
