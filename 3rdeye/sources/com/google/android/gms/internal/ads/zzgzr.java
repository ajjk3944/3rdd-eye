package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public class zzgzr {
    protected volatile zzhag zza;
    private volatile zzgxn zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgzr)) {
            return false;
        }
        zzgzr zzgzrVar = (zzgzr) obj;
        zzhag zzhagVar = this.zza;
        zzhag zzhagVar2 = zzgzrVar.zza;
        if (zzhagVar == null && zzhagVar2 == null) {
            return zzb().equals(zzgzrVar.zzb());
        }
        if (zzhagVar != null && zzhagVar2 != null) {
            return zzhagVar.equals(zzhagVar2);
        }
        if (zzhagVar != null) {
            zzgzrVar.zzd(zzhagVar.zzbt());
            return zzhagVar.equals(zzgzrVar.zza);
        }
        zzd(zzhagVar2.zzbt());
        return this.zza.equals(zzhagVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgxk) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgxn zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzgxn.zzb;
                } else {
                    this.zzb = this.zza.zzaN();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhag zzc(zzhag zzhagVar) {
        zzhag zzhagVar2 = this.zza;
        this.zzb = null;
        this.zza = zzhagVar;
        return zzhagVar2;
    }

    public final void zzd(zzhag zzhagVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhagVar;
                this.zzb = zzgxn.zzb;
            } catch (zzgzk unused) {
                this.zzc = true;
                this.zza = zzhagVar;
                this.zzb = zzgxn.zzb;
            }
        }
    }
}
