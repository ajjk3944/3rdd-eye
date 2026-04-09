package I5;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static final b f2495e = new b();

    @Override // I5.d
    public final void a(boolean z10) {
        Iterator it = Collections.unmodifiableCollection(c.f2496c.f2497a).iterator();
        while (it.hasNext()) {
            K5.a aVar = ((G5.l) it.next()).f1927e;
            if (aVar.f3150b.get() != null) {
                i.f2509a.a(aVar.f(), "setState", z10 ? "foregrounded" : "backgrounded", aVar.f3149a);
            }
        }
    }

    @Override // I5.d
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(c.f2496c.f2498b).iterator();
        while (it.hasNext()) {
            View view = ((G5.l) it.next()).f1926d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
