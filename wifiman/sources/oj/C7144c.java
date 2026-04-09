package oj;

import java.io.File;
import java.io.FileFilter;

/* renamed from: oj.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7144c implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    private final String f55746a;

    public C7144c(String str) {
        this.f55746a = str;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.getName().endsWith(this.f55746a);
    }
}
