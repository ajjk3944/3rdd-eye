package Q9;

import b9.C1992A;
import g0.C4356c;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class F0<A, B, C> implements M9.b<b9.q<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a, reason: collision with root package name */
    public final M9.b<A> f11416a;

    /* renamed from: b, reason: collision with root package name */
    public final M9.b<B> f11417b;

    /* renamed from: c, reason: collision with root package name */
    public final M9.b<C> f11418c;

    /* renamed from: d, reason: collision with root package name */
    public final O9.f f11419d = O9.j.a("kotlin.Triple", new O9.e[0], new a(this));

    /* compiled from: Tuples.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<O9.a, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ F0<A, B, C> f11420g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F0<A, B, C> f02) {
            super(1);
            this.f11420g = f02;
        }

        @Override // p9.l
        public final C1992A invoke(O9.a aVar) {
            O9.a buildClassSerialDescriptor = aVar;
            kotlin.jvm.internal.l.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            F0<A, B, C> f02 = this.f11420g;
            O9.a.a(buildClassSerialDescriptor, "first", f02.f11416a.getDescriptor());
            O9.a.a(buildClassSerialDescriptor, "second", f02.f11417b.getDescriptor());
            O9.a.a(buildClassSerialDescriptor, "third", f02.f11418c.getDescriptor());
            return C1992A.f18074a;
        }
    }

    public F0(M9.b<A> bVar, M9.b<B> bVar2, M9.b<C> bVar3) {
        this.f11416a = bVar;
        this.f11417b = bVar2;
        this.f11418c = bVar3;
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        O9.f fVar = this.f11419d;
        P9.b bVarD = dVar.d(fVar);
        Object obj = G0.f11423a;
        Object objH = obj;
        Object objH2 = objH;
        Object objH3 = objH2;
        while (true) {
            int iX = bVarD.x(fVar);
            if (iX == -1) {
                bVarD.b(fVar);
                if (objH == obj) {
                    throw new M9.i("Element 'first' is missing");
                }
                if (objH2 == obj) {
                    throw new M9.i("Element 'second' is missing");
                }
                if (objH3 != obj) {
                    return new b9.q(objH, objH2, objH3);
                }
                throw new M9.i("Element 'third' is missing");
            }
            if (iX == 0) {
                objH = bVarD.h(fVar, 0, this.f11416a, null);
            } else if (iX == 1) {
                objH2 = bVarD.h(fVar, 1, this.f11417b, null);
            } else {
                if (iX != 2) {
                    throw new M9.i(C4356c.h(iX, "Unexpected index "));
                }
                objH3 = bVarD.h(fVar, 2, this.f11418c, null);
            }
        }
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11419d;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        b9.q value = (b9.q) obj;
        kotlin.jvm.internal.l.f(value, "value");
        O9.f fVar = this.f11419d;
        P9.c cVarD = eVar.d(fVar);
        cVarD.y(fVar, 0, this.f11416a, value.f18093b);
        cVarD.y(fVar, 1, this.f11417b, value.f18094c);
        cVarD.y(fVar, 2, this.f11418c, value.f18095d);
        cVarD.b(fVar);
    }
}
