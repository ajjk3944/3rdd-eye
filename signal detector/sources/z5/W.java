package z5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class W extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W() {
        super(true);
        boolean z6 = true;
        B(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c0.f24524b;
        InterfaceC3033i interfaceC3033i = (InterfaceC3033i) atomicReferenceFieldUpdater.get(this);
        C3034j c3034j = interfaceC3033i instanceof C3034j ? (C3034j) interfaceC3033i : null;
        if (c3034j == null) {
            z6 = false;
            break;
        }
        c0 c0VarN = c3034j.n();
        while (!c0VarN.v()) {
            InterfaceC3033i interfaceC3033i2 = (InterfaceC3033i) atomicReferenceFieldUpdater.get(c0VarN);
            C3034j c3034j2 = interfaceC3033i2 instanceof C3034j ? (C3034j) interfaceC3033i2 : null;
            if (c3034j2 == null) {
                z6 = false;
                break;
            }
            c0VarN = c3034j2.n();
        }
        this.f24507c = z6;
    }

    @Override // z5.c0
    public final boolean v() {
        return this.f24507c;
    }

    @Override // z5.c0
    public final boolean w() {
        return true;
    }
}
