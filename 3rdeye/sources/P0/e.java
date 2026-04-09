package p0;

import java.util.Arrays;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public final class e implements Comparable<e> {

    /* renamed from: b, reason: collision with root package name */
    public boolean f45001b;

    /* renamed from: f, reason: collision with root package name */
    public float f45005f;

    /* renamed from: j, reason: collision with root package name */
    public a f45008j;

    /* renamed from: c, reason: collision with root package name */
    public int f45002c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f45003d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f45004e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45006g = false;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f45007h = new float[9];
    public final float[] i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public b[] f45009k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    public int f45010l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f45011m = 0;

    /* compiled from: SolverVariable.java */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public e(a aVar) {
        this.f45008j = aVar;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i10 = this.f45010l;
            if (i >= i10) {
                b[] bVarArr = this.f45009k;
                if (i10 >= bVarArr.length) {
                    this.f45009k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f45009k;
                int i11 = this.f45010l;
                bVarArr2[i11] = bVar;
                this.f45010l = i11 + 1;
                return;
            }
            if (this.f45009k[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f45010l;
        int i10 = 0;
        while (i10 < i) {
            if (this.f45009k[i10] == bVar) {
                while (i10 < i - 1) {
                    b[] bVarArr = this.f45009k;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f45010l--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f45008j = a.UNKNOWN;
        this.f45004e = 0;
        this.f45002c = -1;
        this.f45003d = -1;
        this.f45005f = 0.0f;
        this.f45006g = false;
        int i = this.f45010l;
        for (int i10 = 0; i10 < i; i10++) {
            this.f45009k[i10] = null;
        }
        this.f45010l = 0;
        this.f45011m = 0;
        this.f45001b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return this.f45002c - eVar.f45002c;
    }

    public final void d(c cVar, float f10) {
        this.f45005f = f10;
        this.f45006g = true;
        int i = this.f45010l;
        this.f45003d = -1;
        for (int i10 = 0; i10 < i; i10++) {
            this.f45009k[i10].h(cVar, this, false);
        }
        this.f45010l = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f45010l;
        for (int i10 = 0; i10 < i; i10++) {
            this.f45009k[i10].i(cVar, bVar, false);
        }
        this.f45010l = 0;
    }

    public final String toString() {
        return "" + this.f45002c;
    }
}
