package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ds {
    public int a = 1;
    public final qe0 b;
    public qe0 c;
    public qe0 d;
    public int e;
    public int f;

    public ds(qe0 qe0Var) {
        this.b = qe0Var;
        this.c = qe0Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        oe0 oe0VarB = this.c.b.b();
        int iA = oe0VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) oe0VarB.i).get(iA + oe0VarB.f) == 0) || this.e == 65039;
    }
}
