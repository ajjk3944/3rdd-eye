package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final H f11308a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f11309b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11310c;

    /* renamed from: f, reason: collision with root package name */
    public long f11313f;
    public boolean i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11318l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11319m;

    /* renamed from: d, reason: collision with root package name */
    public int f11311d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f11312e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f11314g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f11315h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f11316j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public C1994v2 f11317k = C1994v2.f17209f;

    public T(Context context, H h6) {
        this.f11308a = h6;
        this.f11309b = new Y(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f11311d = 1;
        } else if (i != 1) {
            this.f11311d = Math.min(this.f11311d, 2);
        } else {
            this.f11311d = 0;
        }
        this.f11309b.a();
    }

    public final void b() {
        this.f11310c = true;
        this.f11317k.getClass();
        this.f11313f = Vt.s(SystemClock.elapsedRealtime());
        Y y3 = this.f11309b;
        y3.f12543d = true;
        y3.a();
        DisplayManager displayManager = (DisplayManager) y3.f12541b.getSystemService("display");
        V x6 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                x6 = Build.VERSION.SDK_INT >= 33 ? new X(choreographer, displayManager) : new W(choreographer, displayManager);
            } catch (RuntimeException e6) {
                AbstractC2022vd.z("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e6);
            }
        }
        y3.f12542c = x6;
        if (x6 != null) {
            x6.a();
        }
        y3.c(false);
    }

    public final void c(Surface surface) {
        this.f11318l = surface != null;
        this.f11319m = false;
        Y y3 = this.f11309b;
        if (y3.f12544e != surface) {
            y3.d();
            y3.f12544e = surface;
            y3.c(true);
        }
        this.f11311d = Math.min(this.f11311d, 1);
    }

    public final void d(float f2) {
        Y y3 = this.f11309b;
        y3.f12545f = f2;
        D d6 = y3.f12540a;
        d6.f7707a.a();
        d6.f7708b.a();
        d6.f7709c = false;
        d6.f7710d = -9223372036854775807L;
        d6.f7711e = 0;
        y3.b();
    }

    public final boolean e(boolean z6) {
        if (z6 && (this.f11311d == 3 || (!this.f11318l && this.f11319m))) {
            this.f11315h = -9223372036854775807L;
            return true;
        }
        if (this.f11315h == -9223372036854775807L) {
            return false;
        }
        this.f11317k.getClass();
        if (SystemClock.elapsedRealtime() < this.f11315h) {
            return true;
        }
        this.f11315h = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        if (r3 > 100000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0169, code lost:
    
        if (r33 >= r37) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0172, code lost:
    
        if (r30.f11310c != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(long r31, long r33, long r35, long r37, boolean r39, boolean r40, com.google.android.gms.internal.ads.S r41) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T.f(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.S):int");
    }

    public final void g(float f2) {
        AbstractC0582Jp.m(f2 > 0.0f);
        if (f2 == this.f11316j) {
            return;
        }
        this.f11316j = f2;
        Y y3 = this.f11309b;
        y3.i = f2;
        y3.c(false);
    }
}
