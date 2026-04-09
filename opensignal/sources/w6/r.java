package w6;

import a5.b0;
import a5.d0;
import ma.g0;

/* loaded from: classes.dex */
public final class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f24351a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.v f24352b = new a5.v(32);

    /* renamed from: c, reason: collision with root package name */
    public int f24353c;

    /* renamed from: d, reason: collision with root package name */
    public int f24354d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24356f;

    public r(q qVar) {
        this.f24351a = qVar;
    }

    @Override // w6.w
    public final void a() {
        this.f24356f = true;
    }

    @Override // w6.w
    public final void b(int i10, a5.v vVar) {
        boolean z10 = (i10 & 1) != 0;
        int iT = z10 ? vVar.f166b + vVar.t() : -1;
        if (this.f24356f) {
            if (!z10) {
                return;
            }
            this.f24356f = false;
            vVar.E(iT);
            this.f24354d = 0;
        }
        while (vVar.a() > 0) {
            int i11 = this.f24354d;
            a5.v vVar2 = this.f24352b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iT2 = vVar.t();
                    vVar.E(vVar.f166b - 1);
                    if (iT2 == 255) {
                        this.f24356f = true;
                        return;
                    }
                }
                int iMin = Math.min(vVar.a(), 3 - this.f24354d);
                vVar.e(vVar2.f165a, this.f24354d, iMin);
                int i12 = this.f24354d + iMin;
                this.f24354d = i12;
                if (i12 == 3) {
                    vVar2.E(0);
                    vVar2.D(3);
                    vVar2.F(1);
                    int iT3 = vVar2.t();
                    int iT4 = vVar2.t();
                    this.f24355e = (iT3 & 128) != 0;
                    int i13 = (((iT3 & 15) << 8) | iT4) + 3;
                    this.f24353c = i13;
                    byte[] bArr = vVar2.f165a;
                    if (bArr.length < i13) {
                        vVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(vVar.a(), this.f24353c - this.f24354d);
                vVar.e(vVar2.f165a, this.f24354d, iMin2);
                int i14 = this.f24354d + iMin2;
                this.f24354d = i14;
                int i15 = this.f24353c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f24355e) {
                        byte[] bArr2 = vVar2.f165a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = d0.f114l[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = d0.f105a;
                        if (i16 != 0) {
                            this.f24356f = true;
                            return;
                        }
                        vVar2.D(this.f24353c - 4);
                    } else {
                        vVar2.D(i15);
                    }
                    vVar2.E(0);
                    this.f24351a.b(vVar2);
                    this.f24354d = 0;
                }
            }
        }
    }

    @Override // w6.w
    public final void g(b0 b0Var, u5.m mVar, g0 g0Var) {
        this.f24351a.g(b0Var, mVar, g0Var);
        this.f24356f = true;
    }
}
