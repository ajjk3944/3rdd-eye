package defpackage;

import java.util.LinkedList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z83 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final m93 d = new m93();

    public z83(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                return;
            }
            e93 e93Var = (e93) linkedList.getFirst();
            hg4.C.k.getClass();
            if (System.currentTimeMillis() - e93Var.d < this.c) {
                return;
            }
            m93 m93Var = this.d;
            m93Var.f++;
            m93Var.b.g++;
            linkedList.remove();
        }
    }
}
