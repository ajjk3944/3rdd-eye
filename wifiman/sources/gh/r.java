package Gh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r extends AbstractC2916h implements Qh.h {

    /* renamed from: c, reason: collision with root package name */
    private final Class f7495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Zh.f fVar, Class klass) {
        super(fVar, null);
        AbstractC6492s.i(klass, "klass");
        this.f7495c = klass;
    }

    @Override // Qh.h
    public Qh.x c() {
        return E.f7448a.a(this.f7495c);
    }
}
