package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgh;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements zzhfy<CsiParamDefaults> {
    private final zzhgh zza;
    private final zzhgh zzb;

    public CsiParamDefaults_Factory(zzhgh<Context> zzhghVar, zzhgh<VersionInfoParcel> zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    public static CsiParamDefaults_Factory create(zzhgh<Context> zzhghVar, zzhgh<VersionInfoParcel> zzhghVar2) {
        return new CsiParamDefaults_Factory(zzhghVar, zzhghVar2);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
