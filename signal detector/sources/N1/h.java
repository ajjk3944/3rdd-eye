package n1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22185a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22186b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f22187c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22188d;

    /* renamed from: e, reason: collision with root package name */
    public int f22189e;

    /* renamed from: f, reason: collision with root package name */
    public int f22190f;

    /* renamed from: g, reason: collision with root package name */
    public Class f22191g;

    /* renamed from: h, reason: collision with root package name */
    public H1.h f22192h;
    public l1.h i;

    /* renamed from: j, reason: collision with root package name */
    public Map f22193j;

    /* renamed from: k, reason: collision with root package name */
    public Class f22194k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22195l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22196m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2639e f22197n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.h f22198o;

    /* renamed from: p, reason: collision with root package name */
    public k f22199p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22200q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22201r;

    public final ArrayList a() {
        boolean z6 = this.f22196m;
        ArrayList arrayList = this.f22186b;
        if (!z6) {
            this.f22196m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                r1.q qVar = (r1.q) arrayListB.get(i);
                InterfaceC2639e interfaceC2639e = qVar.f23368a;
                List list = qVar.f23369b;
                if (!arrayList.contains(interfaceC2639e)) {
                    arrayList.add(qVar.f23368a);
                }
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (!arrayList.contains(list.get(i3))) {
                        arrayList.add((InterfaceC2639e) list.get(i3));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z6 = this.f22195l;
        ArrayList arrayList = this.f22185a;
        if (!z6) {
            this.f22195l = true;
            arrayList.clear();
            List listG = this.f22187c.b().g(this.f22188d);
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                r1.q qVarA = ((r1.r) listG.get(i)).a(this.f22188d, this.f22189e, this.f22190f, this.i);
                if (qVarA != null) {
                    arrayList.add(qVarA);
                }
            }
        }
        return arrayList;
    }

    public final x c(Class cls) {
        x xVar;
        Class cls2;
        com.bumptech.glide.j jVarB = this.f22187c.b();
        Class cls3 = this.f22191g;
        Class cls4 = this.f22194k;
        C1.c cVar = jVarB.i;
        H1.n nVar = (H1.n) cVar.f1141b.getAndSet(null);
        if (nVar == null) {
            nVar = new H1.n();
        }
        nVar.f1775a = cls;
        nVar.f1776b = cls3;
        nVar.f1777c = cls4;
        synchronized (cVar.f1140a) {
            xVar = (x) cVar.f1140a.get(nVar);
        }
        cVar.f1141b.set(nVar);
        jVarB.i.getClass();
        if (C1.c.f1139c.equals(xVar)) {
            return null;
        }
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = null;
        ArrayList arrayListE = jVarB.e(cls, cls3, cls4);
        if (arrayListE.isEmpty()) {
            cls2 = cls;
        } else {
            cls2 = cls;
            xVar2 = new x(cls2, cls3, cls4, arrayListE, jVarB.f6521j);
        }
        x xVar3 = xVar2;
        jVarB.i.a(cls2, cls3, cls4, xVar3);
        return xVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r1 = r5.f1137b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l1.InterfaceC2636b d(java.lang.Object r8) {
        /*
            r7 = this;
            com.bumptech.glide.f r0 = r7.f22187c
            com.bumptech.glide.j r0 = r0.b()
            A0.e r0 = r0.f6514b
            java.lang.Class r1 = r8.getClass()
            monitor-enter(r0)
            java.lang.Object r2 = r0.f73b     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2c
            r4 = 0
        L16:
            if (r4 >= r3) goto L2e
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + 1
            C1.a r5 = (C1.a) r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Class r6 = r5.f1136a     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r6.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L16
            l1.b r1 = r5.f1137b     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            goto L30
        L2c:
            r8 = move-exception
            goto L4b
        L2e:
            monitor-exit(r0)
            r1 = 0
        L30:
            if (r1 == 0) goto L33
            return r1
        L33:
            com.bumptech.glide.i r0 = new com.bumptech.glide.i
            java.lang.Class r8 = r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find source encoder for data class: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.d(java.lang.Object):l1.b");
    }

    public final l1.l e(Class cls) {
        l1.l lVar = (l1.l) this.f22193j.get(cls);
        if (lVar == null) {
            Iterator it = this.f22193j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (l1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f22193j.isEmpty() || !this.f22200q) {
            return t1.c.f23536b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
