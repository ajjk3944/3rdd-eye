package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements l9.p {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean b(kotlinx.serialization.descriptors.f p02, int i10) {
        kotlin.jvm.internal.p.e(p02, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).e(p02, i10));
    }

    @Override // l9.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((kotlinx.serialization.descriptors.f) obj, ((Number) obj2).intValue());
    }
}
