package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class of2 implements th3 {
    public final cf3 f;
    public final long g;
    public final th3 h;
    public long i;
    public Uri j;

    public of2(cf3 cf3Var, int i, th3 th3Var) {
        this.f = cf3Var;
        this.g = i;
        this.h = th3Var;
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) {
        ij3 ij3Var2;
        ij3 ij3Var3;
        ij3 ij3Var4;
        Uri uri = ij3Var.a;
        long j = ij3Var.d;
        this.j = uri;
        long j2 = ij3Var.c;
        long j3 = this.g;
        if (j2 >= j3) {
            ij3Var2 = null;
        } else {
            long jMin = j3 - j2;
            if (j != -1) {
                jMin = Math.min(j, jMin);
            }
            ij3Var2 = new ij3(uri, j2, jMin);
        }
        if (j == -1 || j2 + j > j3) {
            ij3Var3 = ij3Var2;
            ij3Var4 = new ij3(uri, Math.max(j3, j2), j != -1 ? Math.min(j, (j2 + j) - j3) : -1L);
        } else {
            ij3Var3 = ij3Var2;
            ij3Var4 = null;
        }
        long jA = ij3Var3 != null ? this.f.a(ij3Var3) : 0L;
        long jA2 = ij3Var4 != null ? this.h.a(ij3Var4) : 0L;
        this.i = j2;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.i;
        long j2 = this.g;
        if (j < j2) {
            int iD = this.f.d(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.i + iD;
            this.i = j3;
            i3 = iD;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iD2 = this.h.d(bArr, i + i3, i2 - i3);
        int i4 = i3 + iD2;
        this.i += iD2;
        return i4;
    }

    @Override // defpackage.th3
    public final Map g() {
        return xn3.l;
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.j;
    }

    @Override // defpackage.th3
    public final void l() {
        this.f.l();
        this.h.l();
    }

    @Override // defpackage.th3
    public final void b(ws3 ws3Var) {
    }
}
