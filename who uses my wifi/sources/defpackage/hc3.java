package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hc3 extends kc3 {
    public static final hc3 i = new hc3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(ic3.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((xb3) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kc3
    public final void b(boolean z) {
        Iterator it = Collections.unmodifiableCollection(ic3.c.a).iterator();
        while (it.hasNext()) {
            sc3 sc3Var = ((xb3) it.next()).d;
            if (sc3Var.b.get() != 0) {
                fr.q.s(sc3Var.c(), "setState", true != z ? "backgrounded" : "foregrounded", sc3Var.a);
            }
        }
    }
}
