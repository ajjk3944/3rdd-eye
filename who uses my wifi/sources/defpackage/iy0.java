package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iy0 implements Runnable {
    public final ha1 f;
    public final String g;
    public final boolean h;

    static {
        h80.f("StopWorkRunnable");
    }

    public iy0(ha1 ha1Var, String str, boolean z) {
        this.f = ha1Var;
        this.g = str;
        this.h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        ha1 ha1Var = this.f;
        WorkDatabase workDatabase = ha1Var.r;
        om0 om0Var = ha1Var.u;
        h2 h2VarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.g;
            synchronized (om0Var.p) {
                zContainsKey = om0Var.k.containsKey(str);
            }
            if (this.h) {
                om0 om0Var2 = this.f.u;
                String str2 = this.g;
                synchronized (om0Var2.p) {
                    h80.d().a(new Throwable[0]);
                    om0.c(str2, (wa1) om0Var2.k.remove(str2));
                }
            } else {
                if (!zContainsKey && h2VarN.e(this.g) == 2) {
                    h2VarN.n(1, this.g);
                }
                om0 om0Var3 = this.f.u;
                String str3 = this.g;
                synchronized (om0Var3.p) {
                    h80.d().a(new Throwable[0]);
                    om0.c(str3, (wa1) om0Var3.l.remove(str3));
                }
            }
            h80.d().a(new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
