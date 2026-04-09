package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286hu {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f14617a;

    public C1286hu() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) C2841s.f23267e.f23270c.a(H9.D7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f14617a = patternCompile;
    }
}
