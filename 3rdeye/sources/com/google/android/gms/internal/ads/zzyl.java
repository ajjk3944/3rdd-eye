package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzyl implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzyu zza;

    public zzyl(zzym zzymVar, zzyu zzyuVar) {
        this.zza = zzyuVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }
}
