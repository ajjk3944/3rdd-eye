package com.bytedance.sdk.openadsdk.core.widget.emc;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.vk.emc.emc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ycc implements sf.emc {

    /* renamed from: aa, reason: collision with root package name */
    boolean f9304aa;
    float cf;
    WebView dg;
    Context emc;
    float gbl;
    private boolean lt;
    boolean msw;
    float qh;
    int ru;
    private final boolean sb;
    boolean sba;
    float sup;
    float sz;
    boolean uym;
    long vk;
    private long xmt;
    rie ypw;
    long yzg;
    String zz;
    private final Handler db = new sf(qh.ypw().getLooper(), this);
    String xq = "landingpage";
    int ycc = 0;
    private final String sf = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String dr = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    emc hxp = new emc() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.ycc.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.emc.ycc.emc
        public void emc() {
            ycc yccVar = ycc.this;
            yccVar.msw = true;
            yccVar.ycc();
            ycc yccVar2 = ycc.this;
            yccVar2.emc(2, yccVar2.zz, yccVar2.ru);
        }
    };
    GestureDetector ee = new GestureDetector(aa.emc(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.ycc.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ycc.this.f9304aa = true;
            return false;
        }
    });
    int bw = aa.dg().sra();
    Map<Integer, Long> ul = new HashMap();
    Map<Integer, Float> ylm = new HashMap();
    Map<Integer, Long> sra = new HashMap();
    List<Integer> rie = new ArrayList();

    public interface emc {
        void emc();
    }

    public ycc(WebView webView, rie rieVar, Context context, boolean z10) {
        this.ypw = rieVar;
        this.dg = webView;
        this.emc = context;
        this.sb = z10;
    }

    private boolean bw() {
        try {
            int i10 = this.ru;
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.zz)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.zz);
        } catch (Throwable th) {
            ul.xq("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    private void dg(String str) {
        if (uym()) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(this.ypw, new emc.C0187emc().emc(this.zz).ypw(Uri.decode(str)).emc(), this.xq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void msw() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.dg.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.ru = currentIndex + 1;
            if (this.sb) {
                this.ru = currentIndex + 2;
            }
        }
    }

    private boolean uym() {
        int i10 = this.ycc + 1;
        this.ycc = i10;
        if (i10 > this.bw) {
            return true;
        }
        return ("landingpage".equals(this.xq) || "landingpage_endcard".equals(this.xq) || "landingpage_split_screen".equals(this.xq) || "landingpage_direct".equals(this.xq) || "landingpage_split_ceiling".equals(this.xq)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void ycc() {
        if (this.ylm.get(Integer.valueOf(this.ru)) != null) {
            return;
        }
        float height = this.dg.getHeight() / vw.ypw(this.emc, this.dg.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.ylm.put(Integer.valueOf(this.ru), Float.valueOf(height));
    }

    public void xq(String str) {
        if (this.uym) {
            this.sba = true;
        }
        if (this.ru == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf("&", iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            dg(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void ypw(String str) {
        this.zz = str;
        msw();
        this.ul.put(Integer.valueOf(this.ru), Long.valueOf(SystemClock.elapsedRealtime()));
        this.sra.put(Integer.valueOf(this.ru), Long.valueOf(SystemClock.elapsedRealtime()));
        this.lt = bw();
    }

    public void emc(String str) {
        this.xq = str;
    }

    public void emc() {
        ypw(this.ru);
    }

    public void emc(int i10) {
        float height = (i10 + this.dg.getHeight()) / vw.ypw(this.emc, this.dg.getContentHeight());
        Float f10 = this.ylm.get(Integer.valueOf(this.ru));
        if (height > (f10 == null ? 0.0f : f10.floatValue())) {
            this.ylm.put(Integer.valueOf(this.ru), Float.valueOf(height));
        }
    }

    public void ypw() {
        this.dg.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.ycc.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z10) {
                if (!z10) {
                    ycc yccVar = ycc.this;
                    if (!yccVar.msw) {
                        yccVar.ycc();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - ycc.this.xmt >= 50) {
                            ycc yccVar2 = ycc.this;
                            yccVar2.emc(3, yccVar2.zz, yccVar2.ru);
                            ycc.this.xmt = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    yccVar.msw = false;
                }
                if (z10) {
                    ycc.this.msw();
                    ycc yccVar3 = ycc.this;
                    yccVar3.ul.put(Integer.valueOf(yccVar3.ru), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void dg() {
        if (uym()) {
            return;
        }
        com.bytedance.sdk.openadsdk.vk.emc.emc emcVarEmc = new emc.C0187emc().emc(this.zz).emc(this.ru).dg(this.gbl).bw(this.sup).ycc(this.cf).uym(this.yzg).emc();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = emcVarEmc;
        this.db.sendMessageDelayed(messageObtain, 20L);
    }

    private void ypw(int i10) {
        if (uym() || this.rie.contains(Integer.valueOf(i10))) {
            return;
        }
        this.rie.add(Integer.valueOf(i10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ypw, new emc.C0187emc().emc(this.zz).emc(this.ru).ru(jElapsedRealtime - (this.sra.get(Integer.valueOf(i10)) != null ? r6.longValue() : jElapsedRealtime)).emc(), this.xq);
    }

    public emc xq() {
        return this.hxp;
    }

    private void xq(int i10) {
        if (uym()) {
            return;
        }
        ycc();
        this.uym = true;
        com.bytedance.sdk.openadsdk.vk.emc.emc emcVarEmc = new emc.C0187emc().emc(this.zz).emc(this.ru).emc(this.gbl).ypw(this.sup).xq(this.yzg).xq(i10).emc();
        try {
            if (this.lt) {
                WebView.HitTestResult hitTestResult = this.dg.getHitTestResult();
                emcVarEmc.emc(hitTestResult.getExtra());
                emcVarEmc.emc(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = emcVarEmc;
        this.db.sendMessageDelayed(messageObtain, 100L);
    }

    public void emc(MotionEvent motionEvent) {
        this.ee.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.gbl = motionEvent.getX();
            this.sup = motionEvent.getY();
            this.vk = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            xq(2);
        } else {
            this.yzg = SystemClock.elapsedRealtime() - this.vk;
            if (ypw(motionEvent)) {
                dg();
            } else {
                xq(1);
            }
        }
    }

    private boolean ypw(MotionEvent motionEvent) {
        this.sz = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.qh = y10;
        float f10 = this.sup;
        if (y10 - f10 == 0.0f) {
            return false;
        }
        this.cf = y10 - f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i10, String str, int i11) {
        if (uym()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.ul.get(Integer.valueOf(i11));
        long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
        Float f10 = this.ylm.get(Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.dg.xq.xq(this.ypw, new emc.C0187emc().emc(str).emc(i11).msw(jElapsedRealtime - jLongValue).zz(f10 == null ? 0.0f : f10.floatValue()).ypw(i10).emc(), this.xq);
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.vk.emc.emc emcVar = (com.bytedance.sdk.openadsdk.vk.emc.emc) message.obj;
        if (i10 == 100) {
            emcVar.dg(this.f9304aa ? 2 : 1);
            com.bytedance.sdk.openadsdk.dg.xq.dg(this.ypw, emcVar, this.xq);
            this.f9304aa = false;
        } else if (i10 == 200) {
            if (this.sba) {
                emc(1, emcVar.xq(), emcVar.dg());
            }
            emcVar.xq(this.sba ? 1 : 0);
            com.bytedance.sdk.openadsdk.dg.xq.bw(this.ypw, emcVar, this.xq);
            this.uym = false;
            this.sba = false;
        }
    }
}
