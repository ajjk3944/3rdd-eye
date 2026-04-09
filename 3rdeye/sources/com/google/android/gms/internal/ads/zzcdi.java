package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcdi implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcdl zzd;

    public zzcdi(zzcdl zzcdlVar, String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = zzcdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("totalBytes", Integer.toString(this.zzc));
        zzcdl.zze(this.zzd, "onPrecacheEvent", map);
    }
}
