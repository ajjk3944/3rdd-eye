package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzhfq {
    public static zzhfq zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhfl(cls.getSimpleName()) : new zzhfn(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
