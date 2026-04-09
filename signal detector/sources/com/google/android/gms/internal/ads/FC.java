package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class FC implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f8069a;

    public FC(Pattern pattern) {
        pattern.getClass();
        this.f8069a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f8069a.matcher(str).matches();
    }
}
