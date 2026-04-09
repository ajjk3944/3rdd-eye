package l5;

/* loaded from: classes.dex */
public final class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f14731a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14732d;

    /* renamed from: g, reason: collision with root package name */
    public final n f14733g;

    /* renamed from: r, reason: collision with root package name */
    public final String f14734r;

    public p(androidx.media3.common.r rVar, v vVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + rVar, vVar, rVar.H, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, n nVar, String str3) {
        super(str, th2);
        this.f14731a = str2;
        this.f14732d = z10;
        this.f14733g = nVar;
        this.f14734r = str3;
    }
}
