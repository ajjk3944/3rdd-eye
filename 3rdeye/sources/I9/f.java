package I9;

import A9.AbstractC0576f0;
import f9.InterfaceC4350h;
import java.util.concurrent.Executor;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public class f extends AbstractC0576f0 {

    /* renamed from: c, reason: collision with root package name */
    public a f2627c;

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        a.e(this.f2627c, runnable, 6);
    }

    @Override // A9.A
    public final void O0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        a.e(this.f2627c, runnable, 2);
    }

    @Override // A9.AbstractC0576f0
    public final Executor R0() {
        return this.f2627c;
    }
}
