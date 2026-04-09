package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import t5.AbstractC8031b;
import t5.C8032c;
import t5.n;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    private final C8032c f39003a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f39004b;

    private final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private final p f39005a;

        /* renamed from: b, reason: collision with root package name */
        private final p f39006b;

        /* renamed from: c, reason: collision with root package name */
        private final t5.j f39007c;

        public a(com.google.gson.e eVar, Type type, p pVar, Type type2, p pVar2, t5.j jVar) {
            this.f39005a = new k(eVar, pVar, type);
            this.f39006b = new k(eVar, pVar2, type2);
            this.f39007c = jVar;
        }

        private String e(com.google.gson.g gVar) {
            if (!gVar.k()) {
                if (gVar.i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            com.google.gson.j jVarF = gVar.f();
            if (jVarF.y()) {
                return String.valueOf(jVarF.u());
            }
            if (jVarF.w()) {
                return Boolean.toString(jVarF.q());
            }
            if (jVarF.z()) {
                return jVarF.v();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(C8268a c8268a) throws IOException {
            EnumC8269b enumC8269bV0 = c8268a.v0();
            if (enumC8269bV0 == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            Map map = (Map) this.f39007c.a();
            if (enumC8269bV0 == EnumC8269b.BEGIN_ARRAY) {
                c8268a.g();
                while (c8268a.T()) {
                    c8268a.g();
                    Object objB = this.f39005a.b(c8268a);
                    if (map.put(objB, this.f39006b.b(c8268a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objB);
                    }
                    c8268a.v();
                }
                c8268a.v();
            } else {
                c8268a.h();
                while (c8268a.T()) {
                    t5.f.f61762a.a(c8268a);
                    Object objB2 = this.f39005a.b(c8268a);
                    if (map.put(objB2, this.f39006b.b(c8268a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objB2);
                    }
                }
                c8268a.y();
            }
            return map;
        }

        @Override // com.google.gson.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Map map) throws IOException {
            if (map == null) {
                c8270c.b0();
                return;
            }
            if (!f.this.f39004b) {
                c8270c.j();
                for (Map.Entry entry : map.entrySet()) {
                    c8270c.T(String.valueOf(entry.getKey()));
                    this.f39006b.d(c8270c, entry.getValue());
                }
                c8270c.v();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                com.google.gson.g gVarC = this.f39005a.c(entry2.getKey());
                arrayList.add(gVarC);
                arrayList2.add(entry2.getValue());
                z10 |= gVarC.g() || gVarC.j();
            }
            if (!z10) {
                c8270c.j();
                int size = arrayList.size();
                while (i10 < size) {
                    c8270c.T(e((com.google.gson.g) arrayList.get(i10)));
                    this.f39006b.d(c8270c, arrayList2.get(i10));
                    i10++;
                }
                c8270c.v();
                return;
            }
            c8270c.h();
            int size2 = arrayList.size();
            while (i10 < size2) {
                c8270c.h();
                n.a((com.google.gson.g) arrayList.get(i10), c8270c);
                this.f39006b.d(c8270c, arrayList2.get(i10));
                c8270c.s();
                i10++;
            }
            c8270c.s();
        }
    }

    public f(C8032c c8032c, boolean z10) {
        this.f39003a = c8032c;
        this.f39004b = z10;
    }

    private p a(com.google.gson.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? l.f39075f : eVar.l(com.google.gson.reflect.a.b(type));
    }

    @Override // com.google.gson.q
    public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) throws NoSuchMethodException, SecurityException {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = AbstractC8031b.j(typeD, clsC);
        return new a(eVar, typeArrJ[0], a(eVar, typeArrJ[0]), typeArrJ[1], eVar.l(com.google.gson.reflect.a.b(typeArrJ[1])), this.f39003a.b(aVar));
    }
}
