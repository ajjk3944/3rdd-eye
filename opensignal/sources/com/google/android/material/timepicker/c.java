package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class c extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f5791d;

    public c(ClockFaceView clockFaceView) {
        this.f5791d = clockFaceView;
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
        this.f23147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(ed.f.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f5791d.T.get(iIntValue - 1));
        }
        cVar.k(g.a.a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        cVar.b(v3.b.f23825e);
    }

    @Override // u3.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f5791d;
        view.getHitRect(clockFaceView.Q);
        float fCenterX = clockFaceView.Q.centerX();
        float fCenterY = clockFaceView.Q.centerY();
        clockFaceView.P.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.P.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
