package x;

import E.h;
import java.util.Arrays;
import t2.q;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2983d extends C2981b {

    /* renamed from: f, reason: collision with root package name */
    public C2985f[] f24016f;

    /* renamed from: g, reason: collision with root package name */
    public C2985f[] f24017g;

    /* renamed from: h, reason: collision with root package name */
    public int f24018h;
    public q i;

    @Override // x.C2981b
    public final C2985f d(boolean[] zArr) {
        int i = -1;
        for (int i3 = 0; i3 < this.f24018h; i3++) {
            C2985f[] c2985fArr = this.f24016f;
            C2985f c2985f = c2985fArr[i3];
            if (!zArr[c2985f.f24021b]) {
                q qVar = this.i;
                qVar.f23648b = c2985f;
                int i6 = 8;
                if (i == -1) {
                    while (i6 >= 0) {
                        float f2 = ((C2985f) qVar.f23648b).f24027h[i6];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i3;
                                break;
                            }
                            i6--;
                        }
                    }
                } else {
                    C2985f c2985f2 = c2985fArr[i];
                    while (true) {
                        if (i6 >= 0) {
                            float f5 = c2985f2.f24027h[i6];
                            float f6 = ((C2985f) qVar.f23648b).f24027h[i6];
                            if (f6 == f5) {
                                i6--;
                            } else if (f6 < f5) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f24016f[i];
    }

    @Override // x.C2981b
    public final boolean e() {
        return this.f24018h == 0;
    }

    @Override // x.C2981b
    public final void i(C2982c c2982c, C2981b c2981b, boolean z6) {
        C2985f c2985f = c2981b.f23995a;
        if (c2985f == null) {
            return;
        }
        float[] fArr = c2985f.f24027h;
        C2980a c2980a = c2981b.f23998d;
        int iD = c2980a.d();
        for (int i = 0; i < iD; i++) {
            C2985f c2985fE = c2980a.e(i);
            float f2 = c2980a.f(i);
            q qVar = this.i;
            qVar.f23648b = c2985fE;
            if (c2985fE.f24020a) {
                boolean z7 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = ((C2985f) qVar.f23648b).f24027h;
                    float f5 = (fArr[i3] * f2) + fArr2[i3];
                    fArr2[i3] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        ((C2985f) qVar.f23648b).f24027h[i3] = 0.0f;
                    } else {
                        z7 = false;
                    }
                }
                if (z7) {
                    ((C2983d) qVar.f23649c).k((C2985f) qVar.f23648b);
                }
            } else {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f6 = fArr[i6];
                    if (f6 != 0.0f) {
                        float f7 = f6 * f2;
                        if (Math.abs(f7) < 1.0E-4f) {
                            f7 = 0.0f;
                        }
                        ((C2985f) qVar.f23648b).f24027h[i6] = f7;
                    } else {
                        ((C2985f) qVar.f23648b).f24027h[i6] = 0.0f;
                    }
                }
                j(c2985fE);
            }
            this.f23996b = (c2981b.f23996b * f2) + this.f23996b;
        }
        k(c2985f);
    }

    public final void j(C2985f c2985f) {
        int i;
        int i3 = this.f24018h + 1;
        C2985f[] c2985fArr = this.f24016f;
        if (i3 > c2985fArr.length) {
            C2985f[] c2985fArr2 = (C2985f[]) Arrays.copyOf(c2985fArr, c2985fArr.length * 2);
            this.f24016f = c2985fArr2;
            this.f24017g = (C2985f[]) Arrays.copyOf(c2985fArr2, c2985fArr2.length * 2);
        }
        C2985f[] c2985fArr3 = this.f24016f;
        int i6 = this.f24018h;
        c2985fArr3[i6] = c2985f;
        int i7 = i6 + 1;
        this.f24018h = i7;
        if (i7 > 1 && c2985fArr3[i6].f24021b > c2985f.f24021b) {
            int i8 = 0;
            while (true) {
                i = this.f24018h;
                if (i8 >= i) {
                    break;
                }
                this.f24017g[i8] = this.f24016f[i8];
                i8++;
            }
            Arrays.sort(this.f24017g, 0, i, new h(15));
            for (int i9 = 0; i9 < this.f24018h; i9++) {
                this.f24016f[i9] = this.f24017g[i9];
            }
        }
        c2985f.f24020a = true;
        c2985f.a(this);
    }

    public final void k(C2985f c2985f) {
        int i = 0;
        while (i < this.f24018h) {
            if (this.f24016f[i] == c2985f) {
                while (true) {
                    int i3 = this.f24018h;
                    if (i >= i3 - 1) {
                        this.f24018h = i3 - 1;
                        c2985f.f24020a = false;
                        return;
                    } else {
                        C2985f[] c2985fArr = this.f24016f;
                        int i6 = i + 1;
                        c2985fArr[i] = c2985fArr[i6];
                        i = i6;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // x.C2981b
    public final String toString() {
        q qVar = this.i;
        String str = " goal -> (" + this.f23996b + ") : ";
        for (int i = 0; i < this.f24018h; i++) {
            qVar.f23648b = this.f24016f[i];
            str = str + qVar + " ";
        }
        return str;
    }
}
