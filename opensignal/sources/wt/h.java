package wt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24621c = AtomicIntegerFieldUpdater.newUpdater(h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public h(g gVar, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + gVar + " was cancelled normally");
        }
        super(th2, z10);
        this._resumed$volatile = 0;
    }
}
