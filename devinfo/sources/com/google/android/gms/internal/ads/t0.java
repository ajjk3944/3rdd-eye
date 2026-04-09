package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f16610a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f16611b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16612c;

    /* renamed from: f, reason: collision with root package name */
    public long f16615f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16617i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16619l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16620m;

    /* renamed from: d, reason: collision with root package name */
    public int f16613d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f16614e = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f16616h = -9223372036854775807L;
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public w5 f16618k = w5.f17894f;

    public t0(Context context, i0 i0Var) {
        this.f16610a = i0Var;
        this.f16611b = new a1(context);
    }

    public final void a(int i4) {
        if (i4 == 0) {
            this.f16613d = 1;
        } else if (i4 != 1) {
            this.f16613d = Math.min(this.f16613d, 2);
        } else {
            this.f16613d = 0;
        }
        this.f16611b.a();
    }

    public final void b() {
        this.f16612c = true;
        this.f16618k.getClass();
        this.f16615f = bq0.s(SystemClock.elapsedRealtime());
        a1 a1Var = this.f16611b;
        a1Var.f9168d = true;
        a1Var.a();
        DisplayManager displayManager = (DisplayManager) a1Var.f9166b.getSystemService("display");
        w0 z0Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                z0Var = Build.VERSION.SDK_INT >= 33 ? new z0(choreographer, displayManager) : new x0(choreographer, displayManager);
            } catch (RuntimeException e2) {
                ls.y("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
            }
        }
        a1Var.f9167c = z0Var;
        if (z0Var != null) {
            z0Var.a();
        }
        a1Var.c(false);
    }

    public final void c(Surface surface) {
        this.f16619l = surface != null;
        this.f16620m = false;
        a1 a1Var = this.f16611b;
        if (a1Var.f9169e != surface) {
            a1Var.d();
            a1Var.f9169e = surface;
            a1Var.c(true);
        }
        this.f16613d = Math.min(this.f16613d, 1);
    }

    public final void d(float f10) {
        a1 a1Var = this.f16611b;
        a1Var.f9170f = f10;
        c0 c0Var = a1Var.f9165a;
        c0Var.f9887a.a();
        c0Var.f9888b.a();
        c0Var.f9889c = false;
        c0Var.f9890d = -9223372036854775807L;
        c0Var.f9891e = 0;
        a1Var.b();
    }

    public final boolean e(boolean z3) {
        if (z3 && (this.f16613d == 3 || (!this.f16619l && this.f16620m))) {
            this.f16616h = -9223372036854775807L;
            return true;
        }
        if (this.f16616h == -9223372036854775807L) {
            return false;
        }
        this.f16618k.getClass();
        if (SystemClock.elapsedRealtime() < this.f16616h) {
            return true;
        }
        this.f16616h = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        if (r3 > 100000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0169, code lost:
    
        if (r33 >= r37) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0172, code lost:
    
        if (r30.f16612c != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(long r31, long r33, long r35, long r37, boolean r39, boolean r40, com.google.android.gms.internal.ads.s0 r41) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t0.f(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.s0):int");
    }

    public final void g(float f10) {
        mq0.m(f10 > 0.0f);
        if (f10 == this.j) {
            return;
        }
        this.j = f10;
        a1 a1Var = this.f16611b;
        a1Var.f9172i = f10;
        a1Var.c(false);
    }
}
