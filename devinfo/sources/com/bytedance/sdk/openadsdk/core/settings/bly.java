package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jae;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import z8.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends com.bytedance.sdk.component.pno.pno {

    /* renamed from: lh, reason: collision with root package name */
    private final Set<fkw> f8438lh;
    private final ouw ouw;
    private final pno vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(boolean z3);
    }

    public bly(ouw ouwVar, pno pnoVar, fkw... fkwVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.f8438lh = hashSet;
        this.ouw = ouwVar;
        this.vt = pnoVar;
        hashSet.addAll(Arrays.asList(fkwVarArr));
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iOuw = ksc.ouw(zih.ouw(), 0L);
        if (iOuw == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.ouw.ouw(false);
            return;
        }
        JSONObject jSONObjectOuw = ouw(iOuw);
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        try {
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(uoy.ouw("/api/ad/union/sdk/settings/", false, true)));
            yuVarOuw.vt("User-Agent", uoy.fkw());
        } catch (Exception unused) {
        }
        String string = com.bytedance.sdk.component.utils.ouw.ouw(jSONObjectOuw).toString();
        if (zih.yu().ex() && pd.ouw().yu() == 1) {
            uoy.ouw("Pangle_Debug_Mode", string, zih.ouw());
        }
        yuVarOuw.ouw(string, zih.yu().pno());
        yuVarOuw.ra = 6;
        yuVarOuw.f7626le = "setting";
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.1
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar.f8751lh = "settings_fetch";
                return ouwVar;
            }
        });
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                bly.this.ouw.ouw(false);
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f8751lh = "settings_fetch";
                        return ouwVar;
                    }
                });
                if (lhVar != null) {
                    zin.ouw(lhVar.fkw());
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("settings_fetch", lhVar.fkw(), -1, iOException != null ? iOException.getMessage() : null);
                }
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                JSONObject jSONObject;
                int iOptInt;
                int i4 = vtVar.ouw;
                String str = vtVar.yu;
                if (zih.yu().ex() && pd.ouw().yu() == 1) {
                    uoy.ouw("Pangle_Debug_Mode", str, zih.ouw());
                }
                if (vtVar.pno && !TextUtils.isEmpty(str)) {
                    String strVt = null;
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (iOptInt = jSONObject.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strVt = com.bytedance.sdk.component.utils.ouw.vt(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(strVt)) {
                                try {
                                    jSONObject = new JSONObject(strVt);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            bly.ouw(strVt, vtVar.f7625lh);
                        } catch (Throwable unused4) {
                        }
                        try {
                            bly.this.ouw(jSONObject);
                            zih.yu().pno.ouw().ouw("last_req_time", System.currentTimeMillis()).ouw();
                            com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2.1
                                @Override // com.bytedance.sdk.openadsdk.vm.yu
                                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                    ouwVar.f8751lh = "settings_fetch";
                                    return ouwVar;
                                }
                            });
                            zin.vt();
                        } catch (Throwable unused5) {
                        }
                        bly.this.ouw.ouw(true);
                        return;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.settings.bly.2.2
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f8751lh = "settings_fetch";
                            return ouwVar;
                        }
                    });
                    if (lhVar != null) {
                        zin.ouw(lhVar.fkw());
                    }
                }
                if (!vtVar.pno) {
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("settings_fetch", lhVar.fkw(), i4, vtVar.vt);
                }
                bly.this.ouw.ouw(false);
            }
        });
        com.bytedance.sdk.openadsdk.core.cf.vt(ryl.ouw(zih.ouw()));
        DeviceUtils.cf();
    }

    public static JSONObject ouw(int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            cf cfVarYu = zih.yu();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", uoy.ex());
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(jSONObject);
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.bly.ouw().tlj());
            jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.bly.ouw().ra);
            if (cfVarYu.zin("mcc")) {
                jSONObject.put("mcc", jae.vt());
            }
            Context contextOuw = zih.ouw();
            jSONObject.put("conn_type", uoy.ra(i4));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", ryl.vt());
            jSONObject.put("time_zone", uoy.jae());
            jSONObject.put("package_name", uoy.ra());
            jSONObject.put("position", uoy.ouw() ? 1 : 2);
            jSONObject.put("app_version", uoy.bly());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", ryl.lh(contextOuw));
            String strYu = com.bytedance.sdk.openadsdk.core.bly.ouw().yu();
            if (strYu != null) {
                jSONObject.put("app_id", strYu);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.fkw.ouw(strYu != null ? strYu.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", cf.vt(contextOuw));
            jSONObject.put("tcf_gdpr", cf.ouw(contextOuw));
            jSONObject.put("lmt", DeviceUtils.lh());
            jSONObject.put("locale_language", DeviceUtils.yu());
            jSONObject.put("channel", "main");
            JSONObject jSONObjectFkw = cfVarYu.fkw();
            if (jSONObjectFkw != null) {
                jSONObject.put("digest", jSONObjectFkw);
            }
            jSONObject.put("data_time", cfVarYu.pno.ouw("data_time", 0L));
            jSONObject.put("app_set_id_scope", yu.vt());
            jSONObject.put("app_set_id", yu.lh());
            jSONObject.put("installed_source", yu.yu());
            if (cfVarYu.zin("gaid")) {
                jSONObject.put("did", ryl.ouw(zih.ouw()));
            }
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            String strRa = com.bytedance.sdk.openadsdk.core.bly.ouw().ra();
            if (!TextUtils.isEmpty(strRa)) {
                jSONObject.put("mediation", strRa);
            }
            jSONObject.put("device", DeviceUtils.ouw(contextOuw, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.bly.ouw().vm());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final boolean ouw(JSONObject jSONObject) throws JSONException {
        this.vt.ouw(jSONObject);
        for (fkw fkwVar : this.f8438lh) {
            if (fkwVar != null) {
                fkwVar.ouw(jSONObject);
            }
        }
        return this.vt.f8447lh;
    }

    public static boolean ouw() {
        return BinderPoolService.ouw;
    }

    public static /* synthetic */ void ouw(String str, Map map) {
        int i4 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (str2 != null) {
                        map2.put(str2.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str3 = (String) map2.get("active-control");
                if (str3 != null) {
                    int i10 = Integer.parseInt(str3);
                    String str4 = (String) map2.get("ts");
                    if (str4 != null) {
                        long j = Long.parseLong(str4);
                        String str5 = (String) map2.get("pst");
                        String strA = a.a(str + i10 + j);
                        if (strA != null) {
                            if (strA.equalsIgnoreCase(str5)) {
                                i4 = i10;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        ra.ouw(i4);
    }
}
