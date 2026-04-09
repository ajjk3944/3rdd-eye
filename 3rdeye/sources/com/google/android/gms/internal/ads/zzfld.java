package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfld {
    public static zzfld zza(zzfle zzfleVar, zzflf zzflfVar) {
        zzfmz.zza();
        return new zzflh(zzfleVar, zzflfVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzflk zzflkVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
