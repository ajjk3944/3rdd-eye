package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22235b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f22236a;

    public c0(Throwable th, boolean z10) {
        this.f22236a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f22235b.get(this) != 0;
    }

    public final boolean c() {
        return f22235b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return l0.a(this) + '[' + this.f22236a + ']';
    }

    public /* synthetic */ c0(Throwable th, boolean z10, int i10, kotlin.jvm.internal.i iVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
