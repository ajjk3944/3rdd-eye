package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cf2 implements Runnable {
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ if2 o;

    public cf2(if2 if2Var, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = j2;
        this.l = z;
        this.m = i3;
        this.n = i4;
        this.o = if2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f);
        map.put("cachedSrc", this.g);
        map.put("bytesLoaded", Integer.toString(this.h));
        map.put("totalBytes", Integer.toString(this.i));
        map.put("bufferedDuration", Long.toString(this.j));
        map.put("totalDuration", Long.toString(this.k));
        map.put("cacheReady", true != this.l ? "0" : "1");
        map.put("playerCount", Integer.toString(this.m));
        map.put("playerPreparedCount", Integer.toString(this.n));
        this.o.n(map);
    }
}
