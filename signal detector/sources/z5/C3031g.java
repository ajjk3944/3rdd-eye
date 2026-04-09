package z5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: z5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3031g extends C3038n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24533c = AtomicIntegerFieldUpdater.newUpdater(C3031g.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C3031g(C3030f c3030f, Throwable th, boolean z6) {
        if (th == null) {
            th = new CancellationException("Continuation " + c3030f + " was cancelled normally");
        }
        super(th, z6);
        this._resumed$volatile = 0;
    }
}
