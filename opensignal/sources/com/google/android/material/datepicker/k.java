package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class k extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5601e;

    public /* synthetic */ k(int i10, Object obj) {
        this.f5600d = i10;
        this.f5601e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // u3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.f5600d
            switch(r0) {
                case 3: goto L16;
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r3, r4)
            return
        L9:
            super.c(r3, r4)
            java.lang.Object r3 = r2.f5601e
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            boolean r3 = r3.f5657r
            r4.setChecked(r3)
            return
        L16:
            java.lang.Object r0 = r2.f5601e
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            super.c(r3, r4)
            java.lang.String r3 = "androidx.viewpager.widget.ViewPager"
            r4.setClassName(r3)
            x7.a r3 = r0.f2145x
            if (r3 == 0) goto L2e
            int r3 = r3.c()
            r1 = 1
            if (r3 <= r1) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r4.setScrollable(r1)
            int r3 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r3 != r1) goto L4f
            x7.a r3 = r0.f2145x
            if (r3 == 0) goto L4f
            int r3 = r3.c()
            r4.setItemCount(r3)
            int r3 = r0.f2146y
            r4.setFromIndex(r3)
            int r3 = r0.f2146y
            r4.setToIndex(r3)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.k.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        int i10 = this.f5600d;
        int i11 = -1;
        boolean z10 = false;
        Object obj = this.f5601e;
        View.AccessibilityDelegate accessibilityDelegate = this.f23147a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                m mVar = (m) obj;
                cVar.b(new v3.b(16, mVar.H0.getVisibility() == 0 ? mVar.r(ed.j.mtrl_picker_toggle_to_year_selection) : mVar.r(ed.j.mtrl_picker_toggle_to_day_selection)));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i12 = MaterialButtonToggleGroup.N;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i13) == view) {
                                i11 = i14;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i13).getVisibility() != 8) {
                                    i14++;
                                }
                                i13++;
                            }
                        }
                    }
                }
                cVar.k(g.a.a(((MaterialButton) view).K, 0, 1, i11, 1));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                cVar.i("androidx.viewpager.widget.ViewPager");
                ViewPager viewPager = (ViewPager) obj;
                x7.a aVar = viewPager.f2145x;
                if (aVar != null && aVar.c() > 1) {
                    z10 = true;
                }
                cVar.l(z10);
                if (viewPager.canScrollHorizontally(1)) {
                    cVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                    break;
                }
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo2 = cVar.f23838a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f5658x);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f5657r);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = cVar.f23838a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).T);
                break;
        }
    }

    @Override // u3.b
    public boolean g(View view, int i10, Bundle bundle) {
        switch (this.f5600d) {
            case 1:
                if (i10 != 1048576) {
                    return super.g(view, i10, bundle);
                }
                ((ge.j) ((ge.h) this.f5601e)).a(3);
                return true;
            case 2:
            default:
                return super.g(view, i10, bundle);
            case 3:
                ViewPager viewPager = (ViewPager) this.f5601e;
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f2146y - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f2146y + 1);
                    return true;
                }
                return false;
        }
    }
}
