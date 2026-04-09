package a3;

import e3.InterfaceC4313g;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Set<InterfaceC4313g<?>> f14157b = Collections.newSetFromMap(new WeakHashMap());

    @Override // a3.i
    public final void onDestroy() {
        Iterator it = h3.l.e(this.f14157b).iterator();
        while (it.hasNext()) {
            ((InterfaceC4313g) it.next()).onDestroy();
        }
    }

    @Override // a3.i
    public final void onStart() {
        Iterator it = h3.l.e(this.f14157b).iterator();
        while (it.hasNext()) {
            ((InterfaceC4313g) it.next()).onStart();
        }
    }

    @Override // a3.i
    public final void onStop() {
        Iterator it = h3.l.e(this.f14157b).iterator();
        while (it.hasNext()) {
            ((InterfaceC4313g) it.next()).onStop();
        }
    }
}
