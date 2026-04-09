package kotlinx.serialization.json.internal;

import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class b0 extends JsonTreeDecoder {

    /* renamed from: k, reason: collision with root package name */
    public final JsonObject f22992k;

    /* renamed from: l, reason: collision with root package name */
    public final List f22993l;

    /* renamed from: m, reason: collision with root package name */
    public final int f22994m;

    /* renamed from: n, reason: collision with root package name */
    public int f22995n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z9.a json, JsonObject value) {
        super(json, value, null, null, 12, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(value, "value");
        this.f22992k = value;
        List listE0 = z8.z.e0(s0().keySet());
        this.f22993l = listE0;
        this.f22994m = listE0.size() * 2;
        this.f22995n = -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.internal.e1
    public String a0(kotlinx.serialization.descriptors.f desc, int i10) {
        kotlin.jvm.internal.p.e(desc, "desc");
        return (String) this.f22993l.get(i10 / 2);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.c, y9.c
    public void c(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.c
    public kotlinx.serialization.json.b e0(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        return this.f22995n % 2 == 0 ? z9.g.c(tag) : (kotlinx.serialization.json.b) kotlin.collections.a.i(s0(), tag);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, y9.c
    public int o(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        int i10 = this.f22995n;
        if (i10 >= this.f22994m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f22995n = i11;
        return i11;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.c
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public JsonObject s0() {
        return this.f22992k;
    }
}
