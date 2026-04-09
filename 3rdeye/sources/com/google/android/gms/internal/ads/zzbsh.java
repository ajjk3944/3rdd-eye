package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbsh implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsj zza;

    public zzbsh(zzbsj zzbsjVar) {
        this.zza = zzbsjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbsj zzbsjVar = this.zza;
        Intent intentZzb = zzbsjVar.zzb();
        com.google.android.gms.ads.internal.zzv.zzr();
        com.google.android.gms.ads.internal.util.zzs.zzU(zzbsjVar.zzb, intentZzb);
    }
}
