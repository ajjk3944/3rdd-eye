package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5094v implements L {

    /* renamed from: a, reason: collision with root package name */
    private static final C5094v f38593a = new C5094v();

    private C5094v() {
    }

    public static C5094v c() {
        return f38593a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public K a(Class cls) {
        if (!AbstractC5095w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (K) AbstractC5095w.t(cls.asSubclass(AbstractC5095w.class)).i();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public boolean b(Class cls) {
        return AbstractC5095w.class.isAssignableFrom(cls);
    }
}
