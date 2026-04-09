package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class KP extends AbstractC0934bM {

    /* renamed from: a, reason: collision with root package name */
    public final int f9485a;

    public KP(IllegalStateException illegalStateException, LP lp) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(lp == null ? null : lp.f9690a)), illegalStateException);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.f9485a = errorCode;
    }
}
