package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcuu {
    private final zzfgs zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhfs zzg;
    private final String zzh;
    private final zzetx zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfco zzk;
    private final int zzl;
    private final zzdbh zzm;

    public zzcuu(zzfgs zzfgsVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhfs zzhfsVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzetx zzetxVar, zzfco zzfcoVar, zzdbh zzdbhVar, int i) {
        this.zza = zzfgsVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhfsVar;
        this.zzh = str2;
        this.zzi = zzetxVar;
        this.zzj = zzgVar;
        this.zzk = zzfcoVar;
        this.zzm = zzdbhVar;
        this.zzl = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zzbvo zza(zzcuu zzcuuVar, A4.a aVar, Bundle bundle) {
        zzcut zzcutVar = (zzcut) aVar.get();
        Bundle bundle2 = zzcutVar.zza;
        String str = (String) ((A4.a) zzcuuVar.zzg.zzb()).get();
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhf)).booleanValue() && zzcuuVar.zzj.zzN()) {
            z10 = true;
        }
        boolean z11 = z10;
        String str2 = zzcuuVar.zzh;
        PackageInfo packageInfo = zzcuuVar.zzf;
        List list = zzcuuVar.zze;
        String str3 = zzcuuVar.zzd;
        return new zzbvo(bundle2, zzcuuVar.zzb, zzcuuVar.zzc, str3, list, packageInfo, str, str2, null, null, z11, zzcuuVar.zzk.zza(), bundle, zzcutVar.zzb, zzcuuVar.zzl);
    }

    public final A4.a zzb(Bundle bundle) {
        this.zzm.zza();
        return zzfgc.zzc(this.zzi.zza(new zzcut(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfgm.SIGNALS, this.zza).zza();
    }

    public final A4.a zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final A4.a aVarZzb = zzb(bundle);
        return this.zza.zza(zzfgm.REQUEST_PARCEL, aVarZzb, (A4.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcuu.zza(this.zza, aVarZzb, bundle);
            }
        }).zza();
    }
}
