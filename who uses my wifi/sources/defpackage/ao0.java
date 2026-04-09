package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ao0 {
    public final bo0 f = new bo0();
    public boolean g = false;
    public final int h = 1;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public abstract void d(wo0 wo0Var, int i);

    public abstract wo0 e(ViewGroup viewGroup, int i);

    public final void f(boolean z) {
        if (this.f.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.g = z;
    }
}
