package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzehz extends zzeia {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdaj zzc;
    private final TelephonyManager zzd;
    private final zzehr zze;
    private zzbgj.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbgj.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbgj.zzaf.zzd zzdVar = zzbgj.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbgj.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbgj.zzaf.zzd zzdVar2 = zzbgj.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbgj.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzehz(Context context, zzdaj zzdajVar, zzehr zzehrVar, zzehn zzehnVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzehnVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdajVar;
        this.zze = zzehrVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    public static final /* synthetic */ zzbgj.zzaf.zzd zze(Bundle bundle) {
        return (zzbgj.zzaf.zzd) zzg.get(zzfjz.zza(zzfjz.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbgj.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbgj.zzq zzg(boolean z10) {
        return z10 ? zzbgj.zzq.ENUM_TRUE : zzbgj.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z10) {
        zzgzo.zzr(this.zzc.zza(new Bundle()), new zzehy(this, z10), zzcei.zzg);
    }

    public final /* synthetic */ zzbgj.zzab zzb(Bundle bundle) {
        zzbgj.zzab.zzb zzbVar;
        zzbgj.zzab.zza zzaVarZzq = zzbgj.zzab.zzq();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            this.zzf = zzbgj.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbgj.zzq.ENUM_FALSE;
            if (i10 == 0) {
                zzaVarZzq.zzc(zzbgj.zzab.zzc.CELL);
            } else if (i10 != 1) {
                zzaVarZzq.zzc(zzbgj.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbgj.zzab.zzc.WIFI);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbgj.zzab.zzb.TWO_G;
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
                    zzbVar = zzbgj.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbgj.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbgj.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    public final /* synthetic */ byte[] zzc(boolean z10, ArrayList arrayList, zzbgj.zzab zzabVar, zzbgj.zzaf.zzd zzdVar) {
        zzbgj.zzaf.zza.C0200zza c0200zzaZzz = zzbgj.zzaf.zza.zzz();
        c0200zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c0200zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0200zzaZzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        zzehr zzehrVar = this.zze;
        c0200zzaZzz.zzk(zzehrVar.zzf());
        c0200zzaZzz.zzo(zzehrVar.zzj());
        c0200zzaZzz.zzR(zzehrVar.zzd());
        c0200zzaZzz.zzZ(zzdVar);
        c0200zzaZzz.zzz(zzabVar);
        c0200zzaZzz.zzV(this.zzf);
        c0200zzaZzz.zzg(zzg(z10));
        c0200zzaZzz.zzad(zzehrVar.zzb());
        c0200zzaZzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        c0200zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0200zzaZzz.zzbu().zzaN();
    }

    public final /* synthetic */ zzehr zzd() {
        return this.zze;
    }
}
