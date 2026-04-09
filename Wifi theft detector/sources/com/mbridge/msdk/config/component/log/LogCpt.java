package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;

/* loaded from: classes3.dex */
public class LogCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.log.model.a f13550h;

    /* renamed from: i, reason: collision with root package name */
    x f13551i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f13092f = "913001";
        com.mbridge.msdk.config.component.log.model.a aVar = new com.mbridge.msdk.config.component.log.model.a();
        this.f13550h = aVar;
        aVar.a(map);
        this.f13551i = new x.b().a(this.f13550h.k()).b(this.f13550h.d()).d(this.f13550h.g()).c(this.f13550h.b()).e(this.f13550h.a()).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.log.a
            @Override // com.mbridge.msdk.tracker.f
            public final boolean a(e eVar) {
                return LogCpt.a(eVar);
            }
        }).a(new n()).a(this.f13550h.f(), a(this.f13550h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.f13551i);
        if (this.f13550h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.f13550h.h());
        }
        if (this.f13550h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), this.f13550h.i(), this.f13550h.j()) : new p(new h(), this.f13550h.c(), 0);
    }
}
