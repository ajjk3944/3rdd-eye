package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class de1 {
    public final sd1 a;
    public final he1 b;
    public boolean c;
    public long f;
    public boolean i;
    public boolean l;
    public boolean m;
    public int d = 0;
    public long e = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public pz k = pz.o;

    public de1(Context context, sd1 sd1Var) {
        this.a = sd1Var;
        this.b = new he1(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.d = 1;
        } else if (i != 1) {
            this.d = Math.min(this.d, 2);
        } else {
            this.d = 0;
        }
    }

    public final void b() {
        this.c = true;
        this.k.getClass();
        this.f = v23.r(SystemClock.elapsedRealtime());
        he1 he1Var = this.b;
        he1Var.d = true;
        he1Var.m = 0L;
        he1Var.p = -1L;
        he1Var.n = -1L;
        fe1 fe1Var = he1Var.b;
        if (fe1Var != null) {
            DisplayManager displayManager = fe1Var.a;
            ge1 ge1Var = he1Var.c;
            ge1Var.getClass();
            ge1Var.g.sendEmptyMessage(2);
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            displayManager.registerDisplayListener(fe1Var, new Handler(looperMyLooper, null));
            fe1Var.b.a(displayManager.getDisplay(0));
        }
        he1Var.c(false);
    }

    public final void c() {
        this.c = false;
        this.h = -9223372036854775807L;
        he1 he1Var = this.b;
        he1Var.d = false;
        fe1 fe1Var = he1Var.b;
        if (fe1Var != null) {
            fe1Var.a.unregisterDisplayListener(fe1Var);
            ge1 ge1Var = he1Var.c;
            ge1Var.getClass();
            ge1Var.g.sendEmptyMessage(3);
        }
        he1Var.d();
    }

    public final void d(Surface surface) {
        this.l = surface != null;
        this.m = false;
        he1 he1Var = this.b;
        if (he1Var.e != surface) {
            he1Var.d();
            he1Var.e = surface;
            he1Var.c(true);
        }
        this.d = Math.min(this.d, 1);
    }

    public final void e(float f) {
        he1 he1Var = this.b;
        he1Var.f = f;
        od1 od1Var = he1Var.a;
        od1Var.a.a();
        od1Var.b.a();
        od1Var.c = false;
        od1Var.d = -9223372036854775807L;
        od1Var.e = 0;
        he1Var.b();
    }

    public final boolean f(boolean z) {
        if (z && (this.d == 3 || (!this.l && this.m))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        if (r4 > 100000) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
    
        if (r29 >= r33) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:
    
        if (r26.c != false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(long r27, long r29, long r31, long r33, boolean r35, boolean r36, defpackage.ib1 r37) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de1.g(long, long, long, long, boolean, boolean, ib1):int");
    }

    public final void h(float f) {
        zt0.D(f > 0.0f);
        if (f == this.j) {
            return;
        }
        this.j = f;
        he1 he1Var = this.b;
        he1Var.i = f;
        he1Var.m = 0L;
        he1Var.p = -1L;
        he1Var.n = -1L;
        he1Var.c(false);
    }
}
