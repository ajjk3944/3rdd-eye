package com.applovin.shadow.okio;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.-GzipSourceExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int i4, int i10) {
        return ((i4 >> i10) & 1) == 1;
    }

    public static final GzipSource gzip(Source source) {
        k.e(source, "<this>");
        return new GzipSource(source);
    }
}
