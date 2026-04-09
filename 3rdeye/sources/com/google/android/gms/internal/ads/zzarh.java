package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzarh implements zzaqw {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzarh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
