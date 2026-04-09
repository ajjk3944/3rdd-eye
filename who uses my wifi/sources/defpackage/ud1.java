package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ud1 extends Surface {
    public static int i;
    public static boolean j;
    public final boolean f;
    public final td1 g;
    public boolean h;

    public /* synthetic */ ud1(td1 td1Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.g = td1Var;
        this.f = z;
    }

    public static synchronized boolean a() {
        try {
            if (!j) {
                try {
                } catch (lq2 e) {
                    a30.A("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
                }
                int i2 = ou1.X("EGL_EXT_protected_content") ? ou1.X("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
                i = i2;
                j = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        td1 td1Var = this.g;
        synchronized (td1Var) {
            try {
                if (!this.h) {
                    Handler handler = td1Var.g;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
