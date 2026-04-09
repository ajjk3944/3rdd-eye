package a6;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    public static b f158d = new b();

    public static b k() {
        return f158d;
    }

    @Override // a6.d
    public void f(boolean z10) {
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((y5.f) it.next()).p().k(z10);
        }
    }

    @Override // a6.d
    public boolean h() {
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            View viewH = ((y5.f) it.next()).h();
            if (viewH != null && viewH.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
