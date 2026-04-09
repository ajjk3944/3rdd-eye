package com.google.android.material.timepicker;

import L0.C0770a;
import M0.g;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: ClockFaceView.java */
/* loaded from: classes2.dex */
public final class b extends C0770a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f23192d;

    public b(ClockFaceView clockFaceView) {
        this.f23192d = clockFaceView;
    }

    @Override // L0.C0770a
    public final void d(View view, g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f23192d.f23161A.get(iIntValue - 1));
        }
        gVar.k(g.e.a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(g.a.f4124e);
    }

    @Override // L0.C0770a
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f23192d;
        view.getHitRect(clockFaceView.f23173x);
        float fCenterX = clockFaceView.f23173x.centerX();
        float fCenterY = clockFaceView.f23173x.centerY();
        clockFaceView.f23172w.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f23172w.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
