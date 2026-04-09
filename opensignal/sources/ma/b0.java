package ma;

/* loaded from: classes.dex */
public final class b0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f16389a;

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f16390b = new fb.f(32);

    /* renamed from: c, reason: collision with root package name */
    public int f16391c;

    /* renamed from: d, reason: collision with root package name */
    public int f16392d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16393e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16394f;

    public b0(a0 a0Var) {
        this.f16389a = a0Var;
    }

    @Override // ma.h0
    public final void a() {
        this.f16394f = true;
    }

    @Override // ma.h0
    public final void b(int i10, fb.f fVar) {
        boolean z10 = (i10 & 1) != 0;
        int iO = z10 ? fVar.f8801b + fVar.o() : -1;
        if (this.f16394f) {
            if (!z10) {
                return;
            }
            this.f16394f = false;
            fVar.y(iO);
            this.f16392d = 0;
        }
        while (fVar.a() > 0) {
            int i11 = this.f16392d;
            fb.f fVar2 = this.f16390b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iO2 = fVar.o();
                    fVar.y(fVar.f8801b - 1);
                    if (iO2 == 255) {
                        this.f16394f = true;
                        return;
                    }
                }
                int iMin = Math.min(fVar.a(), 3 - this.f16392d);
                fVar.c(fVar2.f8800a, this.f16392d, iMin);
                int i12 = this.f16392d + iMin;
                this.f16392d = i12;
                if (i12 == 3) {
                    fVar2.y(0);
                    fVar2.x(3);
                    fVar2.z(1);
                    int iO3 = fVar2.o();
                    int iO4 = fVar2.o();
                    this.f16393e = (iO3 & 128) != 0;
                    int i13 = (((iO3 & 15) << 8) | iO4) + 3;
                    this.f16391c = i13;
                    byte[] bArr = fVar2.f8800a;
                    if (bArr.length < i13) {
                        fVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(fVar.a(), this.f16391c - this.f16392d);
                fVar.c(fVar2.f8800a, this.f16392d, iMin2);
                int i14 = this.f16392d + iMin2;
                this.f16392d = i14;
                int i15 = this.f16391c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f16393e) {
                        byte[] bArr2 = fVar2.f8800a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = qb.v.f20837l[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = qb.v.f20828a;
                        if (i16 != 0) {
                            this.f16394f = true;
                            return;
                        }
                        fVar2.x(this.f16391c - 4);
                    } else {
                        fVar2.x(i15);
                    }
                    fVar2.y(0);
                    this.f16389a.c(fVar2);
                    this.f16392d = 0;
                }
            }
        }
    }

    @Override // ma.h0
    public final void d(qb.u uVar, ca.m mVar, g0 g0Var) {
        this.f16389a.d(uVar, mVar, g0Var);
        this.f16394f = true;
    }
}
