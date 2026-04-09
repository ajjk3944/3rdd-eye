package og;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements bc.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f19439a = new AtomicReference();

    @Override // bc.b
    public final void a(boolean z10) {
        Random random = j.j;
        synchronized (j.class) {
            Iterator it = j.k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).e(z10);
            }
        }
    }
}
