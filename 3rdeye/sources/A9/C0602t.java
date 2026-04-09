package A9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* renamed from: A9.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0602t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f271b = AtomicIntegerFieldUpdater.newUpdater(C0602t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f272a;

    public C0602t(boolean z10, Throwable th) {
        this.f272a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f272a + ']';
    }
}
