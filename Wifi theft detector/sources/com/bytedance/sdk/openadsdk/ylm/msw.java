package com.bytedance.sdk.openadsdk.ylm;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {

    /* renamed from: aa, reason: collision with root package name */
    private boolean f9320aa;
    private boolean av;
    private int but;

    @Nullable
    private WebView bv;
    public final String bw;
    private ypw cf;
    private int cn;
    private long cuf;
    private boolean cwv;
    private long db;
    public final String dg;
    private String dm;
    private int dor;
    private String dpk;
    private long dr;
    private String ee;
    private int ej;
    public final String emc;
    private int etw;
    private List<JSONObject> ff;
    private String ffd;
    private int fu;
    private boolean fxt;
    private Runnable gbl;
    private float ge;
    private int gyw;
    private JSONObject hh;
    private int hj;
    private String hoq;
    private int hs;
    private boolean hxp;
    private int iat;
    private int igv;
    private ycc ipv;
    private long iyl;
    private JSONObject jp;
    private xq jxk;
    private String kkn;
    private boolean knr;
    private int kv;
    private long lt;
    private int ltx;
    private long mkp;
    private final Handler msw;
    private long mxo;
    private boolean ndl;
    private int ng;
    private long nw;
    private float nx;
    private float oa;
    private boolean oug;
    private boolean oz;
    private emc pe;
    private WeakReference<View> pm;
    private boolean pxa;
    private String pxj;
    private Runnable qh;
    private String qhy;
    private int qp;
    private String ra;
    private com.bytedance.sdk.openadsdk.ylm.emc rgy;
    private boolean rie;
    private int rig;
    private boolean rlt;
    private int rqm;
    private String rr;
    private long rtt;
    private Runnable ru;
    private long sb;
    private boolean sba;
    private String se;
    private int sf;
    private int sg;
    private boolean sra;
    private final Handler sup;
    private String sx;
    private Runnable sz;
    private String tc;
    private long tp;
    private String ul;
    private final String uym;
    private JSONObject vaf;
    private String vhn;
    private boolean vk;
    private JSONObject vum;
    private String vw;
    private volatile boolean vyk;
    private int wa;
    private int wad;
    private long wbn;
    private int wd;
    private String wo;
    private int wpn;
    private boolean wq;
    private int xhi;
    private long xmt;
    private volatile boolean xou;
    public final String xq;
    private String xst;
    private String xxg;
    private ViewTreeObserver.OnGlobalLayoutListener xxo;
    private Map<String, String> xxs;
    private boolean ya;
    private final String ycc;
    private boolean ye;
    private Context yid;
    private String ylm;
    public final String ypw;
    private int yuz;
    private int yz;
    private Set<String> yzg;
    private int zhk;
    private Runnable zz;

    public enum emc {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private msw(Context context, WebView webView, xq xqVar, com.bytedance.sdk.openadsdk.ylm.emc emcVar, emc emcVar2) {
        this.ycc = "playable_stuck_check_ping";
        this.uym = "playable_apply_media_permission_callback";
        this.msw = new Handler(Looper.getMainLooper());
        this.sup = new Handler(Looper.getMainLooper());
        this.vk = true;
        this.f9320aa = true;
        this.sba = true;
        this.emc = "PL_sdk_playable_global_viewable";
        this.ypw = "PL_sdk_page_screen_blank";
        this.xq = "PL_sdk_playable_destroy_analyze_summary";
        this.dg = "PL_sdk_playable_hardware_dialog_cancel";
        this.bw = "PL_sdk_playable_hardware_dialog_setting";
        this.yzg = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.ul = null;
        this.ylm = "embeded_ad";
        this.sra = true;
        this.rie = true;
        this.hxp = false;
        this.ee = "";
        this.db = 10L;
        this.sb = 10L;
        this.sf = 700;
        this.dr = 0L;
        this.xmt = 0L;
        this.lt = -1L;
        this.cuf = -1L;
        this.rtt = -1L;
        this.mkp = -1L;
        this.iyl = -1L;
        this.mxo = -1L;
        this.tp = -1L;
        this.vw = "";
        this.ra = "";
        this.wo = "";
        this.xxg = "";
        this.yz = 0;
        this.wpn = 0;
        this.pxa = false;
        this.wa = 0;
        this.rqm = -1;
        this.wad = 0;
        this.but = 0;
        this.wd = 0;
        this.ffd = null;
        this.ndl = false;
        this.hj = 0;
        this.xhi = 0;
        this.cn = 0;
        this.fu = 0;
        this.nw = 0L;
        this.wbn = 0L;
        this.ltx = -2;
        this.rig = 0;
        this.ej = 0;
        this.yuz = 0;
        this.vum = new JSONObject();
        this.xxs = new HashMap();
        this.vaf = new JSONObject();
        this.dpk = "";
        this.ge = 0.0f;
        this.oa = 0.0f;
        this.oug = false;
        this.ya = false;
        this.cwv = false;
        this.ff = new ArrayList();
        this.wq = true;
        this.xou = true;
        this.vyk = true;
        this.xxo = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) msw.this.pm.get();
                    if (view == null) {
                        return;
                    }
                    msw.this.ypw(view);
                } catch (Throwable th) {
                    uym.emc("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.ng = -1;
        this.ltx = 0;
        this.pe = emcVar2;
        this.bv = webView;
        zz.emc(webView);
        emc(webView);
        emc(context, xqVar, emcVar);
    }

    private void ra() {
        this.cf = new ypw(this, this.sf);
        this.zz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.5
            @Override // java.lang.Runnable
            public void run() {
                if (msw.this.sra) {
                    msw.this.sra = false;
                    msw.this.msw.removeCallbacks(msw.this.ru);
                    msw.this.emc(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.ru = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.6
            @Override // java.lang.Runnable
            public void run() {
                if (msw.this.sra) {
                    msw.this.sra = false;
                    msw.this.xou = false;
                    msw.this.msw.removeCallbacks(msw.this.zz);
                    msw.this.emc(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.sz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (msw.this.bv != null) {
                    msw.this.bv.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (msw.this.cf != null) {
                                msw.this.cf.emc(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (msw.this.sup != null) {
                    msw.this.sup.postDelayed(this, 500L);
                }
            }
        };
        this.qh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                msw.this.emc("playable_stuck_check_ping", new JSONObject());
                if (msw.this.sup != null) {
                    msw.this.sup.postDelayed(this, 500L);
                }
            }
        };
        this.gbl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.9
            @Override // java.lang.Runnable
            public void run() {
                if (msw.this.wbn <= 0) {
                    msw.this.ypw(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (msw.this.wbn - msw.this.nw > msw.this.sf) {
                        msw.this.ypw(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    msw.this.cuf();
                    msw.this.nw = 0L;
                    msw.this.wbn = 0L;
                }
            }
        };
    }

    public static /* synthetic */ int sup(msw mswVar) {
        int i10 = mswVar.yz;
        mswVar.yz = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int sz(msw mswVar) {
        int i10 = mswVar.wpn;
        mswVar.wpn = i10 + 1;
        return i10;
    }

    private void wo() {
        String str;
        if (this.vaf == null || (str = this.qhy) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.vaf.optString(BidResponsedEx.KEY_CID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.qhy).getHost();
        if (TextUtils.isEmpty(host)) {
            this.qhy += "/cid_" + strOptString;
            return;
        }
        this.qhy = this.qhy.replace(host, host + "/cid_" + strOptString);
    }

    private void xxg() {
        Runnable runnable;
        Runnable runnable2;
        this.cf.emc(System.currentTimeMillis());
        Handler handler = this.sup;
        if (handler != null) {
            int i10 = this.ltx;
            if (i10 == 0 && (runnable2 = this.sz) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.qh) != null) {
                handler.post(runnable);
            }
            this.cf.emc(500);
        }
    }

    public com.bytedance.sdk.openadsdk.ylm.emc aa() {
        return this.rgy;
    }

    public JSONObject cf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.pe.ordinal());
            jSONObject.put("safe_area_top_height", this.ge);
            jSONObject.put("safe_area_bottom_height", this.oa);
            jSONObject.put("playable_enter_from", this.but);
            jSONObject.put("playable_retry_count", this.wad);
            jSONObject.put("playable_card_session", this.vw);
            jSONObject.put("playable_video_session", this.ra);
            jSONObject.put("playable_network_type", vk());
            jSONObject.put("aweme_id", this.xxg);
            return jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void cuf() {
        if (this.rie) {
            this.mxo = System.currentTimeMillis();
            if (this.pe == emc.FEED_AWEME) {
                if (this.av && this.rig == 3) {
                    ypw ypwVar = this.cf;
                    if (ypwVar != null && ypwVar.ypw()) {
                        xxg();
                        return;
                    } else {
                        if (this.cf == null) {
                            this.cf = new ypw(this, this.sf);
                            xxg();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.av && this.rig == 2) {
                ypw ypwVar2 = this.cf;
                if (ypwVar2 != null && ypwVar2.ypw()) {
                    xxg();
                } else if (this.cf == null) {
                    this.cf = new ypw(this, this.sf);
                    xxg();
                }
            }
        }
    }

    public void db() {
        if (this.rgy != null) {
            emc emcVar = emc.LAND_PAGE;
        }
    }

    public void dr() {
        ypw ypwVar;
        this.wbn = System.currentTimeMillis();
        int i10 = this.ltx;
        if ((i10 == 1 || i10 == 2) && (ypwVar = this.cf) != null) {
            ypwVar.emc(System.currentTimeMillis());
        }
    }

    public void ee() {
        this.ndl = true;
    }

    public void hxp() {
        this.rqm = 2;
    }

    public void iyl() {
        if (this.cwv) {
            return;
        }
        this.cwv = true;
        this.xmt = 0L;
        this.f9320aa = true;
        mkp();
        try {
            View view = this.pm.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.xxo);
            }
        } catch (Throwable unused) {
        }
        try {
            this.ipv.ypw();
        } catch (Throwable unused2) {
        }
        try {
            ypw ypwVar = this.cf;
            if (ypwVar != null) {
                ypwVar.emc();
                this.cf = null;
            }
            Handler handler = this.sup;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.qhy)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.yz);
                jSONObject.put("playable_hit_times", this.wpn);
                int i10 = this.yz;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", this.wpn / (i10 * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                xq("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.qhy)) {
                if (this.lt != -1) {
                    this.dr += System.currentTimeMillis() - this.lt;
                    this.lt = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.dr);
                xq("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.xou = false;
        this.vyk = false;
        this.msw.removeCallbacks(this.zz);
        this.msw.removeCallbacks(this.ru);
        this.msw.removeCallbacksAndMessages(null);
    }

    public void lt() {
        this.vyk = false;
        this.msw.removeCallbacks(this.ru);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.rtt > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.rtt);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            xq("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void mkp() {
        this.ej = 0;
        this.yuz = 0;
        this.nx = 0.0f;
        this.zhk = 0;
        this.dor = 0;
        this.sg = 0;
        this.etw = 0;
        this.kv = 0;
        this.gyw = 0;
        this.qp = 0;
        this.iat = 0;
        this.hs = 0;
        this.igv = 0;
    }

    public int mxo() {
        return (this.cuf == -1 || !this.av) ? 1 : 2;
    }

    public JSONObject qh() {
        boolean zEmc;
        boolean zEmc2;
        try {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zEmc = bw.emc(this.yid, "android.permission.READ_MEDIA_IMAGES");
                zEmc2 = true;
            } else {
                zEmc = bw.emc(this.yid, "android.permission.READ_EXTERNAL_STORAGE");
                zEmc2 = bw.emc(this.yid, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zEmc);
            jSONObject.put("isHasWrite", zEmc2);
            if (!zEmc || !zEmc2) {
                z10 = false;
            }
            jSONObject.put("result", z10);
            return jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void rie() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.iyl > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.iyl);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.rtt > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.rtt;
                this.tp = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            xq("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void rtt() {
        try {
            ypw ypwVar = this.cf;
            if (ypwVar != null) {
                ypwVar.emc();
            }
            Handler handler = this.sup;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void sb() {
        if (this.rgy != null) {
            emc emcVar = emc.LAND_PAGE;
        }
    }

    public JSONObject sba() {
        if (this.vum.isNull("width")) {
            View view = this.pm.get();
            if (view == null) {
                return this.vum;
            }
            ypw(view);
        }
        return this.vum;
    }

    public void sf() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.iyl > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.iyl);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.rtt > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.rtt);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            xq("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void sra() {
        com.bytedance.sdk.openadsdk.ylm.emc emcVar = this.rgy;
        if (emcVar != null) {
            emcVar.xq();
        }
    }

    public String tp() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public JSONObject ul() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.nx);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.zhk);
            jSONObject2.put("height", this.dor);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.etw);
            jSONObject3.put("y", this.sg);
            jSONObject3.put("width", this.kv);
            jSONObject3.put("height", this.gyw);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.iat);
            jSONObject4.put("y", this.qp);
            jSONObject4.put("width", this.hs);
            jSONObject4.put("height", this.igv);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public String vk() {
        com.bytedance.sdk.openadsdk.ylm.emc emcVar;
        if (TextUtils.isEmpty(this.wo) && (emcVar = this.rgy) != null) {
            this.wo = emcVar.emc().toString();
        }
        return this.wo;
    }

    public int vw() {
        return this.ng;
    }

    public void xmt() {
        int i10;
        int i11 = this.ltx;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.xou) {
                this.msw.postDelayed(this.zz, this.db * 1000);
            }
            if ((this.vyk && sup(this.qhy)) || (i10 = this.ltx) == 1 || i10 == 2) {
                this.msw.postDelayed(this.ru, this.sb * 1000);
            }
        }
    }

    public void ylm() {
        com.bytedance.sdk.openadsdk.ylm.emc emcVar = this.rgy;
        if (emcVar != null) {
            emcVar.ypw();
        }
    }

    public JSONObject yzg() {
        return this.vaf;
    }

    private boolean sup(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public String bw() {
        return this.se;
    }

    public String dg() {
        return this.vhn;
    }

    public Set<String> gbl() {
        return this.ipv.emc();
    }

    public boolean msw() {
        return this.oz;
    }

    public JSONObject ru() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.fxt);
            return jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public JSONObject sz() {
        try {
            boolean zEmc = bw.emc(this.yid, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zEmc);
            return jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public String uym() {
        return this.sx;
    }

    public JSONObject xq() {
        return this.hh;
    }

    public String ycc() {
        return this.pxj;
    }

    public boolean zz() {
        return this.av;
    }

    public msw bw(String str) {
        this.sx = str;
        return this;
    }

    public msw dg(String str) {
        this.pxj = str;
        return this;
    }

    public void gbl(String str) {
        this.msw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.3
            @Override // java.lang.Runnable
            public void run() {
                msw.sz(msw.this);
            }
        });
    }

    public JSONObject msw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", bw.ypw(this.yid, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", bw.ypw(this.yid, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", bw.emc(this.yid));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public JSONObject sup() {
        try {
            boolean zEmc = bw.emc(this.yid, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zEmc);
            return jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public msw uym(String str) {
        int iIndexOf;
        String strDecode;
        this.dpk = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.ltx == -1) {
                            ypw(2);
                        } else {
                            ypw(1);
                        }
                    }
                } else {
                    ypw(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                ypw(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.qhy = str;
        return this;
    }

    public msw xq(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.hh = jSONObject;
            return this;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public msw ycc(String str) {
        this.ylm = str;
        return this;
    }

    public void zz(String str) {
        WebView webView;
        boolean z10 = this.rig == -1;
        this.rig = 2;
        if (!z10) {
            this.hoq = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mkp = jCurrentTimeMillis;
                long j10 = this.rtt;
                jSONObject.put("playable_html_load_start_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
                jSONObject.put("playable_has_show", mxo());
            } catch (Throwable th) {
                uym.emc("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            xq("PL_sdk_html_load_finish", jSONObject);
        }
        this.xou = false;
        this.msw.removeCallbacks(this.zz);
        try {
            if (this.ltx == 0) {
                if (this.vk && (webView = this.bv) != null) {
                    this.vk = false;
                    webView.evaluateJavascript(tp(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                cuf();
            }
        } catch (Throwable th2) {
            uym.emc("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.ej == view.getWidth() && this.yuz == view.getHeight()) {
                return;
            }
            this.ej = view.getWidth();
            this.yuz = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.ej);
            jSONObject.put("height", this.yuz);
            emc("resize", jSONObject);
            this.vum = jSONObject;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void bw(JSONObject jSONObject) {
        this.jp = jSONObject;
        this.wd++;
        rtt();
        this.msw.removeCallbacks(this.gbl);
        if (this.rie) {
            this.mxo = System.currentTimeMillis();
            this.nw = System.currentTimeMillis();
            this.wbn = 0L;
            int i10 = this.ltx;
            if (i10 == 0) {
                WebView webView = this.bv;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            msw.this.wbn = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                emc("playable_stuck_check_ping", new JSONObject());
            }
            this.msw.postDelayed(this.gbl, this.sf);
        }
    }

    public msw dg(boolean z10) {
        this.fxt = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.fxt);
            emc("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    public void ycc(JSONObject jSONObject) {
        ypw(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    private void emc(Context context, xq xqVar, com.bytedance.sdk.openadsdk.ylm.emc emcVar) {
        this.ul = UUID.randomUUID().toString();
        this.yid = context;
        this.rgy = emcVar;
        this.jxk = xqVar;
        ru.emc(emcVar);
        this.ipv = new ycc(this);
        ra();
        if (this.bv == null) {
            this.ng = 4;
            this.msw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.4
                @Override // java.lang.Runnable
                public void run() {
                    msw.this.emc(5, "webview is null");
                }
            });
        }
    }

    public void ru(String str) {
        this.msw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.2
            @Override // java.lang.Runnable
            public void run() {
                msw.sup(msw.this);
            }
        });
    }

    public msw xq(boolean z10) throws JSONException {
        if (this.ng != -1 && this.av != z10) {
            this.av = z10;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.av) {
                    jSONObject.put("playable_background_show_type", this.xhi);
                }
            } catch (JSONException unused) {
            }
            xq(this.av ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.cuf == -1 && this.av) {
                this.cuf = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.ng == 1 ? 1 : 2);
                    int i10 = this.ng;
                    if (i10 != -1) {
                        jSONObject2.put("webview_state", i10);
                    }
                } catch (JSONException unused2) {
                }
                xq("PL_sdk_page_show", jSONObject2);
            }
            if (this.cuf != -1 && !this.av && !this.oug) {
                this.oug = true;
            }
            if (this.av) {
                this.lt = System.currentTimeMillis();
            } else if (this.lt != -1) {
                this.dr += System.currentTimeMillis() - this.lt;
                this.lt = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.av);
                emc("viewableChange", jSONObject3);
            } catch (Throwable th) {
                uym.emc("PlayablePlugin", "setViewable error", th);
            }
            if (this.av) {
                cuf();
            } else {
                rtt();
            }
        }
        return this;
    }

    public void ycc(boolean z10) {
        this.ye = z10;
    }

    public void dg(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.ffd = jSONObject.optString("section");
        }
    }

    private String dg(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.qhy = str3;
        return str3;
    }

    public void msw(String str) {
        this.rig = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.rtt = jCurrentTimeMillis;
            long j10 = this.cuf;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        xq("PL_sdk_html_load_start", jSONObject);
        this.xou = true;
        this.vyk = true;
        if (this.wq) {
            xmt();
            this.xou = false;
            this.vyk = false;
        }
        if (this.f9320aa) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (bw.emc(this.yid, bw.sup)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (bw.ypw(this.yid, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (bw.emc(this.yid, bw.gbl)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (bw.emc(this.yid, bw.ru)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (bw.emc(this.yid, bw.zz)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (bw.emc(this.yid, bw.msw)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (bw.ypw(this.yid, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (bw.emc(this.yid, bw.uym)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (bw.emc(this.yid)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                xq("PL_sdk_hardware_detect", jSONObject2);
                this.f9320aa = false;
            } catch (Throwable th2) {
                uym.emc("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject dg(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (uym.emc() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectEmc = this.ipv.emc(str, jSONObject);
        if (uym.emc()) {
            System.currentTimeMillis();
            if (jSONObjectEmc != null) {
                jSONObjectEmc.toString();
            }
        }
        return jSONObjectEmc;
    }

    public Map<String, String> ypw() {
        return this.xxs;
    }

    public msw ypw(String str) {
        this.vhn = str;
        return this;
    }

    public void emc(View view) {
        if (view == null) {
            return;
        }
        try {
            this.pm = new WeakReference<>(view);
            ypw(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.xxo);
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public msw ypw(boolean z10) {
        this.knr = z10;
        return this;
    }

    public msw ypw(long j10) {
        if (j10 <= 0) {
            this.sb = 10L;
            return this;
        }
        this.sb = j10;
        return this;
    }

    private void bw(String str, JSONObject jSONObject) throws JSONException {
        try {
            int i10 = this.ltx;
            if (i10 == 0) {
                if (this.pe != emc.LAND_PAGE && !sup(this.qhy)) {
                    wo();
                }
                jSONObject.put("playable_url", this.qhy);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", dg(this.rr, this.dm));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", xq(this.tc, this.xst));
            }
            jSONObject.put("playable_render_type", this.ltx);
            if (this.rgy != null) {
                if (this.ltx == 0 && (this.pe != emc.LAND_PAGE || sup(this.qhy))) {
                    this.rgy.emc(jSONObject);
                } else if (this.ltx != 0) {
                    this.rgy.emc(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void ypw(JSONObject jSONObject) {
        if (this.rgy != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context emc() {
        return this.yid;
    }

    public msw emc(String str, String str2) {
        this.xxs.put(str, str2);
        return this;
    }

    public void ypw(String str, String str2) {
        Bitmap bitmapEmc;
        if (TextUtils.isEmpty(str2) || (bitmapEmc = bw.emc(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.yid.getContentResolver(), bitmapEmc, str, "");
    }

    public msw emc(String str) {
        this.se = str;
        return this;
    }

    public msw emc(boolean z10) {
        this.oz = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.oz);
            emc("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public void zz(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.rig = 3;
                cuf();
            } else {
                this.rig = -2;
            }
            if (zOptBoolean || !this.sra) {
                return;
            }
            this.sra = false;
            this.xou = false;
            this.vyk = false;
            this.msw.removeCallbacks(this.zz);
            this.msw.removeCallbacks(this.ru);
            emc(4, "CaseRenderFail");
        }
    }

    public JSONObject uym(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return sup();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : qh();
        }
        return sz();
    }

    public msw ypw(int i10) {
        this.ltx = i10;
        return this;
    }

    public void ypw(int i10, String str) {
        this.rqm = i10;
        if (this.jp == null) {
            this.jp = new JSONObject();
        }
        try {
            this.jp.put("playable_stuck_type", i10);
            this.jp.put("playable_stuck_reason", str);
            if (this.mxo > 0) {
                this.jp.put("playable_stuck_duration", System.currentTimeMillis() - this.mxo);
            } else {
                this.jp.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        xq("PL_sdk_page_stuck", this.jp);
        rtt();
        if (this.rgy == null || i10 != 2) {
            return;
        }
        this.jp = new JSONObject();
    }

    public msw emc(long j10) {
        if (j10 <= 0) {
            this.db = 10L;
            return this;
        }
        this.db = j10;
        return this;
    }

    public msw bw(boolean z10) {
        this.wq = z10;
        return this;
    }

    public void emc(int i10) {
        this.ng = i10;
    }

    public void uym(boolean z10) {
        this.rlt = z10;
    }

    public void emc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.ylm.emc emcVar = this.rgy;
        if (emcVar == null || emcVar.ypw(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            ypw(strOptString2, strOptString);
        }
    }

    public msw xq(JSONObject jSONObject) {
        this.vaf = jSONObject;
        return this;
    }

    private void xq(int i10, String str) {
        com.bytedance.sdk.openadsdk.ylm.emc emcVar = this.rgy;
        if (emcVar != null) {
            emcVar.emc(i10, str);
        }
    }

    public void emc(String str, JSONObject jSONObject) {
        if (this.rlt) {
            if (!uym.emc() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (uym.emc() && jSONObject != null) {
            jSONObject.toString();
        }
        xq xqVar = this.jxk;
        if (xqVar != null) {
            xqVar.emc(str, jSONObject);
        }
    }

    public void ypw(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bw(str, jSONObject);
    }

    private String xq(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.kkn) && !TextUtils.isEmpty(this.dpk)) {
            Uri uri = Uri.parse(this.dpk);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.kkn = builderAppendQueryParameter.toString();
        }
        return this.kkn;
    }

    public msw emc(float f10) {
        this.nx = f10;
        return this;
    }

    public void emc(int i10, String str) {
        rtt();
        xq(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "reportRenderFatal error", th);
        }
        xq("PL_sdk_global_faild", jSONObject);
    }

    public void xq(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.pxa && this.wpn > 0) {
                this.pxa = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.ye ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.av);
            jSONObject.put("playable_session_id", this.ul);
            int i10 = this.ltx;
            if (i10 == 0) {
                if (this.pe != emc.LAND_PAGE && !sup(this.qhy)) {
                    wo();
                }
                jSONObject.put("playable_url", this.qhy);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", dg(this.rr, this.dm));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", xq(this.tc, this.xst));
            }
            jSONObject.put("playable_full_url", this.dpk);
            jSONObject.put("playable_replay_count", this.wa);
            jSONObject.put("playable_is_prerender", this.knr);
            jSONObject.put("playable_is_preload", this.pxa);
            jSONObject.put("playable_render_type", this.ltx);
            jSONObject.put("playable_scenes_type", this.pe.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.tc) ? "" : this.tc);
            if (!TextUtils.isEmpty(this.xst)) {
                str2 = this.xst;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.rr);
            jSONObject.put("playable_minigamelite_schema", this.dm);
            jSONObject.put("playable_is_debug", this.ya);
            jSONObject.put("playable_retry_count", this.wad);
            jSONObject.put("playable_enter_from", this.but);
            jSONObject.put("playable_sequence", this.wd);
            jSONObject.put("playable_current_section", this.ffd);
            jSONObject.put("is_playable_finish", this.ndl);
            jSONObject.put("playable_card_session", this.vw);
            jSONObject.put("playable_video_session", this.ra);
            jSONObject.put("playable_network_type", vk());
            jSONObject.put("playable_lynx_version", this.ee);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.ylm);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.vaf.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.vaf.opt("log_extra"));
            int i11 = this.ltx;
            if (i11 != -1 && i11 != -2) {
                if (this.rgy != null) {
                    List<JSONObject> list = this.ff;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.ff.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.ltx);
                                jSONObjectOptJSONObject.put("playable_url", this.qhy);
                            }
                            this.rgy.emc(jSONObjectOptJSONObject);
                        }
                        this.ff.clear();
                    }
                    if (this.ltx == 0 && (this.pe != emc.LAND_PAGE || sup(this.qhy))) {
                        this.rgy.emc(jSONObject);
                        return;
                    } else {
                        if (this.ltx != 0) {
                            this.rgy.emc(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.ff == null) {
                this.ff = new ArrayList();
            }
            this.ff.add(jSONObject2);
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void emc(int i10, String str, String str2) {
        this.rig = -1;
        this.hoq = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", mxo());
        } catch (Throwable th) {
            uym.emc("PlayablePlugin", "onWebReceivedError error", th);
        }
        xq("PL_sdk_html_load_error", jSONObject);
        if (this.sra) {
            this.sra = false;
            this.xou = false;
            this.vyk = false;
            this.msw.removeCallbacks(this.zz);
            this.msw.removeCallbacks(this.ru);
            emc(1, "ContainerLoadFail");
        }
    }

    public void emc(boolean z10, String str, int i10) {
        if (z10) {
            this.rig = -1;
            this.hoq = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", mxo());
            } catch (Throwable th) {
                uym.emc("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            xq("PL_sdk_html_load_error", jSONObject);
            if (this.sra) {
                this.sra = false;
                this.xou = false;
                this.vyk = false;
                this.msw.removeCallbacks(this.zz);
                this.msw.removeCallbacks(this.ru);
                emc(1, "ContainerLoadFail");
            }
        }
    }

    private msw(Context context, int i10, xq xqVar, com.bytedance.sdk.openadsdk.ylm.emc emcVar) {
        this.ycc = "playable_stuck_check_ping";
        this.uym = "playable_apply_media_permission_callback";
        this.msw = new Handler(Looper.getMainLooper());
        this.sup = new Handler(Looper.getMainLooper());
        this.vk = true;
        this.f9320aa = true;
        this.sba = true;
        this.emc = "PL_sdk_playable_global_viewable";
        this.ypw = "PL_sdk_page_screen_blank";
        this.xq = "PL_sdk_playable_destroy_analyze_summary";
        this.dg = "PL_sdk_playable_hardware_dialog_cancel";
        this.bw = "PL_sdk_playable_hardware_dialog_setting";
        this.yzg = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.ul = null;
        this.ylm = "embeded_ad";
        this.sra = true;
        this.rie = true;
        this.hxp = false;
        this.ee = "";
        this.db = 10L;
        this.sb = 10L;
        this.sf = 700;
        this.dr = 0L;
        this.xmt = 0L;
        this.lt = -1L;
        this.cuf = -1L;
        this.rtt = -1L;
        this.mkp = -1L;
        this.iyl = -1L;
        this.mxo = -1L;
        this.tp = -1L;
        this.vw = "";
        this.ra = "";
        this.wo = "";
        this.xxg = "";
        this.yz = 0;
        this.wpn = 0;
        this.pxa = false;
        this.wa = 0;
        this.rqm = -1;
        this.wad = 0;
        this.but = 0;
        this.wd = 0;
        this.ffd = null;
        this.ndl = false;
        this.hj = 0;
        this.xhi = 0;
        this.cn = 0;
        this.fu = 0;
        this.nw = 0L;
        this.wbn = 0L;
        this.ltx = -2;
        this.rig = 0;
        this.ej = 0;
        this.yuz = 0;
        this.vum = new JSONObject();
        this.xxs = new HashMap();
        this.vaf = new JSONObject();
        this.dpk = "";
        this.ge = 0.0f;
        this.oa = 0.0f;
        this.oug = false;
        this.ya = false;
        this.cwv = false;
        this.ff = new ArrayList();
        this.wq = true;
        this.xou = true;
        this.vyk = true;
        this.xxo = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.ylm.msw.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) msw.this.pm.get();
                    if (view == null) {
                        return;
                    }
                    msw.this.ypw(view);
                } catch (Throwable th) {
                    uym.emc("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.ng = -1;
        this.ltx = i10;
        this.pe = emc.LAND_PAGE;
        emc(context, xqVar, emcVar);
    }

    public static msw emc(Context context, @Nullable WebView webView, xq xqVar, com.bytedance.sdk.openadsdk.ylm.emc emcVar) {
        if (xqVar == null || emcVar == null) {
            return null;
        }
        if (webView == null) {
            return new msw(context, 0, xqVar, emcVar);
        }
        return new msw(context, webView, xqVar, emcVar, emc.LAND_PAGE);
    }
}
