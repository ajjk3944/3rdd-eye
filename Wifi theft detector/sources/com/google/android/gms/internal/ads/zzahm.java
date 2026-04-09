package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class zzahm {
    protected final zzagh zza;

    public zzahm(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public abstract boolean zza(zzer zzerVar) throws zzat;

    public abstract boolean zzb(zzer zzerVar, long j10) throws zzat;

    public final boolean zzf(zzer zzerVar, long j10) throws zzat {
        return zza(zzerVar) && zzb(zzerVar, j10);
    }
}
