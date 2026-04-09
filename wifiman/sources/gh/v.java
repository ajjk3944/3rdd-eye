package Gh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class v extends AbstractC2916h implements Qh.m {

    /* renamed from: c, reason: collision with root package name */
    private final Enum f7499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Zh.f fVar, Enum value) {
        super(fVar, null);
        AbstractC6492s.i(value, "value");
        this.f7499c = value;
    }

    @Override // Qh.m
    public Zh.b b() {
        Class<?> enclosingClass = this.f7499c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        AbstractC6492s.f(enclosingClass);
        return AbstractC2914f.e(enclosingClass);
    }

    @Override // Qh.m
    public Zh.f d() {
        return Zh.f.h(this.f7499c.name());
    }
}
