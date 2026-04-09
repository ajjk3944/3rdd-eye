package Q9;

import c9.C2092m;
import java.util.ArrayList;
import p9.InterfaceC5480a;

/* compiled from: Tagged.kt */
/* loaded from: classes3.dex */
public abstract class D0<Tag> implements P9.d, P9.b {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<Tag> f11406b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f11407c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tagged.kt */
    public static final class a<T> extends kotlin.jvm.internal.m implements InterfaceC5480a<T> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ D0<Tag> f11408g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ M9.b f11409h;
        public final /* synthetic */ T i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D0<Tag> d02, M9.b bVar, T t10) {
            super(0);
            this.f11408g = d02;
            this.f11409h = bVar;
            this.i = t10;
        }

        @Override // p9.InterfaceC5480a
        public final T invoke() {
            D0<Tag> d02 = this.f11408g;
            if (!d02.p()) {
                return null;
            }
            M9.b deserializer = this.f11409h;
            kotlin.jvm.internal.l.f(deserializer, "deserializer");
            return (T) d02.B(deserializer);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tagged.kt */
    public static final class b<T> extends kotlin.jvm.internal.m implements InterfaceC5480a<T> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ D0<Tag> f11410g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ M9.b f11411h;
        public final /* synthetic */ T i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D0<Tag> d02, M9.b bVar, T t10) {
            super(0);
            this.f11410g = d02;
            this.f11411h = bVar;
            this.i = t10;
        }

        @Override // p9.InterfaceC5480a
        public final T invoke() {
            D0<Tag> d02 = this.f11410g;
            d02.getClass();
            M9.b deserializer = this.f11411h;
            kotlin.jvm.internal.l.f(deserializer, "deserializer");
            return (T) d02.B(deserializer);
        }
    }

    @Override // P9.d
    public P9.d A(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return L(R(), descriptor);
    }

    @Override // P9.d
    public abstract <T> T B(M9.b bVar);

    @Override // P9.b
    public final long C(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return N(Q(descriptor, i));
    }

    public abstract int D(Tag tag, O9.e eVar);

    @Override // P9.d
    public final short E() {
        return O(R());
    }

    @Override // P9.d
    public final float F() {
        return K(R());
    }

    @Override // P9.b
    public final <T> T G(O9.e descriptor, int i, M9.b deserializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        String strQ = Q(descriptor, i);
        a aVar = new a(this, deserializer, t10);
        this.f11406b.add(strQ);
        T t11 = (T) aVar.invoke();
        if (!this.f11407c) {
            R();
        }
        this.f11407c = false;
        return t11;
    }

    @Override // P9.d
    public final int H(O9.e enumDescriptor) {
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        return D(R(), enumDescriptor);
    }

    @Override // P9.b
    public final boolean I(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return e(Q(descriptor, i));
    }

    @Override // P9.d
    public final double J() {
        return u(R());
    }

    public abstract float K(Tag tag);

    public abstract P9.d L(Tag tag, O9.e eVar);

    public abstract int M(Tag tag);

    public abstract long N(Tag tag);

    public abstract short O(Tag tag);

    public abstract String P(Tag tag);

    public abstract String Q(O9.e eVar, int i);

    public final Tag R() {
        ArrayList<Tag> arrayList = this.f11406b;
        Tag tagRemove = arrayList.remove(C2092m.V(arrayList));
        this.f11407c = true;
        return tagRemove;
    }

    public abstract boolean e(Tag tag);

    @Override // P9.d
    public final boolean f() {
        return e(R());
    }

    @Override // P9.d
    public final char g() {
        return t(R());
    }

    @Override // P9.b
    public final <T> T h(O9.e descriptor, int i, M9.b deserializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        String strQ = Q(descriptor, i);
        b bVar = new b(this, deserializer, t10);
        this.f11406b.add(strQ);
        T t11 = (T) bVar.invoke();
        if (!this.f11407c) {
            R();
        }
        this.f11407c = false;
        return t11;
    }

    @Override // P9.b
    public final int i(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return M(Q(descriptor, i));
    }

    @Override // P9.d
    public final int k() {
        return M(R());
    }

    @Override // P9.d
    public final String l() {
        return P(R());
    }

    @Override // P9.d
    public final long m() {
        return N(R());
    }

    @Override // P9.b
    public final String n(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return P(Q(descriptor, i));
    }

    @Override // P9.b
    public final byte o(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return q(Q(descriptor, i));
    }

    @Override // P9.d
    public abstract boolean p();

    public abstract byte q(Tag tag);

    @Override // P9.b
    public final P9.d r(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return L(Q(descriptor, i), descriptor.i(i));
    }

    @Override // P9.b
    public final short s(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return O(Q(descriptor, i));
    }

    public abstract char t(Tag tag);

    public abstract double u(Tag tag);

    @Override // P9.b
    public final float v(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return K(Q(descriptor, i));
    }

    @Override // P9.b
    public final char w(C1552r0 descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return t(Q(descriptor, i));
    }

    @Override // P9.b
    public final double y(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return u(Q(descriptor, i));
    }

    @Override // P9.d
    public final byte z() {
        return q(R());
    }
}
