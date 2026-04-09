package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class w0 extends y0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlinx.serialization.descriptors.f elementDesc) {
        super(elementDesc, null);
        kotlin.jvm.internal.p.e(elementDesc, "elementDesc");
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return "kotlin.collections.LinkedHashSet";
    }
}
