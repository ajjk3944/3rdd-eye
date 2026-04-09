package Mi;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
final class y implements InterfaceC5380e, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5380e f13310a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5384i f13311b;

    public y(InterfaceC5380e interfaceC5380e, InterfaceC5384i interfaceC5384i) {
        this.f13310a = interfaceC5380e;
        this.f13311b = interfaceC5384i;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC5380e interfaceC5380e = this.f13310a;
        if (interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC5380e;
        }
        return null;
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return this.f13311b;
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        this.f13310a.resumeWith(obj);
    }
}
