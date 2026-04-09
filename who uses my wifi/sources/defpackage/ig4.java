package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ig4 extends Exception {
    public final String f;
    public final bg4 g;
    public final String h;

    public ig4(ph4 ph4Var, mg4 mg4Var, int i) {
        String string = ph4Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = ph4Var.m;
        int iAbs = Math.abs(i);
        this(string2, mg4Var, str, null, ex0.j(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs));
    }

    public ig4(String str, Throwable th, String str2, bg4 bg4Var, String str3) {
        super(str, th);
        this.f = str2;
        this.g = bg4Var;
        this.h = str3;
    }
}
