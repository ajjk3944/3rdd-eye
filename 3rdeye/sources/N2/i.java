package N2;

import N2.m;
import R2.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.C5308a;

/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class i<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4487a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4488b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f4489c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4490d;

    /* renamed from: e, reason: collision with root package name */
    public int f4491e;

    /* renamed from: f, reason: collision with root package name */
    public int f4492f;

    /* renamed from: g, reason: collision with root package name */
    public Class<?> f4493g;

    /* renamed from: h, reason: collision with root package name */
    public m.c f4494h;
    public L2.h i;

    /* renamed from: j, reason: collision with root package name */
    public h3.b f4495j;

    /* renamed from: k, reason: collision with root package name */
    public Class<Transcode> f4496k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4497l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4498m;

    /* renamed from: n, reason: collision with root package name */
    public L2.f f4499n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.h f4500o;

    /* renamed from: p, reason: collision with root package name */
    public l f4501p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4502q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4503r;

    public final ArrayList a() {
        boolean z10 = this.f4498m;
        ArrayList arrayList = this.f4488b;
        if (!z10) {
            this.f4498m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                q.a aVar = (q.a) arrayListB.get(i);
                if (!arrayList.contains(aVar.f11686a)) {
                    arrayList.add(aVar.f11686a);
                }
                int i10 = 0;
                while (true) {
                    List<L2.f> list = aVar.f11687b;
                    if (i10 < list.size()) {
                        if (!arrayList.contains(list.get(i10))) {
                            arrayList.add(list.get(i10));
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f4497l;
        ArrayList arrayList = this.f4487a;
        if (!z10) {
            this.f4497l = true;
            arrayList.clear();
            List listG = this.f4489c.b().g(this.f4490d);
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                q.a aVarB = ((R2.q) listG.get(i)).b(this.f4490d, this.f4491e, this.f4492f, this.i);
                if (aVarB != null) {
                    arrayList.add(aVarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> s<Data, ?, Transcode> c(Class<Data> cls) {
        s<Data, ?, Transcode> sVar;
        Class cls2;
        com.bumptech.glide.i iVarB = this.f4489c.b();
        Class<?> cls3 = this.f4493g;
        Class cls4 = this.f4496k;
        c3.b bVar = iVarB.i;
        h3.k andSet = bVar.f18451b.getAndSet(null);
        if (andSet == null) {
            andSet = new h3.k();
        }
        andSet.f38214a = cls;
        andSet.f38215b = cls3;
        andSet.f38216c = cls4;
        synchronized (bVar.f18450a) {
            sVar = (s) bVar.f18450a.get(andSet);
        }
        bVar.f18451b.set(andSet);
        iVarB.i.getClass();
        if (c3.b.f18449c.equals(sVar)) {
            return null;
        }
        if (sVar != null) {
            return sVar;
        }
        s<Data, ?, Transcode> sVar2 = null;
        ArrayList arrayListE = iVarB.e(cls, cls3, cls4);
        if (arrayListE.isEmpty()) {
            cls2 = cls;
        } else {
            cls2 = cls;
            sVar2 = new s<>(cls2, cls3, cls4, arrayListE, iVarB.f22264j);
        }
        s<Data, ?, Transcode> sVar3 = sVar2;
        iVarB.i.a(cls2, cls3, cls4, sVar3);
        return sVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = (L2.d<X>) r3.f18448b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <X> L2.d<X> d(X r6) throws com.bumptech.glide.i.e {
        /*
            r5 = this;
            com.bumptech.glide.e r0 = r5.f4489c
            com.bumptech.glide.i r0 = r0.b()
            c3.a r0 = r0.f22257b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f18446a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            c3.a$a r3 = (c3.C2061a.C0277a) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<T> r4 = r3.f18447a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            L2.d<T> r1 = r3.f18448b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L42
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.i$e r0 = new com.bumptech.glide.i$e
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = "Failed to find source encoder for data class: "
            java.lang.String r6 = N7.H7.o(r6, r1)
            r0.<init>(r6)
            throw r0
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.i.d(java.lang.Object):L2.d");
    }

    public final <Z> L2.l<Z> e(Class<Z> cls) {
        L2.l<Z> lVar = (L2.l) this.f4495j.get(cls);
        if (lVar == null) {
            Iterator it = ((C5308a.C0496a) this.f4495j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (L2.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f4495j.isEmpty() || !this.f4502q) {
            return T2.b.f12247b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
