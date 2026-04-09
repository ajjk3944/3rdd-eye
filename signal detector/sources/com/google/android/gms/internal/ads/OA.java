package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class OA extends Cr implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f10167c;

    public OA(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.f10167c = pattern;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final String toString() {
        return this.f10167c.toString();
    }
}
