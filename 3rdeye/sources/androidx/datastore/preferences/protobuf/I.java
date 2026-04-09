package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public final class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f15550a;

    /* compiled from: MapEntryLite.java */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final r0 f15551a;

        /* renamed from: b, reason: collision with root package name */
        public final r0 f15552b;

        /* renamed from: c, reason: collision with root package name */
        public final Z0.f f15553c;

        public a(r0 r0Var, r0 r0Var2, Z0.f fVar) {
            this.f15551a = r0Var;
            this.f15552b = r0Var2;
            this.f15553c = fVar;
        }
    }

    public I(r0 r0Var, r0 r0Var2, Z0.f fVar) {
        this.f15550a = new a<>(r0Var, r0Var2, fVar);
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return C1740s.b(aVar.f15552b, 2, v10) + C1740s.b(aVar.f15551a, 1, k10);
    }

    public static <K, V> void b(AbstractC1733k abstractC1733k, a<K, V> aVar, K k10, V v10) throws IOException {
        C1740s.j(abstractC1733k, aVar.f15551a, 1, k10);
        C1740s.j(abstractC1733k, aVar.f15552b, 2, v10);
    }
}
