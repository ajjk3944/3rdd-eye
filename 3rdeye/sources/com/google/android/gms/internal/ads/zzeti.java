package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeti implements zzetu {
    private final zzgdm zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    public zzeti(zzgdm zzgdmVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgdmVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    public static /* synthetic */ zzetj zzc(zzeti zzetiVar) {
        Context context = zzetiVar.zzb;
        boolean zIsCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzv.zzr();
        boolean zZzF = com.google.android.gms.ads.internal.util.zzs.zzF(context);
        String str = zzetiVar.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzv.zzr();
        boolean zZzG = com.google.android.gms.ads.internal.util.zzs.zzG();
        com.google.android.gms.ads.internal.zzv.zzr();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzetj(zIsCallerInstantApp, zZzF, str, zZzG, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), zzetiVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeti.zzc(this.zza);
            }
        });
    }
}
