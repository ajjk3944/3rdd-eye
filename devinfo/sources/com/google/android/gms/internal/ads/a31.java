package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a31 extends al0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f9199c;

    public a31(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.f9199c = pattern;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final String toString() {
        return this.f9199c.toString();
    }
}
