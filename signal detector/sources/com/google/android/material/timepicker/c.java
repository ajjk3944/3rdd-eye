package com.google.android.material.timepicker;

import A2.C0117e;
import R.C0175b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class c extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f18599d;

    public c(ClockFaceView clockFaceView) {
        this.f18599d = clockFaceView;
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
        this.f3302a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f18599d.f18571N.get(iIntValue - 1));
        }
        dVar.j(C0117e.w(false, view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        dVar.b(S.c.f3433g);
    }

    @Override // R.C0175b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f18599d;
        view.getHitRect(clockFaceView.f18569K);
        float fCenterX = clockFaceView.f18569K.centerX();
        float fCenterY = clockFaceView.f18569K.centerY();
        clockFaceView.f18568J.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f18568J.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
