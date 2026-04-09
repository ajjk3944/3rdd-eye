package com.mbridge.msdk.config.component.cal;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CalCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.cal.model.a f13098h;

    /* renamed from: i, reason: collision with root package name */
    private MBridgeIds f13099i;

    /* renamed from: j, reason: collision with root package name */
    private String f13100j;

    /* renamed from: k, reason: collision with root package name */
    private String f13101k;

    /* renamed from: l, reason: collision with root package name */
    private String f13102l;

    /* renamed from: m, reason: collision with root package name */
    private String f13103m;

    /* renamed from: n, reason: collision with root package name */
    private String f13104n;

    /* renamed from: o, reason: collision with root package name */
    private String f13105o;

    /* renamed from: p, reason: collision with root package name */
    private String f13106p;

    /* renamed from: q, reason: collision with root package name */
    private Object f13107q;

    private void a(boolean z10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(c.a("500"), z10 ? "1" : "2");
        if (!z10) {
            map.put(c.a("code"), str);
            map.put(c.a("reason"), str2);
        }
        a(a("910002", map));
    }

    private String h() {
        Map<String, Object> mapF = this.f13098h.f();
        this.f13100j = String.valueOf(mapF.get(c.a("107")));
        this.f13101k = String.valueOf(mapF.get(c.a("cbType")));
        this.f13102l = String.valueOf(mapF.get(c.a("110")));
        this.f13103m = String.valueOf(mapF.get(c.a("111")));
        this.f13104n = String.valueOf(mapF.get(c.a("106")));
        this.f13105o = String.valueOf(mapF.get(c.a("108")));
        this.f13106p = String.valueOf(mapF.get(c.a("109")));
        Object objB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.f13090d.b("adModel")).b("host");
        StringBuilder sb = new StringBuilder();
        if (objB instanceof String) {
            sb.append(objB);
            sb.append("/addReward?");
            sb.append("user_id=");
            sb.append(this.f13100j);
            sb.append("&cb_type=");
            sb.append(this.f13101k);
            sb.append("&reward_name=");
            sb.append(this.f13102l);
            sb.append("&reward_amount=");
            sb.append(this.f13103m);
            sb.append("&unit_id=");
            sb.append(this.f13104n);
            sb.append("&click_id=");
            sb.append(this.f13105o);
            sb.append("&extra=");
            sb.append(this.f13106p);
        }
        return sb.toString();
    }

    private void i() {
        Map<String, Object> mapF = this.f13098h.f();
        this.f13102l = String.valueOf(mapF.get(c.a("110")));
        this.f13103m = String.valueOf(mapF.get(c.a("111")));
        RewardInfo rewardInfo = new RewardInfo(mapF.get(c.a("112")).equals("1"), 1);
        rewardInfo.setRewardName(this.f13102l);
        rewardInfo.setRewardAmount(this.f13103m);
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.f13099i, rewardInfo);
        }
    }

    private void j() {
        if (this.f13107q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.a("buyer_id"), this.f13098h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.f13107q).a(map);
        }
    }

    private void k() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.f13099i);
        }
    }

    private void l() {
        if (this.f13107q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.a(MBridgeConstans.PROPERTIES_UNIT_ID), this.f13098h.g());
            map.put(c.a("ready_state"), Boolean.valueOf(this.f13098h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.f13107q).a(map);
        }
    }

    private void m() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.f13099i, this.f13098h.c() == null ? "" : this.f13098h.c());
        }
    }

    private void n() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.f13099i);
        }
    }

    private void o() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.f13099i);
        }
    }

    private void p() {
        if (this.f13107q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.a("init_status"), Integer.valueOf(this.f13098h.d()));
            map.put(c.a("reason"), this.f13098h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.f13107q).a(map);
        }
    }

    private void q() {
        String strH = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strH);
        map2.put("scheme", "HTTP");
        map2.put("method", "GET");
        map.put("componentConfig", map2);
        noriCpt.a(map, this.f13090d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.f13099i, this.f13098h.c() == null ? "" : this.f13098h.c());
        }
    }

    private void s() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.f13099i);
        }
    }

    private void t() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.f13099i);
        }
    }

    private void u() {
        Object obj = this.f13107q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.f13099i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "910001";
        this.f13098h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f13099i = mBridgeIds;
        mBridgeIds.setUnitId(this.f13098h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f13090d;
            if (aVar != null && aVar.a((Object) c.a("sdk_context"))) {
                Object objB = this.f13090d.b(c.a("sdk_context"));
                if (objB instanceof Map) {
                    this.f13107q = ((Map) objB).get(c.a("callback"));
                }
            }
            if (this.f13107q == null) {
                a(false, "", "Callback Listener is NULL");
            }
        } catch (Throwable th) {
            q0.b("CalCpt", th.getMessage(), th);
        }
        g();
    }

    public void g() {
        String strB = this.f13098h.b();
        if (strB == null) {
            a(false, "900001", "command is null");
            return;
        }
        try {
            if (c.a("loadV3Success").equals(strB)) {
                n();
            } else if (c.a("loadSuccess").equals(strB)) {
                o();
            } else if (c.a("loadFailed").equals(strB)) {
                m();
            } else if (c.a("301").equals(strB)) {
                s();
            } else if (c.a("302").equals(strB)) {
                r();
            } else if (c.a("304").equals(strB)) {
                k();
            } else if (c.a("305").equals(strB)) {
                t();
            } else if (c.a("306").equals(strB)) {
                i();
            } else if (c.a("303").equals(strB)) {
                u();
            } else if (c.a("308").equals(strB)) {
                q();
            } else if (c.a("300").equals(strB)) {
                l();
            } else if (c.a("sdkInit").equals(strB)) {
                p();
            } else if (c.a("309").equals(strB)) {
                j();
            }
        } catch (Exception e10) {
            q0.b("CalCpt", e10.getMessage(), e10);
            a(false, "900002", "callback type failed");
        }
        a(true, "", "");
    }
}
