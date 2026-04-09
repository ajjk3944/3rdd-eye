package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final a f15547b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f15548a;

    /* compiled from: ManifestSchemaFactory.java */
    public static class a implements O {
        @Override // androidx.datastore.preferences.protobuf.O
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public final N messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    public static class b implements O {

        /* renamed from: a, reason: collision with root package name */
        public O[] f15549a;

        @Override // androidx.datastore.preferences.protobuf.O
        public final boolean isSupported(Class<?> cls) {
            for (O o10 : this.f15549a) {
                if (o10.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public final N messageInfoFor(Class<?> cls) {
            for (O o10 : this.f15549a) {
                if (o10.isSupported(cls)) {
                    return o10.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public H() {
        O o10;
        try {
            o10 = (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o10 = f15547b;
        }
        O[] oArr = {C1743v.f15701a, o10};
        b bVar = new b();
        bVar.f15549a = oArr;
        Charset charset = C1746y.f15707a;
        this.f15548a = bVar;
    }
}
