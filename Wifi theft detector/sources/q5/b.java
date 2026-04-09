package q5;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    public static b f24052d = new b();

    public static b k() {
        return f24052d;
    }

    @Override // q5.d
    public void f(boolean z10) {
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).t().n(z10);
        }
    }

    @Override // q5.d
    public boolean h() {
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            View viewN = ((o5.g) it.next()).n();
            if (viewN != null && viewN.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
