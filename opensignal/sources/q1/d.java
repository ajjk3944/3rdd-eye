package q1;

import android.view.KeyEvent;
import y1.p;
import z0.l;

/* loaded from: classes.dex */
public final class d extends l implements c {

    /* renamed from: p, reason: collision with root package name */
    public p f20672p;

    @Override // q1.c
    public final boolean e(KeyEvent keyEvent) {
        return false;
    }

    @Override // q1.c
    public final boolean o(KeyEvent keyEvent) {
        p pVar = this.f20672p;
        if (pVar != null) {
            return ((Boolean) pVar.a(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
