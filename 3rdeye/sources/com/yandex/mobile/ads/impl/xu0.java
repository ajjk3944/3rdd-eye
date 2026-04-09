package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
public class xu0 extends ly {

    /* renamed from: b, reason: collision with root package name */
    public final String f35427b;

    public xu0(IllegalStateException illegalStateException, yu0 yu0Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(yu0Var == null ? null : yu0Var.f35980a);
        super(sb.toString(), illegalStateException);
        this.f35427b = s82.f32899a >= 21 ? a(illegalStateException) : null;
    }

    private static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
