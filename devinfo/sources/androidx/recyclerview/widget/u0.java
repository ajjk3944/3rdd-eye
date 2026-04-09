package androidx.recyclerview.widget;

import android.database.Observable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((v0) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public final void c(int i4, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((v0) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i4, i10, 1);
        }
    }

    public final void d(int i4, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((v0) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i4, i10, obj);
        }
    }

    public final void e(int i4, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((v0) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i4, i10);
        }
    }

    public final void f(int i4, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((v0) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i4, i10);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((v0) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}
