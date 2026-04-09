package sa;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: CallAdapter.java */
/* loaded from: classes3.dex */
public interface c<R, T> {

    /* compiled from: CallAdapter.java */
    public static abstract class a {
        public abstract c a(Type type, Annotation[] annotationArr);
    }

    Type a();

    Object b(m mVar);
}
