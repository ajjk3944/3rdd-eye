package com.bytedance.sdk.openadsdk;

import A.f;
import A2.C0115c;
import M1.b;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.multipro.ypw;
import java.io.File;

/* loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile b MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String emc;

    private static b emc() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        C0115c c0115c = new C0115c();
                        c0115c.f235b = null;
                        c0115c.f236c = null;
                        c0115c.f237d = null;
                        c0115c.f238e = null;
                        c0115c.f239f = null;
                        MEDIA_CACHE_DIR = c0115c;
                        c0115c.f235b = getRootDir();
                        ((C0115c) MEDIA_CACHE_DIR).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getRootDir());
        return f.p(sb, File.separator, str);
    }

    public static b getICacheDir(int i) {
        return emc();
    }

    public static String getImageCacheDir(String str) {
        if (emc == null) {
            emc = getDiskCacheDirPath(str);
        }
        return emc;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileEmc = uym.emc(aa.emc(), ypw.xq(), "tt_ad");
        if (fileEmc.isFile()) {
            fileEmc.delete();
        }
        if (!fileEmc.exists()) {
            fileEmc.mkdirs();
        }
        String absolutePath = fileEmc.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}
