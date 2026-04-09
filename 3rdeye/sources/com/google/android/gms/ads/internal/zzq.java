package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzavs;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzq implements Callable {
    final /* synthetic */ zzu zza;

    public zzq(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzu zzuVar = this.zza;
        return new zzavs(zzavr.zzt(zzuVar.zzd, new zzavp(zzuVar.zza.afmaVersion, false)));
    }
}
