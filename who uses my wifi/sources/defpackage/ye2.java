package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ye2 implements Runnable {
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ gf2 j;

    public ye2(gf2 gf2Var, String str, String str2, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
        this.j = gf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f);
        map.put("cachedSrc", this.g);
        map.put("bytesLoaded", Integer.toString(this.h));
        map.put("totalBytes", Integer.toString(this.i));
        map.put("cacheReady", "0");
        this.j.n(map);
    }
}
