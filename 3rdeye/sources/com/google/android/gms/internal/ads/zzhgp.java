package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import s.f;
import s.h;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhgp extends h {
    private final WeakReference zza;

    public zzhgp(zzbed zzbedVar) {
        this.zza = new WeakReference(zzbedVar);
    }

    @Override // s.h
    public final void onCustomTabsServiceConnected(ComponentName componentName, f fVar) {
        zzbed zzbedVar = (zzbed) this.zza.get();
        if (zzbedVar != null) {
            zzbedVar.zzc(fVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbed zzbedVar = (zzbed) this.zza.get();
        if (zzbedVar != null) {
            zzbedVar.zzd();
        }
    }
}
