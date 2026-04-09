package d0;

import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37245c;

    public /* synthetic */ o(AtomicReference atomicReference, int i) {
        this.f37244b = i;
        this.f37245c = atomicReference;
    }

    @Override // o0.b.c
    public final Object i(b.a aVar) {
        switch (this.f37244b) {
            case 0:
                this.f37245c.set(aVar);
                return "mReleasedFuture";
            default:
                this.f37245c.set(aVar);
                return "Terminate InputBuffer";
        }
    }
}
