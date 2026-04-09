package se;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d implements bc.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f22003a = new AtomicReference();

    @Override // bc.b
    public final void a(boolean z10) {
        synchronized (f.k) {
            try {
                Iterator it = new ArrayList(f.f22006l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f22011e.get()) {
                        Iterator it2 = fVar.f22015i.iterator();
                        while (it2.hasNext()) {
                            f fVar2 = ((c) it2.next()).f22002a;
                            if (!z10) {
                                ((cg.d) fVar2.f22014h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
