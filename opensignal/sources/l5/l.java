package l5;

import a5.d0;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public class l extends c5.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14722a;

    public l(IllegalStateException illegalStateException, n nVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(nVar == null ? null : nVar.f14723a);
        super(sb2.toString(), illegalStateException);
        if (d0.f105a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f14722a = diagnosticInfo;
    }
}
