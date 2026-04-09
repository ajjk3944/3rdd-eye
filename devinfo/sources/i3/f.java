package i3;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25853a;

    /* renamed from: e, reason: collision with root package name */
    public float f25857e;

    /* renamed from: l, reason: collision with root package name */
    public int f25862l;

    /* renamed from: b, reason: collision with root package name */
    public int f25854b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f25855c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f25856d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25858f = false;
    public final float[] g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f25859h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public b[] f25860i = new b[16];
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f25861k = 0;

    public f(int i4) {
        this.f25862l = i4;
    }

    public final void a(b bVar) {
        int i4 = 0;
        while (true) {
            int i10 = this.j;
            if (i4 >= i10) {
                b[] bVarArr = this.f25860i;
                if (i10 >= bVarArr.length) {
                    this.f25860i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f25860i;
                int i11 = this.j;
                bVarArr2[i11] = bVar;
                this.j = i11 + 1;
                return;
            }
            if (this.f25860i[i4] == bVar) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void b(b bVar) {
        int i4 = this.j;
        int i10 = 0;
        while (i10 < i4) {
            if (this.f25860i[i10] == bVar) {
                while (i10 < i4 - 1) {
                    b[] bVarArr = this.f25860i;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.j--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f25862l = 5;
        this.f25856d = 0;
        this.f25854b = -1;
        this.f25855c = -1;
        this.f25857e = 0.0f;
        this.f25858f = false;
        int i4 = this.j;
        for (int i10 = 0; i10 < i4; i10++) {
            this.f25860i[i10] = null;
        }
        this.j = 0;
        this.f25861k = 0;
        this.f25853a = false;
        Arrays.fill(this.f25859h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f25854b - ((f) obj).f25854b;
    }

    public final void d(c cVar, float f10) {
        this.f25857e = f10;
        this.f25858f = true;
        int i4 = this.j;
        this.f25855c = -1;
        for (int i10 = 0; i10 < i4; i10++) {
            this.f25860i[i10].h(cVar, this, false);
        }
        this.j = 0;
    }

    public final void e(c cVar, b bVar) {
        int i4 = this.j;
        for (int i10 = 0; i10 < i4; i10++) {
            this.f25860i[i10].i(cVar, bVar, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f25854b;
    }
}
