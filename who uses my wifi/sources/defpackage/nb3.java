package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nb3 {
    public final ub3 c;
    public final sq0 d;
    public final Context e;
    public volatile ConnectivityManager f;
    public final ym h;
    public AtomicInteger i;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public nb3(ub3 ub3Var, sq0 sq0Var, Context context, ym ymVar) {
        this.c = ub3Var;
        this.d = sq0Var;
        this.e = context;
        this.h = ymVar;
    }

    public static String a(String str, s2 s2Var) {
        String strName = s2Var == null ? "NULL" : s2Var.name();
        return ex0.l(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final void b(boolean z) {
        synchronized (this) {
            if (((Boolean) tw1.e.c.a(mz1.x)).booleanValue()) {
                c(z);
            }
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (z) {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((jb3) it.next()).j();
                }
            } else {
                Iterator it2 = this.a.values().iterator();
                while (it2.hasNext()) {
                    ((jb3) it2.next()).f.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00ee, B:35:0x0103, B:37:0x0109, B:34:0x00fe), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.ArrayList d(java.util.List r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb3.d(java.util.List):java.util.ArrayList");
    }

    public final synchronized boolean e(String str, s2 s2Var) {
        boolean z;
        try {
            this.h.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jb3 jb3VarG = g(str, s2Var);
            z = jb3VarG != null && jb3VarG.h();
            Long lValueOf = z ? Long.valueOf(System.currentTimeMillis()) : null;
            qb3 qb3Var = new qb3(new pb3(str, s2Var));
            int iM = 0;
            sq0 sq0Var = this.d;
            int i = jb3VarG == null ? 0 : jb3VarG.e.i;
            if (jb3VarG != null) {
                iM = jb3VarG.m();
            }
            sq0Var.u(i, iM, jCurrentTimeMillis, lValueOf, jb3VarG != null ? jb3VarG.k() : null, qb3Var, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final synchronized Object f(s2 s2Var, Class cls, String str) {
        qb3 qb3Var = new qb3(new pb3(str, s2Var));
        sq0 sq0Var = this.d;
        this.h.getClass();
        sq0Var.z("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, qb3Var, "1");
        jb3 jb3VarG = g(str, s2Var);
        if (jb3VarG == null) {
            return null;
        }
        try {
            String strK = jb3VarG.k();
            Object objI = jb3VarG.i();
            Object objCast = objI == null ? null : cls.cast(objI);
            if (objCast != null) {
                sq0Var.w(System.currentTimeMillis(), jb3VarG.e.i, jb3VarG.m(), strK, qb3Var, "1");
            }
            return objCast;
        } catch (ClassCastException e) {
            hg4.C.h.d("PreloadAdManager.pollAd", e);
            "Unable to cast ad to the requested type:".concat(cls.getName());
            gi2.R();
            return null;
        }
    }

    public final synchronized jb3 g(String str, s2 s2Var) {
        return (jb3) this.a.get(a(str, s2Var));
    }
}
