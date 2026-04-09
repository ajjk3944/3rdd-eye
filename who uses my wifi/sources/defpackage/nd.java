package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nd extends pg {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(nd.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public nd(kd kdVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + kdVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
