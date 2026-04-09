package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhfx implements zzhgh, zzhfs {
    private static final Object zza = new Object();
    private volatile zzhgh zzb;
    private volatile Object zzc = zza;

    private zzhfx(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
    }

    public static zzhfs zza(zzhgh zzhghVar) {
        return zzhghVar instanceof zzhfs ? (zzhfs) zzhghVar : new zzhfx(zzhghVar);
    }

    public static zzhgh zzc(zzhgh zzhghVar) {
        return zzhghVar instanceof zzhfx ? zzhghVar : new zzhfx(zzhghVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
