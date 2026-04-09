package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tl2 implements cp2, rn2 {
    public final ym f;
    public final ul2 g;
    public final l83 h;
    public final String i;

    public tl2(ym ymVar, ul2 ul2Var, l83 l83Var, String str) {
        this.f = ymVar;
        this.g = ul2Var;
        this.h = l83Var;
        this.i = str;
    }

    @Override // defpackage.cp2
    public final void a() {
        this.f.getClass();
        this.g.c.put(this.i, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // defpackage.rn2
    public final void e() {
        this.f.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.h.g;
        ul2 ul2Var = this.g;
        ConcurrentHashMap concurrentHashMap = ul2Var.c;
        String str2 = this.i;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        ul2Var.d.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
    }
}
