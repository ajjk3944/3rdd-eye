package Q9;

import b9.C1992A;

/* compiled from: Tuples.kt */
/* renamed from: Q9.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1539k0<K, V> extends T<K, V, b9.l<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    public final O9.f f11499c;

    /* compiled from: Tuples.kt */
    /* renamed from: Q9.k0$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<O9.a, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ M9.b<K> f11500g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ M9.b<V> f11501h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M9.b<K> bVar, M9.b<V> bVar2) {
            super(1);
            this.f11500g = bVar;
            this.f11501h = bVar2;
        }

        @Override // p9.l
        public final C1992A invoke(O9.a aVar) {
            O9.a buildClassSerialDescriptor = aVar;
            kotlin.jvm.internal.l.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            O9.a.a(buildClassSerialDescriptor, "first", this.f11500g.getDescriptor());
            O9.a.a(buildClassSerialDescriptor, "second", this.f11501h.getDescriptor());
            return C1992A.f18074a;
        }
    }

    public C1539k0(M9.b<K> bVar, M9.b<V> bVar2) {
        super(bVar, bVar2);
        this.f11499c = O9.j.a("kotlin.Pair", new O9.e[0], new a(bVar, bVar2));
    }

    @Override // Q9.T
    public final Object a(Object obj) {
        b9.l lVar = (b9.l) obj;
        kotlin.jvm.internal.l.f(lVar, "<this>");
        return lVar.f18083b;
    }

    @Override // Q9.T
    public final Object b(Object obj) {
        b9.l lVar = (b9.l) obj;
        kotlin.jvm.internal.l.f(lVar, "<this>");
        return lVar.f18084c;
    }

    @Override // Q9.T
    public final Object c(Object obj, Object obj2) {
        return new b9.l(obj, obj2);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11499c;
    }
}
