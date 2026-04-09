package E9;

import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes3.dex */
public final class s<T> implements InterfaceC4347e<T>, h9.d {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4347e<T> f1574b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4350h f1575c;

    /* JADX WARN: Multi-variable type inference failed */
    public s(InterfaceC4347e<? super T> interfaceC4347e, InterfaceC4350h interfaceC4350h) {
        this.f1574b = interfaceC4347e;
        this.f1575c = interfaceC4350h;
    }

    @Override // h9.d
    public final h9.d getCallerFrame() {
        InterfaceC4347e<T> interfaceC4347e = this.f1574b;
        if (interfaceC4347e instanceof h9.d) {
            return (h9.d) interfaceC4347e;
        }
        return null;
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return this.f1575c;
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        this.f1574b.resumeWith(obj);
    }
}
