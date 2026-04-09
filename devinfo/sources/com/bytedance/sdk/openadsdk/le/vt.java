package com.bytedance.sdk.openadsdk.le;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.uq;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private static volatile vt ouw;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.zih.ouw> vt = new ConcurrentHashMap<>();

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.zih.ouw f8566lh = null;
    private volatile boolean yu = false;
    private volatile HandlerThread fkw = null;

    /* renamed from: le, reason: collision with root package name */
    private volatile Handler f8565le = null;
    private String ra = "";
    private int pno = 0;
    private volatile long bly = 0;
    private final Runnable tlj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.6
        @Override // java.lang.Runnable
        public final void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (ouw.ouw().ko) {
                        Set<String> setKeySet = vt.this.vt.keySet();
                        if (setKeySet.size() > vt.this.pno) {
                            vt.this.pno = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(vt.this.vt.values());
                        Collections.sort(arrayList);
                        for (int i4 = 0; i4 < arrayList.size() && i4 < 5; i4++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.zih.ouw) arrayList.get(i4)).ouw);
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.zih.ouw ouwVar = (com.bytedance.sdk.openadsdk.zih.ouw) vt.this.vt.get(str);
                                if (ouwVar != null) {
                                    JSONObject jSONObjectOuw = ouwVar.ouw(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectOuw);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e2) {
                            qbp.yu(e2.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (vt.this.f8566lh != null) {
                                jSONObject.put("common", vt.this.f8566lh.ouw(jSONObject2));
                            }
                        } catch (JSONException e10) {
                            qbp.yu(e10.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    qbp.yu(th2.getMessage(), new Object[0]);
                }
                vt.this.ra = jSONObject.toString();
                vt vtVar = vt.this;
                vtVar.ouw(vtVar.tlj, ouw.ouw().f8562jg);
            } catch (OutOfMemoryError e11) {
                qbp.yu(e11.getMessage(), new Object[0]);
            }
        }
    };

    private vt() {
    }

    private void lh() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.bly > 10000) {
            lh.ouw("track_feature_result", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.le.vt.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    vt.this.bly = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("msg", String.valueOf(vt.this.pno));
                    yu yuVar = new yu();
                    yuVar.ouw = "track_feature_result";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
    }

    private Handler vt() {
        if (this.fkw == null || !this.fkw.isAlive()) {
            synchronized (jg.class) {
                try {
                    if (this.fkw == null || !this.fkw.isAlive()) {
                        this.fkw = pno.ouw("csj_feature", -1);
                        this.f8565le = new Handler(this.fkw.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (this.f8565le == null) {
            synchronized (jg.class) {
                try {
                    if (this.f8565le == null) {
                        this.f8565le = new Handler(this.fkw.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.f8565le;
    }

    public final void ouw(Runnable runnable) {
        if (uq.ouw) {
            return;
        }
        try {
            vt().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(Runnable runnable, long j) {
        if (uq.ouw || runnable == null) {
            return;
        }
        try {
            vt().postDelayed(runnable, j);
        } catch (Throwable unused) {
        }
    }

    public static vt ouw() {
        if (ouw == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.lh.class) {
                try {
                    if (ouw == null) {
                        ouw = new vt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public final void ouw(JSONObject jSONObject) throws JSONException {
        if (ouw.ouw().mwh) {
            try {
                jSONObject.put("feature_data", this.ra);
                lh();
            } catch (JSONException e2) {
                qbp.yu(e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void ouw(final String str, final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !ouw.ouw().mwh) {
            return;
        }
        if (!"show".equals(str) && !"click".equals(str) && !"dislike".equals(str)) {
            if (ouw.ouw().rn) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        vt.ouw(vt.this, str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                vt.ouw(vt.this, str, str2, str3);
            }
        });
    }

    public final void ouw(final String str, final vpp vppVar) {
        int i4;
        if (!TextUtils.isEmpty(str) && ouw.ouw().mwh && vpp.fkw(vppVar)) {
            if (!ouw.ouw().rn || (i4 = vppVar.lna) == 8 || i4 == 7 || i4 == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            String strTlj = vppVar.tlj();
                            String strUx = vppVar.ux();
                            if (TextUtils.isEmpty(strTlj)) {
                                return;
                            }
                            vt.ouw(vt.this, str, strTlj, strUx);
                        }
                    });
                }
            }
        }
    }

    public final void ouw(final String str, final vpp vppVar, final String str2) {
        if (TextUtils.isEmpty(str) || !ouw.ouw().mwh) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.5
                @Override // java.lang.Runnable
                public final void run() {
                    vpp vppVar2 = vppVar;
                    if (vppVar2 == null || TextUtils.isEmpty(vppVar2.tlj())) {
                        return;
                    }
                    vt.ouw(vt.this, str, vppVar.tlj(), vppVar.ux() + str2);
                }
            });
        }
    }

    public static /* synthetic */ void ouw(vt vtVar, String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && ouw.ouw().mwh) {
                if (!vtVar.yu) {
                    vtVar.yu = true;
                    vtVar.ouw(vtVar.tlj, ouw.ouw().f8562jg);
                }
                if (ouw.ouw().ko) {
                    com.bytedance.sdk.openadsdk.zih.ouw ouwVar = vtVar.vt.get(str2);
                    if (ouwVar == null) {
                        ouwVar = new com.bytedance.sdk.openadsdk.zih.ouw(str2);
                    }
                    ouwVar.ouw(str, str3);
                    vtVar.vt.put(str2, ouwVar);
                    return;
                }
                if (vtVar.f8566lh == null) {
                    vtVar.f8566lh = new com.bytedance.sdk.openadsdk.zih.ouw(str2);
                }
                vtVar.f8566lh.ouw(str, str3);
            }
        } catch (OutOfMemoryError e2) {
            qbp.yu(e2.getMessage(), new Object[0]);
        }
    }
}
