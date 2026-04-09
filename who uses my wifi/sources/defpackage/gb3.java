package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gb3 {
    public final HashMap a;
    public final ub3 b;
    public final sq0 c;
    public final Context d;
    public volatile ConnectivityManager e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final ym g;
    public AtomicInteger h;

    public gb3(ub3 ub3Var, sq0 sq0Var, Context context, ym ymVar) {
        HashMap map = new HashMap();
        this.a = map;
        map.put(s2.APP_OPEN_AD, new HashMap());
        map.put(s2.INTERSTITIAL, new HashMap());
        map.put(s2.REWARDED, new HashMap());
        this.b = ub3Var;
        this.c = sq0Var;
        this.d = context;
        this.g = ymVar;
    }

    public final void a(boolean z) {
        synchronized (this) {
            if (((Boolean) tw1.e.c.a(mz1.x)).booleanValue()) {
                b(z);
            }
        }
    }

    public final synchronized void b(boolean z) {
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                for (jb3 jb3Var : ((Map) it.next()).values()) {
                    if (z) {
                        jb3Var.j();
                    } else {
                        jb3Var.f.set(false);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object c(s2 s2Var, Class cls, String str) {
        sq0 sq0Var = this.c;
        this.g.getClass();
        sq0Var.z("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.a;
        if (!map.containsKey(s2Var)) {
            return null;
        }
        jb3 jb3Var = (jb3) ((Map) map.get(s2Var)).get(str);
        if (jb3Var != null && s2Var.equals(s2.a(jb3Var.e.g))) {
            ae3 ae3Var = jb3Var.e;
            pb3 pb3Var = new pb3(ae3Var.f, s2.a(ae3Var.g));
            pb3Var.h = str;
            qb3 qb3Var = new qb3(pb3Var);
            sq0Var.z("poll_ad", "ppac_ts", System.currentTimeMillis(), jb3Var.e.i, jb3Var.m(), null, qb3Var, "2");
            try {
                String strK = jb3Var.k();
                Object objI = jb3Var.i();
                Object objCast = objI == null ? null : cls.cast(objI);
                if (objCast != null) {
                    sq0Var.w(System.currentTimeMillis(), jb3Var.e.i, jb3Var.m(), strK, qb3Var, "2");
                }
                return objCast;
            } catch (ClassCastException e) {
                hg4.C.h.d("PreloadAdManager.pollAd", e);
                "Unable to cast ad to the requested type:".concat(cls.getName());
                gi2.R();
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean d(s2 s2Var) {
        int size;
        int iOrdinal;
        try {
            HashMap map = this.a;
            size = map.containsKey(s2Var) ? ((Map) map.get(s2Var)).size() : 0;
            iOrdinal = s2Var.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) tw1.e.c.a(mz1.U4)).intValue(), 1) : Math.max(((Integer) tw1.e.c.a(mz1.T4)).intValue(), 1) : Math.max(((Integer) tw1.e.c.a(mz1.S4)).intValue(), 1));
    }
}
