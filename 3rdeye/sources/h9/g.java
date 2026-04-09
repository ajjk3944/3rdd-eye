package h9;

import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class g extends AbstractC4424a {
    public g(InterfaceC4347e<Object> interfaceC4347e) {
        super(interfaceC4347e);
        if (interfaceC4347e != null && interfaceC4347e.getContext() != C4351i.f37871b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return C4351i.f37871b;
    }
}
