package sa;

import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes3.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final z f46344a = new z();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return y.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof y;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + y.class.getName() + "()";
    }
}
