package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class T {

    public static final class a implements M {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Vi.b f25588a;

        a(Vi.b bVar) {
            this.f25588a = bVar;
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public Xi.f a() {
            throw new IllegalStateException("unsupported");
        }

        @Override // Vi.InterfaceC3627a
        public Object c(Yi.e decoder) {
            AbstractC6492s.i(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // Zi.M
        public Vi.b[] d() {
            return new Vi.b[]{this.f25588a};
        }

        @Override // Vi.o
        public void e(Yi.f encoder, Object obj) {
            AbstractC6492s.i(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final Xi.f a(String name, Vi.b primitiveSerializer) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(primitiveSerializer, "primitiveSerializer");
        return new S(name, new a(primitiveSerializer));
    }
}
