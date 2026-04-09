package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zh {
    public final ArrayList a = new ArrayList();
    public Object b;
    public final oi c;
    public yh d;

    public zh(oi oiVar) {
        this.c = oiVar;
    }

    public abstract boolean a(oa1 oa1Var);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            oa1 oa1Var = (oa1) it.next();
            if (a(oa1Var)) {
                this.a.add(oa1Var.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            oi oiVar = this.c;
            synchronized (oiVar.c) {
                try {
                    if (oiVar.d.add(this)) {
                        if (oiVar.d.size() == 1) {
                            oiVar.e = oiVar.a();
                            h80 h80VarD = h80.d();
                            int i = oi.f;
                            String.format("%s: initial state = %s", oiVar.getClass().getSimpleName(), oiVar.e);
                            h80VarD.a(new Throwable[0]);
                            oiVar.d();
                        }
                        Object obj = oiVar.e;
                        this.b = obj;
                        d(this.d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.d, this.b);
    }

    public final void d(yh yhVar, Object obj) {
        if (this.a.isEmpty() || yhVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.a;
            v91 v91Var = (v91) yhVar;
            synchronized (v91Var.c) {
                try {
                    u91 u91Var = v91Var.a;
                    if (u91Var != null) {
                        u91Var.c(arrayList);
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList arrayList2 = this.a;
        v91 v91Var2 = (v91) yhVar;
        synchronized (v91Var2.c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (v91Var2.a(str)) {
                        h80 h80VarD = h80.d();
                        int i2 = v91.d;
                        h80VarD.a(new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                u91 u91Var2 = v91Var2.a;
                if (u91Var2 != null) {
                    u91Var2.e(arrayList3);
                }
            } finally {
            }
        }
    }
}
