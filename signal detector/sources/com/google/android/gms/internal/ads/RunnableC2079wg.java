package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2079wg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17460c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0471Dg f17462e;

    public RunnableC2079wg(C0471Dg c0471Dg, String str, String str2, int i, int i3) {
        this.f17458a = str;
        this.f17459b = str2;
        this.f17460c = i;
        this.f17461d = i3;
        this.f17462e = c0471Dg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f17458a);
        map.put("cachedSrc", this.f17459b);
        map.put("bytesLoaded", Integer.toString(this.f17460c));
        map.put("totalBytes", Integer.toString(this.f17461d));
        map.put("cacheReady", "0");
        this.f17462e.n(map);
    }
}
