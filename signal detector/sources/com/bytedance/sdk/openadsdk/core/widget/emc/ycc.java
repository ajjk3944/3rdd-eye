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
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.TTAdConstant;
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
    boolean aa;
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
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f5) {
            ycc.this.aa = true;
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

    public ycc(WebView webView, rie rieVar, Context context, boolean z6) {
        this.ypw = rieVar;
        this.dg = webView;
        this.emc = context;
        this.sb = z6;
    }

    private boolean bw() {
        try {
            int i = this.ru;
            if (i != 2 && i != 3) {
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
        com.bytedance.sdk.openadsdk.dg.xq.emc(this.ypw, new emc.C0102emc().emc(this.zz).ypw(Uri.decode(str)).emc(), this.xq);
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
        int i = this.ycc + 1;
        this.ycc = i;
        if (i > this.bw) {
            return true;
        }
        return ("landingpage".equals(this.xq) || "landingpage_endcard".equals(this.xq) || "landingpage_split_screen".equals(this.xq) || "landingpage_direct".equals(this.xq) || "landingpage_split_ceiling".equals(this.xq)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public void emc(int i) {
        float height = (this.dg.getHeight() + i) / vw.ypw(this.emc, this.dg.getContentHeight());
        Float f2 = this.ylm.get(Integer.valueOf(this.ru));
        if (height > (f2 == null ? 0.0f : f2.floatValue())) {
            this.ylm.put(Integer.valueOf(this.ru), Float.valueOf(height));
        }
    }

    public void ypw() {
        this.dg.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.ycc.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z6) {
                if (!z6) {
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
                if (z6) {
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
        com.bytedance.sdk.openadsdk.vk.emc.emc emcVarEmc = new emc.C0102emc().emc(this.zz).emc(this.ru).dg(this.gbl).bw(this.sup).ycc(this.cf).uym(this.yzg).emc();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = emcVarEmc;
        this.db.sendMessageDelayed(messageObtain, 20L);
    }

    private void ypw(int i) {
        if (uym() || this.rie.contains(Integer.valueOf(i))) {
            return;
        }
        this.rie.add(Integer.valueOf(i));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ypw, new emc.C0102emc().emc(this.zz).emc(this.ru).ru(jElapsedRealtime - (this.sra.get(Integer.valueOf(i)) != null ? r6.longValue() : jElapsedRealtime)).emc(), this.xq);
    }

    public emc xq() {
        return this.hxp;
    }

    private void xq(int i) {
        if (uym()) {
            return;
        }
        ycc();
        this.uym = true;
        com.bytedance.sdk.openadsdk.vk.emc.emc emcVarEmc = new emc.C0102emc().emc(this.zz).emc(this.ru).emc(this.gbl).ypw(this.sup).xq(this.yzg).xq(i).emc();
        try {
            if (this.lt) {
                WebView.HitTestResult hitTestResult = this.dg.getHitTestResult();
                emcVarEmc.emc(hitTestResult.getExtra());
                emcVarEmc.emc(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = TTAdConstant.MATE_VALID;
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
        float y3 = motionEvent.getY();
        this.qh = y3;
        float f2 = this.sup;
        if (y3 - f2 == 0.0f) {
            return false;
        }
        this.cf = y3 - f2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i, String str, int i3) {
        if (uym()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l2 = this.ul.get(Integer.valueOf(i3));
        long jLongValue = l2 != null ? l2.longValue() : jElapsedRealtime;
        Float f2 = this.ylm.get(Integer.valueOf(i3));
        com.bytedance.sdk.openadsdk.dg.xq.xq(this.ypw, new emc.C0102emc().emc(str).emc(i3).msw(jElapsedRealtime - jLongValue).zz(f2 == null ? 0.0f : f2.floatValue()).ypw(i).emc(), this.xq);
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.vk.emc.emc emcVar = (com.bytedance.sdk.openadsdk.vk.emc.emc) message.obj;
        if (i == 100) {
            emcVar.dg(this.aa ? 2 : 1);
            com.bytedance.sdk.openadsdk.dg.xq.dg(this.ypw, emcVar, this.xq);
            this.aa = false;
        } else if (i == 200) {
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
