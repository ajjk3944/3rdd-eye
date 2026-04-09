package com.bytedance.sdk.openadsdk.ycc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.cuf;
import com.bytedance.sdk.openadsdk.vk.emc.dg;
import com.bytedance.sdk.openadsdk.vk.xq;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private static volatile ypw emc;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.aa.emc> ypw = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.aa.emc xq = null;
    private volatile boolean dg = false;
    private volatile HandlerThread bw = null;
    private volatile Handler ycc = null;
    private String uym = "";
    private int msw = 0;
    private volatile long zz = 0;
    private final Runnable ru = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (emc.emc().bw()) {
                        Set<String> setKeySet = ypw.this.ypw.keySet();
                        if (setKeySet.size() > ypw.this.msw) {
                            ypw.this.msw = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(ypw.this.ypw.values());
                        Collections.sort(arrayList);
                        for (int i10 = 0; i10 < arrayList.size() && i10 < 5; i10++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.aa.emc) arrayList.get(i10)).ypw());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.aa.emc emcVar = (com.bytedance.sdk.openadsdk.aa.emc) ypw.this.ypw.get(str);
                                if (emcVar != null) {
                                    JSONObject jSONObjectEmc = emcVar.emc(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectEmc);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e10) {
                            ul.xq(e10.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (ypw.this.xq != null) {
                                jSONObject.put("common", ypw.this.xq.emc(jSONObject2));
                            }
                        } catch (JSONException e11) {
                            ul.xq(e11.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    ul.xq(th.getMessage(), new Object[0]);
                }
                ypw.this.uym = jSONObject.toString();
                ypw ypwVar = ypw.this;
                ypwVar.emc(ypwVar.ru, emc.emc().dg());
            } catch (OutOfMemoryError e12) {
                ul.xq(e12.getMessage(), new Object[0]);
            }
        }
    };

    private ypw() {
    }

    private void bw() {
        if (this.dg) {
            return;
        }
        this.dg = true;
        emc(this.ru, emc.emc().dg());
    }

    private void dg() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.zz > 10000) {
            xq.emc("track_feature_result", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.1
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                @Nullable
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                    ypw.this.zz = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(ypw.this.msw));
                    return dg.ypw().emc("track_feature_result").ypw(jSONObject.toString());
                }
            });
        }
    }

    private Handler xq() {
        if (this.bw == null || !this.bw.isAlive()) {
            synchronized (qh.class) {
                try {
                    if (this.bw == null || !this.bw.isAlive()) {
                        this.bw = msw.emc("csj_feature", -1);
                        this.ycc = new Handler(this.bw.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.ycc == null) {
            synchronized (qh.class) {
                try {
                    if (this.ycc == null) {
                        this.ycc = new Handler(this.bw.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.ycc;
    }

    public void ypw() {
        try {
            if (emc.emc().xq()) {
                emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!emc.emc().bw()) {
                            if (ypw.this.xq != null) {
                                ypw.this.xq.emc();
                            }
                        } else {
                            Iterator it = ypw.this.ypw.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.aa.emc emcVar = (com.bytedance.sdk.openadsdk.aa.emc) ypw.this.ypw.get((String) it.next());
                                if (emcVar != null) {
                                    emcVar.emc();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e10) {
            ul.xq(e10.getMessage(), new Object[0]);
        }
    }

    private void emc(Runnable runnable) {
        if (cuf.emc || runnable == null) {
            return;
        }
        try {
            xq().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(Runnable runnable, long j10) {
        if (cuf.emc || runnable == null) {
            return;
        }
        try {
            xq().postDelayed(runnable, j10);
        } catch (Throwable unused) {
        }
    }

    public static ypw emc() {
        if (emc == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.xq.class) {
                try {
                    if (emc == null) {
                        emc = new ypw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void emc(JSONObject jSONObject) throws JSONException {
        if (emc.emc().xq()) {
            try {
                jSONObject.put("feature_data", this.uym);
                dg();
            } catch (JSONException e10) {
                ul.xq(e10.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(@NonNull String str, @NonNull String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && emc.emc().xq()) {
                bw();
                if (emc.emc().bw()) {
                    com.bytedance.sdk.openadsdk.aa.emc emcVar = this.ypw.get(str2);
                    if (emcVar == null) {
                        emcVar = new com.bytedance.sdk.openadsdk.aa.emc(str2);
                    }
                    emcVar.emc(str, str3);
                    this.ypw.put(str2, emcVar);
                    return;
                }
                if (this.xq == null) {
                    this.xq = new com.bytedance.sdk.openadsdk.aa.emc(str2);
                }
                this.xq.emc(str, str3);
            }
        } catch (OutOfMemoryError e10) {
            ul.xq(e10.getMessage(), new Object[0]);
        }
    }

    public void emc(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !emc.emc().xq()) {
            return;
        }
        if (!"show".equals(str) && !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) && !"dislike".equals(str)) {
            if (emc.emc().sba()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ypw.this.emc(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.2
            @Override // java.lang.Runnable
            public void run() {
                ypw.this.emc(str, str2, str3);
            }
        });
    }

    public void emc(@NonNull final String str, final rie rieVar) {
        if (!TextUtils.isEmpty(str) && emc.emc().xq() && rie.bw(rieVar)) {
            if (!emc.emc().sba() || rieVar.blf() == 8 || rieVar.blf() == 7 || rieVar.blf() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strWa = rieVar.wa();
                            String strLvs = rieVar.lvs();
                            if (TextUtils.isEmpty(strWa)) {
                                return;
                            }
                            ypw.this.emc(str, strWa, strLvs);
                        }
                    });
                }
            }
        }
    }

    public void emc(@NonNull final String str, final rie rieVar, final String str2) {
        if (TextUtils.isEmpty(str) || !emc.emc().xq()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.ypw.5
                @Override // java.lang.Runnable
                public void run() {
                    rie rieVar2 = rieVar;
                    if (rieVar2 == null || TextUtils.isEmpty(rieVar2.wa())) {
                        return;
                    }
                    ypw.this.emc(str, rieVar.wa(), rieVar.lvs() + str2);
                }
            });
        }
    }
}
