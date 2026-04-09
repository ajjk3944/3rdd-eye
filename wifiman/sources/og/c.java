package Og;

import Lg.f;
import Lg.i;
import Lg.l;
import Lg.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.jmdns.impl.constants.g;

/* loaded from: classes4.dex */
public abstract class c extends Mg.a {

    /* renamed from: d, reason: collision with root package name */
    static Ej.b f17830d = Ej.c.i(c.class);

    /* renamed from: e, reason: collision with root package name */
    private static int f17831e = javax.jmdns.impl.constants.a.f50179d;

    /* renamed from: b, reason: collision with root package name */
    private final int f17832b;

    /* renamed from: c, reason: collision with root package name */
    private g f17833c;

    public c(l lVar, int i10) {
        super(lVar);
        this.f17833c = null;
        this.f17832b = i10;
    }

    public static int n() {
        return f17831e;
    }

    protected void g(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                synchronized (iVar) {
                    iVar.h(this);
                }
            }
        }
    }

    protected abstract void h();

    protected void i(g gVar) {
        synchronized (e()) {
            e().u0(this, gVar);
        }
        Iterator it = e().K0().values().iterator();
        while (it.hasNext()) {
            ((q) ((Kg.d) it.next())).L(this, gVar);
        }
    }

    protected abstract f j(f fVar);

    protected abstract f k(q qVar, f fVar);

    protected abstract boolean l();

    protected abstract f m();

    public int o() {
        return this.f17832b;
    }

    public abstract String p();

    protected g q() {
        return this.f17833c;
    }

    protected abstract void r(Throwable th2);

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        f fVarM = m();
        try {
        } catch (Throwable th2) {
            f17830d.j("{}.run() exception ", f(), th2);
            r(th2);
        }
        if (!l()) {
            cancel();
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (e()) {
            try {
                if (e().U0(this, q())) {
                    f17830d.o("{}.run() JmDNS {} {}", f(), p(), e().G0());
                    arrayList.add(e());
                    fVarM = j(fVarM);
                }
            } finally {
            }
        }
        Iterator it = e().K0().values().iterator();
        while (it.hasNext()) {
            q qVar = (q) ((Kg.d) it.next());
            synchronized (qVar) {
                try {
                    if (qVar.c0(this, q())) {
                        f17830d.o("{}.run() JmDNS {} {}", f(), p(), qVar.u());
                        arrayList.add(qVar);
                        fVarM = k(qVar, fVarM);
                    }
                } finally {
                }
            }
        }
        if (fVarM.n()) {
            g(arrayList);
            cancel();
        } else {
            f17830d.o("{}.run() JmDNS {} #{}", f(), p(), q());
            e().m1(fVarM);
            g(arrayList);
            h();
        }
    }

    protected void s() {
        synchronized (e()) {
            e().f1(this);
        }
        Iterator it = e().K0().values().iterator();
        while (it.hasNext()) {
            ((q) ((Kg.d) it.next())).g0(this);
        }
    }

    protected void t(g gVar) {
        this.f17833c = gVar;
    }
}
