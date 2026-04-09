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

    public dg(Context context, View.OnTouchListener onTouchListener, int i10, long j10, ycc yccVar) {
        this.dg = context;
        this.emc = onTouchListener;
        this.ypw = i10;
        this.xq = j10;
        this.bw = yccVar;
    }

    private boolean emc(long j10) {
        long j11 = this.uym;
        if (j11 == -1) {
            this.uym = j10;
            return false;
        }
        int i10 = this.ypw;
        if (i10 == 1) {
            if (j10 - j11 <= this.xq) {
                return true;
            }
            this.uym = j10;
            return false;
        }
        if (i10 == 2) {
            if (j10 - j11 <= this.xq) {
                this.uym = j10;
                return true;
            }
            this.uym = j10;
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
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            dgVar = this;
            dgVar.msw = x10;
            dgVar.zz = y10;
        } else if (action != 1) {
            dgVar = this;
        } else {
            dgVar = this;
            if (dgVar.emc(x10, y10, this.msw, this.zz, this.dg)) {
                if (emc(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    emc(1, x10, y10);
                } else {
                    emc(0, x10, y10);
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

    private void emc(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
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
