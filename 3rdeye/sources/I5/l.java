package I5;

import android.annotation.SuppressLint;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static final l f2515d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f2516a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2517b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2518c;

    static {
        l lVar = new l();
        lVar.f2517b = false;
        lVar.f2518c = false;
        f2515d = lVar;
    }

    public final void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f2518c || this.f2517b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(c.f2496c.f2497a).iterator();
        while (it.hasNext()) {
            K5.a aVar = ((G5.l) it.next()).f1927e;
            boolean z12 = z11 || z10;
            if (aVar.f3150b.get() != null) {
                i.f2509a.a(aVar.f(), "setDeviceLockState", z12 ? "locked" : "unlocked");
            }
        }
    }
}
