package k6;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    public static b f21862d = new b();

    public static b k() {
        return f21862d;
    }

    @Override // k6.d
    public void f(boolean z10) {
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((i6.h) it.next()).k().k(z10);
        }
    }

    @Override // k6.d
    public boolean h() {
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            View viewL = ((i6.h) it.next()).l();
            if (viewL != null && viewL.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
