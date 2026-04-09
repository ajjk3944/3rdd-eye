package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vy2 {
    public static vy2 f;
    public int a;
    public boolean b;
    public Object c;
    public Serializable d;
    public final Object e;

    public vy2(Context context) {
        Executor executorB = wl2.B();
        this.c = executorB;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.a = 0;
        executorB.execute(new n62(this, context, 28));
    }

    public static synchronized vy2 a(Context context) {
        try {
            if (f == null) {
                f = new vy2(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public int b() {
        int i;
        synchronized (this.e) {
            i = this.a;
        }
        return i;
    }

    public void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            sx2 sx2Var = (sx2) it.next();
            if (sx2Var.a.get() == null) {
                copyOnWriteArrayList.remove(sx2Var);
            }
        }
        synchronized (this.e) {
            try {
                if (this.b && this.a == i) {
                    return;
                }
                this.b = true;
                this.a = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    sx2 sx2Var2 = (sx2) it2.next();
                    sx2Var2.getClass();
                    sx2Var2.b.execute(new bs2(4, sx2Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vy2() {
        this.c = null;
        h80 h80Var = new h80(2);
        h80Var.g = 1000;
        this.e = h80Var;
        this.a = 1;
        this.b = false;
    }
}
