package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfea {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfez zzd = new zzfez();

    public zzfea(int i, int i10) {
        this.zzb = i;
        this.zzc = i10;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - ((zzfek) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            linkedList.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfek zze() {
        zzfez zzfezVar = this.zzd;
        zzfezVar.zzf();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfek zzfekVar = (zzfek) linkedList.remove();
        if (zzfekVar != null) {
            zzfezVar.zzh();
        }
        return zzfekVar;
    }

    public final zzfey zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfek zzfekVar) {
        this.zzd.zzf();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfekVar);
        return true;
    }
}
