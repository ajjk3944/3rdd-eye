package j$.util.stream;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2427f2 extends AbstractC2432g2 {
    @Override // j$.util.stream.AbstractC2404b
    public final boolean G0() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new C2407b2(this, EnumC2413c3.f21038r);
    }
}
