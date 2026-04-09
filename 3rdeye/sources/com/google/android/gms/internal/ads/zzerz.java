package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzerz implements zzett {
    private final zzfco zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzerz(zzfco zzfcoVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfcoVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbgc zzbgcVar = this.zza.zzi;
        if (zzbgcVar == null || (i = zzbgcVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbgcVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcut zzcutVar = (zzcut) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcutVar.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // com.google.android.gms.internal.ads.zzett
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerz.zzb(java.lang.Object):void");
    }
}
