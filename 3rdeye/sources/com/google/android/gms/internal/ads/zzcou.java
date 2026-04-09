package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzcou {
    private final zzcqt zza;
    private final View zzb;
    private final zzfbu zzc;
    private final zzcfe zzd;

    public zzcou(View view, zzcfe zzcfeVar, zzcqt zzcqtVar, zzfbu zzfbuVar) {
        this.zzb = view;
        this.zzd = zzcfeVar;
        this.zza = zzcqtVar;
        this.zzc = zzfbuVar;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcfe zzb() {
        return this.zzd;
    }

    public final zzcqt zzc() {
        return this.zza;
    }

    public zzcxd zzd(Set set) {
        return new zzcxd(set);
    }

    public final zzfbu zze() {
        return this.zzc;
    }
}
