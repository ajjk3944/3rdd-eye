package kotlinx.serialization.internal;

import kotlinx.serialization.internal.i0;

/* loaded from: classes4.dex */
public abstract class o0 {

    public static final class a implements i0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.b f22892a;

        public a(kotlinx.serialization.b bVar) {
            this.f22892a = bVar;
        }

        @Override // kotlinx.serialization.internal.i0
        public kotlinx.serialization.b[] childSerializers() {
            return new kotlinx.serialization.b[]{this.f22892a};
        }

        @Override // kotlinx.serialization.a
        public Object deserialize(y9.e decoder) {
            kotlin.jvm.internal.p.e(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        public kotlinx.serialization.descriptors.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.e
        public void serialize(y9.f encoder, Object obj) {
            kotlin.jvm.internal.p.e(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.internal.i0
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }
    }

    public static final kotlinx.serialization.descriptors.f a(String name, kotlinx.serialization.b primitiveSerializer) {
        kotlin.jvm.internal.p.e(name, "name");
        kotlin.jvm.internal.p.e(primitiveSerializer, "primitiveSerializer");
        return new n0(name, new a(primitiveSerializer));
    }
}
