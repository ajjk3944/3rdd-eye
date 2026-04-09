package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;

/* loaded from: classes2.dex */
final class zzhad extends zzgyh.zzf implements Runnable {
    private final Runnable zza;

    public zzhad(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 7);
        sb.append("task=[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
