package x;

import java.util.Arrays;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2985f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24020a;

    /* renamed from: e, reason: collision with root package name */
    public float f24024e;

    /* renamed from: l, reason: collision with root package name */
    public int f24030l;

    /* renamed from: b, reason: collision with root package name */
    public int f24021b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f24022c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f24023d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24025f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f24026g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f24027h = new float[9];
    public C2981b[] i = new C2981b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f24028j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f24029k = 0;

    public C2985f(int i) {
        this.f24030l = i;
    }

    public final void a(C2981b c2981b) {
        int i = 0;
        while (true) {
            int i3 = this.f24028j;
            if (i >= i3) {
                C2981b[] c2981bArr = this.i;
                if (i3 >= c2981bArr.length) {
                    this.i = (C2981b[]) Arrays.copyOf(c2981bArr, c2981bArr.length * 2);
                }
                C2981b[] c2981bArr2 = this.i;
                int i6 = this.f24028j;
                c2981bArr2[i6] = c2981b;
                this.f24028j = i6 + 1;
                return;
            }
            if (this.i[i] == c2981b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C2981b c2981b) {
        int i = this.f24028j;
        int i3 = 0;
        while (i3 < i) {
            if (this.i[i3] == c2981b) {
                while (i3 < i - 1) {
                    C2981b[] c2981bArr = this.i;
                    int i6 = i3 + 1;
                    c2981bArr[i3] = c2981bArr[i6];
                    i3 = i6;
                }
                this.f24028j--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f24030l = 5;
        this.f24023d = 0;
        this.f24021b = -1;
        this.f24022c = -1;
        this.f24024e = 0.0f;
        this.f24025f = false;
        int i = this.f24028j;
        for (int i3 = 0; i3 < i; i3++) {
            this.i[i3] = null;
        }
        this.f24028j = 0;
        this.f24029k = 0;
        this.f24020a = false;
        Arrays.fill(this.f24027h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24021b - ((C2985f) obj).f24021b;
    }

    public final void d(C2982c c2982c, float f2) {
        this.f24024e = f2;
        this.f24025f = true;
        int i = this.f24028j;
        this.f24022c = -1;
        for (int i3 = 0; i3 < i; i3++) {
            this.i[i3].h(c2982c, this, false);
        }
        this.f24028j = 0;
    }

    public final void e(C2982c c2982c, C2981b c2981b) {
        int i = this.f24028j;
        for (int i3 = 0; i3 < i; i3++) {
            this.i[i3].i(c2982c, c2981b, false);
        }
        this.f24028j = 0;
    }

    public final String toString() {
        return "" + this.f24021b;
    }
}
