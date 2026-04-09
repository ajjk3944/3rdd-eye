package com.applovin.shadow.okio;

import java.util.zip.Deflater;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        k.e(sink, "<this>");
        k.e(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            deflater = new Deflater();
        }
        k.e(sink, "<this>");
        k.e(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
