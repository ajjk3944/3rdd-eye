package jj;

/* loaded from: classes.dex */
public final class p extends ik.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13744b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f13745c;

    public p(xi.i iVar) {
        super(iVar);
        this.f13745c = o0.DEVICE_BOOT;
    }

    @Override // ik.a
    public final o0 a() {
        switch (this.f13744b) {
        }
        return this.f13745c;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // ik.a
    public final boolean b(hk.h hVar) {
        switch (this.f13744b) {
        }
        br.l.e(hVar, "task");
        return true;
    }

    public p(xi.i iVar, byte b2) {
        super(iVar);
        this.f13745c = o0.DEVICE_SHUTDOWN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, q qVar) {
        super(qVar);
        br.l.e(qVar, "dataSource");
        this.f13745c = sVar.getTriggerType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t0 t0Var, xi.i iVar) {
        super(iVar);
        br.l.e(t0Var, "wifiScanTriggerType");
        this.f13745c = t0Var.getTriggerType();
    }
}
