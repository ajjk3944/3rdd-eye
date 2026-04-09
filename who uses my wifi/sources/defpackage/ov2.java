package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ov2 implements v93 {
    public final jv2 g;
    public final ym h;
    public final HashMap f = new HashMap();
    public final HashMap i = new HashMap();

    public ov2(jv2 jv2Var, Set set, ym ymVar) {
        this.g = jv2Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            nv2 nv2Var = (nv2) it.next();
            HashMap map = this.i;
            nv2Var.getClass();
            map.put(s93.j, nv2Var);
        }
        this.h = ymVar;
    }

    @Override // defpackage.v93
    public final void H(s93 s93Var, String str, Throwable th) {
        HashMap map = this.f;
        if (map.containsKey(s93Var)) {
            this.h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(s93Var)).longValue();
            this.g.a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.i.containsKey(s93Var)) {
            a(s93Var, false);
        }
    }

    @Override // defpackage.v93
    public final void R(String str, s93 s93Var) {
        HashMap map = this.f;
        if (map.containsKey(s93Var)) {
            this.h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(s93Var)).longValue();
            this.g.a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.i.containsKey(s93Var)) {
            a(s93Var, true);
        }
    }

    public final void a(s93 s93Var, boolean z) {
        nv2 nv2Var = (nv2) this.i.get(s93Var);
        if (nv2Var == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        s93 s93Var2 = nv2Var.b;
        HashMap map = this.f;
        if (map.containsKey(s93Var2)) {
            this.h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(s93Var2)).longValue();
            String str2 = nv2Var.a;
            int length = str.length();
            ConcurrentHashMap concurrentHashMap = this.g.a;
            StringBuilder sb = new StringBuilder(length + String.valueOf(jElapsedRealtime).length());
            sb.append(str);
            sb.append(jElapsedRealtime);
            concurrentHashMap.put("label.".concat(str2), sb.toString());
        }
    }

    @Override // defpackage.v93
    public final void w(String str, s93 s93Var) {
        this.h.getClass();
        this.f.put(s93Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // defpackage.v93
    public final void s(String str) {
    }
}
