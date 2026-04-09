package z9;

import java.util.List;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes4.dex */
public final class b implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25419a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f25420b = a.f25421b;

    public static final class a implements kotlinx.serialization.descriptors.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25421b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f25422c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.f f25423a = x9.a.h(JsonElementSerializer.f22944a).getDescriptor();

        @Override // kotlinx.serialization.descriptors.f
        public boolean b() {
            return this.f25423a.b();
        }

        @Override // kotlinx.serialization.descriptors.f
        public int c(String name) {
            kotlin.jvm.internal.p.e(name, "name");
            return this.f25423a.c(name);
        }

        @Override // kotlinx.serialization.descriptors.f
        public int d() {
            return this.f25423a.d();
        }

        @Override // kotlinx.serialization.descriptors.f
        public String e(int i10) {
            return this.f25423a.e(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public List f(int i10) {
            return this.f25423a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public kotlinx.serialization.descriptors.f g(int i10) {
            return this.f25423a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public List getAnnotations() {
            return this.f25423a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.f
        public kotlinx.serialization.descriptors.h getKind() {
            return this.f25423a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.f
        public String h() {
            return f25422c;
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean i(int i10) {
            return this.f25423a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean isInline() {
            return this.f25423a.isInline();
        }
    }

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.a deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        h.g(decoder);
        return new kotlinx.serialization.json.a((List) x9.a.h(JsonElementSerializer.f22944a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, kotlinx.serialization.json.a value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        h.h(encoder);
        x9.a.h(JsonElementSerializer.f22944a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f25420b;
    }
}
