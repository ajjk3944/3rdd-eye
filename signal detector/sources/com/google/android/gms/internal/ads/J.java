package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class J extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f9203d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f9204e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9205a;

    /* renamed from: b, reason: collision with root package name */
    public final I f9206b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9207c;

    public /* synthetic */ J(I i, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f9206b = i;
        this.f9205a = z6;
    }

    public static synchronized boolean a(Context context) {
        if (!f9204e) {
            try {
            } catch (C1924tn e6) {
                AbstractC2022vd.F("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e6.getMessage())));
            }
            int i = AbstractC0933bL.h(context) ? AbstractC0933bL.H("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
            f9203d = i;
            f9204e = true;
        }
        return f9203d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        I i = this.f9206b;
        synchronized (i) {
            try {
                if (!this.f9207c) {
                    Handler handler = i.f9049b;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f9207c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
