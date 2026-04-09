package g3;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends i1.m implements n1.o {
    @Override // n1.o
    public final void m(n1.l lVar) {
        View viewB = k.b(this);
        lVar.d(this.f25554a.f25565n && k.b(this).hasFocusable());
        View viewFindFocus = viewB.findFocus();
        if (viewFindFocus != null) {
            lVar.e(n1.d.a(viewFindFocus, viewB));
        }
    }
}
