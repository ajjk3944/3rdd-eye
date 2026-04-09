package p0;

import N7.G8;
import java.util.Arrays;
import java.util.Comparator;
import p0.b;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class d extends p0.b {

    /* renamed from: f, reason: collision with root package name */
    public e[] f44996f;

    /* renamed from: g, reason: collision with root package name */
    public e[] f44997g;

    /* renamed from: h, reason: collision with root package name */
    public int f44998h;
    public b i;

    /* compiled from: PriorityGoalRow.java */
    public class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f45002c - eVar2.f45002c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public e f44999a;

        public b() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.f44999a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbU = G8.u(string);
                    sbU.append(this.f44999a.i[i]);
                    sbU.append(" ");
                    string = sbU.toString();
                }
            }
            StringBuilder sbV = G8.v(string, "] ");
            sbV.append(this.f44999a);
            return sbV.toString();
        }
    }

    @Override // p0.b, p0.c.a
    public final e a(boolean[] zArr) {
        int i = -1;
        for (int i10 = 0; i10 < this.f44998h; i10++) {
            e[] eVarArr = this.f44996f;
            e eVar = eVarArr[i10];
            if (!zArr[eVar.f45002c]) {
                b bVar = this.i;
                bVar.f44999a = eVar;
                int i11 = 8;
                if (i == -1) {
                    while (i11 >= 0) {
                        float f10 = bVar.f44999a.i[i11];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    e eVar2 = eVarArr[i];
                    while (true) {
                        if (i11 >= 0) {
                            float f11 = eVar2.i[i11];
                            float f12 = bVar.f44999a.i[i11];
                            if (f12 == f11) {
                                i11--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f44996f[i];
    }

    @Override // p0.b
    public final boolean e() {
        return this.f44998h == 0;
    }

    @Override // p0.b
    public final void i(c cVar, p0.b bVar, boolean z10) {
        e eVar = bVar.f44975a;
        if (eVar == null) {
            return;
        }
        b.a aVar = bVar.f44978d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            e eVarF = aVar.f(i);
            float fH = aVar.h(i);
            b bVar2 = this.i;
            bVar2.f44999a = eVarF;
            boolean z11 = eVarF.f45001b;
            float[] fArr = eVar.i;
            if (z11) {
                boolean z12 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = bVar2.f44999a.i;
                    float f10 = (fArr[i10] * fH) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        bVar2.f44999a.i[i10] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    d.this.k(bVar2.f44999a);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != 0.0f) {
                        float f12 = f11 * fH;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar2.f44999a.i[i11] = f12;
                    } else {
                        bVar2.f44999a.i[i11] = 0.0f;
                    }
                }
                j(eVarF);
            }
            this.f44976b = (bVar.f44976b * fH) + this.f44976b;
        }
        k(eVar);
    }

    public final void j(e eVar) {
        int i;
        int i10 = this.f44998h + 1;
        e[] eVarArr = this.f44996f;
        if (i10 > eVarArr.length) {
            e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            this.f44996f = eVarArr2;
            this.f44997g = (e[]) Arrays.copyOf(eVarArr2, eVarArr2.length * 2);
        }
        e[] eVarArr3 = this.f44996f;
        int i11 = this.f44998h;
        eVarArr3[i11] = eVar;
        int i12 = i11 + 1;
        this.f44998h = i12;
        if (i12 > 1 && eVarArr3[i11].f45002c > eVar.f45002c) {
            int i13 = 0;
            while (true) {
                i = this.f44998h;
                if (i13 >= i) {
                    break;
                }
                this.f44997g[i13] = this.f44996f[i13];
                i13++;
            }
            Arrays.sort(this.f44997g, 0, i, new a());
            for (int i14 = 0; i14 < this.f44998h; i14++) {
                this.f44996f[i14] = this.f44997g[i14];
            }
        }
        eVar.f45001b = true;
        eVar.a(this);
    }

    public final void k(e eVar) {
        int i = 0;
        while (i < this.f44998h) {
            if (this.f44996f[i] == eVar) {
                while (true) {
                    int i10 = this.f44998h;
                    if (i >= i10 - 1) {
                        this.f44998h = i10 - 1;
                        eVar.f45001b = false;
                        return;
                    } else {
                        e[] eVarArr = this.f44996f;
                        int i11 = i + 1;
                        eVarArr[i] = eVarArr[i11];
                        i = i11;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p0.b
    public final String toString() {
        String str = " goal -> (" + this.f44976b + ") : ";
        for (int i = 0; i < this.f44998h; i++) {
            e eVar = this.f44996f[i];
            b bVar = this.i;
            bVar.f44999a = eVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
