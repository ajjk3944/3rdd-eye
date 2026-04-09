package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzhbl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i10);

    public abstract void zze(Object obj, int i, long j4);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzgxn zzgxnVar);

    public abstract void zzh(Object obj, int i, long j4);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzhat zzhatVar, int i) throws IOException {
        int iZzd = zzhatVar.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 == 0) {
            zzh(obj, i10, zzhatVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zze(obj, i10, zzhatVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzg(obj, i10, zzhatVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzgzk("Protocol message end-group tag did not match expected tag.");
            }
            if (i11 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i10, zzhatVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i12 = i10 << 3;
        int i13 = i + 1;
        if (i13 >= zza) {
            throw new zzgzk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhatVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzhatVar, i13)) {
        }
        if ((i12 | 4) != zzhatVar.zzd()) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i10, zzc(objZzb));
        return true;
    }
}
