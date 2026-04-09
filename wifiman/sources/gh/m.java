package Gh;

import Gh.E;
import Zg.AbstractC3689v;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class m extends E implements Qh.f {

    /* renamed from: b, reason: collision with root package name */
    private final Type f7482b;

    /* renamed from: c, reason: collision with root package name */
    private final E f7483c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection f7484d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7485e;

    public m(Type reflectType) {
        E eA;
        AbstractC6492s.i(reflectType, "reflectType");
        this.f7482b = reflectType;
        Type typeR = R();
        if (!(typeR instanceof GenericArrayType)) {
            if (typeR instanceof Class) {
                Class cls = (Class) typeR;
                if (cls.isArray()) {
                    E.a aVar = E.f7448a;
                    Class<?> componentType = cls.getComponentType();
                    AbstractC6492s.h(componentType, "getComponentType(...)");
                    eA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + R().getClass() + "): " + R());
        }
        E.a aVar2 = E.f7448a;
        Type genericComponentType = ((GenericArrayType) typeR).getGenericComponentType();
        AbstractC6492s.h(genericComponentType, "getGenericComponentType(...)");
        eA = aVar2.a(genericComponentType);
        this.f7483c = eA;
        this.f7484d = AbstractC3689v.l();
    }

    @Override // Gh.E
    protected Type R() {
        return this.f7482b;
    }

    @Override // Qh.f
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public E k() {
        return this.f7483c;
    }

    @Override // Qh.InterfaceC3447d
    public Collection getAnnotations() {
        return this.f7484d;
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return this.f7485e;
    }
}
