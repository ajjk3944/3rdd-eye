package com.google.android.gms.internal.ads;

import java.util.HashMap;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2133xg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f17612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f17613h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17614j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0454Cg f17615k;

    public RunnableC2133xg(AbstractC0454Cg abstractC0454Cg, String str, String str2, long j6, long j7, long j8, long j9, long j10, boolean z6, int i, int i3) {
        this.f17606a = str;
        this.f17607b = str2;
        this.f17608c = j6;
        this.f17609d = j7;
        this.f17610e = j8;
        this.f17611f = j9;
        this.f17612g = j10;
        this.f17613h = z6;
        this.i = i;
        this.f17614j = i3;
        this.f17615k = abstractC0454Cg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f17606a);
        map.put("cachedSrc", this.f17607b);
        map.put("bufferedDuration", Long.toString(this.f17608c));
        map.put("totalDuration", Long.toString(this.f17609d));
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f17610e));
            map.put("qoeCachedBytes", Long.toString(this.f17611f));
            map.put("totalBytes", Long.toString(this.f17612g));
            p2.j.f22785C.f22797k.getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f17613h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.i));
        map.put("playerPreparedCount", Integer.toString(this.f17614j));
        this.f17615k.n(map);
    }
}
