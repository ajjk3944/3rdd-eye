package Mj;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public interface e {

    public static abstract class a {
        protected static Type b(int i10, ParameterizedType parameterizedType) {
            return B.g(i10, parameterizedType);
        }

        protected static Class c(Type type) {
            return B.h(type);
        }

        public abstract e a(Type type, Annotation[] annotationArr, x xVar);
    }

    Type a();

    Object b(d dVar);
}
