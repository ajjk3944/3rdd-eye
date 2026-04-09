package Gh;

import Gh.AbstractC2916h;
import Qh.InterfaceC3444a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;

/* renamed from: Gh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2915g extends u implements InterfaceC3444a {

    /* renamed from: a, reason: collision with root package name */
    private final Annotation f7477a;

    public C2915g(Annotation annotation) {
        AbstractC6492s.i(annotation, "annotation");
        this.f7477a = annotation;
    }

    public final Annotation R() {
        return this.f7477a;
    }

    @Override // Qh.InterfaceC3444a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public q y() {
        return new q(AbstractC6596a.b(AbstractC6596a.a(this.f7477a)));
    }

    @Override // Qh.InterfaceC3444a
    public Zh.b b() {
        return AbstractC2914f.e(AbstractC6596a.b(AbstractC6596a.a(this.f7477a)));
    }

    @Override // Qh.InterfaceC3444a
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2915g) && this.f7477a == ((C2915g) obj).f7477a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f7477a);
    }

    @Override // Qh.InterfaceC3444a
    public Collection j() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = AbstractC6596a.b(AbstractC6596a.a(this.f7477a)).getDeclaredMethods();
        AbstractC6492s.h(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC2916h.a aVar = AbstractC2916h.f7478b;
            Object objInvoke = method.invoke(this.f7477a, null);
            AbstractC6492s.h(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, Zh.f.h(method.getName())));
        }
        return arrayList;
    }

    public String toString() {
        return C2915g.class.getName() + ": " + this.f7477a;
    }

    @Override // Qh.InterfaceC3444a
    public boolean u() {
        return false;
    }
}
