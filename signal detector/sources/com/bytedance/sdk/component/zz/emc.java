package com.bytedance.sdk.component.zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.xmt;
import com.bytedance.sdk.component.utils.zz;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends xq implements sf.emc {
    private float aa;
    private final int bw;
    private final List<Integer> dg;
    private long gbl;
    private volatile float msw;
    private float sba;
    private long sup;
    private int sz;
    private View.OnTouchListener ul;
    private volatile float uym;
    private boolean vk;
    private final int xq;
    private final Context ycc;
    private final int ypw;
    private String yzg;
    private float zz = -1.0f;
    private float ru = -1.0f;
    private final Handler cf = new sf(zz.emc().getLooper(), this);
    InterfaceC0045emc emc = new InterfaceC0045emc() { // from class: com.bytedance.sdk.component.zz.emc.1
        @Override // com.bytedance.sdk.component.zz.emc.InterfaceC0045emc
        public void emc() {
            if (emc.this.zz == -1.0f && emc.this.ru == -1.0f && emc.this.sup == -1) {
                float unused = emc.this.zz;
                float unused2 = emc.this.ru;
                emc emcVar = emc.this;
                emcVar.zz = emcVar.uym;
                emc emcVar2 = emc.this;
                emcVar2.ru = emcVar2.msw;
                emc emcVar3 = emc.this;
                emcVar3.sup = emcVar3.gbl;
                emc.this.vk = true;
            }
            float unused3 = emc.this.zz;
            float unused4 = emc.this.ru;
        }

        @Override // com.bytedance.sdk.component.zz.emc.InterfaceC0045emc
        public void emc(int i) {
            emc.this.sz = i;
            emc.this.ypw();
        }
    };
    private int ylm = -1;
    private final List<Integer> qh = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.zz.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0045emc {
        void emc();

        void emc(int i);
    }

    public emc(Context context, int i, int i3, List<Integer> list, int i6) {
        this.ycc = context;
        if (i == -1) {
            this.ypw = xmt.emc(context);
        } else {
            this.ypw = xmt.emc(context, i);
        }
        this.xq = xmt.emc(context, i3);
        this.dg = list;
        this.bw = i6;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        emc emcVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x6 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.gbl = SystemClock.elapsedRealtime();
        this.uym = x6;
        this.msw = y3;
        if (action == 0) {
            emcVar = this;
            emcVar.aa = x6;
            emcVar.sba = y3;
        } else if (action != 1) {
            emcVar = this;
        } else {
            emcVar = this;
            if (emcVar.emc(x6, y3, this.aa, this.sba, this.ycc)) {
                int iEmc = emc(emcVar.uym, emcVar.msw, emcVar.gbl);
                boolean zContains = emcVar.qh.contains(Integer.valueOf(emcVar.sz));
                emc(view, motionEvent, iEmc, !zContains);
                if (!zContains) {
                    emcVar.qh.add(Integer.valueOf(emcVar.sz));
                }
                if (iEmc == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = emcVar.ul;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        this.zz = -1.0f;
        this.ru = -1.0f;
        this.sup = -1L;
    }

    @Override // com.bytedance.sdk.component.zz.xq
    public void emc(View.OnTouchListener onTouchListener) {
        this.ul = onTouchListener;
    }

    public InterfaceC0045emc emc() {
        return this.emc;
    }

    private void emc(View view, MotionEvent motionEvent, int i, boolean z6) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z6 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.sz);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.cf.sendMessageDelayed(messageObtain, 200L);
    }

    public void emc(String str) {
        this.yzg = str;
    }

    private int emc(float f2, float f5, long j6) {
        if (this.zz == -1.0f && this.ru == -1.0f && this.sup == -1) {
            return 1;
        }
        if (!this.dg.contains(Integer.valueOf(this.sz))) {
            return 2;
        }
        if (j6 - this.sup > this.bw) {
            ypw();
            return 3;
        }
        float fAbs = Math.abs(f2 - this.zz);
        float fAbs2 = Math.abs(f5 - this.ru);
        if (fAbs <= this.ypw / 2.0f && fAbs2 <= this.xq / 2.0f) {
            return 0;
        }
        ypw();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.vk ? 1 : 0);
                    this.vk = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.zz.emc.emc.emc().ypw() != null) {
                com.bytedance.sdk.component.zz.emc.emc.emc().ypw().emc(this.yzg, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
