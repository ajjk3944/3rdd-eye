package td;

import Ka.f;
import Ka.h;
import dc.C5341a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e implements InterfaceC8082d {

    /* renamed from: a, reason: collision with root package name */
    private final La.c f62097a;

    public e(C5341a buildConfig) {
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f62097a = new La.c(buildConfig.b(), buildConfig.d());
    }

    @Override // td.InterfaceC8082d
    public f.a a() {
        return Ka.f.f10554a.a(null, this.f62097a);
    }

    @Override // td.InterfaceC8082d
    public Ia.a b(String str) {
        return Ia.a.f8969a.a(str, this.f62097a, com.ubnt.usurvey.a.f39654r.a().getConfig().l());
    }

    @Override // td.InterfaceC8082d
    public h.a c() {
        return Ka.h.f10579a.a();
    }

    @Override // td.InterfaceC8082d
    public f.a d(String str) {
        return Ka.f.f10554a.a(str, this.f62097a);
    }
}
