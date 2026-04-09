package l6;

import a5.d0;
import a5.v;
import u5.a0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f14788a;

    /* renamed from: d, reason: collision with root package name */
    public r f14791d;

    /* renamed from: e, reason: collision with root package name */
    public e f14792e;

    /* renamed from: f, reason: collision with root package name */
    public int f14793f;

    /* renamed from: g, reason: collision with root package name */
    public int f14794g;

    /* renamed from: h, reason: collision with root package name */
    public int f14795h;

    /* renamed from: i, reason: collision with root package name */
    public int f14796i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14797l;

    /* renamed from: b, reason: collision with root package name */
    public final q f14789b = new q();

    /* renamed from: c, reason: collision with root package name */
    public final v f14790c = new v();
    public final v j = new v(1);
    public final v k = new v();

    public g(a0 a0Var, r rVar, e eVar) {
        this.f14788a = a0Var;
        this.f14791d = rVar;
        this.f14792e = eVar;
        this.f14791d = rVar;
        this.f14792e = eVar;
        a0Var.c(rVar.f14885a.f14861f);
        d();
    }

    public final p a() {
        if (!this.f14797l) {
            return null;
        }
        q qVar = this.f14789b;
        e eVar = qVar.f14870a;
        int i10 = d0.f105a;
        int i11 = eVar.f14781a;
        p pVar = qVar.f14880m;
        if (pVar == null) {
            pVar = this.f14791d.f14885a.k[i11];
        }
        if (pVar == null || !pVar.f14865a) {
            return null;
        }
        return pVar;
    }

    public final boolean b() {
        this.f14793f++;
        if (!this.f14797l) {
            return false;
        }
        int i10 = this.f14794g + 1;
        this.f14794g = i10;
        int[] iArr = this.f14789b.f14876g;
        int i11 = this.f14795h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f14795h = i11 + 1;
        this.f14794g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        v vVar;
        p pVarA = a();
        if (pVarA == null) {
            return 0;
        }
        int length = pVarA.f14868d;
        q qVar = this.f14789b;
        if (length != 0) {
            vVar = qVar.f14881n;
        } else {
            byte[] bArr = pVarA.f14869e;
            int i12 = d0.f105a;
            int length2 = bArr.length;
            v vVar2 = this.k;
            vVar2.C(length2, bArr);
            length = bArr.length;
            vVar = vVar2;
        }
        boolean z10 = qVar.k && qVar.f14879l[this.f14793f];
        boolean z11 = z10 || i11 != 0;
        v vVar3 = this.j;
        vVar3.f165a[0] = (byte) ((z11 ? 128 : 0) | length);
        vVar3.E(0);
        a0 a0Var = this.f14788a;
        a0Var.d(1, vVar3);
        a0Var.d(length, vVar);
        if (!z11) {
            return length + 1;
        }
        v vVar4 = this.f14790c;
        if (!z10) {
            vVar4.B(8);
            byte[] bArr2 = vVar4.f165a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            a0Var.d(8, vVar4);
            return length + 9;
        }
        v vVar5 = qVar.f14881n;
        int iY = vVar5.y();
        vVar5.F(-2);
        int i13 = (iY * 6) + 2;
        if (i11 != 0) {
            vVar4.B(i13);
            byte[] bArr3 = vVar4.f165a;
            vVar5.e(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            vVar4 = vVar5;
        }
        a0Var.d(i13, vVar4);
        return length + 1 + i13;
    }

    public final void d() {
        q qVar = this.f14789b;
        qVar.f14873d = 0;
        qVar.f14883p = 0L;
        qVar.f14884q = false;
        qVar.k = false;
        qVar.f14882o = false;
        qVar.f14880m = null;
        this.f14793f = 0;
        this.f14795h = 0;
        this.f14794g = 0;
        this.f14796i = 0;
        this.f14797l = false;
    }
}
