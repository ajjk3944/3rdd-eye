package M9;

import K6.C0749p;
import O9.k;
import Q9.C1545n0;
import c9.C2088i;
import java.util.List;

/* compiled from: ContextualSerializer.kt */
/* loaded from: classes3.dex */
public final class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f4343a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b<?>> f4344b;

    /* renamed from: c, reason: collision with root package name */
    public final O9.b f4345c;

    public a(kotlin.jvm.internal.e eVar, b[] bVarArr) {
        this.f4343a = eVar;
        this.f4344b = C2088i.a(bVarArr);
        this.f4345c = new O9.b(O9.j.b("kotlinx.serialization.ContextualSerializer", k.a.f10521a, new O9.e[0], new C0749p(this, 4)), eVar);
    }

    @Override // M9.b
    public final T deserialize(P9.d dVar) {
        I9.g gVarA = dVar.a();
        kotlin.jvm.internal.e eVar = this.f4343a;
        b bVarQ = gVarA.Q(eVar, this.f4344b);
        if (bVarQ != null) {
            return (T) dVar.B(bVarQ);
        }
        C1545n0.d(eVar);
        throw null;
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f4345c;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, T value) {
        kotlin.jvm.internal.l.f(value, "value");
        I9.g gVarA = eVar.a();
        kotlin.jvm.internal.e eVar2 = this.f4343a;
        b bVarQ = gVarA.Q(eVar2, this.f4344b);
        if (bVarQ != null) {
            eVar.x(bVarQ, value);
        } else {
            C1545n0.d(eVar2);
            throw null;
        }
    }
}
