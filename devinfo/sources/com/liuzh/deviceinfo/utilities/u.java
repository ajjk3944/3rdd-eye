package com.liuzh.deviceinfo.utilities;

import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file != null && file.canRead() && file.getName().endsWith(".cil");
    }
}
