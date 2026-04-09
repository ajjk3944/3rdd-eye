package y8;

import jd.InterfaceC6293b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class k extends i implements j {

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f66477n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f66478o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u latencyOperator, InterfaceC6293b networkTopologyService) {
        super(null, latencyOperator, networkTopologyService);
        AbstractC6492s.i(latencyOperator, "latencyOperator");
        AbstractC6492s.i(networkTopologyService, "networkTopologyService");
        this.f66477n = o();
        this.f66478o = n();
    }

    @Override // y8.c
    public gg.i a() {
        return this.f66477n;
    }

    @Override // y8.c
    public gg.i b() {
        return this.f66478o;
    }
}
