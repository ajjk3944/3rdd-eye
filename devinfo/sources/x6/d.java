package x6;

import android.net.ConnectivityManager;
import b7.r;
import bh.t;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements y6.d {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f36979a;

    public d(ConnectivityManager connectivityManager) {
        this.f36979a = connectivityManager;
    }

    @Override // y6.d
    public final boolean a(r rVar) {
        k.e(rVar, "workSpec");
        return rVar.j.a() != null;
    }

    @Override // y6.d
    public final boolean b(r rVar) {
        if (a(rVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // y6.d
    public final al.c c(t6.e eVar) {
        k.e(eVar, "constraints");
        return new al.c(new t(eVar, this, (ck.c) null, 28), ck.i.f2898a, -2, zk.a.f38322a);
    }
}
