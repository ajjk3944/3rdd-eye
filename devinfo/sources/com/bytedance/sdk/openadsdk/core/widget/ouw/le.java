package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.ouw.ouw;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements jae.ouw {
    String bly;

    /* renamed from: cd, reason: collision with root package name */
    private final boolean f8487cd;

    /* renamed from: cf, reason: collision with root package name */
    float f8488cf;
    boolean jae;

    /* renamed from: jg, reason: collision with root package name */
    float f8489jg;
    float ko;
    long ksc;
    float mwh;
    Context ouw;
    boolean pno;
    boolean ra;
    long rn;
    float ryl;

    /* renamed from: th, reason: collision with root package name */
    long f8494th;
    int tlj;
    boolean vm;
    vpp vt;
    WebView yu;
    boolean zih;

    /* renamed from: od, reason: collision with root package name */
    private final Handler f8492od = new jae(jg.vt().getLooper(), this);

    /* renamed from: lh, reason: collision with root package name */
    public String f8491lh = "landingpage";

    /* renamed from: le, reason: collision with root package name */
    int f8490le = 0;
    private final String uq = ".*\\/serp\\?sc=.*&clkt=\\d+$";

    /* renamed from: pd, reason: collision with root package name */
    private final String f8493pd = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    public ouw ex = new ouw() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw
        public final void ouw() {
            le leVar = le.this;
            leVar.pno = true;
            leVar.vt();
            le leVar2 = le.this;
            leVar2.ouw(2, leVar2.bly, leVar2.tlj);
        }
    };
    GestureDetector tc = new GestureDetector(zih.ouw(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            le.this.zih = true;
            return false;
        }
    });
    int fkw = zih.yu().pno.ouw("bus_con_behavior_count", 300);
    Map<Integer, Long> qbp = new HashMap();
    Map<Integer, Float> zin = new HashMap();
    Map<Integer, Long> vpp = new HashMap();
    List<Integer> jqy = new ArrayList();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();
    }

    public le(WebView webView, vpp vppVar, Context context, boolean z3) {
        this.vt = vppVar;
        this.yu = webView;
        this.ouw = context;
        this.f8487cd = z3;
    }

    private void vt(int i4) {
        if (lh()) {
            return;
        }
        vt();
        this.ra = true;
        com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new ouw.C0111ouw().ouw(this.bly).ouw(this.tlj).ouw(this.f8488cf).vt(this.ryl).lh(this.f8494th).vt(i4).ouw;
        try {
            if (this.jae) {
                ko.vt("_arbitrage_event", "can collect hit result");
                WebView.HitTestResult hitTestResult = this.yu.getHitTestResult();
                ouwVar.f8637th = hitTestResult.getExtra();
                ouwVar.vm = hitTestResult.getType();
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = TTAdConstant.MATE_VALID;
        messageObtain.obj = ouwVar;
        this.f8492od.sendMessageDelayed(messageObtain, 100L);
    }

    public final boolean lh() {
        int i4 = this.f8490le + 1;
        this.f8490le = i4;
        if (i4 > this.fkw) {
            return true;
        }
        return ("landingpage".equals(this.f8491lh) || "landingpage_endcard".equals(this.f8491lh) || "landingpage_split_screen".equals(this.f8491lh) || "landingpage_direct".equals(this.f8491lh) || "landingpage_split_ceiling".equals(this.f8491lh)) ? false : true;
    }

    public final void ouw(int i4) {
        float height = (this.yu.getHeight() + i4) / osn.ouw(this.ouw, this.yu.getContentHeight());
        Float f10 = this.zin.get(Integer.valueOf(this.tlj));
        float fFloatValue = f10 == null ? 0.0f : f10.floatValue();
        ko.ouw("_arbitrage_", "onScrollChange, oldPerUnBox is:", Float.valueOf(fFloatValue), ", browsingPer is:", Float.valueOf(height), ", index is: ", Integer.valueOf(this.tlj));
        if (height > fFloatValue) {
            this.zin.put(Integer.valueOf(this.tlj), Float.valueOf(height));
        }
    }

    public final void yu() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.yu.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.tlj = currentIndex + 1;
            if (this.f8487cd) {
                this.tlj = currentIndex + 2;
            }
        }
        ko.ouw("_arbitrage_", "trigger onPageStarted, and index is: ", Integer.valueOf(this.tlj));
    }

    public final void ouw(MotionEvent motionEvent) {
        this.tc.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8488cf = motionEvent.getX();
            this.ryl = motionEvent.getY();
            this.rn = SystemClock.elapsedRealtime();
            return;
        }
        if (action != 1) {
            if (action != 3) {
                return;
            }
            vt(2);
            return;
        }
        this.f8494th = SystemClock.elapsedRealtime() - this.rn;
        this.mwh = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.f8489jg = y10;
        float f10 = this.ryl;
        if (y10 - f10 != 0.0f) {
            this.ko = y10 - f10;
            if (lh()) {
                return;
            }
            ko.vt("_arbitrage_", "trigger processScrollEvent()");
            ouw.C0111ouw c0111ouwOuw = new ouw.C0111ouw().ouw(this.bly).ouw(this.tlj);
            float f11 = this.f8488cf;
            com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = c0111ouwOuw.ouw;
            ouwVar.ra = f11;
            ouwVar.pno = this.ryl;
            ouwVar.bly = this.ko;
            ouwVar.f8633cf = this.f8494th;
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.obj = ouwVar;
            this.f8492od.sendMessageDelayed(messageObtain, 20L);
            return;
        }
        vt(1);
    }

    public final void vt() {
        if (this.zin.get(Integer.valueOf(this.tlj)) != null) {
            return;
        }
        float height = this.yu.getHeight() / osn.ouw(this.ouw, this.yu.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        ko.ouw("_arbitrage_", "initBrowsingPer, browsingPer is: ", Float.valueOf(height), "index is: ", Integer.valueOf(this.tlj));
        this.zin.put(Integer.valueOf(this.tlj), Float.valueOf(height));
    }

    public final void ouw(int i4, String str, int i10) {
        if (lh()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.qbp.get(Integer.valueOf(i10));
        long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
        Float f10 = this.zin.get(Integer.valueOf(i10));
        float fFloatValue = f10 == null ? 0.0f : f10.floatValue();
        com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new ouw.C0111ouw().ouw(str).ouw(i10).ouw;
        ouwVar.ryl = jElapsedRealtime - jLongValue;
        ouwVar.mwh = fFloatValue;
        ouwVar.f8634jg = i4;
        com.bytedance.sdk.openadsdk.yu.lh.lh(this.vt, ouwVar, this.f8491lh);
    }

    public final boolean ouw() {
        try {
            int i4 = this.tlj;
            if (i4 != 2 && i4 != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.bly)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.bly);
        } catch (Throwable th2) {
            qbp.lh("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        int i4 = message.what;
        com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = (com.bytedance.sdk.openadsdk.rn.ouw.ouw) message.obj;
        if (i4 == 100) {
            ouwVar.tlj = this.zih ? 2 : 1;
            com.bytedance.sdk.openadsdk.yu.lh.yu(this.vt, ouwVar, this.f8491lh);
            this.zih = false;
        } else if (i4 == 200) {
            if (this.vm) {
                ouw(1, ouwVar.ouw, ouwVar.vt);
            }
            ouwVar.f8635le = this.vm ? 1 : 0;
            com.bytedance.sdk.openadsdk.yu.lh.fkw(this.vt, ouwVar, this.f8491lh);
            this.ra = false;
            this.vm = false;
        }
    }
}
