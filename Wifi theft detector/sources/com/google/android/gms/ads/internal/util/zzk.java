package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzikw;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzk implements zzbie {
    final /* synthetic */ zzbif zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    public zzk(zzs zzsVar, zzbif zzbifVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbifVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zza() {
        zzbif zzbifVar = this.zza;
        CustomTabsIntent.d dVar = new CustomTabsIntent.d(zzbifVar.zzc());
        zzs.zzak(dVar, this.zzb);
        CustomTabsIntent customTabsIntentA = dVar.a();
        Intent intent = customTabsIntentA.f1427a;
        Context context = this.zzc;
        intent.setPackage(zzikw.zza(context));
        customTabsIntentA.a(context, this.zzd);
        zzbifVar.zzb((Activity) context);
    }
}
