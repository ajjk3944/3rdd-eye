package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcdf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcdl zze;

    public zzcdf(zzcdl zzcdlVar, String str, String str2, int i, int i10, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i10;
        this.zze = zzcdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", Integer.toString(this.zzc));
        map.put("totalBytes", Integer.toString(this.zzd));
        map.put("cacheReady", CommonUrlParts.Values.FALSE_INTEGER);
        zzcdl.zze(this.zze, "onPrecacheEvent", map);
    }
}
