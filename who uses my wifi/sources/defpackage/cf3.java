package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cf3 extends zd3 {
    public final ds1 j;
    public Uri k;
    public byte[] l;
    public int m;
    public int n;
    public boolean o;

    public cf3(byte[] bArr) {
        ds1 ds1Var = new ds1(1, bArr);
        super(false);
        this.j = ds1Var;
        zt0.D(bArr.length > 0);
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) throws di3 {
        c(ij3Var);
        this.k = ij3Var.a;
        byte[] bArr = this.j.a;
        this.l = bArr;
        long j = ij3Var.c;
        int length = bArr.length;
        if (j > length) {
            throw new di3();
        }
        int i = (int) j;
        this.m = i;
        int i2 = length - i;
        this.n = i2;
        long j2 = ij3Var.d;
        if (j2 != -1) {
            this.n = (int) Math.min(i2, j2);
        }
        this.o = true;
        e(ij3Var);
        return j2 != -1 ? j2 : this.n;
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.n;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.l;
        bArr2.getClass();
        System.arraycopy(bArr2, this.m, bArr, i, iMin);
        this.m += iMin;
        this.n -= iMin;
        f(iMin);
        return iMin;
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.k;
    }

    @Override // defpackage.th3
    public final void l() {
        if (this.o) {
            this.o = false;
            j();
        }
        this.k = null;
        this.l = null;
    }
}
