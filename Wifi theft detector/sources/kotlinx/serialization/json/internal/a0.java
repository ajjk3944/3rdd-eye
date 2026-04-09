package kotlinx.serialization.json.internal;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a0 extends AbstractJsonTreeEncoder {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z9.a json, l9.l nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(nodeConsumer, "nodeConsumer");
        this.f22991f = new ArrayList();
    }

    @Override // kotlinx.serialization.internal.f1
    public String b0(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        return new kotlinx.serialization.json.a(this.f22991f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void s0(String key, kotlinx.serialization.json.b element) throws NumberFormatException {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(element, "element");
        this.f22991f.add(Integer.parseInt(key), element);
    }
}
