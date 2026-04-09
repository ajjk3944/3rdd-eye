package com.bytedance.sdk.openadsdk.api.nativeAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PAGImageItem {

    /* renamed from: lh, reason: collision with root package name */
    private final String f7824lh;
    private final int ouw;
    private final int vt;
    private float yu;

    public PAGImageItem(int i4, int i10, String str, float f10) {
        this.ouw = i4;
        this.vt = i10;
        this.f7824lh = str;
        this.yu = f10;
    }

    public float getDuration() {
        return this.yu;
    }

    public int getHeight() {
        return this.ouw;
    }

    public String getImageUrl() {
        return this.f7824lh;
    }

    public int getWidth() {
        return this.vt;
    }

    public PAGImageItem(int i4, int i10, String str) {
        this(i4, i10, str, 0.0f);
    }
}
