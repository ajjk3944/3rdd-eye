package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class zzcls implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);
    private final int zzb;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 26);
        sb.append("AdWorker(WebViewStartup) #");
        sb.append(andIncrement);
        return new zzclr(this, runnable, sb.toString(), runnable);
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }
}
