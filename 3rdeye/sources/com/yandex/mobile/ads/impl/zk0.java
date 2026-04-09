package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import b9.C1992A;
import com.yandex.mobile.ads.impl.yk0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import y9.C5819a;
import z0.C5849b;

/* loaded from: classes3.dex */
public final class zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36539a;

    /* renamed from: b, reason: collision with root package name */
    private final wk0 f36540b;

    public zk0(Context context, wk0 fileProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(fileProvider, "fileProvider");
        this.f36539a = context;
        this.f36540b = fileProvider;
    }

    public final yk0 a(String reportText) throws IOException {
        kotlin.jvm.internal.l.f(reportText, "reportText");
        try {
            File fileA = this.f36540b.a();
            File parentFile = fileA.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] array = reportText.getBytes(C5819a.f48359b);
            kotlin.jvm.internal.l.e(array, "getBytes(...)");
            if (array.length >= freeSpace) {
                return new yk0.a("Not enough space error");
            }
            kotlin.jvm.internal.l.f(array, "array");
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            try {
                fileOutputStream.write(array);
                C1992A c1992a = C1992A.f18074a;
                fileOutputStream.close();
                Uri uriForFile = C5849b.getUriForFile(this.f36539a, this.f36539a.getPackageName() + ".monetization.ads.inspector.fileprovider", fileA);
                kotlin.jvm.internal.l.c(uriForFile);
                return new yk0.c(uriForFile);
            } finally {
            }
        } catch (Exception unused) {
            fp0.c(new Object[0]);
            return new yk0.a("Failed to save report");
        }
    }
}
