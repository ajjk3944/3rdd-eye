package n1;

import java.util.Arrays;
import java.util.Comparator;
import n1.b;

/* loaded from: classes.dex */
public class h extends n1.b {

    /* renamed from: g, reason: collision with root package name */
    private int f54251g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f54252h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f54253i;

    /* renamed from: j, reason: collision with root package name */
    private int f54254j;

    /* renamed from: k, reason: collision with root package name */
    b f54255k;

    /* renamed from: l, reason: collision with root package name */
    c f54256l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f54264c - iVar2.f54264c;
        }
    }

    class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        i f54258a;

        /* renamed from: b, reason: collision with root package name */
        h f54259b;

        public b(h hVar) {
            this.f54259b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f54258a.f54262a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f54270i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f54258a.f54270i[i10] = f12;
                    } else {
                        this.f54258a.f54270i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f54258a.f54270i;
                float f13 = fArr[i11] + (iVar.f54270i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f54258a.f54270i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f54258a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f54258a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f54258a.f54270i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f54258a.f54264c - ((i) obj).f54264c;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f54270i[i10];
                float f11 = this.f54258a.f54270i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f54258a.f54270i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f54258a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f54258a.f54270i[i10] + " ";
                }
            }
            return str + "] " + this.f54258a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f54251g = 128;
        this.f54252h = new i[128];
        this.f54253i = new i[128];
        this.f54254j = 0;
        this.f54255k = new b(this);
        this.f54256l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f54254j + 1;
        i[] iVarArr = this.f54252h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f54252h = iVarArr2;
            this.f54253i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f54252h;
        int i12 = this.f54254j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f54254j = i13;
        if (i13 > 1 && iVarArr3[i12].f54264c > iVar.f54264c) {
            int i14 = 0;
            while (true) {
                i10 = this.f54254j;
                if (i14 >= i10) {
                    break;
                }
                this.f54253i[i14] = this.f54252h[i14];
                i14++;
            }
            Arrays.sort(this.f54253i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f54254j; i15++) {
                this.f54252h[i15] = this.f54253i[i15];
            }
        }
        iVar.f54262a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f54254j) {
            if (this.f54252h[i10] == iVar) {
                while (true) {
                    int i11 = this.f54254j;
                    if (i10 >= i11 - 1) {
                        this.f54254j = i11 - 1;
                        iVar.f54262a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f54252h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // n1.b
    public void C(n1.b bVar, boolean z10) {
        i iVar = bVar.f54218a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f54222e;
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            i iVarB = aVar.b(i10);
            float fD = aVar.d(i10);
            this.f54255k.b(iVarB);
            if (this.f54255k.a(iVar, fD)) {
                F(iVarB);
            }
            this.f54219b += bVar.f54219b * fD;
        }
        G(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // n1.b, n1.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n1.i a(n1.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f54254j
            if (r0 >= r2) goto L32
            n1.i[] r2 = r4.f54252h
            r2 = r2[r0]
            int r3 = r2.f54264c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            n1.h$b r3 = r4.f54255k
            r3.b(r2)
            if (r1 != r5) goto L22
            n1.h$b r2 = r4.f54255k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            n1.h$b r2 = r4.f54255k
            n1.i[] r3 = r4.f54252h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            n1.i[] r5 = r4.f54252h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.a(n1.d, boolean[]):n1.i");
    }

    @Override // n1.b, n1.d.a
    public void b(i iVar) {
        this.f54255k.b(iVar);
        this.f54255k.g();
        iVar.f54270i[iVar.f54266e] = 1.0f;
        F(iVar);
    }

    @Override // n1.b, n1.d.a
    public void clear() {
        this.f54254j = 0;
        this.f54219b = 0.0f;
    }

    @Override // n1.b
    public String toString() {
        String str = " goal -> (" + this.f54219b + ") : ";
        for (int i10 = 0; i10 < this.f54254j; i10++) {
            this.f54255k.b(this.f54252h[i10]);
            str = str + this.f54255k + " ";
        }
        return str;
    }
}
