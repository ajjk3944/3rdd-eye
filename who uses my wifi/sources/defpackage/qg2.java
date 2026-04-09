package defpackage;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qg2 extends hy2 {
    public final ag2 f;
    public final boolean h;
    public final boolean i;
    public int j;
    public wy2 k;
    public boolean l;
    public float n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public w22 s;
    public final Object g = new Object();
    public boolean m = true;

    public qg2(ag2 ag2Var, float f, boolean z, boolean z2) {
        this.f = ag2Var;
        this.n = f;
        this.h = z;
        this.i = z2;
    }

    public final void C3(ih3 ih3Var) {
        Object obj = this.g;
        boolean z = ih3Var.g;
        boolean z2 = ih3Var.h;
        synchronized (obj) {
            this.q = z;
            this.r = z2;
        }
        boolean z3 = ih3Var.f;
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        s8 s8Var = new s8(3);
        s8Var.put("muteStart", str3);
        s8Var.put("customControlsRequested", str);
        s8Var.put("clickToExpandRequested", str2);
        E3("initialState", Collections.unmodifiableMap(s8Var));
    }

    public final void D3(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.g) {
            try {
                z2 = true;
                if (f2 == this.n && f3 == this.p) {
                    z2 = false;
                }
                this.n = f2;
                if (!((Boolean) tw1.e.c.a(mz1.Cd)).booleanValue()) {
                    this.o = f;
                }
                z3 = this.m;
                this.m = z;
                i2 = this.j;
                this.j = i;
                float f4 = this.p;
                this.p = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.f.p0().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                w22 w22Var = this.s;
                if (w22Var != null) {
                    w22Var.M0(w22Var.U(), 2);
                }
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
        md2.f.execute(new pg2(this, i2, i, z3, z));
    }

    public final void E3(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        md2.f.execute(new n62(this, map2, 12));
    }

    @Override // defpackage.py2
    public final void Z0(wy2 wy2Var) {
        synchronized (this.g) {
            this.k = wy2Var;
        }
    }

    @Override // defpackage.py2
    public final void b() {
        E3("play", null);
    }

    @Override // defpackage.py2
    public final void c() {
        E3("pause", null);
    }

    @Override // defpackage.py2
    public final boolean f() {
        boolean z;
        synchronized (this.g) {
            z = this.m;
        }
        return z;
    }

    @Override // defpackage.py2
    public final float g() {
        float f;
        synchronized (this.g) {
            f = this.n;
        }
        return f;
    }

    @Override // defpackage.py2
    public final int j() {
        int i;
        synchronized (this.g) {
            i = this.j;
        }
        return i;
    }

    @Override // defpackage.py2
    public final float k() {
        float f;
        synchronized (this.g) {
            f = this.o;
        }
        return f;
    }

    @Override // defpackage.py2
    public final float n() {
        float f;
        synchronized (this.g) {
            f = this.p;
        }
        return f;
    }

    @Override // defpackage.py2
    public final boolean o() {
        boolean z;
        synchronized (this.g) {
            try {
                z = false;
                if (this.h && this.q) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.py2
    public final void o0(boolean z) {
        E3(true != z ? "unmute" : "mute", null);
    }

    @Override // defpackage.py2
    public final wy2 p() {
        wy2 wy2Var;
        synchronized (this.g) {
            wy2Var = this.k;
        }
        return wy2Var;
    }

    @Override // defpackage.py2
    public final boolean q() {
        boolean z;
        Object obj = this.g;
        boolean zO = o();
        synchronized (obj) {
            z = false;
            if (!zO) {
                try {
                    if (this.r && this.i) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // defpackage.py2
    public final void x() {
        E3("stop", null);
    }
}
