package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzhgo;
import s.g;
import z0.C5848a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzo implements zzbec {
    final /* synthetic */ zzbed zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzo(zzs zzsVar, zzbed zzbedVar, Context context, Uri uri) {
        this.zza = zzbedVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public final void zza() {
        zzbed zzbedVar = this.zza;
        g gVarA = new g.d(zzbedVar.zza()).a();
        Context context = this.zzb;
        String strZza = zzhgo.zza(context);
        Intent intent = gVarA.f45885a;
        intent.setPackage(strZza);
        intent.setData(this.zzc);
        C5848a.startActivity(context, intent, gVarA.f45886b);
        zzbedVar.zzf((Activity) context);
    }
}
