package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oq0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f14770a;

    public oq0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) va.s.f36163e.f36166c.a(sk.D7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f14770a = patternCompile;
    }
}
