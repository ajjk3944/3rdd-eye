package xq;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f25472f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f25473g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25474a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25475b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25476c;

    /* renamed from: d, reason: collision with root package name */
    public final b f25477d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25478e;

    static {
        b bVar = b.PRESENT;
        f25472f = new a(false, false, -1, bVar);
        f25473g = new byte[]{13, 10};
        new c(true, false, -1, bVar);
        new c(false, true, 76, bVar);
        new c(false, true, 64, bVar);
    }

    public c(boolean z10, boolean z11, int i10, b bVar) {
        this.f25474a = z10;
        this.f25475b = z11;
        this.f25476c = i10;
        this.f25477d = bVar;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f25478e = i10 / 4;
    }

    public final int a(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = 4;
        int i14 = i11 * 4;
        if (i12 != 0) {
            b bVar = b.PRESENT;
            b bVar2 = this.f25477d;
            if (bVar2 != bVar && bVar2 != b.PRESENT_OPTIONAL) {
                i13 = i12 + 1;
            }
            i14 += i13;
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f25475b) {
            i14 += ((i14 - 1) / this.f25476c) * 2;
        }
        if (i14 >= 0) {
            return i14;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
