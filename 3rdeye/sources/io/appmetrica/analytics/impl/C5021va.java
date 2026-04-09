package io.appmetrica.analytics.impl;

import android.content.Context;
import b9.C1992A;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5021va {

    /* renamed from: a, reason: collision with root package name */
    public volatile Boolean f41846a;

    public final void a(Context context) {
        if (this.f41846a == null) {
            synchronized (this) {
                try {
                    if (this.f41846a == null) {
                        boolean z10 = false;
                        try {
                            File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                            boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                            boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                            if (zExists || zExists2) {
                                z10 = true;
                            }
                        } catch (Throwable unused) {
                        }
                        this.f41846a = Boolean.valueOf(z10);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
