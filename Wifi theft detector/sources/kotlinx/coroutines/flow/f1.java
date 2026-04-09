package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes4.dex */
public final class f1 extends kotlinx.coroutines.flow.internal.c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22449a = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(StateFlowImpl stateFlowImpl) {
        if (f22449a.get(this) != null) {
            return false;
        }
        f22449a.set(this, e1.f22447a);
        return true;
    }

    public final Object e(c9.c cVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        if (!t.a.a(f22449a, this, e1.f22447a, pVar)) {
            Result.Companion companion = Result.INSTANCE;
            pVar.resumeWith(Result.b(y8.s.f25199a));
        }
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c9.c[] b(StateFlowImpl stateFlowImpl) {
        f22449a.set(this, null);
        return kotlinx.coroutines.flow.internal.b.f22474a;
    }

    public final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22449a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == e1.f22448b) {
                return;
            }
            if (obj == e1.f22447a) {
                if (t.a.a(f22449a, this, obj, e1.f22448b)) {
                    return;
                }
            } else if (t.a.a(f22449a, this, obj, e1.f22447a)) {
                Result.Companion companion = Result.INSTANCE;
                ((kotlinx.coroutines.p) obj).resumeWith(Result.b(y8.s.f25199a));
                return;
            }
        }
    }

    public final boolean i() {
        Object andSet = f22449a.getAndSet(this, e1.f22447a);
        kotlin.jvm.internal.p.b(andSet);
        return andSet == e1.f22448b;
    }
}
