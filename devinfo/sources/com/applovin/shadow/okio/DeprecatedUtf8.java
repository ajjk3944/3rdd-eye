package com.applovin.shadow.okio;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@yj.a
/* renamed from: com.applovin.shadow.okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @yj.a
    public final long size(String str) {
        k.e(str, "string");
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    @yj.a
    public final long size(String str, int i4, int i10) {
        k.e(str, "string");
        return Utf8.size(str, i4, i10);
    }
}
