package Li;

import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Li.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3216c extends Mi.d {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f11903f = AtomicIntegerFieldUpdater.newUpdater(C3216c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    private final Ki.v f11904d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11905e;

    public /* synthetic */ C3216c(Ki.v vVar, boolean z10, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, z10, (i11 & 4) != 0 ? C5385j.f46088a : interfaceC5384i, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? Ki.a.SUSPEND : aVar);
    }

    private final void q() {
        if (this.f11905e && f11903f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // Mi.d, Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        if (this.f13237b != -3) {
            Object objB = super.b(interfaceC3221h, interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
        q();
        Object objD = AbstractC3224k.d(interfaceC3221h, this.f11904d, this.f11905e, interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }

    @Override // Mi.d
    protected String e() {
        return "channel=" + this.f11904d;
    }

    @Override // Mi.d
    protected Object g(Ki.t tVar, InterfaceC5380e interfaceC5380e) {
        Object objD = AbstractC3224k.d(new Mi.x(tVar), this.f11904d, this.f11905e, interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }

    @Override // Mi.d
    protected Mi.d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return new C3216c(this.f11904d, this.f11905e, interfaceC5384i, i10, aVar);
    }

    @Override // Mi.d
    public InterfaceC3220g k() {
        return new C3216c(this.f11904d, this.f11905e, null, 0, null, 28, null);
    }

    @Override // Mi.d
    public Ki.v o(Ii.N n10) {
        q();
        return this.f13237b == -3 ? this.f11904d : super.o(n10);
    }

    public C3216c(Ki.v vVar, boolean z10, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC5384i, i10, aVar);
        this.f11904d = vVar;
        this.f11905e = z10;
    }
}
