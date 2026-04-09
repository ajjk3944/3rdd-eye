package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1744w;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743v implements O {

    /* renamed from: a, reason: collision with root package name */
    public static final C1743v f15701a = new C1743v();

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean isSupported(Class<?> cls) {
        return AbstractC1744w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final N messageInfoFor(Class<?> cls) {
        if (!AbstractC1744w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (N) AbstractC1744w.g(cls.asSubclass(AbstractC1744w.class)).f(AbstractC1744w.f.BUILD_MESSAGE_INFO);
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }
}
