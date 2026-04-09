package com.bytedance.adsdk.ugeno.emc.ypw;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.emc.bw;
import com.bytedance.adsdk.ugeno.uym.msw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class dg extends emc {
    private List<Keyframe> msw;

    /* renamed from: com.bytedance.adsdk.ugeno.emc.ypw.dg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[bw.values().length];
            emc = iArr;
            try {
                iArr[bw.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[bw.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public dg(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, Map<Float, String> map) {
        super(context, xqVar, str, map);
        this.msw = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public List<PropertyValuesHolder> bw() {
        String strYpw = this.dg.ypw();
        dg();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strYpw + "X", (Keyframe[]) this.bw.toArray(new Keyframe[0]));
        this.ycc.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strYpw + "Y", (Keyframe[]) this.msw.toArray(new Keyframe[0]));
        this.ycc.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorYcc = ycc();
        if (typeEvaluatorYcc != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorYcc);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorYcc);
        }
        return this.ycc;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public void emc(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.dg == bw.TRANSLATE) {
                fOptDouble = msw.emc(this.emc, fOptDouble);
                fOptDouble2 = msw.emc(this.emc, fOptDouble2);
            }
            this.bw.add(Keyframe.ofFloat(f10, fOptDouble));
            this.msw.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public TypeEvaluator ycc() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public void ypw() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i10 = AnonymousClass1.emc[this.dg.ordinal()];
        if (i10 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.uym.cf());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.uym.vk());
        } else if (i10 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.uym.aa());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.uym.sba());
        }
        if (keyframeOfFloat != null) {
            this.bw.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.msw.add(keyframeOfFloat2);
        }
    }
}
