package com.bytedance.sdk.openadsdk.component.ra;

import android.content.Context;
import androidx.lifecycle.f1;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.vt;
import com.bytedance.sdk.openadsdk.multipro.yu.yu;
import d.h;
import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static File ouw(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((f1) CacheDirFactory.getICacheDir(0)).M());
        return new File(h.w(sb2, File.separator, str));
    }

    public static File vt(String str) {
        le.ouw(zih.ouw());
        return ouw(zih.ouw(), le.ouw(), str);
    }

    private static File ouw(Context context, String str, String str2) {
        return ra.ouw(context, vt.lh(), str, str2);
    }

    public static void ouw(Context context) {
        File[] fileArrListFiles;
        try {
            final le leVarOuw = le.ouw(context);
            try {
                yu.ouw("tt_openad_materialMeta");
                yu.ouw("tt_openad_materialMeta_new");
                yu.ouw("tt_openad");
            } catch (Throwable unused) {
            }
            File cacheDir = leVarOuw.ouw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.le.4
                public AnonymousClass4() {
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    return name.contains(le.f7877lh) || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    ra.lh(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
