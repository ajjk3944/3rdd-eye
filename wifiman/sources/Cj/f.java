package cj;

import Zg.U;
import Zi.A0;
import cj.AbstractC4269a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34045a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f34046b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f34047c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f34048d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f34049e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f34050f;

    public static /* synthetic */ void m(f fVar, th.d dVar, th.d dVar2, Vi.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.l(dVar, dVar2, bVar, z10);
    }

    public static /* synthetic */ void o(f fVar, th.d dVar, AbstractC4269a abstractC4269a, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.n(dVar, abstractC4269a, z10);
    }

    @Override // cj.i
    public void b(th.d kClass, Vi.b serializer) {
        AbstractC6492s.i(kClass, "kClass");
        AbstractC6492s.i(serializer, "serializer");
        o(this, kClass, new AbstractC4269a.C1191a(serializer), false, 4, null);
    }

    @Override // cj.i
    public void c(th.d kClass, InterfaceC6835l provider) {
        AbstractC6492s.i(kClass, "kClass");
        AbstractC6492s.i(provider, "provider");
        o(this, kClass, new AbstractC4269a.b(provider), false, 4, null);
    }

    @Override // cj.i
    public void d(th.d baseClass, InterfaceC6835l defaultDeserializerProvider) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(defaultDeserializerProvider, "defaultDeserializerProvider");
        j(baseClass, defaultDeserializerProvider, false);
    }

    @Override // cj.i
    public void e(th.d baseClass, th.d actualClass, Vi.b actualSerializer) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(actualClass, "actualClass");
        AbstractC6492s.i(actualSerializer, "actualSerializer");
        m(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // cj.i
    public void g(th.d baseClass, InterfaceC6835l defaultSerializerProvider) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(defaultSerializerProvider, "defaultSerializerProvider");
        k(baseClass, defaultSerializerProvider, false);
    }

    public final e h() {
        return new c(this.f34045a, this.f34046b, this.f34047c, this.f34048d, this.f34049e, this.f34050f);
    }

    public final void i(e module) {
        AbstractC6492s.i(module, "module");
        module.a(this);
    }

    public final void j(th.d baseClass, InterfaceC6835l defaultDeserializerProvider, boolean z10) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(defaultDeserializerProvider, "defaultDeserializerProvider");
        InterfaceC6835l interfaceC6835l = (InterfaceC6835l) this.f34049e.get(baseClass);
        if (interfaceC6835l == null || AbstractC6492s.d(interfaceC6835l, defaultDeserializerProvider) || z10) {
            this.f34049e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + interfaceC6835l);
    }

    public final void k(th.d baseClass, InterfaceC6835l defaultSerializerProvider, boolean z10) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(defaultSerializerProvider, "defaultSerializerProvider");
        InterfaceC6835l interfaceC6835l = (InterfaceC6835l) this.f34047c.get(baseClass);
        if (interfaceC6835l == null || AbstractC6492s.d(interfaceC6835l, defaultSerializerProvider) || z10) {
            this.f34047c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + interfaceC6835l);
    }

    public final void l(th.d baseClass, th.d concreteClass, Vi.b concreteSerializer, boolean z10) {
        Object next;
        th.d dVar;
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(concreteClass, "concreteClass");
        AbstractC6492s.i(concreteSerializer, "concreteSerializer");
        String strA = concreteSerializer.a().a();
        Map map = this.f34046b;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        Map map4 = this.f34048d;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        Vi.b bVar = (Vi.b) map3.get(concreteClass);
        if (bVar != null && !AbstractC6492s.d(bVar, concreteSerializer)) {
            if (!z10) {
                throw new d(baseClass, concreteClass);
            }
        }
        Vi.b bVar2 = (Vi.b) map6.get(strA);
        if (bVar2 != null && !AbstractC6492s.d(bVar2, concreteSerializer)) {
            Iterator it = U.y(map3).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Map.Entry) next).getValue() == bVar2) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (dVar = (th.d) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + strA + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z10) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + strA + "': " + concreteSerializer + " for '" + concreteClass + "' and " + bVar2 + " for '" + dVar + '\'');
            }
        }
        map3.put(concreteClass, concreteSerializer);
        map6.put(strA, concreteSerializer);
    }

    public final void n(th.d forClass, AbstractC4269a provider, boolean z10) {
        AbstractC4269a abstractC4269a;
        AbstractC6492s.i(forClass, "forClass");
        AbstractC6492s.i(provider, "provider");
        if (z10 || (abstractC4269a = (AbstractC4269a) this.f34045a.get(forClass)) == null || AbstractC6492s.d(abstractC4269a, provider)) {
            this.f34045a.put(forClass, provider);
            if (A0.l(forClass)) {
                this.f34050f = true;
                return;
            }
            return;
        }
        throw new d("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
