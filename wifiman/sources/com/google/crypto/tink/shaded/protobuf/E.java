package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class E implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final L f38439b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final L f38440a;

    class a implements L {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.L
        public K a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.L
        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements L {

        /* renamed from: a, reason: collision with root package name */
        private L[] f38441a;

        b(L... lArr) {
            this.f38441a = lArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.L
        public K a(Class cls) {
            for (L l10 : this.f38441a) {
                if (l10.b(cls)) {
                    return l10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.L
        public boolean b(Class cls) {
            for (L l10 : this.f38441a) {
                if (l10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public E() {
        this(b());
    }

    private static L b() {
        return new b(C5094v.c(), c());
    }

    private static L c() {
        try {
            return (L) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f38439b;
        }
    }

    private static boolean d(K k10) {
        return k10.getSyntax() == X.PROTO2;
    }

    private static c0 e(Class cls, K k10) {
        return AbstractC5095w.class.isAssignableFrom(cls) ? d(k10) ? P.U(cls, k10, U.b(), C.b(), e0.L(), r.b(), J.b()) : P.U(cls, k10, U.b(), C.b(), e0.L(), null, J.b()) : d(k10) ? P.U(cls, k10, U.a(), C.a(), e0.G(), r.a(), J.a()) : P.U(cls, k10, U.a(), C.a(), e0.H(), null, J.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public c0 a(Class cls) {
        e0.I(cls);
        K kA = this.f38440a.a(cls);
        return kA.a() ? AbstractC5095w.class.isAssignableFrom(cls) ? Q.m(e0.L(), r.b(), kA.b()) : Q.m(e0.G(), r.a(), kA.b()) : e(cls, kA);
    }

    private E(L l10) {
        this.f38440a = (L) AbstractC5097y.b(l10, "messageInfoFactory");
    }
}
