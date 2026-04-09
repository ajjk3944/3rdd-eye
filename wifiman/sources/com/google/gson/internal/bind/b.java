package com.google.gson.internal.bind;

import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import t5.AbstractC8031b;
import t5.C8032c;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    private final C8032c f38986a;

    private static final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private final p f38987a;

        /* renamed from: b, reason: collision with root package name */
        private final t5.j f38988b;

        public a(com.google.gson.e eVar, Type type, p pVar, t5.j jVar) {
            this.f38987a = new k(eVar, pVar, type);
            this.f38988b = jVar;
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            Collection collection = (Collection) this.f38988b.a();
            c8268a.g();
            while (c8268a.T()) {
                collection.add(this.f38987a.b(c8268a));
            }
            c8268a.v();
            return collection;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Collection collection) throws IOException {
            if (collection == null) {
                c8270c.b0();
                return;
            }
            c8270c.h();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f38987a.d(c8270c, it.next());
            }
            c8270c.s();
        }
    }

    public b(C8032c c8032c) {
        this.f38986a = c8032c;
    }

    @Override // com.google.gson.q
    public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = AbstractC8031b.h(typeD, clsC);
        return new a(eVar, typeH, eVar.l(com.google.gson.reflect.a.b(typeH)), this.f38986a.b(aVar));
    }
}
