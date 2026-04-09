package com.bumptech.glide;

import I2.o;
import I2.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    private final p f34155a;

    /* renamed from: b, reason: collision with root package name */
    private final S2.a f34156b;

    /* renamed from: c, reason: collision with root package name */
    private final S2.e f34157c;

    /* renamed from: d, reason: collision with root package name */
    private final S2.f f34158d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f34159e;

    /* renamed from: f, reason: collision with root package name */
    private final P2.f f34160f;

    /* renamed from: g, reason: collision with root package name */
    private final S2.b f34161g;

    /* renamed from: h, reason: collision with root package name */
    private final S2.d f34162h = new S2.d();

    /* renamed from: i, reason: collision with root package name */
    private final S2.c f34163i = new S2.c();

    /* renamed from: j, reason: collision with root package name */
    private final E1.e f34164j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        E1.e eVarE = X2.a.e();
        this.f34164j = eVarE;
        this.f34155a = new p(eVarE);
        this.f34156b = new S2.a();
        this.f34157c = new S2.e();
        this.f34158d = new S2.f();
        this.f34159e = new com.bumptech.glide.load.data.f();
        this.f34160f = new P2.f();
        this.f34161g = new S2.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f34157c.d(cls, cls2)) {
            for (Class cls5 : this.f34160f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f34157c.b(cls, cls4), this.f34160f.a(cls4, cls5), this.f34164j));
            }
        }
        return arrayList;
    }

    public Registry a(Class cls, C2.d dVar) {
        this.f34156b.a(cls, dVar);
        return this;
    }

    public Registry b(Class cls, C2.j jVar) {
        this.f34158d.a(cls, jVar);
        return this;
    }

    public Registry c(Class cls, Class cls2, C2.i iVar) {
        e("legacy_append", cls, cls2, iVar);
        return this;
    }

    public Registry d(Class cls, Class cls2, o oVar) {
        this.f34155a.a(cls, cls2, oVar);
        return this;
    }

    public Registry e(String str, Class cls, Class cls2, C2.i iVar) {
        this.f34157c.a(str, iVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f34161g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public q h(Class cls, Class cls2, Class cls3) {
        q qVarA = this.f34163i.a(cls, cls2, cls3);
        if (this.f34163i.c(qVarA)) {
            return null;
        }
        if (qVarA == null) {
            List listF = f(cls, cls2, cls3);
            qVarA = listF.isEmpty() ? null : new q(cls, cls2, cls3, listF, this.f34164j);
            this.f34163i.d(cls, cls2, cls3, qVarA);
        }
        return qVarA;
    }

    public List i(Object obj) {
        return this.f34155a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f34162h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f34155a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f34157c.d((Class) it.next(), cls2)) {
                    if (!this.f34160f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f34162h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public C2.j k(E2.c cVar) {
        C2.j jVarB = this.f34158d.b(cVar.d());
        if (jVarB != null) {
            return jVarB;
        }
        throw new NoResultEncoderAvailableException(cVar.d());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f34159e.a(obj);
    }

    public C2.d m(Object obj) {
        C2.d dVarB = this.f34156b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    public boolean n(E2.c cVar) {
        return this.f34158d.b(cVar.d()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f34161g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a aVar) {
        this.f34159e.b(aVar);
        return this;
    }

    public Registry q(Class cls, Class cls2, P2.e eVar) {
        this.f34160f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f34157c.e(arrayList);
        return this;
    }
}
