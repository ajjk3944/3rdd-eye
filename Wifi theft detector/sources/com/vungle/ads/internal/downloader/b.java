package com.vungle.ads.internal.downloader;

import android.util.Base64;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Result;
import kotlin.c;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final b INSTANCE = new b();

    private b() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArrDecode = Base64.decode(com.vungle.ads.internal.b.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                s sVar = s.f25199a;
                i9.b.a(fileOutputStream, null);
                objB = Result.b(Boolean.TRUE);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(c.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    @WorkerThread
    @Nullable
    public final File injectPrivacyIcon(@NotNull File dir) {
        p.e(dir, "dir");
        File file = new File(dir, com.vungle.ads.internal.b.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
