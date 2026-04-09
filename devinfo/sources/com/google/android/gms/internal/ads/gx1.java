package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gx1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f11631a;

    /* renamed from: b, reason: collision with root package name */
    public final ex1 f11632b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11633c;

    public gx1(mx1 mx1Var, kx1 kx1Var, int i4) {
        String string = mx1Var.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i4);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = mx1Var.f14052m;
        int iAbs = Math.abs(i4);
        this(string2, kx1Var, str, null, d.h.q(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)));
    }

    public gx1(String str, Throwable th2, String str2, ex1 ex1Var, String str3) {
        super(str, th2);
        this.f11631a = str2;
        this.f11632b = ex1Var;
        this.f11633c = str3;
    }
}
