package Mj;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes2.dex */
class t {

    static final class a extends t {
        a() {
        }

        @Override // Mj.t
        Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // Mj.t
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    static class b extends t {
        b() {
        }

        @Override // Mj.t
        String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // Mj.t
        Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // Mj.t
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    t() {
    }

    String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    boolean c(Method method) {
        return false;
    }
}
