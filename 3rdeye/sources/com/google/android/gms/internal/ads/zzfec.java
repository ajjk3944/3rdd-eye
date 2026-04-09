package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfec implements zzfeb {
    private final ConcurrentHashMap zza;
    private final zzfei zzb;
    private final zzfee zzc = new zzfee();

    public zzfec(zzfei zzfeiVar) {
        this.zza = new ConcurrentHashMap(zzfeiVar.zzd);
        this.zzb = zzfeiVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfei> creator = zzfei.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgw)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfei zzfeiVar = this.zzb;
            sb.append(zzfeiVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfel) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i10 = 0; i10 < ((zzfea) entry.getValue()).zzb(); i10++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((zzfea) entry.getValue()).zzb(); iZzb < zzfeiVar.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfea) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfeiVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final zzfei zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final synchronized zzfek zzb(zzfel zzfelVar) {
        zzfek zzfekVarZze;
        try {
            zzfea zzfeaVar = (zzfea) this.zza.get(zzfelVar);
            if (zzfeaVar != null) {
                zzfekVarZze = zzfeaVar.zze();
                if (zzfekVarZze == null) {
                    this.zzc.zze();
                }
                zzfey zzfeyVarZzf = zzfeaVar.zzf();
                if (zzfekVarZze != null) {
                    zzbch.zzb.zzc zzcVarZzd = zzbch.zzb.zzd();
                    zzbch.zzb.zza.C0336zza c0336zzaZza = zzbch.zzb.zza.zza();
                    c0336zzaZza.zzf(zzbch.zzb.zzd.IN_MEMORY);
                    zzbch.zzb.zze.zza zzaVarZzb = zzbch.zzb.zze.zzb();
                    zzaVarZzb.zzd(zzfeyVarZzf.zza);
                    zzaVarZzb.zze(zzfeyVarZzf.zzb);
                    c0336zzaZza.zzg(zzaVarZzb);
                    zzcVarZzd.zzd(c0336zzaZza);
                    zzfekVarZze.zza.zzb().zzc().zzi(zzcVarZzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfekVarZze = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfekVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    @Deprecated
    public final zzfel zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfei zzfeiVar = this.zzb;
        return new zzfem(zzmVar, str, new zzbvr(zzfeiVar.zza).zza().zzj, zzfeiVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final synchronized boolean zzd(zzfel zzfelVar, zzfek zzfekVar) {
        boolean zZzh;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfea zzfeaVar = (zzfea) concurrentHashMap.get(zzfelVar);
            zzfekVar.zzd = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            if (zzfeaVar == null) {
                zzfei zzfeiVar = this.zzb;
                zzfea zzfeaVar2 = new zzfea(zzfeiVar.zzd, zzfeiVar.zze * 1000);
                if (concurrentHashMap.size() == zzfeiVar.zzc) {
                    int i = zzfeiVar.zzg;
                    int i10 = i - 1;
                    zzfel zzfelVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jZzc = Long.MAX_VALUE;
                    if (i10 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfea) entry.getValue()).zzc() < jZzc) {
                                jZzc = ((zzfea) entry.getValue()).zzc();
                                zzfelVar2 = (zzfel) entry.getKey();
                            }
                        }
                        if (zzfelVar2 != null) {
                            concurrentHashMap.remove(zzfelVar2);
                        }
                    } else if (i10 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfea) entry2.getValue()).zzd() < jZzc) {
                                jZzc = ((zzfea) entry2.getValue()).zzd();
                                zzfelVar2 = (zzfel) entry2.getKey();
                            }
                        }
                        if (zzfelVar2 != null) {
                            concurrentHashMap.remove(zzfelVar2);
                        }
                    } else if (i10 == 2) {
                        int iZza = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfea) entry3.getValue()).zza() < iZza) {
                                iZza = ((zzfea) entry3.getValue()).zza();
                                zzfelVar2 = (zzfel) entry3.getKey();
                            }
                        }
                        if (zzfelVar2 != null) {
                            concurrentHashMap.remove(zzfelVar2);
                        }
                    }
                    this.zzc.zzg();
                }
                concurrentHashMap.put(zzfelVar, zzfeaVar2);
                this.zzc.zzd();
                zzfeaVar = zzfeaVar2;
            }
            zZzh = zzfeaVar.zzh(zzfekVar);
            zzfee zzfeeVar = this.zzc;
            zzfeeVar.zzc();
            zzfed zzfedVarZza = zzfeeVar.zza();
            zzfey zzfeyVarZzf = zzfeaVar.zzf();
            zzbch.zzb.zzc zzcVarZzd = zzbch.zzb.zzd();
            zzbch.zzb.zza.C0336zza c0336zzaZza = zzbch.zzb.zza.zza();
            c0336zzaZza.zzf(zzbch.zzb.zzd.IN_MEMORY);
            zzbch.zzb.zzg.zza zzaVarZzb = zzbch.zzb.zzg.zzb();
            zzaVarZzb.zze(zzfedVarZza.zza);
            zzaVarZzb.zzf(zzfedVarZza.zzb);
            zzaVarZzb.zzg(zzfeyVarZzf.zzb);
            c0336zzaZza.zzi(zzaVarZzb);
            zzcVarZzd.zzd(c0336zzaZza);
            zzfekVar.zza.zzb().zzc().zzj(zzcVarZzd.zzbr());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final synchronized boolean zze(zzfel zzfelVar) {
        zzfea zzfeaVar = (zzfea) this.zza.get(zzfelVar);
        if (zzfeaVar == null) {
            return true;
        }
        return zzfeaVar.zzb() < this.zzb.zzd;
    }
}
