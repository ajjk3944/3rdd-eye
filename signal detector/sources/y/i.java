package Y;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final g f4216a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4217b;

    public i(h hVar, g gVar, ReferenceQueue referenceQueue) {
        super(hVar, referenceQueue);
        this.f4216a = gVar;
    }

    public final boolean a() {
        boolean z6;
        Object obj = this.f4217b;
        if (obj != null) {
            g gVar = this.f4216a;
            gVar.getClass();
            a aVar = (a) obj;
            synchronized (aVar) {
                try {
                    d dVar = aVar.f4194a;
                    if (dVar != null) {
                        dVar.f(gVar);
                    }
                } finally {
                }
            }
            z6 = true;
        } else {
            z6 = false;
        }
        this.f4217b = null;
        return z6;
    }
}
