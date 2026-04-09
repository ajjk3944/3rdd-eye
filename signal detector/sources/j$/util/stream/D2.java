package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class D2 extends AbstractC2452k2 {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f20843b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20844c;

    public D2(InterfaceC2472o2 interfaceC2472o2, Comparator comparator) {
        super(interfaceC2472o2);
        this.f20843b = comparator;
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        this.f20844c = true;
        return false;
    }
}
