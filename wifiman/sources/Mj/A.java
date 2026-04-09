package Mj;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    private static final z f13312a = new A();

    A() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (B.l(annotationArr, z.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f13312a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return z.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof z;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + z.class.getName() + "()";
    }
}
