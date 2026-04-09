package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class m61 {
    public final n61 a = new n61();

    public final void a() {
        n61 n61Var = this.a;
        if (n61Var != null && !n61Var.d) {
            n61Var.d = true;
            synchronized (n61Var.a) {
                try {
                    Iterator it = n61Var.b.values().iterator();
                    while (it.hasNext()) {
                        n61.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = n61Var.c.iterator();
                    while (it2.hasNext()) {
                        n61.a((AutoCloseable) it2.next());
                    }
                    n61Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
