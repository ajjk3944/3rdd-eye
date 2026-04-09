package com.applovin.shadow.okio;

import java.util.zip.Inflater;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        k.e(source, "<this>");
        k.e(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inflater = new Inflater();
        }
        k.e(source, "<this>");
        k.e(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
