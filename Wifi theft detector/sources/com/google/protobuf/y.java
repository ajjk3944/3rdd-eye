package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;

/* loaded from: classes3.dex */
public final class y implements r0 {
    private static final d0 EMPTY_FACTORY = new a();
    private final d0 messageInfoFactory;

    public class a implements d0 {
        @Override // com.google.protobuf.d0
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.d0
        public c0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements d0 {
        private d0[] factories;

        public c(d0... d0VarArr) {
            this.factories = d0VarArr;
        }

        @Override // com.google.protobuf.d0
        public boolean isSupported(Class<?> cls) {
            for (d0 d0Var : this.factories) {
                if (d0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.d0
        public c0 messageInfoFor(Class<?> cls) {
            for (d0 d0Var : this.factories) {
                if (d0Var.isSupported(cls)) {
                    return d0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public y() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(c0 c0Var) {
        return b.$SwitchMap$com$google$protobuf$ProtoSyntax[c0Var.getSyntax().ordinal()] != 1;
    }

    private static d0 getDefaultMessageInfoFactory() {
        return new c(n.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static d0 getDescriptorMessageInfoFactory() {
        try {
            return (d0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> q0 newSchema(Class<T> cls, c0 c0Var) {
        return GeneratedMessageLite.class.isAssignableFrom(cls) ? allowExtensions(c0Var) ? f0.newSchema(cls, c0Var, j0.lite(), w.lite(), s0.unknownFieldSetLiteSchema(), l.lite(), b0.lite()) : f0.newSchema(cls, c0Var, j0.lite(), w.lite(), s0.unknownFieldSetLiteSchema(), null, b0.lite()) : allowExtensions(c0Var) ? f0.newSchema(cls, c0Var, j0.full(), w.full(), s0.unknownFieldSetFullSchema(), l.full(), b0.full()) : f0.newSchema(cls, c0Var, j0.full(), w.full(), s0.unknownFieldSetFullSchema(), null, b0.full());
    }

    @Override // com.google.protobuf.r0
    public <T> q0 createSchema(Class<T> cls) {
        s0.requireGeneratedMessage(cls);
        c0 c0VarMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        return c0VarMessageInfoFor.isMessageSetWireFormat() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? g0.newSchema(s0.unknownFieldSetLiteSchema(), l.lite(), c0VarMessageInfoFor.getDefaultInstance()) : g0.newSchema(s0.unknownFieldSetFullSchema(), l.full(), c0VarMessageInfoFor.getDefaultInstance()) : newSchema(cls, c0VarMessageInfoFor);
    }

    private y(d0 d0Var) {
        this.messageInfoFactory = (d0) Internal.checkNotNull(d0Var, "messageInfoFactory");
    }
}
