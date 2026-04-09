package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public abstract class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final kotlin.coroutines.d a(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, final boolean z10) {
        boolean zC = c(dVar);
        boolean zC2 = c(dVar2);
        if (!zC && !zC2) {
            return dVar.plus(dVar2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f21979a;
        kotlin.coroutines.d dVar3 = (kotlin.coroutines.d) dVar.fold(emptyCoroutineContext, new l9.p() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // l9.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.coroutines.d invoke(kotlin.coroutines.d dVar4, d.b bVar) {
                return dVar4.plus(bVar);
            }
        });
        if (zC2) {
            ref$ObjectRef.element = ((kotlin.coroutines.d) ref$ObjectRef.element).fold(emptyCoroutineContext, new l9.p() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // l9.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.coroutines.d invoke(kotlin.coroutines.d dVar4, d.b bVar) {
                    return dVar4.plus(bVar);
                }
            });
        }
        return dVar3.plus((kotlin.coroutines.d) ref$ObjectRef.element);
    }

    public static final String b(kotlin.coroutines.d dVar) {
        return null;
    }

    public static final boolean c(kotlin.coroutines.d dVar) {
        return ((Boolean) dVar.fold(Boolean.FALSE, new l9.p() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            public final Boolean a(boolean z10, d.b bVar) {
                return Boolean.valueOf(z10);
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (d.b) obj2);
            }
        })).booleanValue();
    }

    public static final kotlin.coroutines.d d(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2) {
        return !c(dVar2) ? dVar.plus(dVar2) : a(dVar, dVar2, false);
    }

    public static final kotlin.coroutines.d e(j0 j0Var, kotlin.coroutines.d dVar) {
        kotlin.coroutines.d dVarA = a(j0Var.getCoroutineContext(), dVar, true);
        return (dVarA == w0.a() || dVarA.get(kotlin.coroutines.c.F8) != null) ? dVarA : dVarA.plus(w0.a());
    }

    public static final s2 f(d9.c cVar) {
        while (!(cVar instanceof s0) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof s2) {
                return (s2) cVar;
            }
        }
        return null;
    }

    public static final s2 g(c9.c cVar, kotlin.coroutines.d dVar, Object obj) {
        if (!(cVar instanceof d9.c) || dVar.get(t2.f22694a) == null) {
            return null;
        }
        s2 s2VarF = f((d9.c) cVar);
        if (s2VarF != null) {
            s2VarF.V0(dVar, obj);
        }
        return s2VarF;
    }
}
