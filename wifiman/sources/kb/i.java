package kb;

import Yg.J;
import Yg.z;
import Zg.AbstractC3689v;
import aj.C3869c;
import aj.InterfaceC3875i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
final class i implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f51359a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final Vi.b f51360b;

    /* renamed from: c, reason: collision with root package name */
    private static final Xi.f f51361c;

    static {
        U u10 = U.f51694a;
        f51360b = Wi.a.k(Wi.a.K(u10), Wi.a.h(Wi.a.K(u10)));
        String name = g.class.getName();
        AbstractC6492s.h(name, "getName(...)");
        f51361c = Xi.l.c(name, new Xi.f[0], new InterfaceC6835l() { // from class: kb.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.h((Xi.a) obj);
            }
        });
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(Xi.a buildClassSerialDescriptor) {
        AbstractC6492s.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        Xi.a.b(buildClassSerialDescriptor, "headers", f51360b.a(), null, false, 12, null);
        return J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f51361c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Vi.InterfaceC3627a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public g c(Yi.e decoder) {
        Collection collectionE;
        AbstractC6492s.i(decoder, "decoder");
        InterfaceC3875i interfaceC3875i = decoder instanceof InterfaceC3875i ? (InterfaceC3875i) decoder : null;
        if (interfaceC3875i == null) {
            throw new IllegalArgumentException("Only JSON decoder supported");
        }
        Set<Map.Entry<String, aj.j>> setEntrySet = aj.k.h(interfaceC3875i.m()).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            aj.j jVar = (aj.j) entry.getValue();
            if (jVar instanceof C3869c) {
                Iterable iterable = (Iterable) jVar;
                collectionE = new ArrayList(AbstractC3689v.w(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    collectionE.add(aj.k.i((aj.j) it2.next()).b());
                }
            } else {
                collectionE = AbstractC3689v.e(aj.k.i(jVar).b());
            }
            Yg.s sVarA = z.a(str, collectionE);
            linkedHashMap.put(sVarA.h(), sVarA.j());
        }
        return new g(linkedHashMap);
    }

    @Override // Vi.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, g value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        encoder.z(f51360b, value.a());
    }
}
