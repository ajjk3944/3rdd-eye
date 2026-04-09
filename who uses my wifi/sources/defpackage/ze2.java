package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ze2 implements Runnable {
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ ff2 p;

    public ze2(ff2 ff2Var, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = j5;
        this.m = z;
        this.n = i;
        this.o = i2;
        this.p = ff2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f);
        map.put("cachedSrc", this.g);
        map.put("bufferedDuration", Long.toString(this.h));
        map.put("totalDuration", Long.toString(this.i));
        if (((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.j));
            map.put("qoeCachedBytes", Long.toString(this.k));
            map.put("totalBytes", Long.toString(this.l));
            hg4.C.k.getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.m ? "0" : "1");
        map.put("playerCount", Integer.toString(this.n));
        map.put("playerPreparedCount", Integer.toString(this.o));
        this.p.n(map);
    }
}
