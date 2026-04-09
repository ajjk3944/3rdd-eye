package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public abstract class f1 extends c2 {
    public abstract String a0(String str, String str2);

    public String b0(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return descriptor.e(i10);
    }

    @Override // kotlinx.serialization.internal.c2
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(kotlinx.serialization.descriptors.f fVar, int i10) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        return d0(b0(fVar, i10));
    }

    public final String d0(String nestedName) {
        kotlin.jvm.internal.p.e(nestedName, "nestedName");
        String str = (String) W();
        if (str == null) {
            str = "";
        }
        return a0(str, nestedName);
    }
}
