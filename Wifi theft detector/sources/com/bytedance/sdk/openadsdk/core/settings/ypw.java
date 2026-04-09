package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {

    /* renamed from: aa, reason: collision with root package name */
    public int f9298aa;
    public int bw;
    public int cf;
    public JSONObject cuf;
    public int db;
    public int dg;
    public boolean dr;
    public int ee;
    public String emc;
    public int gbl;
    public int hxp;
    public int lt;
    public int msw;
    public int qh;
    public List<String> rie;
    public int ru;
    public int sb;
    public int sba;
    public boolean sf;
    public int sra;
    public int sup;
    public int sz;
    public int ul;
    public int uym;
    public int vk;
    public boolean xmt;
    public int xq;
    public int ycc;
    public boolean ylm;
    public int ypw;
    public int yzg;
    public int zz;

    public ypw(JSONObject jSONObject) {
        this.ypw = 1;
        this.xq = 1;
        this.dg = 2;
        this.bw = 1;
        this.ycc = 100;
        this.uym = 0;
        this.msw = 2;
        this.zz = 1;
        this.ru = 3;
        this.gbl = 30;
        this.sup = 30;
        this.sz = 1;
        this.qh = 1;
        this.cf = 2;
        this.vk = 1500;
        this.f9298aa = 2;
        this.sba = 3500;
        this.yzg = 0;
        this.ul = 5;
        this.ylm = false;
        this.sra = 0;
        this.hxp = 2;
        this.ee = 0;
        this.db = 0;
        this.sb = 5;
        this.sf = true;
        this.dr = false;
        this.xmt = false;
        this.lt = -1;
        new JSONObject();
        this.cuf = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.emc = jSONObject.optString("code_id");
        this.ypw = jSONObject.optInt("auto_play", 1);
        this.lt = jSONObject.optInt("endcard_close_time", -1);
        this.xq = jSONObject.optInt("voice_control", 1);
        this.dg = jSONObject.optInt("rv_preload", 2);
        this.bw = jSONObject.optInt("nv_preload", 1);
        this.ycc = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.uym = jSONObject.optInt("skip_time_displayed", 0);
        this.msw = jSONObject.optInt("video_skip_result", 2);
        this.zz = jSONObject.optInt("reg_creative_control", 1);
        this.ru = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.gbl = iOptInt;
        if (iOptInt < 0) {
            this.gbl = 30;
        }
        this.sz = jSONObject.optInt("voice_control", 2);
        this.qh = jSONObject.optInt("if_show_win", 1);
        this.cf = jSONObject.optInt("sp_preload", 2);
        this.vk = jSONObject.optInt("stop_time", 1500);
        this.f9298aa = jSONObject.optInt("native_playable_delay", 2);
        this.sba = jSONObject.optInt("time_out_control", -1);
        this.yzg = jSONObject.optInt("playable_reward_type", 0);
        this.sra = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.ul = iOptInt2;
        if (iOptInt2 < 0) {
            this.ul = 5;
        }
        emc(jSONObject.optJSONArray("parent_tpl_ids"));
        this.hxp = jSONObject.optInt("slot_type", 2);
        this.ylm = jSONObject.optBoolean("close_on_click", false);
        this.ee = jSONObject.optInt("allow_system_back", 0);
        this.db = jSONObject.optInt("splash_skip_time", 0);
        this.sb = jSONObject.optInt("splash_image_count_down_time", 5);
        this.dr = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.xmt = jSONObject.optBoolean("splash_close_on_click", false);
        this.sf = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!emc(this.xq)) {
            this.xq = 1;
        }
        if (!emc(this.sz)) {
            this.sz = 1;
        }
        this.sup = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean emc(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void emc(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.rie = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.rie.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public ypw(String str, int i10) {
        this.ypw = 1;
        this.xq = 1;
        this.dg = 2;
        this.bw = 1;
        this.ycc = 100;
        this.uym = 0;
        this.msw = 2;
        this.zz = 1;
        this.ru = 3;
        this.gbl = 30;
        this.sup = 30;
        this.sz = 1;
        this.qh = 1;
        this.cf = 2;
        this.vk = 1500;
        this.f9298aa = 2;
        this.sba = 3500;
        this.yzg = 0;
        this.ul = 5;
        this.ylm = false;
        this.sra = 0;
        this.hxp = 2;
        this.ee = 0;
        this.db = 0;
        this.sb = 5;
        this.sf = true;
        this.dr = false;
        this.xmt = false;
        this.lt = -1;
        this.cuf = new JSONObject();
        this.emc = str;
        this.xq = i10;
    }
}
