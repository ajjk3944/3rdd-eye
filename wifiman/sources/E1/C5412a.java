package e1;

import java.util.Arrays;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5412a {

    /* renamed from: a, reason: collision with root package name */
    int[] f46123a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    int[] f46124b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    int f46125c = 0;

    /* renamed from: d, reason: collision with root package name */
    int[] f46126d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    float[] f46127e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    int f46128f = 0;

    /* renamed from: g, reason: collision with root package name */
    int[] f46129g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    String[] f46130h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    int f46131i = 0;

    /* renamed from: j, reason: collision with root package name */
    int[] f46132j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    boolean[] f46133k = new boolean[4];

    /* renamed from: l, reason: collision with root package name */
    int f46134l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f46128f;
        int[] iArr = this.f46126d;
        if (i11 >= iArr.length) {
            this.f46126d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f46127e;
            this.f46127e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f46126d;
        int i12 = this.f46128f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f46127e;
        this.f46128f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f46125c;
        int[] iArr = this.f46123a;
        if (i12 >= iArr.length) {
            this.f46123a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f46124b;
            this.f46124b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f46123a;
        int i13 = this.f46125c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f46124b;
        this.f46125c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f46131i;
        int[] iArr = this.f46129g;
        if (i11 >= iArr.length) {
            this.f46129g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f46130h;
            this.f46130h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f46129g;
        int i12 = this.f46131i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f46130h;
        this.f46131i = i12 + 1;
        strArr2[i12] = str;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f46125c + ", mCountFloat=" + this.f46128f + ", mCountString=" + this.f46131i + ", mCountBoolean=" + this.f46134l + '}';
    }
}
