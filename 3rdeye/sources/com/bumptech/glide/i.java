package com.bumptech.glide;

import D9.G;
import R2.q;
import R2.r;
import R2.s;
import Z2.c;
import androidx.camera.core.impl.C0;
import c3.C2061a;
import c3.c;
import c3.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import i3.C4455a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t4.C5606d;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final s f22256a;

    /* renamed from: b, reason: collision with root package name */
    public final C2061a f22257b;

    /* renamed from: c, reason: collision with root package name */
    public final c3.c f22258c;

    /* renamed from: d, reason: collision with root package name */
    public final c3.d f22259d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f22260e;

    /* renamed from: f, reason: collision with root package name */
    public final Z2.c f22261f;

    /* renamed from: g, reason: collision with root package name */
    public final C0 f22262g;

    /* renamed from: h, reason: collision with root package name */
    public final G f22263h = new G();
    public final c3.b i = new c3.b();

    /* renamed from: j, reason: collision with root package name */
    public final C4455a.c f22264j;

    /* compiled from: Registry.java */
    public static class a extends RuntimeException {
    }

    /* compiled from: Registry.java */
    public static final class b extends a {
    }

    /* compiled from: Registry.java */
    public static class c extends a {
    }

    /* compiled from: Registry.java */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    public static class e extends a {
    }

    public i() {
        C4455a.c cVar = new C4455a.c(new K0.e(20), new i3.b(), new i3.c());
        this.f22264j = cVar;
        this.f22256a = new s(cVar);
        this.f22257b = new C2061a();
        this.f22258c = new c3.c();
        this.f22259d = new c3.d();
        this.f22260e = new com.bumptech.glide.load.data.f();
        this.f22261f = new Z2.c();
        this.f22262g = new C0();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        c3.c cVar2 = this.f22258c;
        synchronized (cVar2) {
            try {
                ArrayList arrayList2 = new ArrayList(cVar2.f18452a);
                cVar2.f18452a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    cVar2.f18452a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        cVar2.f18452a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, L2.d dVar) {
        C2061a c2061a = this.f22257b;
        synchronized (c2061a) {
            c2061a.f18446a.add(new C2061a.C0277a(cls, dVar));
        }
    }

    public final void b(Class cls, L2.k kVar) {
        c3.d dVar = this.f22259d;
        synchronized (dVar) {
            dVar.f18457a.add(new d.a(cls, kVar));
        }
    }

    public final void c(Class cls, Class cls2, r rVar) {
        s sVar = this.f22256a;
        synchronized (sVar) {
            sVar.f11689a.a(cls, cls2, rVar);
            sVar.f11690b.f11691a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, L2.j jVar) {
        c3.c cVar = this.f22258c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, jVar));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f22258c.b(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f22261f.b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                c3.c cVar = this.f22258c;
                synchronized (cVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = cVar.f18452a.iterator();
                    while (it3.hasNext()) {
                        List<c.a> list = (List) cVar.f18453b.get((String) it3.next());
                        if (list != null) {
                            for (c.a aVar : list) {
                                if (aVar.f18454a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f18455b)) {
                                    arrayList.add(aVar.f18456c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new N2.k(cls, cls4, cls5, arrayList, this.f22261f.a(cls4, cls5), this.f22264j));
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        C0 c02 = this.f22262g;
        synchronized (c02) {
            arrayList = c02.f14871a;
        }
        if (arrayList.isEmpty()) {
            throw new b("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final <Model> List<q<Model, ?>> g(Model model) {
        List<q<Model, ?>> listUnmodifiableList;
        s sVar = this.f22256a;
        sVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (sVar) {
            s.a.C0155a c0155a = (s.a.C0155a) sVar.f11690b.f11691a.get(cls);
            listUnmodifiableList = c0155a == null ? null : c0155a.f11692a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(sVar.f11689a.c(cls));
                if (((s.a.C0155a) sVar.f11690b.f11691a.put(cls, new s.a.C0155a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new c("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<q<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i = 0; i < size; i++) {
            q<Model, ?> qVar = listUnmodifiableList.get(i);
            if (qVar.a(model)) {
                if (z10) {
                    arrayList = new ArrayList<>(size - i);
                    z10 = false;
                }
                arrayList.add(qVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new c("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    public final <X> com.bumptech.glide.load.data.e<X> h(X x10) {
        com.bumptech.glide.load.data.e<X> eVarB;
        com.bumptech.glide.load.data.f fVar = this.f22260e;
        synchronized (fVar) {
            try {
                C5606d.k(x10);
                e.a aVar = (e.a) fVar.f22303a.get(x10.getClass());
                if (aVar == null) {
                    Iterator it = fVar.f22303a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e.a aVar2 = (e.a) it.next();
                        if (aVar2.a().isAssignableFrom(x10.getClass())) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = com.bumptech.glide.load.data.f.f22302b;
                }
                eVarB = aVar.b(x10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVarB;
    }

    public final void i(ImageHeaderParser imageHeaderParser) {
        C0 c02 = this.f22262g;
        synchronized (c02) {
            c02.f14871a.add(imageHeaderParser);
        }
    }

    public final void j(e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f22260e;
        synchronized (fVar) {
            fVar.f22303a.put(aVar.a(), aVar);
        }
    }

    public final void k(Class cls, Class cls2, Z2.b bVar) {
        Z2.c cVar = this.f22261f;
        synchronized (cVar) {
            cVar.f14009a.add(new c.a(cls, cls2, bVar));
        }
    }
}
