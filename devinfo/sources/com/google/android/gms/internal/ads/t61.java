package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t61 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f16719a;

    public t61(Pattern pattern) {
        pattern.getClass();
        this.f16719a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f16719a.matcher(str).matches();
    }
}
