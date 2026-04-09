package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgyh extends zzgyg {
    @Override // com.google.android.gms.internal.ads.zzgyg
    public final void zza(Object obj) {
        ((zzgyr) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final void zzb(zzhca zzhcaVar, Map.Entry entry) throws IOException {
        zzgys zzgysVar = (zzgys) entry.getKey();
        if (!zzgysVar.zzc) {
            zzhby zzhbyVar = zzhby.zza;
            switch (zzgysVar.zzb.ordinal()) {
                case 0:
                    zzhcaVar.zzf(zzgysVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzhcaVar.zzo(zzgysVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzhcaVar.zzt(zzgysVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzhcaVar.zzK(zzgysVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzhcaVar.zzr(zzgysVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzhcaVar.zzm(zzgysVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzhcaVar.zzk(zzgysVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzhcaVar.zzb(zzgysVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzhcaVar.zzG(zzgysVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzhcaVar.zzq(zzgysVar.zza, entry.getValue(), zzhaq.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzhcaVar.zzv(zzgysVar.zza, entry.getValue(), zzhaq.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzhcaVar.zzd(zzgysVar.zza, (zzgxn) entry.getValue());
                    break;
                case 12:
                    zzhcaVar.zzI(zzgysVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzhcaVar.zzr(zzgysVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzhcaVar.zzx(zzgysVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzhcaVar.zzz(zzgysVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzhcaVar.zzB(zzgysVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzhcaVar.zzD(zzgysVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhby zzhbyVar2 = zzhby.zza;
        switch (zzgysVar.zzb.ordinal()) {
            case 0:
                zzhbb.zzt(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 1:
                zzhbb.zzx(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 2:
                zzhbb.zzA(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 3:
                zzhbb.zzI(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 4:
                zzhbb.zzz(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 5:
                zzhbb.zzw(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 6:
                zzhbb.zzv(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 7:
                zzhbb.zzr(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 8:
                zzhbb.zzG(zzgysVar.zza, (List) entry.getValue(), zzhcaVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhbb.zzy(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzhaq.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhbb.zzB(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzhaq.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzhbb.zzs(zzgysVar.zza, (List) entry.getValue(), zzhcaVar);
                break;
            case 12:
                zzhbb.zzH(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 13:
                zzhbb.zzz(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 14:
                zzhbb.zzC(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 15:
                zzhbb.zzD(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 16:
                zzhbb.zzE(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
            case 17:
                zzhbb.zzF(zzgysVar.zza, (List) entry.getValue(), zzhcaVar, zzgysVar.zzd);
                break;
        }
    }
}
