package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    m f13211a;

    /* renamed from: b, reason: collision with root package name */
    x f13212b;

    /* renamed from: c, reason: collision with root package name */
    JSONObject f13213c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f13214a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private m c() {
        try {
            m mVar = this.f13211a;
            if (mVar == null) {
                m mVarB = m.b("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), b());
                this.f13211a = mVarB;
                if (mVarB != null) {
                    JSONObject jSONObject = this.f13213c;
                    if (jSONObject != null) {
                        mVarB.a(jSONObject);
                    }
                    this.f13211a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f13213c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f13211a;
    }

    public void d() {
        if (this.f13211a == null) {
            this.f13211a = c();
        }
        this.f13211a.a();
    }

    private a() {
    }

    public static a a() {
        return b.f13214a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f13213c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.a("key")));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th) {
                q0.b("ComponentMetrics", th.getMessage(), th);
            }
        }
    }

    private x b() {
        if (this.f13212b == null) {
            this.f13212b = new x.b().a(604800000).b(50).d(50).c(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.c
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    return a.a(eVar);
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f15165d, 0)).a();
        }
        return this.f13212b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f13212b = xVar;
            m mVar = this.f13211a;
            if (mVar != null) {
                mVar.a("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), xVar);
            }
        }
    }
}
