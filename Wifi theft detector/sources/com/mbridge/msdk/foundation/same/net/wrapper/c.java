package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.k;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.n().d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb.append("&");
                        sb.append(str);
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(TAG, e10.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) ? v0.b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A") : sb.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.h<?> createRequest(int i10, int i11, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (i10 == 0) {
            return new k(i11, str, str2, j10, new i(bVar));
        }
        if (i10 != 1) {
            return null;
        }
        return new com.mbridge.msdk.tracker.network.i(i11, str, str2, j10, new i(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: Exception -> 0x00f1, TRY_ENTER, TryCatch #3 {Exception -> 0x00f1, blocks: (B:36:0x00c4, B:38:0x00ca, B:42:0x00d5, B:48:0x00f9, B:50:0x0117), top: B:93:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.mbridge.msdk.tracker.network.h, com.mbridge.msdk.tracker.network.t] */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.mbridge.msdk.tracker.network.u] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01ca -> B:92:0x0223). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x020a -> B:92:0x0223). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void post(int r11, java.lang.String r12, com.mbridge.msdk.foundation.same.net.wrapper.e r13, com.mbridge.msdk.foundation.same.net.b r14, boolean r15, boolean r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.wrapper.c.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.wrapper.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar == null) {
            q0.b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String strA = Aa.a();
        if (strA == null) {
            strA = "";
        }
        eVar.a("channel", strA);
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a(MRAIDPresenter.OPEN, com.mbridge.msdk.foundation.same.a.S);
        if (com.mbridge.msdk.util.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String strB = Aa.b();
            if (!TextUtils.isEmpty(strB)) {
                eVar.a("keyword", strB);
            }
        }
        String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
            if (lVarE != null && !TextUtils.isEmpty(lVarE.a())) {
                eVar.a("u_stid", lVarE.a());
            }
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
    }

    public boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i10, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j10) {
        e eVar2;
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        int iT0 = TextUtils.isEmpty(str) ? gVarB.t0() : gVarB.C();
        String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iT0);
        if (iT0 < 2) {
            postV5(i10, strA, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
            return;
        }
        if (iT0 % 2 == 0) {
            if (eVar == null) {
                eVar = new e();
            }
            eVar2 = eVar;
            JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (jSONArrayB != null) {
                String string = jSONArrayB.toString();
                int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                if (i11 > 0 && string.length() > i11) {
                    post(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                    return;
                }
                eVar2.a(e.f15201k, string);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
    }

    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        get(i10, str, eVar, bVar, false, false, str2, j10);
    }

    public void getCampaign(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j10) {
        e eVar2;
        try {
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
            int iT0 = TextUtils.isEmpty(str) ? gVarB.t0() : gVarB.C();
            String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iT0);
            if (iT0 < 2) {
                postV5(i10, strA, eVar, bVar, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                return;
            }
            if (iT0 % 2 == 0) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar2 = eVar;
                JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (jSONArrayB != null) {
                    String string = jSONArrayB.toString();
                    int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                    if (i11 > 0 && string.length() > i11) {
                        post(i10, strA, eVar2, bVar, true, false, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                        return;
                    }
                    eVar2.a(e.f15201k, string);
                }
            } else {
                eVar2 = eVar;
            }
            get(i10, strA, eVar2, bVar, true, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        getLoadOrSetting(i10, str, eVar, bVar, true, str2, j10);
    }

    public void postFocusReport(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, true, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(int r15, java.lang.String r16, com.mbridge.msdk.foundation.same.net.wrapper.e r17, com.mbridge.msdk.foundation.same.net.b r18, boolean r19, boolean r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.wrapper.c.get(int, java.lang.String, com.mbridge.msdk.foundation.same.net.wrapper.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        get(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void get(int i10, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String strAsUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(strAsUrlParams)) {
            str = str + "?" + strAsUrlParams;
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "get wx scheme url = " + str3);
        }
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest = createRequest(i10, 0, str3, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            hVarCreateRequest.a("local_id", str4);
            String str5 = map.get("ad_type");
            hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            hVarCreateRequest.a(map);
            hVarCreateRequest.d(canTrack());
            com.mbridge.msdk.tracker.network.l.a().b().a(hVarCreateRequest);
        }
    }

    public void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }
}
