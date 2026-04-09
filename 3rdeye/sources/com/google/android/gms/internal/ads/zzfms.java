package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfms implements Runnable {
    final /* synthetic */ zzfmt zza;
    private final WebView zzb;

    public zzfms(zzfmt zzfmtVar) {
        this.zza = zzfmtVar;
        this.zzb = zzfmtVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
