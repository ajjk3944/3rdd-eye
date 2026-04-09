package com.google.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes2.dex */
public final class L implements o0 {
    private static final T EMPTY_FACTORY = new a();
    private final T messageInfoFactory;

    /* compiled from: ManifestSchemaFactory.java */
    public class a implements T {
        @Override // com.google.protobuf.T
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.T
        public S messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    public static class b implements T {
        private T[] factories;

        public b(T... tArr) {
            this.factories = tArr;
        }

        @Override // com.google.protobuf.T
        public boolean isSupported(Class<?> cls) {
            for (T t10 : this.factories) {
                if (t10.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.T
        public S messageInfoFor(Class<?> cls) {
            for (T t10 : this.factories) {
                if (t10.isSupported(cls)) {
                    return t10.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public L() {
        this(getDefaultMessageInfoFactory());
    }

    private static T getDefaultMessageInfoFactory() {
        return new b(C4041y.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static T getDescriptorMessageInfoFactory() {
        try {
            return (T) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(S s10) {
        return s10.getSyntax() == g0.PROTO2;
    }

    private static <T> n0<T> newSchema(Class<T> cls, S s10) {
        return AbstractC4042z.class.isAssignableFrom(cls) ? isProto2(s10) ? X.newSchema(cls, s10, C4019b0.lite(), J.lite(), p0.unknownFieldSetLiteSchema(), C4036t.lite(), Q.lite()) : X.newSchema(cls, s10, C4019b0.lite(), J.lite(), p0.unknownFieldSetLiteSchema(), null, Q.lite()) : isProto2(s10) ? X.newSchema(cls, s10, C4019b0.full(), J.full(), p0.proto2UnknownFieldSetSchema(), C4036t.full(), Q.full()) : X.newSchema(cls, s10, C4019b0.full(), J.full(), p0.proto3UnknownFieldSetSchema(), null, Q.full());
    }

    @Override // com.google.protobuf.o0
    public <T> n0<T> createSchema(Class<T> cls) {
        p0.requireGeneratedMessage(cls);
        S sMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        return sMessageInfoFor.isMessageSetWireFormat() ? AbstractC4042z.class.isAssignableFrom(cls) ? Y.newSchema(p0.unknownFieldSetLiteSchema(), C4036t.lite(), sMessageInfoFor.getDefaultInstance()) : Y.newSchema(p0.proto2UnknownFieldSetSchema(), C4036t.full(), sMessageInfoFor.getDefaultInstance()) : newSchema(cls, sMessageInfoFor);
    }

    private L(T t10) {
        this.messageInfoFactory = (T) B.checkNotNull(t10, "messageInfoFactory");
    }
}
