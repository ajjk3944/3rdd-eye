package y8;

import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes3.dex */
public final class u extends t {

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f66506g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f66507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Zc.c internetLatencyService, ad.g dnsLatencyService) {
        super(internetLatencyService, dnsLatencyService);
        AbstractC6492s.i(internetLatencyService, "internetLatencyService");
        AbstractC6492s.i(dnsLatencyService, "dnsLatencyService");
        gg.i iVarK0 = gg.i.K0(new C6556a(null));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f66506g = iVarK0;
        gg.i iVarK02 = gg.i.K0(new C6556a(null));
        AbstractC6492s.h(iVarK02, "just(...)");
        this.f66507h = iVarK02;
    }

    @Override // y8.r
    public gg.i b() {
        return this.f66507h;
    }

    @Override // y8.r
    public gg.i d() {
        return this.f66506g;
    }
}
