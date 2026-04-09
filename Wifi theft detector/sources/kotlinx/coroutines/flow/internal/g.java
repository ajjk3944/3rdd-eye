package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.y;

/* loaded from: classes4.dex */
public final class g extends y {
    public g(kotlin.coroutines.d dVar, c9.c cVar) {
        super(dVar, cVar);
    }

    @Override // kotlinx.coroutines.y1
    public boolean S(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return M(th);
    }
}
