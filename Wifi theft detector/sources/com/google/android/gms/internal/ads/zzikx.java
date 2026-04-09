package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzikx extends n.d {
    private final WeakReference zza;

    public zzikx(zzbif zzbifVar) {
        this.zza = new WeakReference(zzbifVar);
    }

    @Override // n.d
    public final void onCustomTabsServiceConnected(ComponentName componentName, n.b bVar) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzf(bVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzg();
        }
    }
}
