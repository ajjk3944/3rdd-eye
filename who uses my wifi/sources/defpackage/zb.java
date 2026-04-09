package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zb extends oi {
    public final d6 g;

    static {
        h80.f("BrdcstRcvrCnstrntTrckr");
    }

    public zb(Context context, l01 l01Var) {
        super(context, l01Var);
        this.g = new d6(1, this);
    }

    @Override // defpackage.oi
    public final void d() {
        h80 h80VarD = h80.d();
        getClass().getSimpleName().concat(": registering receiver");
        h80VarD.a(new Throwable[0]);
        this.b.registerReceiver(this.g, f());
    }

    @Override // defpackage.oi
    public final void e() {
        h80 h80VarD = h80.d();
        getClass().getSimpleName().concat(": unregistering receiver");
        h80VarD.a(new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
