package Q9;

import b9.C1992A;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class T0 implements M9.b<C1992A> {

    /* renamed from: b, reason: collision with root package name */
    public static final T0 f11458b = new T0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1537j0<C1992A> f11459a = new C1537j0<>(C1992A.f18074a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        this.f11459a.deserialize(dVar);
        return C1992A.f18074a;
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11459a.getDescriptor();
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        C1992A value = (C1992A) obj;
        kotlin.jvm.internal.l.f(value, "value");
        this.f11459a.serialize(eVar, value);
    }
}
