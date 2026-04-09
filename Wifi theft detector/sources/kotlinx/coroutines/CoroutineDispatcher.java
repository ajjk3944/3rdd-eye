package kotlinx.coroutines;

import kotlin.coroutines.c;
import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.c {

    /* renamed from: a, reason: collision with root package name */
    public static final Key f22203a = new Key(null);

    public static final class Key extends kotlin.coroutines.b {
        public /* synthetic */ Key(kotlin.jvm.internal.i iVar) {
            this();
        }

        public Key() {
            super(kotlin.coroutines.c.F8, new l9.l() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // l9.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CoroutineDispatcher invoke(d.b bVar) {
                    if (bVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) bVar;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(kotlin.coroutines.c.F8);
    }

    @Override // kotlin.coroutines.c
    public final void I(c9.c cVar) {
        kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((kotlinx.coroutines.internal.i) cVar).t();
    }

    @Override // kotlin.coroutines.c
    public final c9.c P(c9.c cVar) {
        return new kotlinx.coroutines.internal.i(this, cVar);
    }

    public abstract void X(kotlin.coroutines.d dVar, Runnable runnable);

    public void Y(kotlin.coroutines.d dVar, Runnable runnable) {
        X(dVar, runnable);
    }

    public boolean Z(kotlin.coroutines.d dVar) {
        return true;
    }

    public CoroutineDispatcher a0(int i10) {
        kotlinx.coroutines.internal.m.a(i10);
        return new kotlinx.coroutines.internal.l(this, i10);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d.b, kotlin.coroutines.d
    public d.b get(d.c cVar) {
        return c.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(d.c cVar) {
        return c.a.b(this, cVar);
    }

    public String toString() {
        return l0.a(this) + '@' + l0.b(this);
    }
}
