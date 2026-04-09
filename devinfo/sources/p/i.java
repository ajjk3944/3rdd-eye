package p;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final g f30709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f30710b;

    public i(k kVar, g gVar) {
        this.f30710b = kVar;
        this.f30709a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.k kVar;
        k kVar2 = this.f30710b;
        o.m mVar = kVar2.f30727c;
        if (mVar != null && (kVar = mVar.f30242e) != null) {
            kVar.s(mVar);
        }
        View view = (View) kVar2.f30731h;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f30709a;
            if (gVar.b()) {
                kVar2.f30741s = gVar;
            } else if (gVar.f30304e != null) {
                gVar.d(0, 0, false, false);
                kVar2.f30741s = gVar;
            }
        }
        kVar2.f30743u = null;
    }
}
