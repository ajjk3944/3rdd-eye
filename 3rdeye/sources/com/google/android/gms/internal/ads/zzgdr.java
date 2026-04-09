package com.google.android.gms.internal.ads;

import N7.C1154e9;
import com.google.android.gms.internal.ads.zzgbp;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgdr extends zzgbp.zzf implements Runnable {
    private final Runnable zza;

    public zzgdr(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        return C1154e9.i("task=[", this.zza.toString(), "]");
    }
}
