package x2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements Comparable {
    public e E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f25011a;

    /* renamed from: x, reason: collision with root package name */
    public float f25015x;

    /* renamed from: d, reason: collision with root package name */
    public int f25012d = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f25013g = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f25014r = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25016y = false;
    public final float[] B = new float[9];
    public final float[] D = new float[9];
    public b[] F = new b[16];
    public int G = 0;
    public int H = 0;

    public f(e eVar) {
        this.E = eVar;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.G;
            if (i10 >= i11) {
                b[] bVarArr = this.F;
                if (i11 >= bVarArr.length) {
                    this.F = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.F;
                int i12 = this.G;
                bVarArr2[i12] = bVar;
                this.G = i12 + 1;
                return;
            }
            if (this.F[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.G;
        int i11 = 0;
        while (i11 < i10) {
            if (this.F[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.F;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.G--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.E = e.UNKNOWN;
        this.f25014r = 0;
        this.f25012d = -1;
        this.f25013g = -1;
        this.f25015x = 0.0f;
        this.f25016y = false;
        int i10 = this.G;
        for (int i11 = 0; i11 < i10; i11++) {
            this.F[i11] = null;
        }
        this.G = 0;
        this.H = 0;
        this.f25011a = false;
        Arrays.fill(this.D, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f25012d - ((f) obj).f25012d;
    }

    public final void d(c cVar, float f10) {
        this.f25015x = f10;
        this.f25016y = true;
        int i10 = this.G;
        this.f25013g = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.F[i11].h(cVar, this, false);
        }
        this.G = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.G;
        for (int i11 = 0; i11 < i10; i11++) {
            this.F[i11].i(cVar, bVar, false);
        }
        this.G = 0;
    }

    public final String toString() {
        return "" + this.f25012d;
    }
}
