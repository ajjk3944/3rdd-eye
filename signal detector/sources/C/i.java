package C;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f898a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f899b;

    /* renamed from: c, reason: collision with root package name */
    public int f900c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f901d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f902e;

    /* renamed from: f, reason: collision with root package name */
    public int f903f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f904g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f905h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f906j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f907k;

    /* renamed from: l, reason: collision with root package name */
    public int f908l;

    public final void a(int i, float f2) {
        int i3 = this.f903f;
        int[] iArr = this.f901d;
        if (i3 >= iArr.length) {
            this.f901d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f902e;
            this.f902e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f901d;
        int i6 = this.f903f;
        iArr2[i6] = i;
        float[] fArr2 = this.f902e;
        this.f903f = i6 + 1;
        fArr2[i6] = f2;
    }

    public final void b(int i, int i3) {
        int i6 = this.f900c;
        int[] iArr = this.f898a;
        if (i6 >= iArr.length) {
            this.f898a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f899b;
            this.f899b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f898a;
        int i7 = this.f900c;
        iArr3[i7] = i;
        int[] iArr4 = this.f899b;
        this.f900c = i7 + 1;
        iArr4[i7] = i3;
    }

    public final void c(int i, String str) {
        int i3 = this.i;
        int[] iArr = this.f904g;
        if (i3 >= iArr.length) {
            this.f904g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f905h;
            this.f905h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f904g;
        int i6 = this.i;
        iArr2[i6] = i;
        String[] strArr2 = this.f905h;
        this.i = i6 + 1;
        strArr2[i6] = str;
    }

    public final void d(int i, boolean z6) {
        int i3 = this.f908l;
        int[] iArr = this.f906j;
        if (i3 >= iArr.length) {
            this.f906j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f907k;
            this.f907k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f906j;
        int i6 = this.f908l;
        iArr2[i6] = i;
        boolean[] zArr2 = this.f907k;
        this.f908l = i6 + 1;
        zArr2[i6] = z6;
    }
}
