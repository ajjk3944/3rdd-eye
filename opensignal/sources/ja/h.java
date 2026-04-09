package ja;

import ca.x;
import qb.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final x f13450a;

    /* renamed from: d, reason: collision with root package name */
    public t f13453d;

    /* renamed from: e, reason: collision with root package name */
    public f f13454e;

    /* renamed from: f, reason: collision with root package name */
    public int f13455f;

    /* renamed from: g, reason: collision with root package name */
    public int f13456g;

    /* renamed from: h, reason: collision with root package name */
    public int f13457h;

    /* renamed from: i, reason: collision with root package name */
    public int f13458i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13459l;

    /* renamed from: b, reason: collision with root package name */
    public final s f13451b = new s();

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f13452c = new fb.f();
    public final fb.f j = new fb.f(1);
    public final fb.f k = new fb.f();

    public h(x xVar, t tVar, f fVar) {
        this.f13450a = xVar;
        this.f13453d = tVar;
        this.f13454e = fVar;
        this.f13453d = tVar;
        this.f13454e = fVar;
        xVar.e(tVar.f13548a.f13523f);
        d();
    }

    public final r a() {
        if (!this.f13459l) {
            return null;
        }
        s sVar = this.f13451b;
        f fVar = sVar.f13532a;
        int i10 = v.f20828a;
        int i11 = fVar.f13444a;
        r rVar = sVar.f13543n;
        if (rVar == null) {
            rVar = this.f13453d.f13548a.k[i11];
        }
        if (rVar == null || !rVar.f13527a) {
            return null;
        }
        return rVar;
    }

    public final boolean b() {
        this.f13455f++;
        if (!this.f13459l) {
            return false;
        }
        int i10 = this.f13456g + 1;
        this.f13456g = i10;
        int[] iArr = this.f13451b.f13538g;
        int i11 = this.f13457h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f13457h = i11 + 1;
        this.f13456g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        fb.f fVar;
        r rVarA = a();
        if (rVarA == null) {
            return 0;
        }
        int length = rVarA.f13530d;
        s sVar = this.f13451b;
        if (length != 0) {
            fVar = sVar.f13544o;
        } else {
            byte[] bArr = rVarA.f13531e;
            int i12 = v.f20828a;
            int length2 = bArr.length;
            fb.f fVar2 = this.k;
            fVar2.w(length2, bArr);
            length = bArr.length;
            fVar = fVar2;
        }
        boolean z10 = sVar.f13541l && sVar.f13542m[this.f13455f];
        boolean z11 = z10 || i11 != 0;
        fb.f fVar3 = this.j;
        fVar3.f8800a[0] = (byte) ((z11 ? 128 : 0) | length);
        fVar3.y(0);
        x xVar = this.f13450a;
        xVar.a(1, fVar3);
        xVar.a(length, fVar);
        if (!z11) {
            return length + 1;
        }
        fb.f fVar4 = this.f13452c;
        if (!z10) {
            fVar4.v(8);
            byte[] bArr2 = fVar4.f8800a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            xVar.a(8, fVar4);
            return length + 9;
        }
        fb.f fVar5 = sVar.f13544o;
        int iT = fVar5.t();
        fVar5.z(-2);
        int i13 = (iT * 6) + 2;
        if (i11 != 0) {
            fVar4.v(i13);
            byte[] bArr3 = fVar4.f8800a;
            fVar5.c(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            fVar4 = fVar5;
        }
        xVar.a(i13, fVar4);
        return length + 1 + i13;
    }

    public final void d() {
        s sVar = this.f13451b;
        sVar.f13535d = 0;
        sVar.f13546q = 0L;
        sVar.f13547r = false;
        sVar.f13541l = false;
        sVar.f13545p = false;
        sVar.f13543n = null;
        this.f13455f = 0;
        this.f13457h = 0;
        this.f13456g = 0;
        this.f13458i = 0;
        this.f13459l = false;
    }
}
