package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import androidx.annotation.CallSuper;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
abstract class zzacv implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    final Choreographer zza;
    final DisplayManager zzb;
    volatile long zzc = C.TIME_UNSET;
    volatile long zzd = C.TIME_UNSET;

    public /* synthetic */ zzacv(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.zza = choreographer;
        this.zzb = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @CallSuper
    public void zza() {
        this.zzb.registerDisplayListener(this, zzfj.zzc(null));
    }

    @CallSuper
    public void zzb() {
        throw null;
    }
}
