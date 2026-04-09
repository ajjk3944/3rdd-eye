package defpackage;

import android.media.MediaCodec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ag4 extends qv3 {
    public final int f;

    public ag4(IllegalStateException illegalStateException, bg4 bg4Var) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(bg4Var == null ? null : bg4Var.a)), illegalStateException);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.f = errorCode;
    }
}
