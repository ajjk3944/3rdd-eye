package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcuj implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzcuj(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzchu) this.zzb).zza();
        final zzfco zzfcoVarZza = ((zzcvi) this.zzc).zza();
        return new zzfut() { // from class: com.google.android.gms.internal.ads.zzcui
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzfbt zzfbtVar = (zzfbt) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzfbtVar.zzB);
                zzauVar.zzq(zzfbtVar.zzC.toString());
                zzauVar.zzo(versionInfoParcelZza.afmaVersion);
                zzauVar.zzn(zzfcoVarZza.zzf);
                return zzauVar;
            }
        };
    }
}
