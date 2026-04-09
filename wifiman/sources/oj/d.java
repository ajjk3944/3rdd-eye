package oj;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public class d implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final String f55747a;

    public d(String str) {
        this.f55747a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(this.f55747a);
    }
}
