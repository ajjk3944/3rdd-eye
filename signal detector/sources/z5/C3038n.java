package z5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: z5.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3038n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24545b = AtomicIntegerFieldUpdater.newUpdater(C3038n.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f24546a;

    public C3038n(Throwable th, boolean z6) {
        this.f24546a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f24546a + ']';
    }
}
