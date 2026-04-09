package ha;

import u5.a0;
import u5.l;
import u5.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10564a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10565b;

    /* renamed from: c, reason: collision with root package name */
    public int f10566c;

    /* renamed from: d, reason: collision with root package name */
    public long f10567d;

    /* renamed from: e, reason: collision with root package name */
    public int f10568e;

    /* renamed from: f, reason: collision with root package name */
    public int f10569f;

    /* renamed from: g, reason: collision with root package name */
    public int f10570g;

    public d(int i10) {
        switch (i10) {
            case 1:
                this.f10564a = new byte[10];
                break;
            default:
                this.f10564a = new byte[10];
                break;
        }
    }

    public void a(a0 a0Var, z zVar) {
        if (this.f10566c > 0) {
            a0Var.a(this.f10567d, this.f10568e, this.f10569f, this.f10570g, zVar);
            this.f10566c = 0;
        }
    }

    public void b(a0 a0Var, long j, int i10, int i11, int i12, z zVar) {
        if (!(this.f10570g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f10565b) {
            int i13 = this.f10566c;
            int i14 = i13 + 1;
            this.f10566c = i14;
            if (i13 == 0) {
                this.f10567d = j;
                this.f10568e = i10;
                this.f10569f = 0;
            }
            this.f10569f += i11;
            this.f10570g = i12;
            if (i14 >= 16) {
                a(a0Var, zVar);
            }
        }
    }

    public void c(l lVar) {
        if (this.f10565b) {
            return;
        }
        byte[] bArr = this.f10564a;
        lVar.p(bArr, 0, 10);
        lVar.l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                i = 40 << ((bArr[((b2 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f10565b = true;
    }
}
