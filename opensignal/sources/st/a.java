package st;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f22276a;

    public a(j jVar) {
        this.f22276a = new AtomicReference(jVar);
    }

    @Override // st.j
    public final Iterator iterator() {
        j jVar = (j) this.f22276a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
