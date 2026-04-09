package oa;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f19176a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19177d;

    /* renamed from: g, reason: collision with root package name */
    public final c f19178g;

    /* renamed from: r, reason: collision with root package name */
    public final String f19179r;

    public d(Format format, h hVar, boolean z10, int i10) {
        String strValueOf = String.valueOf(format);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(strValueOf);
        String string = sb2.toString();
        String str = format.H;
        String str2 = i10 < 0 ? "neg_" : "";
        int iAbs = Math.abs(i10);
        StringBuilder sb3 = new StringBuilder(str2.length() + 71);
        sb3.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
        sb3.append(str2);
        sb3.append(iAbs);
        this(string, hVar, str, z10, null, sb3.toString());
    }

    public d(String str, Throwable th2, String str2, boolean z10, c cVar, String str3) {
        super(str, th2);
        this.f19176a = str2;
        this.f19177d = z10;
        this.f19178g = cVar;
        this.f19179r = str3;
    }
}
