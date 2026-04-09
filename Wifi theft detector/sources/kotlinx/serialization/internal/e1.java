package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public abstract class e1 extends TaggedDecoder {
    public abstract String Z(String str, String str2);

    public String a0(kotlinx.serialization.descriptors.f desc, int i10) {
        kotlin.jvm.internal.p.e(desc, "desc");
        return desc.e(i10);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String V(kotlinx.serialization.descriptors.f fVar, int i10) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        return c0(a0(fVar, i10));
    }

    public final String c0(String nestedName) {
        kotlin.jvm.internal.p.e(nestedName, "nestedName");
        String str = (String) U();
        if (str == null) {
            str = "";
        }
        return Z(str, nestedName);
    }
}
