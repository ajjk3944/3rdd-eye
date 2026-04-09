package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vy f14815e;

    public oy(vy vyVar, String str, String str2, int i4, int i10) {
        this.f14811a = str;
        this.f14812b = str2;
        this.f14813c = i4;
        this.f14814d = i10;
        this.f14815e = vyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f14811a);
        map.put("cachedSrc", this.f14812b);
        map.put("bytesLoaded", Integer.toString(this.f14813c));
        map.put("totalBytes", Integer.toString(this.f14814d));
        map.put("cacheReady", "0");
        this.f14815e.s(map);
    }
}
