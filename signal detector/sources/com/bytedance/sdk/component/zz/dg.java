package com.bytedance.sdk.component.zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends xq {
    private final ycc bw;
    private final Context dg;
    private final View.OnTouchListener emc;
    private float msw;
    private String ru;
    private long uym = -1;
    private final long xq;
    private View.OnTouchListener ycc;
    private final int ypw;
    private float zz;

    public dg(Context context, View.OnTouchListener onTouchListener, int i, long j6, ycc yccVar) {
        this.dg = context;
        this.emc = onTouchListener;
        this.ypw = i;
        this.xq = j6;
        this.bw = yccVar;
    }

    private boolean emc(long j6) {
        long j7 = this.uym;
        if (j7 == -1) {
            this.uym = j6;
            return false;
        }
        int i = this.ypw;
        if (i == 1) {
            if (j6 - j7 <= this.xq) {
                return true;
            }
            this.uym = j6;
            return false;
        }
        if (i == 2) {
            if (j6 - j7 <= this.xq) {
                this.uym = j6;
                return true;
            }
            this.uym = j6;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        dg dgVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x6 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (action == 0) {
            dgVar = this;
            dgVar.msw = x6;
            dgVar.zz = y3;
        } else if (action != 1) {
            dgVar = this;
        } else {
            dgVar = this;
            if (dgVar.emc(x6, y3, this.msw, this.zz, this.dg)) {
                if (emc(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    emc(1, x6, y3);
                } else {
                    emc(0, x6, y3);
                }
            }
        }
        View.OnTouchListener onTouchListener = dgVar.emc;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = dgVar.ycc;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void emc(int i, float f2, float f5) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f2);
            jSONObject2.put("click_y", f5);
            jSONObject.put("lp_click_type", this.ypw);
            jSONObject.put("lp_click_interval", this.xq);
        } catch (Throwable th) {
            ul.emc("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.zz.emc.emc.emc().ypw() != null) {
            com.bytedance.sdk.component.zz.emc.ypw ypwVarYpw = com.bytedance.sdk.component.zz.emc.emc.emc().ypw();
            ycc yccVar = this.bw;
            ypwVarYpw.emc(yccVar != null ? yccVar.getMaterialMeta() : null, this.ru, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void emc(String str) {
        this.ru = str;
    }

    @Override // com.bytedance.sdk.component.zz.xq
    public void emc(View.OnTouchListener onTouchListener) {
        this.ycc = onTouchListener;
    }
}
