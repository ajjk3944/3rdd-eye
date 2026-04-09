package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzdaj {
    private final zzfnu zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzika zzg;
    private final String zzh;
    private final zzfba zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfjk zzk;
    private final int zzl;
    private final zzdgy zzm;

    public zzdaj(zzfnu zzfnuVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzika zzikaVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfba zzfbaVar, zzfjk zzfjkVar, zzdgy zzdgyVar, int i10) {
        this.zza = zzfnuVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzikaVar;
        this.zzh = str2;
        this.zzi = zzfbaVar;
        this.zzj = zzgVar;
        this.zzk = zzfjkVar;
        this.zzm = zzdgyVar;
        this.zzl = i10;
    }

    public final com.google.common.util.concurrent.a zza(Bundle bundle) {
        this.zzm.zza();
        zzfno zzfnoVar = zzfno.SIGNALS;
        zzfnu zzfnuVar = this.zza;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zza(this.zzi.zza(new zzdah(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfnoVar, zzfnuVar).zzi();
    }

    public final com.google.common.util.concurrent.a zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final com.google.common.util.concurrent.a aVarZza = zza(bundle);
        return this.zza.zzb(zzfno.REQUEST_PARCEL, aVarZza, (com.google.common.util.concurrent.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(aVarZza, bundle);
            }
        }).zzi();
    }

    public final /* synthetic */ zzbzu zzc(com.google.common.util.concurrent.a aVar, Bundle bundle) {
        zzdah zzdahVar = (zzdah) aVar.get();
        Bundle bundle2 = zzdahVar.zza;
        String str = (String) ((com.google.common.util.concurrent.a) this.zzg.zzb()).get();
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhV)).booleanValue() && this.zzj.zzx()) {
            z10 = true;
        }
        boolean z11 = z10;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbzu(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z11, this.zzk.zza(), bundle, zzdahVar.zzb, this.zzl);
    }
}
