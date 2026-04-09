package com.google.android.material.datepicker;

import L0.C0770a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class m extends C0770a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22829e;

    public /* synthetic */ m(Object obj, int i) {
        this.f22828d = i;
        this.f22829e = obj;
    }

    @Override // L0.C0770a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f22828d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f22829e).f22976e);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // L0.C0770a
    public final void d(View view, M0.g gVar) {
        switch (this.f22828d) {
            case 0:
                this.f3883a.onInitializeAccessibilityNodeInfo(view, gVar.f4122a);
                j jVar = (j) this.f22829e;
                gVar.l(jVar.f22821o.getVisibility() == 0 ? jVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : jVar.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.f22829e;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f22977f);
                accessibilityNodeInfo.setChecked(checkableImageButton.f22976e);
                break;
        }
    }
}
