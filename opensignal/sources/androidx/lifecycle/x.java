package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends o {
    public int B;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final zt.o0 G;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1526g;

    /* renamed from: r, reason: collision with root package name */
    public r.a f1527r;

    /* renamed from: x, reason: collision with root package name */
    public n f1528x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakReference f1529y;

    public x(v vVar) {
        super(0);
        this.f1526g = true;
        this.f1527r = new r.a();
        n nVar = n.INITIALIZED;
        this.f1528x = nVar;
        this.F = new ArrayList();
        this.f1529y = new WeakReference(vVar);
        this.G = zt.f0.a(nVar);
    }

    @Override // androidx.lifecycle.o
    public final void V0(u uVar) {
        t eVar;
        v vVar;
        br.l.e(uVar, "observer");
        u1("addObserver");
        n nVar = this.f1528x;
        n nVar2 = n.DESTROYED;
        if (nVar != nVar2) {
            nVar2 = n.INITIALIZED;
        }
        br.l.e(nVar2, "initialState");
        w wVar = new w();
        HashMap map = y.f1530a;
        boolean z10 = uVar instanceof t;
        boolean z11 = uVar instanceof DefaultLifecycleObserver;
        Object obj = null;
        int i10 = 1;
        if (z10 && z11) {
            eVar = new e((DefaultLifecycleObserver) uVar, (t) uVar);
        } else if (z11) {
            eVar = new e((DefaultLifecycleObserver) uVar, (t) null);
        } else if (z10) {
            eVar = (t) uVar;
        } else {
            Class<?> cls = uVar.getClass();
            if (y.b(cls) == 2) {
                Object obj2 = y.f1531b.get(cls);
                br.l.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), uVar);
                    throw null;
                }
                int size = list.size();
                g[] gVarArr = new g[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), uVar);
                    throw null;
                }
                eVar = new l7.b(i10, gVarArr);
            } else {
                eVar = new e(uVar);
            }
        }
        wVar.f1525b = eVar;
        wVar.f1524a = nVar2;
        r.a aVar = this.f1527r;
        r.c cVarA = aVar.a(uVar);
        if (cVarA != null) {
            obj = cVarA.f21101d;
        } else {
            HashMap map2 = aVar.f21096x;
            r.c cVar = new r.c(uVar, wVar);
            aVar.f21110r++;
            r.c cVar2 = aVar.f21108d;
            if (cVar2 == null) {
                aVar.f21107a = cVar;
                aVar.f21108d = cVar;
            } else {
                cVar2.f21102g = cVar;
                cVar.f21103r = cVar2;
                aVar.f21108d = cVar;
            }
            map2.put(uVar, cVar);
        }
        if (((w) obj) == null && (vVar = (v) this.f1529y.get()) != null) {
            boolean z12 = this.B != 0 || this.D;
            n nVarT1 = t1(uVar);
            this.B++;
            while (wVar.f1524a.compareTo(nVarT1) < 0 && this.f1527r.f21096x.containsKey(uVar)) {
                n nVar3 = wVar.f1524a;
                ArrayList arrayList = this.F;
                arrayList.add(nVar3);
                k kVar = m.Companion;
                n nVar4 = wVar.f1524a;
                kVar.getClass();
                m mVarB = k.b(nVar4);
                if (mVarB == null) {
                    throw new IllegalStateException("no event up from " + wVar.f1524a);
                }
                wVar.a(vVar, mVarB);
                arrayList.remove(arrayList.size() - 1);
                nVarT1 = t1(uVar);
            }
            if (!z12) {
                y1();
            }
            this.B--;
        }
    }

    @Override // androidx.lifecycle.o
    public final n e1() {
        return this.f1528x;
    }

    @Override // androidx.lifecycle.o
    public final void m1(u uVar) {
        br.l.e(uVar, "observer");
        u1("removeObserver");
        this.f1527r.b(uVar);
    }

    public final n t1(u uVar) {
        HashMap map = this.f1527r.f21096x;
        r.c cVar = map.containsKey(uVar) ? ((r.c) map.get(uVar)).f21103r : null;
        n nVar = cVar != null ? ((w) cVar.f21101d).f1524a : null;
        ArrayList arrayList = this.F;
        n nVar2 = arrayList.isEmpty() ? null : (n) h0.b.f(1, arrayList);
        n nVar3 = this.f1528x;
        br.l.e(nVar3, "state1");
        if (nVar == null || nVar.compareTo(nVar3) >= 0) {
            nVar = nVar3;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void u1(String str) {
        if (this.f1526g) {
            q.a.X().f20652i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(h0.b.o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void v1(m mVar) {
        br.l.e(mVar, "event");
        u1("handleLifecycleEvent");
        w1(mVar.getTargetState());
    }

    public final void w1(n nVar) {
        if (this.f1528x == nVar) {
            return;
        }
        v vVar = (v) this.f1529y.get();
        n nVar2 = this.f1528x;
        br.l.e(nVar2, "current");
        br.l.e(nVar, "next");
        if (nVar2 == n.INITIALIZED && nVar == n.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + n.CREATED + "' to be moved to '" + nVar + "' in component " + vVar).toString());
        }
        n nVar3 = n.DESTROYED;
        if (nVar2 == nVar3 && nVar2 != nVar) {
            throw new IllegalStateException(("State is '" + nVar3 + "' and cannot be moved to `" + nVar + "` in component " + vVar).toString());
        }
        this.f1528x = nVar;
        if (this.D || this.B != 0) {
            this.E = true;
            return;
        }
        this.D = true;
        y1();
        this.D = false;
        if (this.f1528x == nVar3) {
            this.f1527r = new r.a();
        }
    }

    public final void x1(n nVar) {
        br.l.e(nVar, "state");
        u1("setCurrentState");
        w1(nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.E = false;
        r7.G.g(r7.f1528x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.y1():void");
    }
}
