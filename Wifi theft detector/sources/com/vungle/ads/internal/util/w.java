package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w {

    @NotNull
    public static final w INSTANCE = new w();

    private w() {
    }

    private final long getFolderSize(File file) {
        long length = 0;
        if (file.exists()) {
            for (File file2 : i9.h.r(file)) {
                if (file2.isFile()) {
                    length += file2.length();
                }
            }
        }
        return length;
    }

    public final long getWebViewDataSize(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            folderSize = file.exists() ? getFolderSize(file) : 0L;
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return folderSize;
            }
            kotlin.jvm.internal.p.d(cacheDir, "cacheDir");
            return folderSize + getFolderSize(i9.i.v(cacheDir, "webviewCache"));
        } catch (Exception e10) {
            p.Companion.e("WebViewSize", "Error reading WebView data size: " + e10.getMessage());
            return folderSize;
        }
    }

    public final boolean isOSVersionInvalid() {
        return Build.VERSION.SDK_INT < 25;
    }

    public final boolean isUrlValid(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }
}
