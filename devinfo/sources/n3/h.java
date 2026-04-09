package n3;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f29634a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f29635b;

    /* renamed from: c, reason: collision with root package name */
    public int f29636c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f29637d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f29638e;

    /* renamed from: f, reason: collision with root package name */
    public int f29639f;
    public int[] g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f29640h;

    /* renamed from: i, reason: collision with root package name */
    public int f29641i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f29642k;

    /* renamed from: l, reason: collision with root package name */
    public int f29643l;

    public final void a(int i4, float f10) {
        int i10 = this.f29639f;
        int[] iArr = this.f29637d;
        if (i10 >= iArr.length) {
            this.f29637d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f29638e;
            this.f29638e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f29637d;
        int i11 = this.f29639f;
        iArr2[i11] = i4;
        float[] fArr2 = this.f29638e;
        this.f29639f = i11 + 1;
        fArr2[i11] = f10;
    }

    public final void b(int i4, int i10) {
        int i11 = this.f29636c;
        int[] iArr = this.f29634a;
        if (i11 >= iArr.length) {
            this.f29634a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f29635b;
            this.f29635b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f29634a;
        int i12 = this.f29636c;
        iArr3[i12] = i4;
        int[] iArr4 = this.f29635b;
        this.f29636c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i4, String str) {
        int i10 = this.f29641i;
        int[] iArr = this.g;
        if (i10 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f29640h;
            this.f29640h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i11 = this.f29641i;
        iArr2[i11] = i4;
        String[] strArr2 = this.f29640h;
        this.f29641i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i4, boolean z3) {
        int i10 = this.f29643l;
        int[] iArr = this.j;
        if (i10 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f29642k;
            this.f29642k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i11 = this.f29643l;
        iArr2[i11] = i4;
        boolean[] zArr2 = this.f29642k;
        this.f29643l = i11 + 1;
        zArr2[i11] = z3;
    }
}
