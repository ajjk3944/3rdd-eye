package com.liuzh.deviceinfo.provider;

import android.net.Uri;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import je.u;
import s3.a;
import s3.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ContentFileProvider extends b {
    public static Uri e(File file) throws IOException {
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        a aVarC = b.c(DeviceInfoApp.f21145f, "com.liuzh.deviceinfo.FileProvider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : aVarC.f33460b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (b.a(canonicalPath).startsWith(b.a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(u.t("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(aVarC.f33459a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
