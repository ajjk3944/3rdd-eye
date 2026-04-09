package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f15907a;

    /* renamed from: b, reason: collision with root package name */
    private String f15908b;

    /* renamed from: c, reason: collision with root package name */
    private String f15909c;

    /* renamed from: e, reason: collision with root package name */
    private BidListennning f15911e;

    /* renamed from: f, reason: collision with root package name */
    private BidResponsedEx f15912f;

    /* renamed from: g, reason: collision with root package name */
    private int f15913g;

    /* renamed from: i, reason: collision with root package name */
    private long f15915i;

    /* renamed from: j, reason: collision with root package name */
    private long f15916j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15917k;

    /* renamed from: l, reason: collision with root package name */
    private int f15918l;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15914h = false;

    /* renamed from: d, reason: collision with root package name */
    private Context f15910d = com.mbridge.msdk.foundation.controller.c.n().d();

    public b(String str, String str2, String str3) {
        this.f15907a = str;
        this.f15908b = str2;
        this.f15909c = str3;
    }

    public void b(boolean z10) {
        this.f15917k = z10;
    }

    public void b(int i10) {
        this.f15918l = i10;
    }

    public class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f15919b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f15914h = false;
            b.this.f15912f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f15910d, b.this.f15908b, bidResponsedEx.getBidId(), this.f15919b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f15914h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f15910d, b.this.f15908b, str, this.f15919b);
            b.this.a(str);
        }
    }

    public void b(long j10) {
        this.f15916j = j10;
    }

    public void a(int i10) {
        this.f15913g = i10;
    }

    public void a(long j10) {
        this.f15915i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f15914h) {
                this.f15914h = true;
                if (this.f15910d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f15910d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                eVar.a(MBridgeConstans.APP_ID, strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f15908b);
                if (TextUtils.isEmpty(this.f15907a)) {
                    this.f15907a = "";
                }
                eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.f15907a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f15909c);
                eVar.a(e.f15198h, v0.a(this.f15910d, this.f15908b));
                eVar.a(e.f15197g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f15908b, ""));
                String str = "1";
                eVar.a("req_type", this.f15917k ? "1" : "2");
                eVar.a(AdUnitActivity.EXTRA_ORIENTATION, m0.F(this.f15910d) + "");
                int i10 = this.f15913g;
                if (i10 == 296) {
                    if (this.f15915i > 0 && this.f15916j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f15916j + "x" + this.f15915i);
                        try {
                            int i11 = BannerUtils.f15853a;
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f15908b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f15908b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f15915i > 0 && this.f15916j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f15916j + "x" + this.f15915i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f15918l);
                        sb.append("");
                        eVar.a(AdUnitActivity.EXTRA_ORIENTATION, sb.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f15915i > 0 && this.f15916j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f15916j + "x" + this.f15915i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(v0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f15907a, this.f15908b, md5);
                aVar2.setUnitId(this.f15908b);
                aVar2.setPlacementId(this.f15907a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th) {
            a(th.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f15911e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f15911e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f15911e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
