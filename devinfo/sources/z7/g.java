package z7;

import com.google.android.gms.internal.ads.hp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38000a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38001b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.h f38002c;

    /* renamed from: d, reason: collision with root package name */
    public Object f38003d;

    /* renamed from: e, reason: collision with root package name */
    public int f38004e;

    /* renamed from: f, reason: collision with root package name */
    public int f38005f;
    public Class g;

    /* renamed from: h, reason: collision with root package name */
    public hp f38006h;

    /* renamed from: i, reason: collision with root package name */
    public x7.h f38007i;
    public Map j;

    /* renamed from: k, reason: collision with root package name */
    public Class f38008k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38009l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38010m;

    /* renamed from: n, reason: collision with root package name */
    public x7.e f38011n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.i f38012o;

    /* renamed from: p, reason: collision with root package name */
    public j f38013p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38014q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38015r;

    public final ArrayList a() {
        boolean z3 = this.f38010m;
        ArrayList arrayList = this.f38001b;
        if (!z3) {
            this.f38010m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i4 = 0; i4 < size; i4++) {
                d8.u uVar = (d8.u) arrayListB.get(i4);
                x7.e eVar = uVar.f22047a;
                List list = uVar.f22048b;
                if (!arrayList.contains(eVar)) {
                    arrayList.add(uVar.f22047a);
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (!arrayList.contains(list.get(i10))) {
                        arrayList.add((x7.e) list.get(i10));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z3 = this.f38009l;
        ArrayList arrayList = this.f38000a;
        if (!z3) {
            this.f38009l = true;
            arrayList.clear();
            List listG = this.f38002c.b().g(this.f38003d);
            int size = listG.size();
            for (int i4 = 0; i4 < size; i4++) {
                d8.u uVarA = ((d8.v) listG.get(i4)).a(this.f38003d, this.f38004e, this.f38005f, this.f38007i);
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
        }
        return arrayList;
    }

    public final w c(Class cls) {
        w wVar;
        Class cls2;
        com.bumptech.glide.k kVarB = this.f38002c.b();
        Class cls3 = this.g;
        Class cls4 = this.f38008k;
        o8.c cVar = kVarB.f6510i;
        t8.k kVar = (t8.k) cVar.f30427b.getAndSet(null);
        if (kVar == null) {
            kVar = new t8.k();
        }
        kVar.f34516a = cls;
        kVar.f34517b = cls3;
        kVar.f34518c = cls4;
        synchronized (cVar.f30426a) {
            wVar = (w) cVar.f30426a.get(kVar);
        }
        cVar.f30427b.set(kVar);
        kVarB.f6510i.getClass();
        if (o8.c.f30425c.equals(wVar)) {
            return null;
        }
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = null;
        ArrayList arrayListE = kVarB.e(cls, cls3, cls4);
        if (arrayListE.isEmpty()) {
            cls2 = cls;
        } else {
            cls2 = cls;
            wVar2 = new w(cls2, cls3, cls4, arrayListE, kVarB.j);
        }
        w wVar3 = wVar2;
        kVarB.f6510i.a(cls2, cls3, cls4, wVar3);
        return wVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r1 = r5.f30423b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.b d(java.lang.Object r8) {
        /*
            r7 = this;
            com.bumptech.glide.h r0 = r7.f38002c
            com.bumptech.glide.k r0 = r0.b()
            h7.c r0 = r0.f6504b
            java.lang.Class r1 = r8.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f24902a     // Catch: java.lang.Throwable -> L2a
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2a
            r4 = 0
        L14:
            if (r4 >= r3) goto L2c
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L2a
            int r4 = r4 + 1
            o8.a r5 = (o8.a) r5     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r6 = r5.f30422a     // Catch: java.lang.Throwable -> L2a
            boolean r6 = r6.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L14
            x7.b r1 = r5.f30423b     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)
            goto L2e
        L2a:
            r8 = move-exception
            goto L49
        L2c:
            monitor-exit(r0)
            r1 = 0
        L2e:
            if (r1 == 0) goto L31
            return r1
        L31:
            com.bumptech.glide.j r0 = new com.bumptech.glide.j
            java.lang.Class r8 = r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find source encoder for data class: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.g.d(java.lang.Object):x7.b");
    }

    public final x7.l e(Class cls) {
        x7.l lVar = (x7.l) this.j.get(cls);
        if (lVar == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (x7.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.j.isEmpty() || !this.f38014q) {
            return f8.c.f23839b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
