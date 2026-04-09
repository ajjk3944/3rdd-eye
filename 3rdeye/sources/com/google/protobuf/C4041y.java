package com.google.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4041y implements T {
    private static final C4041y instance = new C4041y();

    private C4041y() {
    }

    public static C4041y getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.T
    public boolean isSupported(Class<?> cls) {
        return AbstractC4042z.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.T
    public S messageInfoFor(Class<?> cls) {
        if (!AbstractC4042z.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (S) AbstractC4042z.getDefaultInstance(cls.asSubclass(AbstractC4042z.class)).buildMessageInfo();
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }
}
