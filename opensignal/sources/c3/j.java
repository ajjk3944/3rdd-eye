package c3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3207a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3208b;

    /* renamed from: c, reason: collision with root package name */
    public int f3209c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3210d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3211e;

    /* renamed from: f, reason: collision with root package name */
    public int f3212f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3213g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f3214h;

    /* renamed from: i, reason: collision with root package name */
    public int f3215i;
    public int[] j;
    public boolean[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f3216l;

    public final void a(int i10, float f10) {
        int i11 = this.f3212f;
        int[] iArr = this.f3210d;
        if (i11 >= iArr.length) {
            this.f3210d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3211e;
            this.f3211e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f3210d;
        int i12 = this.f3212f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f3211e;
        this.f3212f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f3209c;
        int[] iArr = this.f3207a;
        if (i12 >= iArr.length) {
            this.f3207a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3208b;
            this.f3208b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3207a;
        int i13 = this.f3209c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f3208b;
        this.f3209c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f3215i;
        int[] iArr = this.f3213g;
        if (i11 >= iArr.length) {
            this.f3213g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f3214h;
            this.f3214h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3213g;
        int i12 = this.f3215i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f3214h;
        this.f3215i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f3216l;
        int[] iArr = this.j;
        if (i11 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i12 = this.f3216l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.k;
        this.f3216l = i12 + 1;
        zArr2[i12] = z10;
    }
}
