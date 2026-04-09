package androidx.lifecycle;

import f9.InterfaceC4350h;

/* compiled from: PausingDispatcher.jvm.kt */
/* loaded from: classes.dex */
public final class H extends A9.A {

    /* renamed from: c, reason: collision with root package name */
    public final C1773f f16043c = new C1773f();

    @Override // A9.A
    public final void N0(InterfaceC4350h context, Runnable block) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(block, "block");
        C1773f c1773f = this.f16043c;
        c1773f.getClass();
        I9.c cVar = A9.U.f211a;
        B9.g gVarR0 = F9.q.f1782a.R0();
        if (!gVarR0.P0(context)) {
            if (!(c1773f.f16147b || !c1773f.f16146a)) {
                if (!c1773f.f16149d.offer(block)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                c1773f.a();
                return;
            }
        }
        gVarR0.N0(context, new B.a(13, c1773f, block));
    }

    @Override // A9.A
    public final boolean P0(InterfaceC4350h context) {
        kotlin.jvm.internal.l.f(context, "context");
        I9.c cVar = A9.U.f211a;
        if (F9.q.f1782a.R0().P0(context)) {
            return true;
        }
        C1773f c1773f = this.f16043c;
        return !(c1773f.f16147b || !c1773f.f16146a);
    }
}
