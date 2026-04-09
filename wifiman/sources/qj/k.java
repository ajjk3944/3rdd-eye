package Qj;

import Mj.h;
import Mj.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class k extends h.a {
    private k() {
    }

    public static k f() {
        return new k();
    }

    @Override // Mj.h.a
    public Mj.h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return a.f19376a;
        }
        return null;
    }

    @Override // Mj.h.a
    public Mj.h d(Type type, Annotation[] annotationArr, x xVar) {
        if (type == String.class) {
            return j.f19386a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return b.f19378a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return c.f19379a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return d.f19380a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return e.f19381a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return f.f19382a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.f19383a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return h.f19384a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return i.f19385a;
        }
        return null;
    }
}
