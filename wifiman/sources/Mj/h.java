package Mj;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public interface h {

    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return B.g(i10, parameterizedType);
        }

        protected static Class b(Type type) {
            return B.h(type);
        }

        public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
            return null;
        }

        public abstract h d(Type type, Annotation[] annotationArr, x xVar);

        public h e(Type type, Annotation[] annotationArr, x xVar) {
            return null;
        }
    }

    Object a(Object obj);
}
