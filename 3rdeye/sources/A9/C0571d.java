package A9;

import f9.InterfaceC4350h;
import java.util.concurrent.locks.LockSupport;

/* compiled from: Builders.kt */
/* renamed from: A9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0571d<T> extends AbstractC0565a<T> {

    /* renamed from: e, reason: collision with root package name */
    public final Thread f239e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0566a0 f240f;

    public C0571d(InterfaceC4350h interfaceC4350h, Thread thread, AbstractC0566a0 abstractC0566a0) {
        super(interfaceC4350h, true, true);
        this.f239e = thread;
        this.f240f = abstractC0566a0;
    }

    @Override // A9.C0605u0
    public final void r(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f239e;
        if (kotlin.jvm.internal.l.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
