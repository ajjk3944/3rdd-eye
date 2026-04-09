package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nf2 extends zd3 {
    public final Context j;
    public final th3 k;
    public final vg0 l;
    public final String m;
    public final int n;
    public final boolean o;
    public InputStream p;
    public boolean q;
    public Uri r;
    public volatile ww1 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public n70 y;
    public final AtomicLong z;

    public nf2(Context context, th3 th3Var, String str, int i, ws3 ws3Var, vg0 vg0Var) {
        super(false);
        this.j = context;
        this.k = th3Var;
        this.l = vg0Var;
        this.m = str;
        this.n = i;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0L;
        this.z = new AtomicLong(-1L);
        this.y = null;
        this.o = ((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue();
        b(ws3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    /* JADX WARN: Type inference failed for: r2v23, types: [hg4] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.String] */
    @Override // defpackage.th3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.ij3 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf2.a(ij3):long");
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.q) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.p;
        int iD = inputStream != null ? inputStream.read(bArr, i, i2) : this.k.d(bArr, i, i2);
        if (this.o && this.p == null) {
            return iD;
        }
        f(iD);
        return iD;
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.r;
    }

    public final boolean k() {
        if (!this.o) {
            return false;
        }
        iz1 iz1Var = mz1.M4;
        tw1 tw1Var = tw1.e;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue() || this.v) {
            return ((Boolean) tw1Var.c.a(mz1.N4)).booleanValue() && !this.w;
        }
        return true;
    }

    @Override // defpackage.th3
    public final void l() throws IOException {
        if (!this.q) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.q = false;
        this.r = null;
        boolean z = (this.o && this.p == null) ? false : true;
        InputStream inputStream = this.p;
        if (inputStream != null) {
            g82.c(inputStream);
            this.p = null;
        } else {
            this.k.l();
        }
        if (z) {
            j();
        }
    }
}
