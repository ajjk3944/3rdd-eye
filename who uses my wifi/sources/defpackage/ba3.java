package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ba3 implements aa3 {
    public final Context a;
    public final int p;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int q = 2;
    public int r = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public int j = 2;
    public String k = "";
    public String l = "";
    public String m = "";
    public boolean n = false;
    public boolean o = false;

    public ba3(Context context, int i) {
        this.a = context;
        this.p = i;
    }

    @Override // defpackage.aa3
    public final aa3 G(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // defpackage.aa3
    public final /* bridge */ /* synthetic */ aa3 a() {
        c();
        return this;
    }

    @Override // defpackage.aa3
    public final aa3 b(boolean z) {
        synchronized (this) {
            this.d = z;
        }
        return this;
    }

    public final synchronized void c() {
        Configuration configuration;
        hg4 hg4Var = hg4.C;
        nh4 nh4Var = hg4Var.f;
        Context context = this.a;
        this.e = nh4Var.Y(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.r = i;
        hg4Var.k.getClass();
        this.b = SystemClock.elapsedRealtime();
        this.o = true;
    }

    @Override // defpackage.aa3
    public final synchronized boolean d() {
        return this.o;
    }

    public final synchronized void e() {
        hg4.C.k.getClass();
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.aa3
    public final aa3 f(int i) {
        synchronized (this) {
            this.q = i;
        }
        return this;
    }

    @Override // defpackage.aa3
    public final /* bridge */ /* synthetic */ aa3 h() {
        e();
        return this;
    }

    @Override // defpackage.aa3
    public final boolean i() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // defpackage.aa3
    public final aa3 j(Throwable th) {
        synchronized (this) {
            if (((Boolean) tw1.e.c.a(mz1.x9)).booleanValue()) {
                String strD = j63.d(r92.d(th), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                this.l = strD;
                String strD2 = r92.d(th);
                sq0 sq0VarP = sq0.p(new yk3('\n'));
                strD2.getClass();
                this.k = (String) ((jl3) ((kl3) sq0VarP.g).d(sq0VarP, strD2)).next();
            }
        }
        return this;
    }

    @Override // defpackage.aa3
    public final aa3 k(nx2 nx2Var) {
        synchronized (this) {
            try {
                IBinder iBinder = nx2Var.j;
                if (iBinder != null) {
                    rm2 rm2Var = (rm2) iBinder;
                    String str = rm2Var.i;
                    if (!TextUtils.isEmpty(str)) {
                        this.f = str;
                    }
                    String str2 = rm2Var.g;
                    if (!TextUtils.isEmpty(str2)) {
                        this.g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // defpackage.aa3
    public final aa3 m(String str) {
        synchronized (this) {
            if (((Boolean) tw1.e.c.a(mz1.x9)).booleanValue()) {
                this.m = str;
            }
        }
        return this;
    }

    @Override // defpackage.aa3
    public final synchronized ca3 n() {
        try {
            if (this.n) {
                return null;
            }
            this.n = true;
            if (!this.o) {
                c();
            }
            if (this.c < 0) {
                e();
            }
            return new ca3(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.g = r0;
     */
    @Override // defpackage.aa3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aa3 o(defpackage.p21 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.g     // Catch: java.lang.Throwable -> L10
            c83 r0 = (defpackage.c83) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            r2.f = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L32
        L12:
            java.lang.Object r3 = r3.f     // Catch: java.lang.Throwable -> L10
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L10
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L10
            a83 r0 = (defpackage.a83) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.b0     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1a
            r2.g = r0     // Catch: java.lang.Throwable -> L10
        L30:
            monitor-exit(r2)
            return r2
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba3.o(p21):aa3");
    }

    @Override // defpackage.aa3
    public final aa3 q0(String str) {
        synchronized (this) {
            this.h = str;
        }
        return this;
    }

    @Override // defpackage.aa3
    public final aa3 t(int i) {
        synchronized (this) {
            this.j = i;
        }
        return this;
    }
}
