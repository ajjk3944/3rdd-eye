package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class yzg {
    private float bw;
    private float dg;
    private final emc emc;
    private boolean gbl;
    private int uym;
    private int ycc;
    private final boolean ypw = false;
    private boolean xq = false;
    private boolean msw = true;
    private boolean zz = false;
    private final View.OnTouchListener ru = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.yzg.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (yzg.this.emc.rie()) {
                return !yzg.this.xq;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                yzg yzgVar = yzg.this;
                yzgVar.gbl = yzgVar.emc(motionEvent);
                yzg.this.dg = x10;
                yzg.this.bw = y10;
                yzg.this.ycc = (int) x10;
                yzg.this.uym = (int) y10;
                yzg.this.msw = true;
                if (yzg.this.emc != null && yzg.this.xq) {
                    yzg.this.emc.emc(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - yzg.this.ycc) > 20.0f || Math.abs(y10 - yzg.this.uym) > 20.0f) {
                    yzg.this.msw = false;
                }
                yzg.this.msw = true;
                yzg.this.zz = false;
                yzg.this.dg = 0.0f;
                yzg.this.bw = 0.0f;
                yzg.this.ycc = 0;
                if (yzg.this.emc != null) {
                    yzg.this.emc.emc(view, yzg.this.msw);
                }
                yzg.this.gbl = false;
            } else if (action == 3) {
                yzg.this.gbl = false;
            }
            return !yzg.this.xq;
        }
    };

    public interface emc {
        void emc(View view, boolean z10);

        boolean rie();
    }

    public yzg(emc emcVar) {
        this.emc = emcVar;
    }

    public void emc(View view) {
        if (view != null) {
            view.setOnTouchListener(this.ru);
        }
    }

    public void emc(boolean z10) {
        this.xq = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iXq = vw.xq(com.bytedance.sdk.openadsdk.core.aa.emc().getApplicationContext());
        int iBw = vw.bw(com.bytedance.sdk.openadsdk.core.aa.emc().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iXq;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iBw;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
