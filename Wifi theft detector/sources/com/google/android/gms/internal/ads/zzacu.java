package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
/* loaded from: classes2.dex */
final class zzacu {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzee.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
