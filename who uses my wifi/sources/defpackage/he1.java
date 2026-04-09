package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class he1 {
    public final od1 a;
    public final fe1 b;
    public final ge1 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public he1(Context context) {
        DisplayManager displayManager;
        od1 od1Var = new od1();
        od1Var.a = new nd1();
        od1Var.b = new nd1();
        od1Var.d = -9223372036854775807L;
        this.a = od1Var;
        fe1 fe1Var = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new fe1(this, displayManager);
        this.b = fe1Var;
        this.c = fe1Var != null ? ge1.j : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final /* synthetic */ void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            a30.x("Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    public final void b() {
        float f;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        od1 od1Var = this.a;
        if (!od1Var.a.b()) {
            f = this.f;
        } else if (od1Var.a.b()) {
            f = (float) (1.0E9d / (od1Var.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f2 = this.g;
        if (f != f2) {
            if (f != -1.0f && f2 != -1.0f) {
                float f3 = 1.0f;
                if (od1Var.a.b()) {
                    if ((od1Var.a.b() ? od1Var.a.f : -9223372036854775807L) >= 5000000000L) {
                        f3 = 0.1f;
                    }
                }
                if (Math.abs(f - this.g) < f3) {
                    return;
                }
            } else if (f == -1.0f && od1Var.e < 30) {
                return;
            }
            this.g = f;
            c(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L40
            android.view.Surface r0 = r4.e
            if (r0 == 0) goto L40
            int r1 = r4.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L40
        L11:
            boolean r1 = r4.d
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r3 = r4.i
            float r1 = r1 * r3
            goto L23
        L22:
            r1 = r2
        L23:
            if (r5 != 0) goto L2b
            float r5 = r4.h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L40
        L2b:
            r4.h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L33
            r5 = 0
            goto L34
        L33:
            r5 = 1
        L34:
            defpackage.m91.n(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L38
            return
        L38:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            defpackage.a30.C(r0, r1, r5)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he1.c(boolean):void");
    }

    public final void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            a30.C("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
