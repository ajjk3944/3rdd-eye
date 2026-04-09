package com.bytedance.adsdk.vt.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum lh {
    JSON(".json"),
    ZIP(".zip");


    /* renamed from: lh, reason: collision with root package name */
    public final String f7220lh;

    lh(String str) {
        this.f7220lh = str;
    }

    public final String ouw() {
        return ".temp" + this.f7220lh;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7220lh;
    }
}
