package com.bumptech.glide;

import A2.C0117e;
import G3.C0152f;
import h0.C2351a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l1.InterfaceC2636b;
import l1.InterfaceC2638d;
import r1.r;
import r1.s;
import r1.t;
import r1.u;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u f6513a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.e f6514b;

    /* renamed from: c, reason: collision with root package name */
    public final C2351a f6515c;

    /* renamed from: d, reason: collision with root package name */
    public final C0117e f6516d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f6517e;

    /* renamed from: f, reason: collision with root package name */
    public final C1.b f6518f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.b f6519g;

    /* renamed from: h, reason: collision with root package name */
    public final V2.h f6520h = new V2.h(3);
    public final C1.c i = new C1.c();

    /* renamed from: j, reason: collision with root package name */
    public final V2.e f6521j;

    public j() {
        V2.e eVar = new V2.e(new Q.d(20), new C0152f(16), new C0152f(17), 4, false);
        this.f6521j = eVar;
        this.f6513a = new u(eVar);
        this.f6514b = new A0.e(2);
        this.f6515c = new C2351a(3);
        this.f6516d = new C0117e(3);
        this.f6517e = new com.bumptech.glide.load.data.h();
        this.f6518f = new C1.b(2);
        this.f6519g = new C1.b(0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C2351a c2351a = this.f6515c;
        synchronized (c2351a) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) c2351a.f20441b);
                ((ArrayList) c2351a.f20441b).clear();
                int size = arrayList.size();
                int i = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ArrayList) c2351a.f20441b).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c2351a.f20441b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, s sVar) {
        u uVar = this.f6513a;
        synchronized (uVar) {
            uVar.f23372a.a(cls, cls2, sVar);
            uVar.f23373b.f6507a.clear();
        }
    }

    public final void b(Class cls, InterfaceC2636b interfaceC2636b) {
        A0.e eVar = this.f6514b;
        synchronized (eVar) {
            ((ArrayList) eVar.f73b).add(new C1.a(cls, interfaceC2636b));
        }
    }

    public final void c(Class cls, l1.k kVar) {
        C0117e c0117e = this.f6516d;
        synchronized (c0117e) {
            ((ArrayList) c0117e.f245b).add(new C1.e(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, l1.j jVar) {
        C2351a c2351a = this.f6515c;
        synchronized (c2351a) {
            c2351a.F(str).add(new C1.d(cls, cls2, jVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        Class cls4 = cls;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListG = this.f6515c.G(cls4, cls2);
        int size = arrayListG.size();
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            Class cls5 = (Class) arrayListG.get(i);
            ArrayList arrayListB = this.f6518f.b(cls5, cls3);
            int size2 = arrayListB.size();
            int i6 = 0;
            while (i6 < size2) {
                int i7 = i6 + 1;
                Class cls6 = (Class) arrayListB.get(i6);
                C2351a c2351a = this.f6515c;
                synchronized (c2351a) {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = (ArrayList) c2351a.f20441b;
                    int size3 = arrayList3.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj = arrayList3.get(i8);
                        i8++;
                        ArrayList arrayList4 = arrayList3;
                        String str = (String) obj;
                        int i9 = size3;
                        List list = (List) ((HashMap) c2351a.f20442c).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C1.d dVar = (C1.d) it.next();
                                Iterator it2 = it;
                                if (dVar.f1142a.isAssignableFrom(cls4) && cls5.isAssignableFrom(dVar.f1143b)) {
                                    arrayList.add(dVar.f1144c);
                                }
                                it = it2;
                            }
                        }
                        size3 = i9;
                        arrayList3 = arrayList4;
                    }
                }
                arrayList2.add(new n1.j(cls4, cls5, cls6, arrayList, this.f6518f.a(cls5, cls6), this.f6521j));
                cls4 = cls;
                i6 = i7;
            }
            cls4 = cls;
            i = i3;
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        C1.b bVar = this.f6519g;
        synchronized (bVar) {
            arrayList = bVar.f1138a;
        }
        if (arrayList.isEmpty()) {
            throw new i("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        u uVar = this.f6513a;
        uVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (uVar) {
            t tVar = (t) uVar.f23373b.f6507a.get(cls);
            listUnmodifiableList = tVar == null ? null : tVar.f23371a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(uVar.f23372a.b(cls));
                if (((t) uVar.f23373b.f6507a.put(cls, new t(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new i("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z6 = true;
        for (int i = 0; i < size; i++) {
            r rVar = (r) listUnmodifiableList.get(i);
            if (rVar.b(obj)) {
                if (z6) {
                    arrayList = new ArrayList(size - i);
                    z6 = false;
                }
                arrayList.add(rVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new i("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f h(Object obj) {
        com.bumptech.glide.load.data.f fVarB;
        com.bumptech.glide.load.data.h hVar = this.f6517e;
        synchronized (hVar) {
            try {
                H1.g.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) hVar.f6545b).get(obj.getClass());
                if (eVar == null) {
                    Iterator it = ((HashMap) hVar.f6545b).values().iterator();
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
                    eVar = com.bumptech.glide.load.data.h.f6543c;
                }
                fVarB = eVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVarB;
    }

    public final void i(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.h hVar = this.f6517e;
        synchronized (hVar) {
            ((HashMap) hVar.f6545b).put(eVar.a(), eVar);
        }
    }

    public final void j(Class cls, Class cls2, z1.a aVar) {
        C1.b bVar = this.f6518f;
        synchronized (bVar) {
            bVar.f1138a.add(new z1.b(cls, cls2, aVar));
        }
    }

    public final void k(InterfaceC2638d interfaceC2638d) {
        C1.b bVar = this.f6519g;
        synchronized (bVar) {
            bVar.f1138a.add(interfaceC2638d);
        }
    }
}
