package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class r2 extends CoroutineDispatcher {

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f22595b = new r2();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        v2 v2Var = (v2) dVar.get(v2.f22697b);
        if (v2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        v2Var.f22698a = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean Z(kotlin.coroutines.d dVar) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
