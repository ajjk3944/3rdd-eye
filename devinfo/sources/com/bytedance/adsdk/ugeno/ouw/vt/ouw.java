package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw {

    /* renamed from: lh, reason: collision with root package name */
    protected Map<Float, String> f6932lh;
    protected Context ouw;
    protected com.bytedance.adsdk.ugeno.vt.lh ra;
    protected String vt;
    protected fkw yu;

    /* renamed from: le, reason: collision with root package name */
    protected List<PropertyValuesHolder> f6931le = new ArrayList();
    protected List<Keyframe> fkw = new ArrayList();

    public ouw(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Map<Float, String> map) {
        this.ouw = context;
        this.vt = str;
        this.f6932lh = map;
        this.yu = fkw.ouw(this.vt);
        this.ra = lhVar;
    }

    public List<PropertyValuesHolder> lh() {
        String str = this.yu.rn;
        vt();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) this.fkw.toArray(new Keyframe[0]));
        propertyValuesHolderOfKeyframe.setEvaluator(yu());
        this.f6931le.add(propertyValuesHolderOfKeyframe);
        return this.f6931le;
    }

    public abstract void ouw();

    public abstract void ouw(float f10, String str);

    public final void vt() {
        Map<Float, String> map = this.f6932lh;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.f6932lh;
        if (!((map2 == null || map2.size() <= 0) ? false : this.f6932lh.containsKey(Float.valueOf(0.0f)))) {
            ouw();
        }
        for (Map.Entry<Float, String> entry : this.f6932lh.entrySet()) {
            if (entry != null) {
                ouw(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        Map<Float, String> map3 = this.f6932lh;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        Map<Float, String> map4 = this.f6932lh;
        if (map4 instanceof TreeMap) {
            Float f10 = (Float) ((TreeMap) map4).lastKey();
            if (f10.floatValue() != 100.0f) {
                ouw(100.0f, this.f6932lh.get(f10));
            }
        }
    }

    public abstract TypeEvaluator yu();
}
