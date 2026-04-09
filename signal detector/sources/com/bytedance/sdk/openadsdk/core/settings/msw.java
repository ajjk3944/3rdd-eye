package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.lt;
import com.bytedance.sdk.openadsdk.core.settings.bw;
import com.bytedance.sdk.openadsdk.core.settings.ru;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw extends ru {
    static final ArrayList<String> dg = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> bw;
    public boolean xq;

    public msw(ru.emc emcVar) {
        super("tt_sdk_settings_sr.prop", emcVar);
        this.bw = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.bw
    public void emc(JSONObject jSONObject) throws JSONException {
        int iOptInt;
        bw.emc emcVarEmc = emc();
        JSONObject jSONObjectUym = gbl.xq().uym();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.xq = (jSONObjectOptJSONObject == null || jSONObjectUym == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectUym.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            emcVarEmc.emc("digest", jSONObjectOptJSONObject.toString());
        } else {
            emcVarEmc.emc("digest");
        }
        emcVarEmc.emc("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * 60000;
            if (jOptLong < 0 || jOptLong > 86400000) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            emcVarEmc.emc("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            emcVarEmc.emc("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            emcVarEmc.emc("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                emcVarEmc.emc("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has("max")) {
                emcVarEmc.emc("max", jSONObjectOptJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            emcVarEmc.emc("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                emcVarEmc.emc("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                emcVarEmc.emc("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            gbl.xq().zz();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            emcVarEmc.emc("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            emcVarEmc.emc("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            emcVarEmc.emc("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            emcVarEmc.emc("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            emcVarEmc.emc("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            emcVarEmc.emc("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("privacy_url")) {
            emcVarEmc.emc("policy_url", jSONObject.optString("privacy_url"));
        }
        if (jSONObject.has("consent_url")) {
            emcVarEmc.emc("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            emcVarEmc.emc("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            emcVarEmc.emc("dc", jSONObject.optString("dc"));
        }
        gbl.xq().emc(jSONObject, emcVarEmc);
        gbl.xq().ypw(jSONObject, emcVarEmc);
        if (jSONObject.has("if_both_open")) {
            emcVarEmc.emc("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            emcVarEmc.emc("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            emcVarEmc.emc("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            emcVarEmc.emc("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            emcVarEmc.emc("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && dg.contains(strOptString)) {
                    emcVarEmc.emc("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                emcVarEmc.emc("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                emcVarEmc.emc("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                emcVarEmc.emc("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                emcVarEmc.emc("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                emcVarEmc.emc("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                emcVarEmc.emc("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.bw.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.bw.add(jSONArrayOptJSONArray.getString(i));
                        }
                    }
                    this.bw = emc(this.bw);
                    emcVarEmc.emc("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th) {
                    ul.xq("GeckoLog: settings json error ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            emcVarEmc.emc("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        xq.emc(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                emcVarEmc.emc("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                emcVarEmc.emc("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                emcVarEmc.emc("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                emcVarEmc.emc("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                emcVarEmc.emc("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString2 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (TextUtils.isEmpty(strOptString2)) {
                    emcVarEmc.emc("privacy_fields_allowed");
                } else {
                    emcVarEmc.emc("privacy_fields_allowed", strOptString2);
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", 1);
                if (iOptInt3 == 0 && lt.emc().dg() == 1 && com.bytedance.sdk.openadsdk.sra.emc.emc("app_register_alert_enable", false)) {
                    iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.msw.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(aa.emc(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                emcVarEmc.emc("privacy_app_reg", iOptInt3 != 0);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            emcVarEmc.emc("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            emcVarEmc.emc("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            emcVarEmc.emc("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            emcVarEmc.emc("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                emcVarEmc.emc("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                emcVarEmc.emc("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                emcVarEmc.emc("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                emcVarEmc.emc("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                emcVarEmc.emc("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                emcVarEmc.emc("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                emcVarEmc.emc("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                emcVarEmc.emc("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                emcVarEmc.emc("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            String str = gbl.emc;
            if (jSONObjectOptJSONObject7.has(str)) {
                emcVarEmc.emc(str, jSONObjectOptJSONObject7.optBoolean(str, false));
            }
            String str2 = gbl.ypw;
            if (jSONObjectOptJSONObject7.has(str2)) {
                emcVarEmc.emc(str2, jSONObjectOptJSONObject7.optInt(str2, 10000));
            }
            String str3 = gbl.xq;
            if (jSONObjectOptJSONObject7.has(str3)) {
                emcVarEmc.emc(str3, (float) jSONObjectOptJSONObject7.optDouble(str3, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_stats_rate")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            emcVarEmc.emc("perf_con_stats_rate", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            emcVarEmc.emc("perf_con_applog_send", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        emcVarEmc.emc("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        emcVarEmc.emc("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        emcVarEmc.emc("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        emcVarEmc.emc("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        emcVarEmc.emc("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        emcVarEmc.emc("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString5 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            emcVarEmc.emc("perf_con_thread_pool_config", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        emcVarEmc.emc("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        emcVarEmc.emc("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        emcVarEmc.emc("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        emcVarEmc.emc("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        emcVarEmc.emc("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        emcVarEmc.emc("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        emcVarEmc.emc("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        emcVarEmc.emc("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        emcVarEmc.emc("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_sync_gaid")) {
                        emcVarEmc.emc("perf_con_sync_gaid", jSONObjectOptJSONObject8.optInt("perf_con_sync_gaid"));
                    }
                }
            } catch (Throwable th2) {
                ul.xq("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e6) {
            ul.xq("SettingsDefaultRepository", "coreSettingJson", e6.getMessage());
        }
        emcVarEmc.emc("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            emcVarEmc.emc("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            emcVarEmc.emc("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString6 = jSONObject.optString("token_adx_ids", "");
            if (TextUtils.isEmpty(strOptString6)) {
                emcVarEmc.emc("token_adx_ids");
            } else {
                emcVarEmc.emc("token_adx_ids", strOptString6);
            }
        }
        emcVarEmc.emc();
        gbl.xq().mxo();
        dg();
    }

    public static Set<String> emc(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
