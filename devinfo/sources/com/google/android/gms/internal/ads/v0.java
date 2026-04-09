package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class v0 {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            ls.H("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
