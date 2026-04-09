package wh;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f65169a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65170b;

    /* renamed from: c, reason: collision with root package name */
    private ClassLoader f65171c;

    public k1(ClassLoader classLoader) {
        AbstractC6492s.i(classLoader, "classLoader");
        this.f65169a = new WeakReference(classLoader);
        this.f65170b = System.identityHashCode(classLoader);
        this.f65171c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f65171c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k1) && this.f65169a.get() == ((k1) obj).f65169a.get();
    }

    public int hashCode() {
        return this.f65170b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f65169a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
