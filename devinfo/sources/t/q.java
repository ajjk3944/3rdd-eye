package t;

import androidx.lifecycle.l0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33851a;

    public q(s sVar) {
        this.f33851a = new WeakReference(sVar);
    }

    @Override // t.d
    public final void a(int i4, CharSequence charSequence) {
        WeakReference weakReference = this.f33851a;
        if (weakReference.get() == null || ((s) weakReference.get()).f33863m || !((s) weakReference.get()).f33862l) {
            return;
        }
        ((s) weakReference.get()).f(new e(i4, charSequence));
    }

    @Override // t.d
    public final void b(p pVar) {
        WeakReference weakReference = this.f33851a;
        if (weakReference.get() == null || !((s) weakReference.get()).f33862l) {
            return;
        }
        int i4 = -1;
        if (pVar.f33850b == -1) {
            se.b bVar = pVar.f33849a;
            int iE = ((s) weakReference.get()).e();
            if ((iE & 32767) != 0 && !com.bumptech.glide.e.F(iE)) {
                i4 = 2;
            }
            pVar = new p(bVar, i4);
        }
        s sVar = (s) weakReference.get();
        if (sVar.f33866p == null) {
            sVar.f33866p = new l0();
        }
        s.j(sVar.f33866p, pVar);
    }
}
