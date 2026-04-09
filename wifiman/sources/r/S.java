package r;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private final Object f59536a;

    /* renamed from: b, reason: collision with root package name */
    private E f59537b;

    public /* synthetic */ S(Object obj, E e10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, e10);
    }

    public final E a() {
        return this.f59537b;
    }

    public final Object b() {
        return this.f59536a;
    }

    public final void c(E e10) {
        this.f59537b = e10;
    }

    private S(Object obj, E e10) {
        this.f59536a = obj;
        this.f59537b = e10;
    }
}
