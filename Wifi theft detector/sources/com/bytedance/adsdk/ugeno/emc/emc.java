package com.bytedance.adsdk.ugeno.emc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.emc.emc.emc;
import com.bytedance.adsdk.ugeno.emc.xq;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends AnimatorListenerAdapter {
    private int bw;
    private Context dg;
    private com.bytedance.adsdk.ugeno.ypw.xq emc;
    private String msw;
    private com.bytedance.adsdk.ugeno.emc.emc.emc uym;
    private ValueAnimator xq;
    private int ycc = 1;
    private xq ypw;
    private ypw zz;

    public emc(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, xq xqVar2) {
        this.emc = xqVar;
        this.ypw = xqVar2;
        this.dg = context;
    }

    public String bw() {
        return this.msw;
    }

    public ValueAnimator dg() {
        String key;
        com.bytedance.adsdk.ugeno.emc.ypw.emc xqVar;
        xq xqVar2 = this.ypw;
        if (xqVar2 == null || this.emc == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapYpw = xqVar2.ypw();
        ArrayList arrayList = new ArrayList();
        if (mapYpw != null && !mapYpw.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapYpw.entrySet()) {
                if (entry != null) {
                    key = entry.getKey();
                    String strXq = bw.emc(key).xq();
                    strXq.getClass();
                    switch (strXq) {
                        case "int":
                            xqVar = new com.bytedance.adsdk.ugeno.emc.ypw.xq(this.dg, this.emc, key, entry.getValue());
                            break;
                        case "float":
                            xqVar = new com.bytedance.adsdk.ugeno.emc.ypw.ypw(this.dg, this.emc, key, entry.getValue());
                            break;
                        case "point":
                            xqVar = new com.bytedance.adsdk.ugeno.emc.ypw.dg(this.dg, this.emc, key, entry.getValue());
                            break;
                        default:
                            xqVar = null;
                            break;
                    }
                    if (xqVar != null) {
                        arrayList.addAll(xqVar.bw());
                    }
                }
            }
        }
        JSONObject jSONObjectEmc = this.ypw.emc();
        if (jSONObjectEmc != null) {
            com.bytedance.adsdk.ugeno.emc.emc.emc emcVarEmc = emc.C0095emc.emc(this.emc, jSONObjectEmc);
            this.uym = emcVarEmc;
            if (emcVarEmc != null) {
                arrayList.addAll(emcVarEmc.xq());
            }
        }
        final View viewGbl = this.emc.gbl();
        if (viewGbl == null) {
            return null;
        }
        final xq.emc emcVarUym = this.ypw.uym();
        if (emcVarUym != null) {
            viewGbl.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.emc.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewGbl.getWidth();
                    int height = viewGbl.getHeight();
                    viewGbl.setPivotX(dg.emc(emcVarUym.emc, width));
                    viewGbl.setPivotY(dg.emc(emcVarUym.ypw, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewGbl, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.bw = dg.emc(this.ypw.dg());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.ypw.xq());
        int i10 = this.bw;
        if (i10 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i10);
        }
        this.ycc = this.ypw.ru();
        this.msw = this.ypw.zz();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.ypw.ycc());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(dg.emc(this.ypw.bw()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(dg.ypw(this.ypw.msw()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.xq = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void emc() {
        ValueAnimator valueAnimator = this.xq;
        if (valueAnimator == null || this.ycc == 0 || this.bw == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ypw ypwVar = this.zz;
        if (ypwVar != null) {
            ypwVar.ypw();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        ypw ypwVar = this.zz;
        if (ypwVar != null) {
            ypwVar.emc();
        }
    }

    public void xq() {
        ValueAnimator valueAnimator = this.xq;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void ypw() {
        ValueAnimator valueAnimator = this.xq;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void ypw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.emc.emc.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.ypw(canvas);
        }
    }

    public void emc(ypw ypwVar) {
        this.zz = ypwVar;
    }

    public void emc(Canvas canvas) {
        com.bytedance.adsdk.ugeno.emc.emc.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.emc(canvas);
        }
    }

    public void emc(int i10, int i11) {
        com.bytedance.adsdk.ugeno.emc.emc.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.emc(i10, i11);
        }
    }
}
