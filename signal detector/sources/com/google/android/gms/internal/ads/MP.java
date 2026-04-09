package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class MP extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f9876a;

    /* renamed from: b, reason: collision with root package name */
    public final LP f9877b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9878c;

    public MP(TP tp, RP rp, int i) {
        String string = tp.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = tp.f11397m;
        int iAbs = Math.abs(i);
        this(string2, rp, str, null, A.f.i(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)));
    }

    public MP(String str, Throwable th, String str2, LP lp, String str3) {
        super(str, th);
        this.f9876a = str2;
        this.f9877b = lp;
        this.f9878c = str3;
    }
}
