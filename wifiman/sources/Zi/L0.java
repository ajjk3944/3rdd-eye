package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class L0 extends AbstractC3703e0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f25575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Xi.f primitive) {
        super(primitive, null);
        AbstractC6492s.i(primitive, "primitive");
        this.f25575c = primitive.a() + "Array";
    }

    @Override // Xi.f
    public String a() {
        return this.f25575c;
    }
}
