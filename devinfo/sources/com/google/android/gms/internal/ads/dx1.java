package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class dx1 extends np1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10603a;

    public dx1(IllegalStateException illegalStateException, ex1 ex1Var) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(ex1Var == null ? null : ex1Var.f10904a)), illegalStateException);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.f10603a = errorCode;
    }
}
