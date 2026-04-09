package gd;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.lifecycle.o0;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.material.slider.Slider;
import com.liuzh.deviceinfo.R;
import e4.s0;
import e4.v0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends n4.a {

    /* renamed from: q, reason: collision with root package name */
    public final Slider f24632q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f24633r;

    public c(Slider slider) {
        super(slider);
        this.f24633r = new Rect();
        this.f24632q = slider;
    }

    @Override // n4.a
    public final int n(float f10, float f11) {
        int i4 = 0;
        while (true) {
            Slider slider = this.f24632q;
            if (i4 >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f24633r;
            slider.C(i4, rect);
            if (rect.contains((int) f10, (int) f11)) {
                return i4;
            }
            i4++;
        }
    }

    @Override // n4.a
    public final void o(ArrayList arrayList) {
        for (int i4 = 0; i4 < this.f24632q.getValues().size(); i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
    }

    @Override // n4.a
    public final boolean s(int i4, int i10, Bundle bundle) {
        Slider slider = this.f24632q;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i10 != 4096 && i10 != 8192) {
            if (i10 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.A(i4, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.D();
            slider.postInvalidate();
            p(i4);
            return true;
        }
        float fRound = slider.f24668p0;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((slider.f24660l0 - slider.f24658k0) / fRound > 20) {
            fRound *= Math.round(r1 / r4);
        }
        if (i10 == 8192) {
            fRound = -fRound;
        }
        if (slider.s()) {
            fRound = -fRound;
        }
        if (!slider.A(i4, com.bumptech.glide.d.h(slider.getValues().get(i4).floatValue() + fRound, slider.getValueFrom(), slider.getValueTo()))) {
            return false;
        }
        slider.setActiveThumbIndex(i4);
        o0 o0Var = slider.T0;
        slider.removeCallbacks(o0Var);
        slider.postDelayed(o0Var, slider.Q0);
        slider.D();
        slider.postInvalidate();
        p(i4);
        return true;
    }

    @Override // n4.a
    public final void u(int i4, f4.f fVar) {
        Object tag;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
        fVar.b(f4.c.f23643r);
        Slider slider = this.f24632q;
        List<Float> values = slider.getValues();
        Float f10 = values.get(i4);
        float fFloatValue = f10.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                fVar.a(Segment.SIZE);
            }
            if (fFloatValue < valueTo) {
                fVar.a(Buffer.SEGMENTING_THRESHOLD);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            int i10 = e.V0;
            Log.w("e", "Error parsing value(" + f10 + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        fVar.k(SeekBar.class.getName());
        StringBuilder sb2 = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb2.append(slider.getContentDescription());
            sb2.append(",");
        }
        String strM = slider.m(fFloatValue);
        String string = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            string = i4 == slider.getValues().size() - 1 ? slider.getContext().getString(R.string.material_slider_range_end) : i4 == 0 ? slider.getContext().getString(R.string.material_slider_range_start) : "";
        }
        WeakHashMap weakHashMap = v0.f22405a;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = s0.b(slider);
        } else {
            tag = slider.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb2.append(string + ", " + strM);
        } else {
            fVar.v(charSequence);
        }
        accessibilityNodeInfo.setContentDescription(sb2.toString());
        Rect rect = this.f24633r;
        slider.C(i4, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
