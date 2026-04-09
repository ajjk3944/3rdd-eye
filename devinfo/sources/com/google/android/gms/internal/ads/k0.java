package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f12909d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f12910e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12911a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f12912b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12913c;

    public /* synthetic */ k0(j0 j0Var, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f12912b = j0Var;
        this.f12911a = z3;
    }

    public static synchronized boolean a(Context context) {
        if (!f12910e) {
            try {
            } catch (pc0 e2) {
                ls.D("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e2.getMessage())));
            }
            int i4 = a80.i(context) ? a80.L("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
            f12909d = i4;
            f12910e = true;
        }
        return f12909d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        j0 j0Var = this.f12912b;
        synchronized (j0Var) {
            try {
                if (!this.f12913c) {
                    Handler handler = j0Var.f12553b;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f12913c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
