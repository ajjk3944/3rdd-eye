package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c22 {
    public final b22 a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public c22(b22 b22Var) {
        double dL;
        int iB;
        u10 u10VarD;
        this.a = b22Var;
        Uri uriH = null;
        try {
            u10VarD = b22Var.d();
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
        Drawable drawable = u10VarD != null ? (Drawable) oi0.l1(u10VarD) : null;
        this.b = drawable;
        try {
            uriH = this.a.h();
        } catch (RemoteException e2) {
            gi2.c0("", e2);
        }
        this.c = uriH;
        try {
            dL = this.a.l();
        } catch (RemoteException e3) {
            gi2.c0("", e3);
            dL = 1.0d;
        }
        this.d = dL;
        int iC = -1;
        try {
            iB = this.a.b();
        } catch (RemoteException e4) {
            gi2.c0("", e4);
            iB = -1;
        }
        this.e = iB;
        try {
            iC = this.a.c();
        } catch (RemoteException e5) {
            gi2.c0("", e5);
        }
        this.f = iC;
    }
}
