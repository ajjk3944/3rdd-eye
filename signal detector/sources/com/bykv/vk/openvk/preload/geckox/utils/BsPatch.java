package com.bykv.vk.openvk.preload.geckox.utils;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file, File file2, File file3, String str) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        file3.mkdirs();
        File file4 = new File(file3, str);
        file4.delete();
        int iPatch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
        if (iPatch == 0) {
            return;
        }
        StringBuilder sbP = AbstractC1135f5.p(iPatch, "patch merged failed, code：", " full:");
        sbP.append(file.getAbsolutePath());
        sbP.append(" patch:");
        sbP.append(file2.getAbsolutePath());
        sbP.append(" dest:");
        sbP.append(file4.getAbsolutePath());
        throw new RuntimeException(sbP.toString());
    }

    private static native int patch(String str, String str2, String str3);
}
