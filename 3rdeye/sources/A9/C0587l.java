package A9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* renamed from: A9.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0587l extends C0602t {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f256c = AtomicIntegerFieldUpdater.newUpdater(C0587l.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0587l(C0583j c0583j, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0583j + " was cancelled normally");
        }
        super(z10, th);
        this._resumed$volatile = 0;
    }
}
