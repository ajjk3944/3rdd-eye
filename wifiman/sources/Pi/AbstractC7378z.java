package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7378z extends E0 {

    /* renamed from: c, reason: collision with root package name */
    private final E0 f58195c;

    public AbstractC7378z(E0 substitution) {
        AbstractC6492s.i(substitution, "substitution");
        this.f58195c = substitution;
    }

    @Override // pi.E0
    public boolean a() {
        return this.f58195c.a();
    }

    @Override // pi.E0
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations) {
        AbstractC6492s.i(annotations, "annotations");
        return this.f58195c.d(annotations);
    }

    @Override // pi.E0
    public B0 e(S key) {
        AbstractC6492s.i(key, "key");
        return this.f58195c.e(key);
    }

    @Override // pi.E0
    public boolean f() {
        return this.f58195c.f();
    }

    @Override // pi.E0
    public S g(S topLevelType, N0 position) {
        AbstractC6492s.i(topLevelType, "topLevelType");
        AbstractC6492s.i(position, "position");
        return this.f58195c.g(topLevelType, position);
    }
}
