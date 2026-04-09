package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.sup;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.bw;
import com.bytedance.sdk.openadsdk.core.settings.ru;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.dg.emc.gbl;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.pgl.ssdk.ces.out.PglSSConfig;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl implements zz.emc {
    public static String bw;
    public static String dg;
    public static final String emc;
    private static final com.bytedance.sdk.component.msw.msw gbl;
    private static String sb;
    private static boolean sup;
    private static final ConcurrentLinkedQueue<ru.emc> ul;
    public static final String xq;
    static final ConcurrentHashMap<String, Integer> ycc;
    public static final String ypw;
    private static final String zz;
    private int aa;
    private final AtomicBoolean cf;
    private bw.ypw<JSONObject> db;
    private final bw.ypw<Set<String>> ee;
    private final Set<String> hxp;
    bw.ypw<com.bytedance.sdk.openadsdk.dg.emc.gbl> msw;
    private final msw qh;
    private final bw.ypw<Map<String, Integer>> rie;
    private Set<String> ru;
    private int sba;
    private final Runnable sra;
    private final com.bytedance.sdk.openadsdk.core.settings.emc sz;
    final bw.ypw<ConcurrentHashMap<String, Integer>> uym;
    private volatile boolean vk;
    private final BroadcastReceiver ylm;
    private boolean yzg;

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.gbl$9, reason: invalid class name */
    public class AnonymousClass9 extends BroadcastReceiver {
        private final Runnable ypw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.9.1
            @Override // java.lang.Runnable
            public void run() {
                iyl.ypw(new com.bytedance.sdk.component.msw.msw("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.9.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            gbl.this.dg();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass9() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            iyl.ypw(new com.bytedance.sdk.component.msw.msw("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.9.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        gbl.this.emc(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.zz.emc().removeCallbacks(AnonymousClass9.this.ypw);
                        com.bytedance.sdk.component.utils.zz.emc().postDelayed(AnonymousClass9.this.ypw, 10000L);
                    }
                }
            });
        }
    }

    public static final class emc {
        static final gbl emc = new gbl();
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", tp.dr()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) "_");
        sb2.append(charSequenceArr[1]);
        emc = sb2.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", tp.dr(), tp.sf(), "timeout"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i = 1; i < 4; i++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[i]);
        }
        ypw = sb3.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", tp.dr(), tp.sf(), "alpha"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        for (int i3 = 1; i3 < 4; i3++) {
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr3[i3]);
        }
        xq = sb4.toString();
        zz = tp.sra();
        gbl = new com.bytedance.sdk.component.msw.msw("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.emc.ypw.bw.ypw().zz();
                com.bytedance.sdk.component.adexpress.emc.ypw.bw.ypw().ypw(false);
                com.bytedance.sdk.component.adexpress.emc.ypw.ypw.ypw();
                com.bytedance.sdk.component.adexpress.emc.ypw.bw.ypw().xq();
            }
        };
        dg = "";
        bw = "IABTCF_TCString";
        sup = false;
        ul = new ConcurrentLinkedQueue<>();
        ycc = new ConcurrentHashMap<>();
    }

    private static SharedPreferences dg(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private String etw() {
        return this.qh.emc("force_language", "");
    }

    public static boolean kkn() {
        return sup;
    }

    private Set<String> kv() {
        return (Set) this.qh.emc("perf_con_applog_send", this.hxp, this.ee);
    }

    public static gbl xq() {
        return emc.emc;
    }

    public static String zhk() {
        if (sb == null) {
            String strYpw = com.bytedance.sdk.openadsdk.core.xq.emc().ypw("settings_host_from_meta", "");
            sb = strYpw;
            if (strYpw == null) {
                sb = "";
            }
        }
        return sb;
    }

    public boolean aa() {
        return this.qh.emc("allow_blind_mode_request_ad", false);
    }

    public int but() {
        int iEmc = this.qh.emc("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iEmc != Integer.MAX_VALUE) {
            return iEmc;
        }
        int iHxp = tp.hxp();
        if (iHxp == 1 || iHxp == 2) {
            return 2;
        }
        return iHxp != 3 ? 0 : 1;
    }

    public void bv() {
        if (zz.emc()) {
            qh.ypw().removeCallbacks(this.sra);
            qh.ypw().postDelayed(this.sra, pe());
        }
    }

    public String bw() {
        return this.qh.emc("aes_key", "");
    }

    public int cf() {
        kv();
        return this.sba;
    }

    public boolean cn() {
        return this.qh.emc("global_rate", 1.0f) == 1.0f;
    }

    public int cuf() {
        return this.qh.emc("max", 50);
    }

    public int db() {
        return this.qh.emc(ypw, 10000);
    }

    public boolean dpk() {
        return this.qh.emc("bus_con_video_keep_screen_on", 1) == 1;
    }

    public String dr() {
        return this.qh.emc("ab_test_param", "");
    }

    public boolean ee() {
        return this.qh.emc(emc, false);
    }

    public boolean ej() {
        return this.qh.emc("perf_con_is_new_net_thread", 0) == 1;
    }

    public boolean ffd() {
        return this.qh.emc("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public boolean fu() {
        return this.qh.emc("read_video_from_cache", 1) == 1;
    }

    public String gbl() {
        return this.qh.emc("ab_test_version", "");
    }

    public Set<String> ge() {
        return (Set) this.qh.emc("privacy_fields_allowed", Collections.EMPTY_SET, bw.ypw);
    }

    public void hh() {
        bw.emc emcVarEmc = this.qh.emc();
        emcVarEmc.emc("settings_url", "");
        emcVarEmc.emc();
        dr("");
    }

    public boolean hj() {
        return this.qh.emc("privacy_app_reg", true);
    }

    public int hoq() {
        return this.qh.emc("perf_con_sync_gaid", 0);
    }

    public boolean hxp() {
        return this.qh.emc("bus_con_url_check", 1) != 0;
    }

    public int ipv() {
        return this.qh.emc("perf_con_thread_stack_size", 0);
    }

    public int iyl() {
        int iEmc = this.qh.emc("fetch_tpl_second", 0);
        if (iEmc <= 0) {
            return 0;
        }
        return iEmc;
    }

    public String[] jp() {
        Set<String> set;
        try {
            set = this.ru;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.qh.emc("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.ru.add(jSONArray.getString(i));
                }
            }
            Set<String> setEmc = msw.emc(this.ru);
            this.ru = setEmc;
            if (setEmc != null) {
                if (setEmc.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.ru.toArray(new String[0]);
    }

    public long jxk() {
        return this.qh.emc("perf_con_adlog_expire_time", 0L);
    }

    public long lt() {
        return this.qh.emc("duration", 10000L);
    }

    public int ltx() {
        return this.qh.emc("blank_detect_rate", 30);
    }

    public int mkp() {
        int iEmc = this.qh.emc("fetch_tpl_timeout_ctrl", 3000);
        if (iEmc <= 0) {
            return 3000;
        }
        return iEmc;
    }

    public long msw() {
        return this.qh.emc("data_time", 0L);
    }

    public void mxo() {
        String strEtw = etw();
        if (TextUtils.isEmpty(strEtw)) {
            return;
        }
        if (strEtw.equals("zh-Hant")) {
            sup.emc(aa.emc(), "zh", "tw");
        } else {
            sup.emc(aa.emc(), strEtw, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            ul.xq("TTAD.SdkSettings", th.getMessage());
        }
    }

    public boolean ndl() {
        return this.qh.emc("privacy_debug_unlock", 1) != 0;
    }

    public int nw() {
        int iEmc = this.qh.emc("perf_con_webview_cache_count", 0);
        if (iEmc < 0) {
            return 0;
        }
        return iEmc;
    }

    public String nx() {
        return this.qh.emc("target_region", "");
    }

    public boolean oa() {
        return this.qh.emc("token_enable", 0) == 1;
    }

    public long pe() {
        long jEmc = this.qh.emc("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jEmc < 0 || jEmc > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : jEmc;
    }

    public boolean pm() {
        if (com.bytedance.sdk.component.adexpress.dg.ypw.emc(aa.emc())) {
            return this.qh.emc("support_rtl", false);
        }
        return false;
    }

    public String pxa() {
        return this.qh.emc("dc", "TX");
    }

    public int pxj() {
        int iEmc = this.qh.emc("bus_con_auto_click_delay", 3000);
        if (iEmc <= 0) {
            return 3000;
        }
        return iEmc;
    }

    public Set<String> qh() {
        return kv();
    }

    public Set<String> qhy() {
        return (Set) this.qh.emc("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, bw.ypw);
    }

    public String ra() {
        return this.qh.emc("settings_url", "");
    }

    public boolean rgy() {
        int iEmc = this.sz.emc("perf_con_apm", 100);
        if (iEmc == 0) {
            return false;
        }
        return iEmc < 0 || iEmc >= 100 || iEmc > ((int) (Math.random() * 100.0d));
    }

    public String rie() {
        return this.qh.emc("bus_con_check_clz", "");
    }

    public JSONObject rig() {
        return (JSONObject) this.qh.emc("video_cache_config", null, bw.emc);
    }

    public int rqm() {
        return this.qh.emc("vbtt", 5);
    }

    public ycc rtt() {
        return (ycc) this.qh.emc("insert_js_config", ycc.emc, new bw.ypw<ycc>() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public ycc ypw(String str) {
                return new ycc(str);
            }
        });
    }

    public boolean ru() {
        return this.qh.emc("if_both_open", 0) == 1;
    }

    public float sb() {
        return this.qh.emc(xq, 1.0f);
    }

    public boolean sba() {
        return this.qh.emc("support_gzip", false);
    }

    public boolean se() {
        return this.qh.emc("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public int sf() {
        return this.qh.emc("loadedCallbackOpportunity", 0);
    }

    public int sra() {
        return this.qh.emc("bus_con_behavior_count", 300);
    }

    public int sup() {
        return this.qh.emc("splash_video_load_strategy", 0);
    }

    public int sz() {
        return this.qh.emc("perf_con_drawable_code", 0);
    }

    public boolean tp() {
        return this.qh.ypw();
    }

    public boolean ul() {
        return this.qh.emc("bus_con_adshow_check_enable", true);
    }

    public JSONObject uym() {
        return (JSONObject) this.qh.emc("digest", null, bw.emc);
    }

    public int vaf() {
        return this.qh.emc("perf_con_close_button_delay_check_time", -1);
    }

    public String vhn() {
        return this.qh.emc("dual_event_url", (String) null);
    }

    public int vk() {
        kv();
        return this.aa;
    }

    public boolean vum() {
        return this.qh.emc("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public String vw() {
        return this.qh.emc("ads_url", "");
    }

    public int wa() {
        return this.qh.emc("isGdprUser", -1);
    }

    public boolean wad() {
        int iEmc = this.qh.emc("privacy_ad_enable", Integer.MAX_VALUE);
        if (iEmc == 1) {
            return true;
        }
        if (iEmc == 0) {
            return false;
        }
        int iHxp = tp.hxp();
        return iHxp == 1 || iHxp == 2 || iHxp == 3;
    }

    public int wbn() {
        int iEmc = this.qh.emc("perf_con_webview_cache_count_v3", 0);
        if (iEmc < 0) {
            return 0;
        }
        return iEmc;
    }

    public boolean wd() {
        return this.qh.emc("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public String wo() {
        return this.qh.emc("app_log_url", "");
    }

    public String wpn() {
        return this.qh.emc("dyn_draw_engine_url", zz);
    }

    public boolean xhi() {
        return this.vk;
    }

    public boolean xmt() {
        return this.qh.emc("landingpage_new_style", -1) == 1;
    }

    public String xxg() {
        return this.qh.emc("policy_url", "");
    }

    public com.bytedance.sdk.openadsdk.dg.emc.gbl xxs() {
        return (com.bytedance.sdk.openadsdk.dg.emc.gbl) this.qh.emc("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.dg.emc.gbl.emc, this.msw);
    }

    public int ycc() {
        return this.qh.emc("max_tpl_cnts", 100);
    }

    public long yid() {
        return this.qh.emc("last_req_time", 0L);
    }

    public String ylm() {
        return this.qh.emc("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public JSONObject yuz() {
        return (JSONObject) this.qh.emc("perf_con_thread_pool_config", new JSONObject(), this.db);
    }

    public int yz() {
        return this.qh.emc("ivrv_downward", 0);
    }

    public boolean yzg() {
        return this.qh.emc("ad_revenue_enable", true);
    }

    public void zz() {
        this.qh.emc().emc("tt_sdk_settings").emc("ab_test_param").emc();
    }

    private gbl() {
        this.ru = Collections.synchronizedSet(new HashSet());
        this.sz = new com.bytedance.sdk.openadsdk.core.settings.emc();
        this.qh = new msw(new ru.emc() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.ru.emc
            public void emc() {
                ru.emc[] emcVarArr;
                boolean unused = gbl.sup = true;
                if (gbl.ul == null || gbl.ul.size() == 0 || (emcVarArr = (ru.emc[]) gbl.ul.toArray()) == null) {
                    return;
                }
                for (ru.emc emcVar : emcVarArr) {
                    emcVar.emc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ru.emc
            public void ypw() {
                if (gbl.ul == null || gbl.ul.isEmpty()) {
                    return;
                }
                Iterator it = gbl.ul.iterator();
                while (it.hasNext()) {
                    ((ru.emc) it.next()).ypw();
                }
            }
        });
        this.cf = new AtomicBoolean(false);
        this.vk = false;
        this.aa = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
        this.sba = 10;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        this.ylm = anonymousClass9;
        this.sra = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.10
            @Override // java.lang.Runnable
            public void run() {
                gbl.this.dg(2);
                gbl.this.bv();
            }
        };
        this.uym = new bw.ypw<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.11
            @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> ypw(String str) {
                if (TextUtils.isEmpty(str)) {
                    return gbl.ycc;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                    return concurrentHashMap;
                } catch (JSONException e6) {
                    Log.i("TTAD.SdkSettings", e6.getMessage());
                    return concurrentHashMap;
                }
            }
        };
        this.rie = new bw.ypw<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.12
            @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> ypw(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e6) {
                    ul.xq("get applog rate from sp failed:" + e6.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.hxp = new HashSet();
        this.ee = new bw.ypw<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public Set<String> ypw(String str) throws JSONException {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            gbl.this.sba = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            gbl.this.aa = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e6) {
                        Log.i("TTAD.SdkSettings", e6.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.db = new bw.ypw<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public JSONObject ypw(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    ul.xq("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.msw = new bw.ypw<com.bytedance.sdk.openadsdk.dg.emc.gbl>() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.bw.ypw
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.dg.emc.gbl ypw(String str) {
                com.bytedance.sdk.openadsdk.dg.emc.gbl gblVar = new com.bytedance.sdk.openadsdk.dg.emc.gbl();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    gblVar.emc(jSONObject.optInt("enable_strategy", 0) == 1);
                    gblVar.emc(emc(jSONObject.optJSONObject("default")));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            gblVar.emc(next, emc(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return gblVar;
            }

            private gbl.emc emc(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new gbl.emc(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context contextEmc = aa.emc();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextEmc.registerReceiver(anonymousClass9, intentFilter, 4);
            } else {
                contextEmc.registerReceiver(anonymousClass9, intentFilter);
            }
        } catch (Exception e6) {
            ul.emc("TTAD.SdkSettings", "", e6);
        }
    }

    public static void dr(String str) {
        if (str == null) {
            str = "";
        }
        String strZhk = zhk();
        if (strZhk == null || !strZhk.equals(str)) {
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("settings_host_from_meta", str);
            sb = str;
            xq().emc(8, true);
        }
    }

    public boolean aa(String str) {
        return str == null || DeviceUtils.ru(aa.emc()) == 0 || db(str).sz == 1;
    }

    public boolean bw(String str) {
        int i = db(str).bw;
        return i != 1 ? i == 2 && sba.xq(aa.emc()) != 0 : sba.dg(aa.emc());
    }

    public ypw db(String str) {
        return xq.emc(str);
    }

    public synchronized void dg() {
        SystemClock.elapsedRealtime();
        boolean z6 = this.vk;
        this.sz.emc(this.vk);
        this.qh.emc(this.vk);
        xq.emc(!z6);
        this.vk = true;
        SystemClock.elapsedRealtime();
        if (!z6) {
            qh.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!zz.emc()) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().ypw();
                    } else {
                        gbl.this.dg(1);
                        gbl.this.bv();
                    }
                }
            }, 1000L);
        }
    }

    public boolean ee(String str) {
        return aa.dg().db(str).cf == 1;
    }

    public int gbl(String str) {
        return db(str).sup;
    }

    public boolean hxp(String str) {
        return db(str).xmt;
    }

    public boolean msw(String str) {
        return str == null || db(str).qh == 1;
    }

    public boolean qh(String str) {
        return sz(str) != 1;
    }

    public int rie(String str) {
        return db(str).sb;
    }

    public int ru(String str) {
        return db(str).gbl;
    }

    public boolean sb(String str) {
        Set set = (Set) this.qh.emc("privacy_fields_allowed", Collections.EMPTY_SET, bw.ypw);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iHxp = tp.hxp();
        if (iHxp != 1) {
            if (iHxp != 2 && iHxp != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public JSONObject sba(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.qh.emc("core_settings", ""));
        } catch (JSONException e6) {
            e = e6;
        }
        try {
            jSONObject.put("ad_slot_setting", db(str).cuf);
            return jSONObject;
        } catch (JSONException e7) {
            e = e7;
            jSONObject2 = jSONObject;
            ul.xq("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
            return jSONObject2;
        }
    }

    public boolean sf(String str) {
        Set set;
        if (TextUtils.isEmpty(str) || (set = (Set) this.qh.emc("token_adx_ids", Collections.EMPTY_SET, bw.ypw)) == null || set.size() == 0) {
            return false;
        }
        return set.contains(str);
    }

    public int sra(String str) {
        return db(str).db;
    }

    public boolean sup(String str) {
        try {
            return db(str).rie != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public int sz(String str) {
        return db(String.valueOf(str)).msw;
    }

    public boolean ul(String str) {
        return db(str).ylm;
    }

    public int uym(String str) {
        return db(str).sba;
    }

    public boolean xq(String str) {
        return db(str).xq == 1;
    }

    public boolean ycc(String str) {
        return db(str).uym == 1;
    }

    public int ylm(String str) {
        return db(str).ee;
    }

    public int yzg(String str) {
        return db(str).ul;
    }

    public int zz(String str) {
        return str == null ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : db(str).vk;
    }

    private static void ypw(int i, boolean z6) {
        Context contextEmc = aa.emc();
        if (contextEmc != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextEmc.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z6);
                intent.putExtra("_source", i);
                contextEmc.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public int cf(String str) {
        return db(str).ru;
    }

    public void emc() {
        File file;
        try {
            xq.emc();
            this.qh.xq();
            this.sz.xq();
            Context contextEmc = aa.emc();
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                file = new File(contextEmc.getDataDir(), "shared_prefs");
            } else {
                file = new File(contextEmc.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs");
            }
            File file2 = new File(file, "tt_sdk_settings.xml");
            if (file2.exists() && file2.isFile()) {
                String strReplace = file2.getName().replace(".xml", "");
                if (i >= 24) {
                    contextEmc.deleteSharedPreferences(strReplace);
                } else {
                    contextEmc.getSharedPreferences(strReplace, 0).edit().clear().apply();
                    com.bytedance.sdk.component.utils.uym.xq(file2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean vk(String str) {
        return db(str).sra == 0;
    }

    public int xq(int i) {
        return db(String.valueOf(i)).zz;
    }

    public void xq(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.ylm, intentFilter, 4);
            } else {
                context.registerReceiver(this.ylm, intentFilter);
            }
        } catch (Exception e6) {
            ul.emc("TTAD.SdkSettings", "", e6);
        }
        if (xhi()) {
            dg(1);
            bv();
        }
    }

    public static void ypw() {
        Context contextEmc;
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq() && (contextEmc = aa.emc()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextEmc.getPackageName());
                intent.setAction("_dataChanged");
                contextEmc.sendBroadcast(intent);
            } catch (Throwable th) {
                ul.emc("TTAD.SdkSettings", "", th);
            }
        }
    }

    public boolean dg(String str) {
        return db(str).sf;
    }

    public void dg(@TTSdkSettings.FETCH_REQUEST_SOURCE int i) {
        emc(i, false);
    }

    public static String ypw(Context context) {
        SharedPreferences sharedPreferencesDg;
        return (context == null || (sharedPreferencesDg = dg(context)) == null) ? "" : sharedPreferencesDg.getString(bw, "");
    }

    public static int emc(Context context) {
        SharedPreferences sharedPreferencesDg;
        if (context == null || (sharedPreferencesDg = dg(context)) == null) {
            return -2;
        }
        int i = sharedPreferencesDg.getInt("IABTCF_CmpSdkID", LinearLayoutManager.INVALID_OFFSET);
        int i3 = sharedPreferencesDg.getInt("IABTCF_CmpSdkVersion", LinearLayoutManager.INVALID_OFFSET);
        if (i == Integer.MIN_VALUE && i3 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesDg.getInt("IABTCF_gdprApplies", -1);
    }

    public void ypw(JSONObject jSONObject, bw.emc emcVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            emcVar.emc("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    public void emc(JSONObject jSONObject, bw.emc emcVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        msw mswVar = this.qh;
        String str = zz;
        String strEmc = mswVar.emc("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strEmc) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strEmc)) {
            qh.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.gbl.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(gbl.this.qh.emc("dyn_draw_engine_url", gbl.zz), strOptString)) {
                        com.bytedance.sdk.component.adexpress.emc.ypw.bw.ypw().xq();
                    }
                }
            }, 5000L);
        }
        emcVar.emc("dyn_draw_engine_url", strOptString);
    }

    public int ypw(String str) {
        Integer num;
        Map map = (Map) this.qh.emc("perf_con_applog_rate", null, this.rie);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int ypw(int i) {
        return db(String.valueOf(i)).ypw;
    }

    public int emc(String str) {
        if (str == null) {
            return 0;
        }
        return aa.dg().db(str).yzg;
    }

    public int emc(String str, int i) {
        Integer num;
        Map map = (Map) this.qh.emc("perf_con_stats_rate", ycc, this.uym);
        return (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) ? i : num.intValue();
    }

    public int emc(int i) {
        return db(String.valueOf(i)).lt;
    }

    public void emc(long j6) {
        this.qh.emc().emc("last_req_time", j6).emc();
    }

    public void emc(@TTSdkSettings.FETCH_REQUEST_SOURCE int i, boolean z6) {
        if (!qh.bw() && i != 1 && i != 2) {
            if (z6) {
                this.yzg = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.zz.ypw().dg())) {
                return;
            }
            if (this.yzg) {
                this.yzg = false;
                if (!z6) {
                    z6 = true;
                }
            }
            long jYid = yid();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jPe = pe();
            long j6 = jCurrentTimeMillis - jYid;
            if (z6 || j6 >= jPe) {
                if (!zz.emc()) {
                    ypw(i, z6);
                } else if (this.cf.compareAndSet(false, true)) {
                    iyl.ypw((com.bytedance.sdk.component.msw.msw) new zz(this, this.qh, this.sz));
                    qh.ypw().removeCallbacks(this.sra);
                }
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.zz.emc
    public void emc(boolean z6) {
        this.cf.set(false);
        bv();
        if (z6) {
            HashMap map = new HashMap();
            Set<String> setGe = ge();
            if (setGe != null && !setGe.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setGe);
            }
            String strSba = tp.sba();
            if (!TextUtils.isEmpty(strSba)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strSba);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, nx());
            com.bytedance.sdk.openadsdk.core.ru.ypw.ypw().emc(map);
            ypw();
        }
    }

    public static void emc(ru.emc emcVar) {
        ConcurrentLinkedQueue<ru.emc> concurrentLinkedQueue = ul;
        if (concurrentLinkedQueue.contains(emcVar)) {
            return;
        }
        concurrentLinkedQueue.add(emcVar);
    }
}
