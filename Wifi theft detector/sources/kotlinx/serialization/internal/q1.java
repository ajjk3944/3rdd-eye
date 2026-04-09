package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class q1 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f22903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kotlinx.serialization.descriptors.f primitive) {
        super(primitive, null);
        kotlin.jvm.internal.p.e(primitive, "primitive");
        this.f22903c = primitive.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22903c;
    }
}
