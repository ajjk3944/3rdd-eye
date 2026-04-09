package A9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* renamed from: A9.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0599r0 extends C0605u0 implements r {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0599r0(InterfaceC0594o0 interfaceC0594o0) {
        super(true);
        boolean z10 = true;
        O(interfaceC0594o0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0605u0.f275c;
        InterfaceC0591n interfaceC0591n = (InterfaceC0591n) atomicReferenceFieldUpdater.get(this);
        C0593o c0593o = interfaceC0591n instanceof C0593o ? (C0593o) interfaceC0591n : null;
        if (c0593o == null) {
            z10 = false;
            break;
        }
        C0605u0 c0605u0I = c0593o.i();
        while (!c0605u0I.I()) {
            InterfaceC0591n interfaceC0591n2 = (InterfaceC0591n) atomicReferenceFieldUpdater.get(c0605u0I);
            C0593o c0593o2 = interfaceC0591n2 instanceof C0593o ? (C0593o) interfaceC0591n2 : null;
            if (c0593o2 == null) {
                z10 = false;
                break;
            }
            c0605u0I = c0593o2.i();
        }
        this.f265d = z10;
    }

    @Override // A9.C0605u0
    public final boolean I() {
        return this.f265d;
    }

    @Override // A9.C0605u0
    public final boolean J() {
        return true;
    }
}
