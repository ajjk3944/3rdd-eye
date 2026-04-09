package pi;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
public final class Y extends O0 {

    /* renamed from: b, reason: collision with root package name */
    private final oi.n f58104b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6824a f58105c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f58106d;

    public Y(oi.n storageManager, InterfaceC6824a computation) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(computation, "computation");
        this.f58104b = storageManager;
        this.f58105c = computation;
        this.f58106d = storageManager.f(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S V0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar, Y y10) {
        return gVar.a((InterfaceC7618i) y10.f58105c.invoke());
    }

    @Override // pi.O0
    protected S R0() {
        return (S) this.f58106d.invoke();
    }

    @Override // pi.O0
    public boolean S0() {
        return this.f58106d.m();
    }

    @Override // pi.S
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Y X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new Y(this.f58104b, new X(kotlinTypeRefiner, this));
    }
}
