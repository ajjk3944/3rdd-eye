package Gh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class x extends AbstractC2916h implements Qh.o {

    /* renamed from: c, reason: collision with root package name */
    private final Object f7501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Zh.f fVar, Object value) {
        super(fVar, null);
        AbstractC6492s.i(value, "value");
        this.f7501c = value;
    }

    @Override // Qh.o
    public Object getValue() {
        return this.f7501c;
    }
}
