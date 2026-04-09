package kotlinx.serialization.json.internal;

import java.util.Set;

/* loaded from: classes4.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f23029a = z8.j0.f(x9.a.E(y8.l.f25183b).getDescriptor(), x9.a.F(y8.n.f25188b).getDescriptor(), x9.a.D(y8.j.f25178b).getDescriptor(), x9.a.G(y8.q.f25194b).getDescriptor());

    public static final boolean a(kotlinx.serialization.descriptors.f fVar) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        return fVar.isInline() && f23029a.contains(fVar);
    }
}
