package y8;

import jd.InterfaceC6293b;
import kotlin.jvm.internal.AbstractC6492s;
import y8.AbstractC8627a;

/* loaded from: classes3.dex */
public final class m extends i implements l {

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f66479n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f66480o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractC8627a.b markerManager, v latencyOperator, InterfaceC6293b networkTopologyService) {
        super(markerManager, latencyOperator, networkTopologyService);
        AbstractC6492s.i(markerManager, "markerManager");
        AbstractC6492s.i(latencyOperator, "latencyOperator");
        AbstractC6492s.i(networkTopologyService, "networkTopologyService");
        this.f66479n = o();
        this.f66480o = n();
    }

    @Override // y8.c
    public gg.i a() {
        return this.f66479n;
    }

    @Override // y8.c
    public gg.i b() {
        return this.f66480o;
    }
}
