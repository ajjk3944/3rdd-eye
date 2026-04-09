package com.bytedance.sdk.openadsdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTImage {

    /* renamed from: lh, reason: collision with root package name */
    private final String f7690lh;
    private final int ouw;
    private final int vt;
    private double yu;

    public TTImage(int i4, int i10, String str, double d10) {
        this.ouw = i4;
        this.vt = i10;
        this.f7690lh = str;
        this.yu = d10;
    }

    public double getDuration() {
        return this.yu;
    }

    public int getHeight() {
        return this.ouw;
    }

    public String getImageUrl() {
        return this.f7690lh;
    }

    public int getWidth() {
        return this.vt;
    }

    public boolean isValid() {
        String str;
        return this.ouw > 0 && this.vt > 0 && (str = this.f7690lh) != null && str.length() > 0;
    }

    public TTImage(int i4, int i10, String str) {
        this(i4, i10, str, 0.0d);
    }
}
