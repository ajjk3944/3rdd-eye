package i3;

import androidx.recyclerview.widget.m;
import java.util.Arrays;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f25849f;
    public f[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f25850h;

    /* renamed from: i, reason: collision with root package name */
    public i f25851i;

    @Override // i3.b
    public final f d(boolean[] zArr) {
        int i4 = -1;
        for (int i10 = 0; i10 < this.f25850h; i10++) {
            f[] fVarArr = this.f25849f;
            f fVar = fVarArr[i10];
            if (!zArr[fVar.f25854b]) {
                i iVar = this.f25851i;
                iVar.f37516b = fVar;
                int i11 = 8;
                if (i4 == -1) {
                    while (i11 >= 0) {
                        float f10 = ((f) iVar.f37516b).f25859h[i11];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i4 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i4];
                    while (true) {
                        if (i11 >= 0) {
                            float f11 = fVar2.f25859h[i11];
                            float f12 = ((f) iVar.f37516b).f25859h[i11];
                            if (f12 == f11) {
                                i11--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f25849f[i4];
    }

    @Override // i3.b
    public final boolean e() {
        return this.f25850h == 0;
    }

    @Override // i3.b
    public final void i(c cVar, b bVar, boolean z3) {
        f fVar = bVar.f25829a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f25859h;
        a aVar = bVar.f25832d;
        int iD = aVar.d();
        for (int i4 = 0; i4 < iD; i4++) {
            f fVarE = aVar.e(i4);
            float f10 = aVar.f(i4);
            i iVar = this.f25851i;
            iVar.f37516b = fVarE;
            if (fVarE.f25853a) {
                boolean z10 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((f) iVar.f37516b).f25859h;
                    float f11 = (fArr[i10] * f10) + fArr2[i10];
                    fArr2[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((f) iVar.f37516b).f25859h[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((d) iVar.f37517c).k((f) iVar.f37516b);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = fArr[i11];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((f) iVar.f37516b).f25859h[i11] = f13;
                    } else {
                        ((f) iVar.f37516b).f25859h[i11] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f25830b = (bVar.f25830b * f10) + this.f25830b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i4;
        int i10 = this.f25850h + 1;
        f[] fVarArr = this.f25849f;
        if (i10 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f25849f = fVarArr2;
            this.g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f25849f;
        int i11 = this.f25850h;
        fVarArr3[i11] = fVar;
        int i12 = i11 + 1;
        this.f25850h = i12;
        if (i12 > 1 && fVarArr3[i11].f25854b > fVar.f25854b) {
            int i13 = 0;
            while (true) {
                i4 = this.f25850h;
                if (i13 >= i4) {
                    break;
                }
                this.g[i13] = this.f25849f[i13];
                i13++;
            }
            Arrays.sort(this.g, 0, i4, new m(6));
            for (int i14 = 0; i14 < this.f25850h; i14++) {
                this.f25849f[i14] = this.g[i14];
            }
        }
        fVar.f25853a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i4 = 0;
        while (i4 < this.f25850h) {
            if (this.f25849f[i4] == fVar) {
                while (true) {
                    int i10 = this.f25850h;
                    if (i4 >= i10 - 1) {
                        this.f25850h = i10 - 1;
                        fVar.f25853a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f25849f;
                        int i11 = i4 + 1;
                        fVarArr[i4] = fVarArr[i11];
                        i4 = i11;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // i3.b
    public final String toString() {
        i iVar = this.f25851i;
        String str = " goal -> (" + this.f25830b + ") : ";
        for (int i4 = 0; i4 < this.f25850h; i4++) {
            iVar.f37516b = this.f25849f[i4];
            str = str + iVar + " ";
        }
        return str;
    }
}
