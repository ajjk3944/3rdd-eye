package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y2 extends r9 {
    public d3[] getAdSizes() {
        return this.f.g;
    }

    public b8 getAppEventListener() {
        return this.f.h;
    }

    public j51 getVideoController() {
        return this.f.c;
    }

    public l51 getVideoOptions() {
        return this.f.j;
    }

    public void setAdSizes(d3... d3VarArr) {
        if (d3VarArr == null || d3VarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f.d(d3VarArr);
    }

    public void setAppEventListener(b8 b8Var) {
        this.f.e(b8Var);
    }

    public void setManualImpressionsEnabled(boolean z) {
        e23 e23Var = this.f;
        e23Var.m = z;
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.g1(z);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(l51 l51Var) {
        e23 e23Var = this.f;
        e23Var.j = l51Var;
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.J2(l51Var == null ? null : new ih3(l51Var));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
