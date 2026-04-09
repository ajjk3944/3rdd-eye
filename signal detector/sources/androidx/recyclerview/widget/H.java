package androidx.recyclerview.widget;

import android.database.Observable;

/* loaded from: classes.dex */
public final class H extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((I) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i3) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((I) ((Observable) this).mObservers.get(size)).d(i, i3);
        }
    }

    public final void d(int i, int i3, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((I) ((Observable) this).mObservers.get(size)).b(i, i3, obj);
        }
    }

    public final void e(int i, int i3) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((I) ((Observable) this).mObservers.get(size)).c(i, i3);
        }
    }

    public final void f(int i, int i3) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((I) ((Observable) this).mObservers.get(size)).e(i, i3);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((I) ((Observable) this).mObservers.get(size)).f();
        }
    }
}
