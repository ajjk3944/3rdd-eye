package xi;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class r extends d {
    public final Context B;
    public final IntentFilter D;
    public final a5.s E;
    public hk.k F;

    /* renamed from: y, reason: collision with root package name */
    public final bk.f f25361y;

    public r(al.b bVar, bk.f fVar, Context context) {
        super(bVar, fVar);
        this.f25361y = fVar;
        this.B = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.D = intentFilter;
        this.E = new a5.s(11, this);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.F;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        this.F = kVar;
        a5.s sVar = this.E;
        Context context = this.B;
        if (kVar == null) {
            context.unregisterReceiver(sVar);
        } else {
            context.registerReceiver(sVar, this.D);
        }
    }
}
