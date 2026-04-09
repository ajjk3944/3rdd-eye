package com.bytedance.adsdk.ugeno.emc.ypw;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.emc.bw;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class xq extends emc {
    public xq(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, TreeMap<Float, String> treeMap) {
        super(context, xqVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public void emc(float f2, String str) {
        this.bw.add(this.dg == bw.BACKGROUND_COLOR ? Keyframe.ofInt(f2, com.bytedance.adsdk.ugeno.uym.emc.emc(str)) : Keyframe.ofInt(f2, com.bytedance.adsdk.ugeno.uym.xq.emc(str, 0)));
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public TypeEvaluator ycc() {
        return this.dg == bw.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public void ypw() {
        if (this.dg == bw.BACKGROUND_COLOR) {
            this.bw.add(Keyframe.ofInt(0.0f, this.uym.vw()));
        }
    }
}
