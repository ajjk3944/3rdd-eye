package bj;

import Zg.d0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f33427a = d0.i(Wi.a.y(Yg.C.f24981b).a(), Wi.a.z(Yg.E.f24986b).a(), Wi.a.x(Yg.A.f24976b).a(), Wi.a.A(Yg.H.f24992b).a());

    public static final boolean a(Xi.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return fVar.isInline() && AbstractC6492s.d(fVar, aj.k.j());
    }

    public static final boolean b(Xi.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return fVar.isInline() && f33427a.contains(fVar);
    }
}
