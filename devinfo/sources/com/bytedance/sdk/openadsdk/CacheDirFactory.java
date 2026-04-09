package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.vt;
import d.h;
import java.io.File;
import y8.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile b MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String ouw;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir());
        return h.w(sb2, File.separator, str);
    }

    public static b getICacheDir(int i4) {
        return ouw();
    }

    public static String getImageCacheDir(String str) {
        if (ouw == null) {
            ouw = getDiskCacheDirPath(str);
        }
        return ouw;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileOuw = ra.ouw(zih.ouw(), vt.lh(), "tt_ad");
        if (fileOuw.isFile()) {
            fileOuw.delete();
        }
        if (!fileOuw.exists()) {
            fileOuw.mkdirs();
        }
        String absolutePath = fileOuw.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static b ouw() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        f1 f1Var = new f1(6, false);
                        f1Var.f1134b = null;
                        f1Var.f1135c = null;
                        f1Var.f1136d = null;
                        f1Var.f1137e = null;
                        f1Var.f1138f = null;
                        MEDIA_CACHE_DIR = f1Var;
                        f1Var.f1134b = getRootDir();
                        ((f1) MEDIA_CACHE_DIR).N();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
