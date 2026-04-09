package z9;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.w;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class p implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p f25457a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f25458b = a.f25459b;

    public static final class a implements kotlinx.serialization.descriptors.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25459b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f25460c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.f f25461a = x9.a.k(x9.a.B(w.f22046a), JsonElementSerializer.f22944a).getDescriptor();

        @Override // kotlinx.serialization.descriptors.f
        public boolean b() {
            return this.f25461a.b();
        }

        @Override // kotlinx.serialization.descriptors.f
        public int c(String name) {
            kotlin.jvm.internal.p.e(name, "name");
            return this.f25461a.c(name);
        }

        @Override // kotlinx.serialization.descriptors.f
        public int d() {
            return this.f25461a.d();
        }

        @Override // kotlinx.serialization.descriptors.f
        public String e(int i10) {
            return this.f25461a.e(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public List f(int i10) {
            return this.f25461a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public kotlinx.serialization.descriptors.f g(int i10) {
            return this.f25461a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public List getAnnotations() {
            return this.f25461a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.f
        public kotlinx.serialization.descriptors.h getKind() {
            return this.f25461a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.f
        public String h() {
            return f25460c;
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean i(int i10) {
            return this.f25461a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean isInline() {
            return this.f25461a.isInline();
        }
    }

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        h.g(decoder);
        return new JsonObject((Map) x9.a.k(x9.a.B(w.f22046a), JsonElementSerializer.f22944a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, JsonObject value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        h.h(encoder);
        x9.a.k(x9.a.B(w.f22046a), JsonElementSerializer.f22944a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f25458b;
    }
}
