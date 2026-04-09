package oa;

import android.media.MediaCodec;
import qb.v;

/* loaded from: classes.dex */
public class b extends c5.e {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(IllegalStateException illegalStateException, c cVar) {
        String strValueOf = String.valueOf(cVar == null ? null : cVar.f19169a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), illegalStateException);
        if (v.f20828a < 21 || !(illegalStateException instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
    }
}
