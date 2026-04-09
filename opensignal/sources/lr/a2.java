package lr;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15594a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15595b;

    public a2(ClassLoader classLoader) {
        this.f15594a = new WeakReference(classLoader);
        this.f15595b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a2) && this.f15594a.get() == ((a2) obj).f15594a.get();
    }

    public final int hashCode() {
        return this.f15595b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f15594a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
