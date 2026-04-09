package Gh;

import Gh.E;
import Qh.InterfaceC3444a;
import Zg.AbstractC3689v;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class s extends E implements Qh.j {

    /* renamed from: b, reason: collision with root package name */
    private final Type f7496b;

    /* renamed from: c, reason: collision with root package name */
    private final Qh.i f7497c;

    public s(Type reflectType) {
        Qh.i qVar;
        AbstractC6492s.i(reflectType, "reflectType");
        this.f7496b = reflectType;
        Type typeR = R();
        if (typeR instanceof Class) {
            qVar = new q((Class) typeR);
        } else if (typeR instanceof TypeVariable) {
            qVar = new F((TypeVariable) typeR);
        } else {
            if (!(typeR instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeR.getClass() + "): " + typeR);
            }
            Type rawType = ((ParameterizedType) typeR).getRawType();
            AbstractC6492s.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f7497c = qVar;
    }

    @Override // Qh.j
    public List F() {
        List listH = AbstractC2914f.h(R());
        E.a aVar = E.f7448a;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Gh.E
    public Type R() {
        return this.f7496b;
    }

    @Override // Qh.InterfaceC3447d
    public Collection getAnnotations() {
        return AbstractC3689v.l();
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return false;
    }

    @Override // Gh.E, Qh.InterfaceC3447d
    public InterfaceC3444a l(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return null;
    }

    @Override // Qh.j
    public Qh.i r() {
        return this.f7497c;
    }

    @Override // Qh.j
    public String s() {
        return R().toString();
    }

    @Override // Qh.j
    public boolean w() {
        Type typeR = R();
        if (!(typeR instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) typeR).getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }

    @Override // Qh.j
    public String x() {
        throw new UnsupportedOperationException("Type not found: " + R());
    }
}
