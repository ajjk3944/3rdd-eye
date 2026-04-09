package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class x1 {
    public static String a(zzfxm zzfxmVar, File file, String str) {
        return b(file, str, zzfxq.zza);
    }

    public static String b(File file, String str, zzfxq zzfxqVar) {
        return new File(file, str).getPath();
    }
}
