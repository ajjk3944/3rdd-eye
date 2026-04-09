package Sh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import pi.N0;

/* loaded from: classes4.dex */
public final class I {

    /* renamed from: k, reason: collision with root package name */
    public static final a f20706k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final I f20707l;

    /* renamed from: m, reason: collision with root package name */
    public static final I f20708m;

    /* renamed from: n, reason: collision with root package name */
    public static final I f20709n;

    /* renamed from: o, reason: collision with root package name */
    public static final I f20710o;

    /* renamed from: p, reason: collision with root package name */
    public static final I f20711p;

    /* renamed from: q, reason: collision with root package name */
    public static final I f20712q;

    /* renamed from: r, reason: collision with root package name */
    public static final I f20713r;

    /* renamed from: s, reason: collision with root package name */
    public static final I f20714s;

    /* renamed from: t, reason: collision with root package name */
    public static final I f20715t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20716a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20717b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20718c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20719d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20720e;

    /* renamed from: f, reason: collision with root package name */
    private final I f20721f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20722g;

    /* renamed from: h, reason: collision with root package name */
    private final I f20723h;

    /* renamed from: i, reason: collision with root package name */
    private final I f20724i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f20725j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20726a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20726a = iArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        I i10 = null;
        boolean z14 = false;
        I i11 = null;
        I i12 = null;
        boolean z15 = false;
        I i13 = new I(z10, false, z11, z12, z13, i10, z14, i11, i12, z15, 1023, defaultConstructorMarker);
        f20707l = i13;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        I i14 = null;
        I i15 = null;
        boolean z22 = true;
        I i16 = new I(z16, z17, z18, z19, z20, null, z21, i14, i15, z22, 511, defaultConstructorMarker2);
        f20708m = i16;
        f20709n = new I(z10, true, z11, z12, z13, i10, z14, i11, i12, z15, 1021, defaultConstructorMarker);
        int i17 = 988;
        f20710o = new I(z10, false, z11, z12, z13, i13, z14, i11, i12, z15, i17, defaultConstructorMarker);
        f20711p = new I(z16, z17, z18, z19, z20, i16, z21, i14, i15, z22, 476, defaultConstructorMarker2);
        f20712q = new I(z10, true, z11, z12, z13, i13, z14, i11, i12, z15, i17, defaultConstructorMarker);
        boolean z23 = false;
        boolean z24 = true;
        f20713r = new I(z10, z23, z11, z24, z13, i13, z14, i11, i12, z15, 983, defaultConstructorMarker);
        f20714s = new I(z10, z23, z11, z24, z13, i13, z14, i11, i12, z15, 919, defaultConstructorMarker);
        f20715t = new I(z10, z23, true, false, z13, i13, z14, i11, i12, z15, 984, defaultConstructorMarker);
    }

    public I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, I i10, boolean z15, I i11, I i12, boolean z16) {
        this.f20716a = z10;
        this.f20717b = z11;
        this.f20718c = z12;
        this.f20719d = z13;
        this.f20720e = z14;
        this.f20721f = i10;
        this.f20722g = z15;
        this.f20723h = i11;
        this.f20724i = i12;
        this.f20725j = z16;
    }

    public final boolean a() {
        return this.f20722g;
    }

    public final boolean b() {
        return this.f20725j;
    }

    public final boolean c() {
        return this.f20717b;
    }

    public final boolean d() {
        return this.f20716a;
    }

    public final boolean e() {
        return this.f20718c;
    }

    public final I f(N0 effectiveVariance, boolean z10) {
        AbstractC6492s.i(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f20718c) {
            int i10 = b.f20726a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                I i11 = this.f20723h;
                if (i11 != null) {
                    return i11;
                }
            } else if (i10 != 2) {
                I i12 = this.f20721f;
                if (i12 != null) {
                    return i12;
                }
            } else {
                I i13 = this.f20724i;
                if (i13 != null) {
                    return i13;
                }
            }
        }
        return this;
    }

    public final I g() {
        return new I(this.f20716a, true, this.f20718c, this.f20719d, this.f20720e, this.f20721f, this.f20722g, this.f20723h, this.f20724i, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, I i10, boolean z15, I i11, I i12, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z17 = (i13 & 1) != 0 ? true : z10;
        boolean z18 = (i13 & 2) != 0 ? true : z11;
        boolean z19 = (i13 & 4) != 0 ? false : z12;
        boolean z20 = (i13 & 8) != 0 ? false : z13;
        boolean z21 = (i13 & 16) != 0 ? false : z14;
        I i14 = (i13 & 32) != 0 ? null : i10;
        this(z17, z18, z19, z20, z21, i14, (i13 & 64) == 0 ? z15 : true, (i13 & 128) != 0 ? i14 : i11, (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? i14 : i12, (i13 & 512) == 0 ? z16 : false);
    }
}
