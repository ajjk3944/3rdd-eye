package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7356i0 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    private final S f58133a;

    public C7356i0(kotlin.reflect.jvm.internal.impl.builtins.i kotlinBuiltIns) {
        AbstractC6492s.i(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC7346d0 abstractC7346d0I = kotlinBuiltIns.I();
        AbstractC6492s.h(abstractC7346d0I, "getNullableAnyType(...)");
        this.f58133a = abstractC7346d0I;
    }

    @Override // pi.B0
    public N0 a() {
        return N0.OUT_VARIANCE;
    }

    @Override // pi.B0
    public B0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pi.B0
    public boolean c() {
        return true;
    }

    @Override // pi.B0
    public S getType() {
        return this.f58133a;
    }
}
