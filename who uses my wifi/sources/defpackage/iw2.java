package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iw2 implements zv2 {
    public final long a;
    public final f20 b;
    public final x73 c;

    public iw2(long j, Context context, f20 f20Var, th2 th2Var, String str) {
        this.a = j;
        this.b = f20Var;
        this.c = (x73) ((ba4) new vq2(th2Var.b, context, str).h).d();
    }

    @Override // defpackage.zv2
    public final void a(pc4 pc4Var) {
        try {
            this.c.q2(pc4Var, new gw2(this));
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zv2
    public final void d() {
        try {
            x73 x73Var = this.c;
            x73Var.c1(new hw2(this));
            x73Var.w2(new oi0(null));
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zv2
    public final void h() {
    }
}
