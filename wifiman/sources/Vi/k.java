package Vi;

import Xi.d;
import Xi.m;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.M;
import Zg.U;
import Zi.AbstractC3696b;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class k extends AbstractC3696b {

    /* renamed from: a, reason: collision with root package name */
    private final th.d f23458a;

    /* renamed from: b, reason: collision with root package name */
    private List f23459b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f23460c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f23461d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f23462e;

    public static final class a implements M {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f23463a;

        public a(Iterable iterable) {
            this.f23463a = iterable;
        }

        @Override // Zg.M
        public Object a(Object obj) {
            return ((b) ((Map.Entry) obj).getValue()).a().a();
        }

        @Override // Zg.M
        public Iterator b() {
            return this.f23463a.iterator();
        }
    }

    public k(final String serialName, th.d baseClass, th.d[] subclasses, b[] subclassSerializers) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(subclasses, "subclasses");
        AbstractC6492s.i(subclassSerializers, "subclassSerializers");
        this.f23458a = baseClass;
        this.f23459b = AbstractC3689v.l();
        this.f23460c = Yg.n.a(Yg.q.PUBLICATION, new InterfaceC6824a() { // from class: Vi.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return k.o(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + k().v() + " should be marked @Serializable");
        }
        Map mapR = U.r(AbstractC3682n.t1(subclasses, subclassSerializers));
        this.f23461d = mapR;
        a aVar = new a(mapR.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = aVar.b();
        while (itB.hasNext()) {
            Object next = itB.next();
            Object objA = aVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + k() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.d(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f23462e = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f o(String str, final k kVar) {
        return Xi.l.d(str, d.b.f24438a, new Xi.f[0], new InterfaceC6835l() { // from class: Vi.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return k.p(this.f23456a, (Xi.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(final k kVar, Xi.a buildSerialDescriptor) {
        AbstractC6492s.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Xi.a.b(buildSerialDescriptor, "type", Wi.a.K(kotlin.jvm.internal.U.f51694a).a(), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "value", Xi.l.d("kotlinx.serialization.Sealed<" + kVar.k().v() + '>', m.a.f24468a, new Xi.f[0], new InterfaceC6835l() { // from class: Vi.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return k.q(this.f23457a, (Xi.a) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.h(kVar.f23459b);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(k kVar, Xi.a buildSerialDescriptor) {
        AbstractC6492s.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry entry : kVar.f23462e.entrySet()) {
            Xi.a.b(buildSerialDescriptor, (String) entry.getKey(), ((b) entry.getValue()).a(), null, false, 12, null);
        }
        return J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return (Xi.f) this.f23460c.getValue();
    }

    @Override // Zi.AbstractC3696b
    public InterfaceC3627a i(Yi.c decoder, String str) {
        AbstractC6492s.i(decoder, "decoder");
        b bVar = (b) this.f23462e.get(str);
        return bVar != null ? bVar : super.i(decoder, str);
    }

    @Override // Zi.AbstractC3696b
    public o j(Yi.f encoder, Object value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        o oVarJ = (b) this.f23461d.get(O.b(value.getClass()));
        if (oVarJ == null) {
            oVarJ = super.j(encoder, value);
        }
        if (oVarJ != null) {
            return oVarJ;
        }
        return null;
    }

    @Override // Zi.AbstractC3696b
    public th.d k() {
        return this.f23458a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String serialName, th.d baseClass, th.d[] subclasses, b[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(subclasses, "subclasses");
        AbstractC6492s.i(subclassSerializers, "subclassSerializers");
        AbstractC6492s.i(classAnnotations, "classAnnotations");
        this.f23459b = AbstractC3682n.e(classAnnotations);
    }
}
