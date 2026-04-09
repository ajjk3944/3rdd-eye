package com.bumptech.glide;

import d8.v;
import d8.w;
import d8.x;
import d8.y;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final y f6503a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.c f6504b;

    /* renamed from: c, reason: collision with root package name */
    public final km.o f6505c;

    /* renamed from: d, reason: collision with root package name */
    public final l8.c f6506d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f6507e;

    /* renamed from: f, reason: collision with root package name */
    public final l8.c f6508f;
    public final o8.b g;

    /* renamed from: h, reason: collision with root package name */
    public final km.n f6509h = new km.n((byte) 0, 5);

    /* renamed from: i, reason: collision with root package name */
    public final o8.c f6510i = new o8.c();
    public final i0.f j;

    public k() {
        i0.f fVar = new i0.f(new d4.e(20), new i7.b(), new j6.i(20));
        this.j = fVar;
        this.f6503a = new y(fVar);
        this.f6504b = new h7.c(2);
        this.f6505c = new km.o(5);
        this.f6506d = new l8.c(1);
        this.f6507e = new com.bumptech.glide.load.data.h();
        this.f6508f = new l8.c(0);
        this.g = new o8.b();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        km.o oVar = this.f6505c;
        synchronized (oVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) oVar.f28445a);
                ((ArrayList) oVar.f28445a).clear();
                int size = arrayList.size();
                int i4 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ArrayList) oVar.f28445a).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) oVar.f28445a).add(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Class cls, Class cls2, w wVar) {
        y yVar = this.f6503a;
        synchronized (yVar) {
            yVar.f22051a.a(cls, cls2, wVar);
            ((HashMap) yVar.f22052b.f31385a).clear();
        }
    }

    public final void b(Class cls, x7.b bVar) {
        h7.c cVar = this.f6504b;
        synchronized (cVar) {
            cVar.f24902a.add(new o8.a(cls, bVar));
        }
    }

    public final void c(Class cls, x7.k kVar) {
        l8.c cVar = this.f6506d;
        synchronized (cVar) {
            cVar.f28621a.add(new o8.e(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, x7.j jVar) {
        km.o oVar = this.f6505c;
        synchronized (oVar) {
            oVar.e(str).add(new o8.d(cls, cls2, jVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        Class cls4 = cls;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListF = this.f6505c.f(cls4, cls2);
        int size = arrayListF.size();
        int i4 = 0;
        while (i4 < size) {
            int i10 = i4 + 1;
            Class cls5 = (Class) arrayListF.get(i4);
            ArrayList arrayListC = this.f6508f.c(cls5, cls3);
            int size2 = arrayListC.size();
            int i11 = 0;
            while (i11 < size2) {
                int i12 = i11 + 1;
                Class cls6 = (Class) arrayListC.get(i11);
                km.o oVar = this.f6505c;
                synchronized (oVar) {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = (ArrayList) oVar.f28445a;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj = arrayList3.get(i13);
                        i13++;
                        ArrayList arrayList4 = arrayList3;
                        String str = (String) obj;
                        int i14 = size3;
                        List list = (List) ((HashMap) oVar.f28446b).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                o8.d dVar = (o8.d) it.next();
                                Iterator it2 = it;
                                if (dVar.f30428a.isAssignableFrom(cls4) && cls5.isAssignableFrom(dVar.f30429b)) {
                                    arrayList.add(dVar.f30430c);
                                }
                                it = it2;
                            }
                        }
                        size3 = i14;
                        arrayList3 = arrayList4;
                    }
                }
                arrayList2.add(new z7.i(cls4, cls5, cls6, arrayList, this.f6508f.a(cls5, cls6), this.j));
                cls4 = cls;
                i11 = i12;
            }
            cls4 = cls;
            i4 = i10;
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        o8.b bVar = this.g;
        synchronized (bVar) {
            arrayList = bVar.f30424a;
        }
        if (arrayList.isEmpty()) {
            throw new j("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        y yVar = this.f6503a;
        yVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (yVar) {
            x xVar = (x) ((HashMap) yVar.f22052b.f31385a).get(cls);
            listUnmodifiableList = xVar == null ? null : xVar.f22050a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = DesugarCollections.unmodifiableList(yVar.f22051a.c(cls));
                if (((x) ((HashMap) yVar.f22052b.f31385a).put(cls, new x(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new j("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z3 = true;
        for (int i4 = 0; i4 < size; i4++) {
            v vVar = (v) listUnmodifiableList.get(i4);
            if (vVar.b(obj)) {
                if (z3) {
                    arrayList = new ArrayList(size - i4);
                    z3 = false;
                }
                arrayList.add(vVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new j("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f h(Object obj) {
        com.bumptech.glide.load.data.f fVarB;
        com.bumptech.glide.load.data.h hVar = this.f6507e;
        synchronized (hVar) {
            try {
                t8.f.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) hVar.f6523b).get(obj.getClass());
                if (eVar == null) {
                    Iterator it = ((HashMap) hVar.f6523b).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.e eVar2 = (com.bumptech.glide.load.data.e) it.next();
                        if (eVar2.a().isAssignableFrom(obj.getClass())) {
                            eVar = eVar2;
                            break;
                        }
                    }
                }
                if (eVar == null) {
                    eVar = com.bumptech.glide.load.data.h.f6521c;
                }
                fVarB = eVar.b(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVarB;
    }

    public final void i(Class cls, w wVar) {
        y yVar = this.f6503a;
        synchronized (yVar) {
            yVar.f22051a.e(cls, wVar);
            ((HashMap) yVar.f22052b.f31385a).clear();
        }
    }

    public final void j(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.h hVar = this.f6507e;
        synchronized (hVar) {
            ((HashMap) hVar.f6523b).put(eVar.a(), eVar);
        }
    }

    public final void k(Class cls, Class cls2, l8.a aVar) {
        l8.c cVar = this.f6508f;
        synchronized (cVar) {
            cVar.f28621a.add(new l8.b(cls, cls2, aVar));
        }
    }

    public final void l(x7.d dVar) {
        o8.b bVar = this.g;
        synchronized (bVar) {
            bVar.f30424a.add(dVar);
        }
    }
}
