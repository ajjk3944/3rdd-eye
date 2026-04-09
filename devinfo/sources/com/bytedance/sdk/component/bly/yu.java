package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends lh {
    private float bly;
    private final Context fkw;

    /* renamed from: le, reason: collision with root package name */
    private final le f7440le;

    /* renamed from: lh, reason: collision with root package name */
    private final int f7441lh;
    String ouw;
    private long pno = -1;
    private View.OnTouchListener ra;
    private float tlj;
    private final View.OnTouchListener vt;
    private final long yu;

    public yu(Context context, View.OnTouchListener onTouchListener, int i4, long j, le leVar) {
        this.fkw = context;
        this.vt = onTouchListener;
        this.f7441lh = i4;
        this.yu = j;
        this.f7440le = leVar;
    }

    private void ouw(int i4, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i4);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f7441lh);
            jSONObject.put("lp_click_interval", this.yu);
        } catch (Throwable th2) {
            qbp.ouw("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
            com.bytedance.sdk.component.bly.ouw.vt vtVar = com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw;
            le leVar = this.f7440le;
            vtVar.ouw(leVar != null ? leVar.getMaterialMeta() : null, this.ouw, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ko.vt("LpClickIntervalTouchListener", "action: ", Integer.valueOf(action), ", x: ", Float.valueOf(motionEvent.getX()), ",y: ", Float.valueOf(motionEvent.getY()));
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.bly = x10;
            this.tlj = y10;
        } else if (action == 1 && ouw(x10, y10, this.bly, this.tlj, this.fkw)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.pno;
            if (j == -1) {
                this.pno = jElapsedRealtime;
                ouw(0, x10, y10);
            } else {
                int i4 = this.f7441lh;
                if (i4 == 1) {
                    if (jElapsedRealtime - j > this.yu) {
                        this.pno = jElapsedRealtime;
                        ouw(0, x10, y10);
                    }
                    motionEvent.setAction(3);
                    ouw(1, x10, y10);
                } else {
                    if (i4 == 2) {
                        if (jElapsedRealtime - j <= this.yu) {
                            this.pno = jElapsedRealtime;
                            motionEvent.setAction(3);
                            ouw(1, x10, y10);
                        }
                        this.pno = jElapsedRealtime;
                    }
                    ouw(0, x10, y10);
                }
            }
        }
        View.OnTouchListener onTouchListener = this.vt;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = this.ra;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.bly.lh
    public final void ouw(View.OnTouchListener onTouchListener) {
        this.ra = onTouchListener;
    }
}
