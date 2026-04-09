package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends e4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f20670d;

    public c(ClockFaceView clockFaceView) {
        this.f20670d = clockFaceView;
    }

    @Override // e4.b
    public final void d(View view, f4.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
        this.f22306a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f20670d.f20651x.get(iIntValue - 1));
        }
        fVar.m(f4.e.a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        fVar.b(f4.c.f23632e);
    }

    @Override // e4.b
    public final boolean g(View view, int i4, Bundle bundle) {
        if (i4 != 16) {
            return super.g(view, i4, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f20670d;
        view.getHitRect(clockFaceView.f20648u);
        float fCenterX = clockFaceView.f20648u.centerX();
        float fCenterY = clockFaceView.f20648u.centerY();
        clockFaceView.f20647t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f20647t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
