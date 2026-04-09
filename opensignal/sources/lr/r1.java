package lr;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class r1 extends t1 implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final ar.a f15678d;

    /* renamed from: g, reason: collision with root package name */
    public volatile SoftReference f15679g;

    public r1(Object obj, ar.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f15679g = null;
        this.f15678d = aVar;
        if (obj != null) {
            this.f15679g = new SoftReference(obj);
        }
    }

    @Override // ar.a
    public final Object c() {
        Object obj;
        Object obj2 = t1.f15694a;
        SoftReference softReference = this.f15679g;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objC = this.f15678d.c();
        if (objC != null) {
            obj2 = objC;
        }
        this.f15679g = new SoftReference(obj2);
        return objC;
    }
}
