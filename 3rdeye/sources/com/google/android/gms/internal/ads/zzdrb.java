package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbch;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdrb implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzdrb(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String strZza = ((zzewg) this.zza).zza();
        Context contextZza = ((zzchg) this.zzb).zza();
        zzgdm zzgdmVarZzc = zzffm.zzc();
        Map mapZzb = ((zzhgc) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfo)).booleanValue()) {
            zzbca zzbcaVar = new zzbca(new zzbcg(contextZza));
            zzbcaVar.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzdrc
                @Override // com.google.android.gms.internal.ads.zzbbz
                public final void zza(zzbch.zzt.zza zzaVar) {
                    zzaVar.zzO(strZza);
                }
            });
            setSingleton = Collections.singleton(new zzddo(new zzdre(zzbcaVar, mapZzb), zzgdmVarZzc));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }
}
