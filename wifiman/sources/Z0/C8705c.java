package z0;

import Zg.AbstractC3682n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8705c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f67037a;

    /* renamed from: b, reason: collision with root package name */
    private final a f67038b;

    /* renamed from: c, reason: collision with root package name */
    private final int f67039c;

    /* renamed from: d, reason: collision with root package name */
    private final C8703a[] f67040d;

    /* renamed from: e, reason: collision with root package name */
    private int f67041e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f67042f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f67043g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f67044h;

    /* renamed from: z0.c$a */
    public enum a {
        Lsq2,
        Impulse
    }

    /* renamed from: z0.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67045a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67045a = iArr;
        }
    }

    public C8705c(boolean z10, a aVar) {
        this.f67037a = z10;
        this.f67038b = aVar;
        if (z10 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.f67045a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.f67039c = i11;
        this.f67040d = new C8703a[20];
        this.f67042f = new float[20];
        this.f67043g = new float[20];
        this.f67044h = new float[3];
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return e.i(fArr2, fArr, i10, 2, this.f67044h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f67041e + 1) % 20;
        this.f67041e = i10;
        e.j(this.f67040d, i10, j10, f10);
    }

    public final float c() {
        float f10;
        float[] fArr = this.f67042f;
        float[] fArr2 = this.f67043g;
        int i10 = this.f67041e;
        C8703a c8703a = this.f67040d[i10];
        if (c8703a == null) {
            return 0.0f;
        }
        int i11 = 0;
        C8703a c8703a2 = c8703a;
        while (true) {
            C8703a c8703a3 = this.f67040d[i10];
            if (c8703a3 == null) {
                break;
            }
            float fB = c8703a.b() - c8703a3.b();
            float fAbs = Math.abs(c8703a3.b() - c8703a2.b());
            C8703a c8703a4 = (this.f67038b == a.Lsq2 || this.f67037a) ? c8703a3 : c8703a;
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = c8703a3.a();
            fArr2[i11] = -fB;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            c8703a2 = c8703a4;
        }
        if (i11 < this.f67039c) {
            return 0.0f;
        }
        int i12 = b.f67045a[this.f67038b.ordinal()];
        if (i12 == 1) {
            f10 = e.f(fArr, fArr2, i11, this.f67037a);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = b(fArr, fArr2, i11);
        }
        return f10 * 1000;
    }

    public final float d(float f10) {
        if (!(f10 > 0.0f)) {
            B0.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? AbstractC7978m.f(fC, f10) : AbstractC7978m.c(fC, -f10);
    }

    public final void e() {
        AbstractC3682n.y(this.f67040d, null, 0, 0, 6, null);
        this.f67041e = 0;
    }

    public /* synthetic */ C8705c(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }
}
