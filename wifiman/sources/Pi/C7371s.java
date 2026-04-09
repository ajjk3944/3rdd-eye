package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7371s extends p0 {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f58164a;

    public C7371s(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations) {
        AbstractC6492s.i(annotations, "annotations");
        this.f58164a = annotations;
    }

    @Override // pi.p0
    public th.d b() {
        return kotlin.jvm.internal.O.b(C7371s.class);
    }

    @Override // pi.p0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7371s a(C7371s c7371s) {
        return c7371s == null ? this : new C7371s(kotlin.reflect.jvm.internal.impl.descriptors.annotations.j.a(this.f58164a, c7371s.f58164a));
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h e() {
        return this.f58164a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7371s) {
            return AbstractC6492s.d(((C7371s) obj).f58164a, this.f58164a);
        }
        return false;
    }

    @Override // pi.p0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7371s c(C7371s c7371s) {
        if (AbstractC6492s.d(c7371s, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f58164a.hashCode();
    }
}
