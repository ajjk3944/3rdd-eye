package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeaw extends zzeax {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcuu zzd;
    private final TelephonyManager zze;
    private final zzeao zzf;
    private zzbch.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbch.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbch.zzaf.zzd zzdVar = zzbch.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbch.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbch.zzaf.zzd zzdVar2 = zzbch.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbch.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzeaw(Context context, zzcuu zzcuuVar, zzeao zzeaoVar, zzeak zzeakVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeakVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcuuVar;
        this.zzf = zzeaoVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbch.zzab zza(zzeaw zzeawVar, Bundle bundle) {
        zzbch.zzab.zzb zzbVar;
        zzbch.zzab.zza zzaVarZza = zzbch.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i10 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzeawVar.zzg = zzbch.zzq.ENUM_TRUE;
        } else {
            zzeawVar.zzg = zzbch.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZza.zzd(zzbch.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZza.zzd(zzbch.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(zzbch.zzab.zzc.WIFI);
            }
            switch (i10) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbch.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbch.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbch.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbch.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbch.zzaf.zzd zzb(zzeaw zzeawVar, Bundle bundle) {
        return (zzbch.zzaf.zzd) zzb.get(zzfdc.zza(zzfdc.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbch.zzaf.zzd.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzeaw zzeawVar, boolean z10, ArrayList arrayList, zzbch.zzab zzabVar, zzbch.zzaf.zzd zzdVar) {
        zzbch.zzaf.zza.C0335zza c0335zzaZzn = zzbch.zzaf.zza.zzn();
        c0335zzaZzn.zzn(arrayList);
        Context context = zzeawVar.zzc;
        c0335zzaZzn.zzD(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0335zzaZzn.zzE(com.google.android.gms.ads.internal.zzv.zzs().zzg(context, zzeawVar.zze));
        zzeao zzeaoVar = zzeawVar.zzf;
        c0335zzaZzn.zzM(zzeaoVar.zze());
        c0335zzaZzn.zzL(zzeaoVar.zzb());
        c0335zzaZzn.zzG(zzeaoVar.zza());
        c0335zzaZzn.zzH(zzdVar);
        c0335zzaZzn.zzJ(zzabVar);
        c0335zzaZzn.zzK(zzeawVar.zzg);
        c0335zzaZzn.zzN(zzg(z10));
        c0335zzaZzn.zzP(zzeaoVar.zzd());
        c0335zzaZzn.zzO(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        c0335zzaZzn.zzQ(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0335zzaZzn.zzbr().zzaV();
    }

    private static final zzbch.zzq zzg(boolean z10) {
        return z10 ? zzbch.zzq.ENUM_TRUE : zzbch.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z10) {
        zzgdb.zzr(this.zzd.zzb(new Bundle()), new zzeav(this, z10), zzcad.zzg);
    }
}
