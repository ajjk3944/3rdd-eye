package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public abstract class SafeCollector_commonKt {
    public static final void a(final SafeCollector safeCollector, kotlin.coroutines.d dVar) {
        if (((Number) dVar.fold(0, new l9.p() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            {
                super(2);
            }

            public final Integer a(int i10, d.b bVar) {
                d.c key = bVar.getKey();
                d.b bVar2 = safeCollector.collectContext.get(key);
                if (key != r1.H8) {
                    return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i10 + 1);
                }
                r1 r1Var = (r1) bVar2;
                kotlin.jvm.internal.p.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                r1 r1VarB = SafeCollector_commonKt.b((r1) bVar, r1Var);
                if (r1VarB == r1Var) {
                    if (r1Var != null) {
                        i10++;
                    }
                    return Integer.valueOf(i10);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r1VarB + ", expected child of " + r1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (d.b) obj2);
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + dVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final r1 b(r1 r1Var, r1 r1Var2) {
        while (r1Var != null) {
            if (r1Var == r1Var2 || !(r1Var instanceof y)) {
                return r1Var;
            }
            r1Var = r1Var.getParent();
        }
        return null;
    }
}
