package defpackage;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gc3 implements jc3 {
    public static final gc3 e;
    public boolean a = false;
    public boolean b = false;
    public Object c;
    public Object d;

    static {
        kc3 kc3Var = new kc3();
        gc3 gc3Var = new gc3();
        gc3Var.d = kc3Var;
        e = gc3Var;
    }

    public gc3(t83 t83Var, z71 z71Var, a73 a73Var) {
        this.c = a73Var;
        n70 n70VarU = ((vg0) z71Var.g).u(a73Var.b, a73Var.a, null);
        k62 k62Var = new k62(this, z71Var, t83Var, a73Var, 6);
        Executor executor = a73Var.e;
        this.d = pu1.L(pu1.O(n70VarU, k62Var, executor), Exception.class, new u42(this, z71Var), executor);
    }

    @Override // defpackage.jc3
    public void b(boolean z) {
        if (!this.b && z) {
            Date date = new Date();
            Date date2 = (Date) this.c;
            if (date2 == null || date.after(date2)) {
                this.c = date;
                if (this.a) {
                    Iterator it = Collections.unmodifiableCollection(ic3.c.b).iterator();
                    while (it.hasNext()) {
                        sc3 sc3Var = ((xb3) it.next()).d;
                        Date date3 = (Date) this.c;
                        sc3Var.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.b = z;
    }
}
