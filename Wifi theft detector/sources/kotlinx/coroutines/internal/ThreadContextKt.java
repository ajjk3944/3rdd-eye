package kotlinx.coroutines.internal;

import kotlin.coroutines.d;
import kotlinx.coroutines.o2;

/* loaded from: classes4.dex */
public abstract class ThreadContextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f22512a = new c0("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final l9.p f22513b = new l9.p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // l9.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, d.b bVar) {
            if (!(bVar instanceof o2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final l9.p f22514c = new l9.p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // l9.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o2 invoke(o2 o2Var, d.b bVar) {
            if (o2Var != null) {
                return o2Var;
            }
            if (bVar instanceof o2) {
                return (o2) bVar;
            }
            return null;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final l9.p f22515d = new l9.p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // l9.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke(j0 j0Var, d.b bVar) {
            if (bVar instanceof o2) {
                o2 o2Var = (o2) bVar;
                j0Var.a(o2Var, o2Var.V(j0Var.f22541a));
            }
            return j0Var;
        }
    };

    public static final void a(kotlin.coroutines.d dVar, Object obj) {
        if (obj == f22512a) {
            return;
        }
        if (obj instanceof j0) {
            ((j0) obj).b(dVar);
            return;
        }
        Object objFold = dVar.fold(null, f22514c);
        kotlin.jvm.internal.p.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((o2) objFold).j(dVar, obj);
    }

    public static final Object b(kotlin.coroutines.d dVar) {
        Object objFold = dVar.fold(0, f22513b);
        kotlin.jvm.internal.p.b(objFold);
        return objFold;
    }

    public static final Object c(kotlin.coroutines.d dVar, Object obj) {
        if (obj == null) {
            obj = b(dVar);
        }
        if (obj == 0) {
            return f22512a;
        }
        if (obj instanceof Integer) {
            return dVar.fold(new j0(dVar, ((Number) obj).intValue()), f22515d);
        }
        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((o2) obj).V(dVar);
    }
}
