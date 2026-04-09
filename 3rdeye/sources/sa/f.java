package sa;

import U9.F;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: Converter.java */
/* loaded from: classes3.dex */
public interface f<F, T> {

    /* compiled from: Converter.java */
    public static abstract class a {
        public f a(Type type) {
            return null;
        }

        public f<F, ?> b(Type type, Annotation[] annotationArr, w wVar) {
            return null;
        }
    }

    T convert(F f10) throws IOException;
}
