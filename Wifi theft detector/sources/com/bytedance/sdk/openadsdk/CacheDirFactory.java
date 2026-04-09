package com.bytedance.sdk.openadsdk;

import a3.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.multipro.ypw;
import java.io.File;
import t2.b;

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
                        a aVar = new a();
                        MEDIA_CACHE_DIR = aVar;
                        aVar.emc(getRootDir());
                        MEDIA_CACHE_DIR.dg();
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
        return getRootDir() + File.separator + str;
    }

    public static b getICacheDir(int i10) {
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
