package com.bytedance.adsdk.ugeno.emc.ypw;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.emc.bw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class emc {
    protected bw dg;
    protected Context emc;
    protected com.bytedance.adsdk.ugeno.ypw.xq uym;
    protected Map<Float, String> xq;
    protected String ypw;
    protected List<PropertyValuesHolder> ycc = new ArrayList();
    protected List<Keyframe> bw = new ArrayList();

    public emc(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, Map<Float, String> map) {
        this.emc = context;
        this.ypw = str;
        this.xq = map;
        this.dg = bw.emc(this.ypw);
        this.uym = xqVar;
    }

    public List<PropertyValuesHolder> bw() {
        String strYpw = this.dg.ypw();
        dg();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strYpw, (Keyframe[]) this.bw.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorYcc = ycc();
        if (typeEvaluatorYcc != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorYcc);
        }
        this.ycc.add(propertyValuesHolderOfKeyframe);
        return this.ycc;
    }

    public void dg() {
        Map<Float, String> map = this.xq;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!emc()) {
            ypw();
        }
        for (Map.Entry<Float, String> entry : this.xq.entrySet()) {
            if (entry != null) {
                emc(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        xq();
    }

    public abstract void emc(float f2, String str);

    public boolean emc() {
        Map<Float, String> map = this.xq;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.xq.containsKey(Float.valueOf(0.0f));
    }

    public void xq() {
        Map<Float, String> map = this.xq;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.xq;
        if (map2 instanceof TreeMap) {
            Float f2 = (Float) ((TreeMap) map2).lastKey();
            if (f2.floatValue() != 100.0f) {
                emc(100.0f, this.xq.get(f2));
            }
        }
    }

    public abstract TypeEvaluator ycc();

    public abstract void ypw();
}
