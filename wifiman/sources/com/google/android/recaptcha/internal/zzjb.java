package com.google.android.recaptcha.internal;

import Yg.z;
import Zg.U;
import android.os.Build;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzjb {
    public static final Map zza() {
        Map mapL = U.l(z.a(-4, zzba.zzo), z.a(-12, zzba.zzp), z.a(-6, zzba.zzk), z.a(-11, zzba.zzm), z.a(-13, zzba.zzq), z.a(-14, zzba.zzr), z.a(-2, zzba.zzl), z.a(-7, zzba.zzs), z.a(-5, zzba.zzt), z.a(-9, zzba.zzu), z.a(-8, zzba.zzE), z.a(-15, zzba.zzn), z.a(-1, zzba.zzv), z.a(-3, zzba.zzx), z.a(-10, zzba.zzy));
        int i10 = Build.VERSION.SDK_INT;
        mapL.put(-16, zzba.zzw);
        if (i10 >= 27) {
            mapL.put(1, zzba.zzA);
            mapL.put(2, zzba.zzB);
            mapL.put(0, zzba.zzC);
            mapL.put(3, zzba.zzD);
        }
        if (i10 >= 29) {
            mapL.put(4, zzba.zzz);
        }
        return mapL;
    }
}
