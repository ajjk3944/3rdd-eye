package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzp implements View.OnTouchListener {
    final /* synthetic */ zzu zza;

    public zzp(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzu zzuVar = this.zza;
        if (zzuVar.zzh == null) {
            return false;
        }
        zzuVar.zzh.zzd(motionEvent);
        return false;
    }
}
