package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yc4 implements Handler.Callback, zt1 {
    public final ya4 f;
    public final oa4 g;
    public final sw1 h = new sw1();
    public final d13 i;
    public final uc4 j;
    public final vc4 k;
    public final wc4 l;
    public final xc4 m;

    public yc4(ya4 ya4Var, oa4 oa4Var, pz pzVar, int i, int i2, int i3, int i4) {
        this.f = ya4Var;
        this.g = oa4Var;
        this.i = pzVar.p(ya4Var.z, this);
        this.j = new uc4(this, i);
        this.k = new vc4(this, i2);
        this.l = new wc4(this, i3);
        this.m = new xc4(this, i4);
        ya4Var.t.a(this);
    }

    @Override // defpackage.zt1
    public final void a() {
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.j.a();
            return true;
        }
        if (i == 2) {
            this.k.a();
            return true;
        }
        if (i == 3) {
            this.l.a();
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.m.a();
        return true;
    }
}
