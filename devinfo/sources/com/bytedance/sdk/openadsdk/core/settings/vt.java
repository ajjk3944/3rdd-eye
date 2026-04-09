package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public int bly;

    /* renamed from: cd, reason: collision with root package name */
    public boolean f8452cd;

    /* renamed from: cf, reason: collision with root package name */
    public int f8453cf;
    public int ex;
    public int fkw;
    public JSONObject fvf;
    public int jae;

    /* renamed from: jg, reason: collision with root package name */
    public int f8454jg;
    public List<String> jqy;
    public int ko;
    public int ksc;

    /* renamed from: le, reason: collision with root package name */
    public int f8455le;

    /* renamed from: lh, reason: collision with root package name */
    public int f8456lh;
    public int mwh;

    /* renamed from: od, reason: collision with root package name */
    public boolean f8457od;
    public String ouw;

    /* renamed from: pd, reason: collision with root package name */
    public int f8458pd;
    public int pno;
    public int qbp;
    public int ra;
    public int rn;
    public int ryl;
    public int tc;

    /* renamed from: th, reason: collision with root package name */
    public int f8459th;
    public int tlj;
    public boolean uq;
    public int vm;
    public int vpp;
    public int vt;
    public int yu;
    public int zih;
    public boolean zin;

    public vt(JSONObject jSONObject) {
        this.vt = 1;
        this.f8456lh = 1;
        this.yu = 2;
        this.fkw = 1;
        this.f8455le = 100;
        this.ra = 0;
        this.pno = 2;
        this.bly = 1;
        this.tlj = 3;
        this.f8453cf = 30;
        this.ryl = 30;
        this.mwh = 1;
        this.f8454jg = 1;
        this.ko = 2;
        this.rn = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.zih = 2;
        this.vm = 3500;
        this.f8459th = 0;
        this.qbp = 5;
        this.zin = false;
        this.vpp = 0;
        this.ex = 2;
        this.tc = 0;
        this.ksc = 0;
        this.jae = 5;
        this.f8457od = true;
        this.f8452cd = false;
        this.uq = false;
        this.f8458pd = -1;
        new JSONObject();
        this.fvf = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.ouw = jSONObject.optString("code_id");
        this.vt = jSONObject.optInt("auto_play", 1);
        this.f8458pd = jSONObject.optInt("endcard_close_time", -1);
        this.f8456lh = jSONObject.optInt("voice_control", 1);
        this.yu = jSONObject.optInt("rv_preload", 2);
        this.fkw = jSONObject.optInt("nv_preload", 1);
        this.f8455le = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.ra = jSONObject.optInt("skip_time_displayed", 0);
        this.pno = jSONObject.optInt("video_skip_result", 2);
        this.bly = jSONObject.optInt("reg_creative_control", 1);
        this.tlj = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.f8453cf = iOptInt;
        if (iOptInt < 0) {
            this.f8453cf = 30;
        }
        this.mwh = jSONObject.optInt("voice_control", 2);
        this.f8454jg = jSONObject.optInt("if_show_win", 1);
        this.ko = jSONObject.optInt("sp_preload", 2);
        this.rn = jSONObject.optInt("stop_time", TTAdConstant.STYLE_SIZE_RADIO_3_2);
        this.zih = jSONObject.optInt("native_playable_delay", 2);
        this.vm = jSONObject.optInt("time_out_control", -1);
        this.f8459th = jSONObject.optInt("playable_reward_type", 0);
        this.vpp = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.qbp = iOptInt2;
        if (iOptInt2 < 0) {
            this.qbp = 5;
        }
        ouw(jSONObject.optJSONArray("parent_tpl_ids"));
        this.ex = jSONObject.optInt("slot_type", 2);
        this.zin = jSONObject.optBoolean("close_on_click", false);
        this.tc = jSONObject.optInt("allow_system_back", 0);
        this.ksc = jSONObject.optInt("splash_skip_time", 0);
        this.jae = jSONObject.optInt("splash_image_count_down_time", 5);
        this.f8452cd = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.uq = jSONObject.optBoolean("splash_close_on_click", false);
        this.f8457od = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!ouw(this.f8456lh)) {
            this.f8456lh = 1;
        }
        if (!ouw(this.mwh)) {
            this.mwh = 1;
        }
        this.ryl = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean ouw(int i4) {
        return i4 == 1 || i4 == 2;
    }

    private void ouw(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.jqy = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                this.jqy.add(jSONArray.get(i4).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public vt(String str) {
        this.vt = 1;
        this.f8456lh = 1;
        this.yu = 2;
        this.fkw = 1;
        this.f8455le = 100;
        this.ra = 0;
        this.pno = 2;
        this.bly = 1;
        this.tlj = 3;
        this.f8453cf = 30;
        this.ryl = 30;
        this.mwh = 1;
        this.f8454jg = 1;
        this.ko = 2;
        this.rn = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.zih = 2;
        this.vm = 3500;
        this.f8459th = 0;
        this.qbp = 5;
        this.zin = false;
        this.vpp = 0;
        this.ex = 2;
        this.tc = 0;
        this.ksc = 0;
        this.jae = 5;
        this.f8457od = true;
        this.f8452cd = false;
        this.uq = false;
        this.f8458pd = -1;
        this.fvf = new JSONObject();
        this.ouw = str;
        this.f8456lh = 1;
    }
}
