package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ouw {
    private List<Keyframe> pno;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.ouw.vt.yu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.values().length];
            ouw = iArr;
            try {
                iArr[fkw.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public yu(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Map<Float, String> map) {
        super(context, lhVar, str, map);
        this.pno = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final List<PropertyValuesHolder> lh() {
        String str = this.yu.rn;
        vt();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str + "X", (Keyframe[]) this.fkw.toArray(new Keyframe[0]));
        this.f6931le.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(str + "Y", (Keyframe[]) this.pno.toArray(new Keyframe[0]));
        this.f6931le.add(propertyValuesHolderOfKeyframe2);
        FloatEvaluator floatEvaluator = new FloatEvaluator();
        propertyValuesHolderOfKeyframe.setEvaluator(floatEvaluator);
        propertyValuesHolderOfKeyframe2.setEvaluator(floatEvaluator);
        return this.f6931le;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i4 = AnonymousClass1.ouw[this.yu.ordinal()];
        if (i4 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.ra.cf());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.ra.ryl());
        } else if (i4 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.ra.mwh());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.ra.jg());
        }
        if (keyframeOfFloat != null) {
            this.fkw.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.pno.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final TypeEvaluator yu() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw(float f10, String str) {
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
            if (this.yu == fkw.TRANSLATE) {
                fOptDouble = ra.ouw(this.ouw, fOptDouble);
                fOptDouble2 = ra.ouw(this.ouw, fOptDouble2);
            }
            this.fkw.add(Keyframe.ofFloat(f10, fOptDouble));
            this.pno.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
