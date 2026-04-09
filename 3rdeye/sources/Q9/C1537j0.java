package Q9;

import b9.C1992A;
import b9.C2001h;
import g0.C4356c;

/* compiled from: ObjectSerializer.kt */
/* renamed from: Q9.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1537j0<T> implements M9.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final C1992A f11495a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11496b;

    public C1537j0(C1992A objectInstance) {
        kotlin.jvm.internal.l.f(objectInstance, "objectInstance");
        this.f11495a = objectInstance;
        this.f11496b = C2001h.a(b9.i.PUBLICATION, new C1535i0(this));
    }

    @Override // M9.b
    public final T deserialize(P9.d dVar) {
        O9.e descriptor = getDescriptor();
        P9.b bVarD = dVar.d(descriptor);
        int iX = bVarD.x(getDescriptor());
        if (iX != -1) {
            throw new M9.i(C4356c.h(iX, "Unexpected index "));
        }
        C1992A c1992a = C1992A.f18074a;
        bVarD.b(descriptor);
        return (T) this.f11495a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    @Override // M9.b
    public final O9.e getDescriptor() {
        return (O9.e) this.f11496b.getValue();
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, T value) {
        kotlin.jvm.internal.l.f(value, "value");
        eVar.d(getDescriptor()).b(getDescriptor());
    }
}
