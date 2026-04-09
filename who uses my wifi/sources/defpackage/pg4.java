package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pg4 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final wt2 c;
    public final lv2 d;
    public Looper e;
    public oz1 f;
    public xd4 g;

    public pg4() {
        Object obj = null;
        this.c = new wt2(new CopyOnWriteArrayList(), obj, 14);
        this.d = new lv2((Object) new CopyOnWriteArrayList(), obj, 18, false);
    }

    public abstract void a(fk1 fk1Var);

    public abstract void b(jh4 jh4Var);

    public abstract jh4 c(kh4 kh4Var, rj4 rj4Var, long j);

    public abstract fk1 f();

    public abstract void h(ws3 ws3Var);

    public abstract void j();

    public final void k(oz1 oz1Var) {
        this.f = oz1Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lh4) arrayList.get(i)).a(this, oz1Var);
        }
    }

    public final void l(rh4 rh4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.h;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            mh4 mh4Var = (mh4) it.next();
            if (mh4Var.b == rh4Var) {
                copyOnWriteArrayList.remove(mh4Var);
            }
        }
    }

    public final void m(kf4 kf4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.h;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            jf4 jf4Var = (jf4) it.next();
            if (jf4Var.a == kf4Var) {
                copyOnWriteArrayList.remove(jf4Var);
            }
        }
    }

    public final void n(lh4 lh4Var, ws3 ws3Var, xd4 xd4Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zt0.D(z);
        this.g = xd4Var;
        oz1 oz1Var = this.f;
        this.a.add(lh4Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(lh4Var);
            h(ws3Var);
        } else if (oz1Var != null) {
            o(lh4Var);
            lh4Var.a(this, oz1Var);
        }
    }

    public final void o(lh4 lh4Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(lh4Var);
        if (zIsEmpty) {
            g();
        }
    }

    public final void p(lh4 lh4Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(lh4Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(lh4 lh4Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(lh4Var);
        if (!arrayList.isEmpty()) {
            p(lh4Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }

    public void g() {
    }

    public void i() {
    }
}
