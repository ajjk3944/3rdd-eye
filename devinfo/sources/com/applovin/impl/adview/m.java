package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f3703a;

    public m(JSONObject jSONObject) {
        this.f3703a = jSONObject;
    }

    public Integer a() {
        String string = JsonUtils.getString(this.f3703a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f3703a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f3703a, "geolocation_enabled", null);
    }

    public Boolean d() {
        return JsonUtils.getBoolean(this.f3703a, "allow_content_access", null);
    }

    public Boolean e() {
        return JsonUtils.getBoolean(this.f3703a, "allow_file_access", null);
    }

    public Boolean f() {
        return JsonUtils.getBoolean(this.f3703a, "allow_file_access_from_file_urls", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f3703a, "allow_universal_access_from_file_urls", null);
    }

    public Boolean h() {
        return JsonUtils.getBoolean(this.f3703a, "display_zoom_controls", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f3703a, "load_with_overview_mode", null);
    }

    public Boolean j() {
        return JsonUtils.getBoolean(this.f3703a, "need_initial_focus", null);
    }

    public Boolean k() {
        return JsonUtils.getBoolean(this.f3703a, "offscreen_pre_raster", null);
    }

    public Boolean l() {
        return JsonUtils.getBoolean(this.f3703a, "save_form_data", null);
    }

    public Boolean m() {
        return JsonUtils.getBoolean(this.f3703a, "algorithmic_darkening_allowed", null);
    }

    public Boolean n() {
        return JsonUtils.getBoolean(this.f3703a, "block_network_image", null);
    }

    public Boolean o() {
        return JsonUtils.getBoolean(this.f3703a, "loads_images_automatically", null);
    }

    public Boolean p() {
        return JsonUtils.getBoolean(this.f3703a, "use_built_in_zoom_controls", null);
    }

    public Boolean q() {
        return JsonUtils.getBoolean(this.f3703a, "use_wide_view_port", null);
    }
}
