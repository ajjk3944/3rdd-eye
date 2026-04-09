package com.applovin.shadow.okio;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        k.e(sink, "<this>");
        return new GzipSink(sink);
    }
}
