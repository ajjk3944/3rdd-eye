package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nd2 {
    public final xm3 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public nd2(xm3 xm3Var) {
        this.a = xm3Var;
        ce2 ce2Var = ce2.e;
        this.d = false;
    }

    public final ce2 a(ce2 ce2Var) throws af2 {
        if (ce2Var.equals(ce2.e)) {
            throw new af2("Unhandled input format:", ce2Var);
        }
        int i = 0;
        while (true) {
            xm3 xm3Var = this.a;
            if (i >= xm3Var.size()) {
                return ce2Var;
            }
            qf2 qf2Var = (qf2) xm3Var.get(i);
            ce2 ce2VarA = qf2Var.a(ce2Var);
            if (qf2Var.h()) {
                zt0.b0(!ce2VarA.equals(r0));
                ce2Var = ce2VarA;
            }
            i++;
        }
    }

    public final void b(pe2 pe2Var) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long jD = pe2Var.a;
        int i = 0;
        while (true) {
            xm3 xm3Var = this.a;
            if (i >= xm3Var.size()) {
                break;
            }
            qf2 qf2Var = (qf2) xm3Var.get(i);
            new pe2(jD);
            qf2Var.j();
            if (qf2Var.h()) {
                jD = qf2Var.d(jD);
                zt0.b0(jD >= 0);
                arrayList.add(qf2Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= f(); i2++) {
            this.c[i2] = ((qf2) arrayList.get(i2)).c();
        }
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final boolean d() {
        return this.d && ((qf2) this.b.get(f())).e() && !this.c[f()].hasRemaining();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= f()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    qf2 qf2Var = (qf2) arrayList.get(i);
                    if (!qf2Var.e()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : qf2.a;
                        long jRemaining = byteBuffer2.remaining();
                        qf2Var.f(byteBuffer2);
                        this.c[i] = qf2Var.c();
                        boolean z2 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < f()) {
                        ((qf2) arrayList.get(i + 1)).b();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd2)) {
            return false;
        }
        xm3 xm3Var = this.a;
        int size = xm3Var.size();
        xm3 xm3Var2 = ((nd2) obj).a;
        if (size != xm3Var2.size()) {
            return false;
        }
        for (int i = 0; i < xm3Var.size(); i++) {
            if (xm3Var.get(i) != xm3Var2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.c.length - 1;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
