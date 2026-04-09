package x2;

import java.util.Arrays;
import sm.i;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f25007f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f25008g;

    /* renamed from: h, reason: collision with root package name */
    public int f25009h;

    /* renamed from: i, reason: collision with root package name */
    public q3.a f25010i;

    @Override // x2.b
    public final f d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f25009h; i11++) {
            f[] fVarArr = this.f25007f;
            f fVar = fVarArr[i11];
            if (!zArr[fVar.f25012d]) {
                q3.a aVar = this.f25010i;
                aVar.f20679d = fVar;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f10 = ((f) aVar.f20679d).D[i12];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f11 = fVar2.D[i12];
                            float f12 = ((f) aVar.f20679d).D[i12];
                            if (f12 == f11) {
                                i12--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f25007f[i10];
    }

    @Override // x2.b
    public final boolean e() {
        return this.f25009h == 0;
    }

    @Override // x2.b
    public final void i(c cVar, b bVar, boolean z10) {
        f fVar = bVar.f24987a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.D;
        a aVar = bVar.f24990d;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = aVar.e(i10);
            float f10 = aVar.f(i10);
            q3.a aVar2 = this.f25010i;
            aVar2.f20679d = fVarE;
            if (fVarE.f25011a) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((f) aVar2.f20679d).D;
                    float f11 = (fArr[i11] * f10) + fArr2[i11];
                    fArr2[i11] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((f) aVar2.f20679d).D[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((d) aVar2.f20680g).k((f) aVar2.f20679d);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f12 = fArr[i12];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((f) aVar2.f20679d).D[i12] = f13;
                    } else {
                        ((f) aVar2.f20679d).D[i12] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f24988b = (bVar.f24988b * f10) + this.f24988b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i10;
        int i11 = this.f25009h + 1;
        f[] fVarArr = this.f25007f;
        if (i11 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f25007f = fVarArr2;
            this.f25008g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f25007f;
        int i12 = this.f25009h;
        fVarArr3[i12] = fVar;
        int i13 = i12 + 1;
        this.f25009h = i13;
        if (i13 > 1 && fVarArr3[i12].f25012d > fVar.f25012d) {
            int i14 = 0;
            while (true) {
                i10 = this.f25009h;
                if (i14 >= i10) {
                    break;
                }
                this.f25008g[i14] = this.f25007f[i14];
                i14++;
            }
            Arrays.sort(this.f25008g, 0, i10, new i(2));
            for (int i15 = 0; i15 < this.f25009h; i15++) {
                this.f25007f[i15] = this.f25008g[i15];
            }
        }
        fVar.f25011a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i10 = 0;
        while (i10 < this.f25009h) {
            if (this.f25007f[i10] == fVar) {
                while (true) {
                    int i11 = this.f25009h;
                    if (i10 >= i11 - 1) {
                        this.f25009h = i11 - 1;
                        fVar.f25011a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f25007f;
                        int i12 = i10 + 1;
                        fVarArr[i10] = fVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // x2.b
    public final String toString() {
        q3.a aVar = this.f25010i;
        String str = " goal -> (" + this.f24988b + ") : ";
        for (int i10 = 0; i10 < this.f25009h; i10++) {
            aVar.f20679d = this.f25007f[i10];
            str = str + aVar + " ";
        }
        return str;
    }
}
