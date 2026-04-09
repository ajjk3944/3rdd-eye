package Jb;

import Vi.b;
import Vi.m;
import Xi.e;
import Xi.f;
import Xi.l;
import Zg.U;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import sh.AbstractC7978m;
import th.d;

/* loaded from: classes3.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f9975a;

    /* renamed from: b, reason: collision with root package name */
    private final Enum f9976b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9977c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9978d;

    /* renamed from: e, reason: collision with root package name */
    private final f f9979e;

    public a(d enumClass, InterfaceC6824a getValues, Enum r92) {
        AbstractC6492s.i(enumClass, "enumClass");
        AbstractC6492s.i(getValues, "getValues");
        AbstractC6492s.i(r92, "default");
        this.f9975a = enumClass;
        this.f9976b = r92;
        Object[] objArr = (Object[]) getValues.invoke();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(objArr.length), 16));
        for (Object obj : objArr) {
            Enum r42 = (Enum) obj;
            linkedHashMap.put(r42, h(r42));
        }
        this.f9977c = linkedHashMap;
        Object[] objArr2 = (Object[]) getValues.invoke();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7978m.d(U.d(objArr2.length), 16));
        for (Object obj2 : objArr2) {
            linkedHashMap2.put(h((Enum) obj2), obj2);
        }
        this.f9978d = linkedHashMap2;
        String strL = this.f9975a.l();
        AbstractC6492s.f(strL);
        this.f9979e = l.b(strL, e.i.f24447a);
    }

    private final String h(Enum r22) {
        Annotation annotation = r22.getClass().getField(r22.name()).getAnnotation(m.class);
        AbstractC6492s.f(annotation);
        return ((m) annotation).value();
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public final f a() {
        return this.f9979e;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        String strS = decoder.s();
        Enum r02 = (Enum) this.f9978d.get(strS);
        if (r02 != null) {
            return r02;
        }
        Enum r03 = this.f9976b;
        Sj.a.f20830a.a("Fallback `" + this.f9975a.l() + "` to default `" + this.f9976b + "` with value `" + strS + "`", new Object[0]);
        return r03;
    }

    @Override // Vi.o
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void e(Yi.f encoder, Enum value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        encoder.G((String) U.i(this.f9977c, value));
    }
}
