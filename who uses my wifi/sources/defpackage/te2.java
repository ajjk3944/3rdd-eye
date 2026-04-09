package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class te2 implements th3 {
    public final Context f;
    public final bl3 g;
    public final String h;
    public final int i;
    public final boolean j;
    public InputStream k;
    public boolean l;
    public Uri m;
    public volatile ww1 n;
    public boolean o = false;
    public boolean p = false;
    public ij3 q;

    public te2(Context context, bl3 bl3Var, String str, int i) {
        this.f = context;
        this.g = bl3Var;
        this.h = str;
        this.i = i;
        new AtomicLong(-1L);
        this.j = ((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue();
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) throws IOException {
        if (this.l) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.l = true;
        Uri uri = ij3Var.a;
        this.m = uri;
        this.q = ij3Var;
        this.n = ww1.a(uri);
        iz1 iz1Var = mz1.J4;
        tw1 tw1Var = tw1.e;
        uw1 uw1VarT = null;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            if (this.n != null) {
                this.n.m = ij3Var.c;
                ww1 ww1Var = this.n;
                String str = this.h;
                ww1Var.n = str != null ? str : "";
                this.n.o = this.i;
                uw1VarT = hg4.C.j.t(this.n);
            }
            if (uw1VarT != null && uw1VarT.a()) {
                this.o = uw1VarT.d();
                this.p = uw1VarT.c();
                if (!c()) {
                    this.k = uw1VarT.b();
                    return -1L;
                }
            }
        } else if (this.n != null) {
            this.n.m = ij3Var.c;
            ww1 ww1Var2 = this.n;
            String str2 = this.h;
            ww1Var2.n = str2 != null ? str2 : "";
            this.n.o = this.i;
            long jLongValue = (this.n.l ? (Long) tw1Var.c.a(mz1.L4) : (Long) tw1Var.c.a(mz1.K4)).longValue();
            hg4.C.k.getClass();
            SystemClock.elapsedRealtime();
            yw1 yw1VarN = us0.n(this.f, this.n);
            try {
                try {
                    try {
                        ax1 ax1Var = (ax1) yw1VarN.f.get(jLongValue, TimeUnit.MILLISECONDS);
                        ax1Var.getClass();
                        this.o = ax1Var.c;
                        this.p = ax1Var.e;
                        if (!c()) {
                            this.k = ax1Var.a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        yw1VarN.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    yw1VarN.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            hg4.C.k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.n != null) {
            Map map = ij3Var.b;
            long j = ij3Var.c;
            long j2 = ij3Var.d;
            int i = ij3Var.e;
            Uri uri2 = Uri.parse(this.n.f);
            zt0.d0(uri2, "The uri must be set.");
            this.q = new ij3(uri2, map, j, j2, i);
        }
        return this.g.a(this.q);
    }

    public final boolean c() {
        if (!this.j) {
            return false;
        }
        iz1 iz1Var = mz1.M4;
        tw1 tw1Var = tw1.e;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue() || this.o) {
            return ((Boolean) tw1Var.c.a(mz1.N4)).booleanValue() && !this.p;
        }
        return true;
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.l) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.k;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.g.d(bArr, i, i2);
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.m;
    }

    @Override // defpackage.th3
    public final void l() throws IOException {
        if (!this.l) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.l = false;
        this.m = null;
        InputStream inputStream = this.k;
        if (inputStream == null) {
            this.g.l();
        } else {
            g82.c(inputStream);
            this.k = null;
        }
    }

    @Override // defpackage.th3
    public final void b(ws3 ws3Var) {
    }
}
