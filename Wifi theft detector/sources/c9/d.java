package c9;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import l9.p;
import y8.s;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(p pVar, Object obj, c completion) {
        kotlin.jvm.internal.p.e(pVar, "<this>");
        kotlin.jvm.internal.p.e(completion, "completion");
        c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(IntrinsicsKt__IntrinsicsJvmKt.a(pVar, obj, completion));
        Result.Companion companion = Result.INSTANCE;
        cVarC.resumeWith(Result.b(s.f25199a));
    }
}
