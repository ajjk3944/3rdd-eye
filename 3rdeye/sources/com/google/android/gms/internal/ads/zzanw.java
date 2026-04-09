package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzanw {
    private final zzamx zza;
    private final zzeu zzb;
    private final zzem zzc = new zzem(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzanw(zzamx zzamxVar, zzeu zzeuVar) {
        this.zza = zzamxVar;
        this.zzb = zzeuVar;
    }

    public final void zza(zzen zzenVar) throws zzaz {
        long jZzb;
        char c10;
        zzem zzemVar = this.zzc;
        zzenVar.zzH(zzemVar.zza, 0, 3);
        zzemVar.zzl(0);
        zzemVar.zzn(8);
        this.zzd = zzemVar.zzp();
        this.zze = zzemVar.zzp();
        zzemVar.zzn(6);
        zzenVar.zzH(zzemVar.zza, 0, zzemVar.zzd(8));
        zzemVar.zzl(0);
        if (this.zzd) {
            zzemVar.zzn(4);
            long jZzd = zzemVar.zzd(3);
            zzemVar.zzn(1);
            int iZzd = zzemVar.zzd(15) << 15;
            zzemVar.zzn(1);
            long jZzd2 = zzemVar.zzd(15);
            zzemVar.zzn(1);
            if (this.zzf || !this.zze) {
                c10 = 30;
            } else {
                zzemVar.zzn(4);
                zzemVar.zzn(1);
                int iZzd2 = zzemVar.zzd(15) << 15;
                zzemVar.zzn(1);
                c10 = 30;
                long jZzd3 = zzemVar.zzd(15);
                zzemVar.zzn(1);
                this.zzb.zzb((zzemVar.zzd(3) << 30) | iZzd2 | jZzd3);
                this.zzf = true;
            }
            jZzb = this.zzb.zzb((jZzd << c10) | iZzd | jZzd2);
        } else {
            jZzb = 0;
        }
        zzamx zzamxVar = this.zza;
        zzamxVar.zzd(jZzb, 4);
        zzamxVar.zza(zzenVar);
        zzamxVar.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
