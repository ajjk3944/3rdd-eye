package Qi;

import Ii.InterfaceC3091y0;
import kg.InterfaceC6468e;

/* loaded from: classes4.dex */
public final class c implements InterfaceC6468e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3091y0 f19360a;

    public c(InterfaceC3091y0 interfaceC3091y0) {
        this.f19360a = interfaceC3091y0;
    }

    @Override // kg.InterfaceC6468e
    public void cancel() {
        InterfaceC3091y0.a.b(this.f19360a, null, 1, null);
    }
}
