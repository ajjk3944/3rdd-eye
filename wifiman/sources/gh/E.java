package Gh;

import Qh.InterfaceC3444a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class E implements Qh.x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7448a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Type type) {
            AbstractC6492s.i(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new H((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    protected abstract Type R();

    public boolean equals(Object obj) {
        return (obj instanceof E) && AbstractC6492s.d(R(), ((E) obj).R());
    }

    public int hashCode() {
        return R().hashCode();
    }

    @Override // Qh.InterfaceC3447d
    public InterfaceC3444a l(Zh.c fqName) {
        Object obj;
        AbstractC6492s.i(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Zh.b bVarB = ((InterfaceC3444a) next).b();
            if (AbstractC6492s.d(bVarB != null ? bVarB.a() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC3444a) obj;
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }
}
