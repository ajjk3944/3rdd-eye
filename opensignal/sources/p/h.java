package p;

import android.view.View;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final f f20063a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f20064d;

    public h(androidx.appcompat.widget.b bVar, f fVar) {
        this.f20064d = bVar;
        this.f20063a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.k kVar;
        androidx.appcompat.widget.b bVar = this.f20064d;
        o.m mVar = bVar.f1045g;
        if (mVar != null && (kVar = mVar.f18617e) != null) {
            kVar.A(mVar);
        }
        View view = (View) bVar.D;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.f20063a;
            if (fVar.b()) {
                bVar.P = fVar;
            } else if (fVar.f18677e != null) {
                fVar.d(0, 0, false, false);
                bVar.P = fVar;
            }
        }
        bVar.R = null;
    }
}
