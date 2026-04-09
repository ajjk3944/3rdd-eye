package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes4.dex */
public abstract class w2 {
    public static final Object a(c9.c cVar) {
        Object objF;
        kotlin.coroutines.d context = cVar.getContext();
        u1.g(context);
        c9.c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(cVar);
        kotlinx.coroutines.internal.i iVar = cVarC instanceof kotlinx.coroutines.internal.i ? (kotlinx.coroutines.internal.i) cVarC : null;
        if (iVar == null) {
            objF = y8.s.f25199a;
        } else {
            if (iVar.f22535d.Z(context)) {
                iVar.n(context, y8.s.f25199a);
            } else {
                v2 v2Var = new v2();
                kotlin.coroutines.d dVarPlus = context.plus(v2Var);
                y8.s sVar = y8.s.f25199a;
                iVar.n(dVarPlus, sVar);
                objF = (!v2Var.f22698a || kotlinx.coroutines.internal.j.d(iVar)) ? kotlin.coroutines.intrinsics.a.f() : sVar;
            }
            objF = kotlin.coroutines.intrinsics.a.f();
        }
        if (objF == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objF == kotlin.coroutines.intrinsics.a.f() ? objF : y8.s.f25199a;
    }
}
