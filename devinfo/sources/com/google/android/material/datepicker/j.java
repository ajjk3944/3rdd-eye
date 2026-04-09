package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends e4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20461e;

    public /* synthetic */ j(int i4, Object obj) {
        this.f20460d = i4;
        this.f20461e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // e4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.f20460d
            switch(r0) {
                case 1: goto L16;
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r3, r4)
            return
        L9:
            super.c(r3, r4)
            java.lang.Object r3 = r2.f20461e
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            boolean r3 = r3.f20533d
            r4.setChecked(r3)
            return
        L16:
            java.lang.Object r0 = r2.f20461e
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            n6.a r3 = r0.f1577e
            if (r3 == 0) goto L32
            int r3 = r3.c()
            r1 = 1
            if (r3 <= r1) goto L32
            goto L33
        L32:
            r1 = 0
        L33:
            r4.setScrollable(r1)
            int r3 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r3 != r1) goto L53
            n6.a r3 = r0.f1577e
            if (r3 == 0) goto L53
            int r3 = r3.c()
            r4.setItemCount(r3)
            int r3 = r0.f1578f
            r4.setFromIndex(r3)
            int r3 = r0.f1578f
            r4.setToIndex(r3)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // e4.b
    public final void d(View view, f4.f fVar) {
        int i4 = this.f20460d;
        int i10 = -1;
        boolean z3 = false;
        Object obj = this.f20461e;
        View.AccessibilityDelegate accessibilityDelegate = this.f22306a;
        switch (i4) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, fVar.f23651a);
                l lVar = (l) obj;
                fVar.b(new f4.c(16, lVar.f20474k0.getVisibility() == 0 ? lVar.u(R.string.mtrl_picker_toggle_to_year_selection) : lVar.u(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, fVar.f23651a);
                fVar.k(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                n6.a aVar = viewPager.f1577e;
                if (aVar != null && aVar.c() > 1) {
                    z3 = true;
                }
                fVar.t(z3);
                if (viewPager.canScrollHorizontally(1)) {
                    fVar.a(Buffer.SEGMENTING_THRESHOLD);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    fVar.a(Segment.SIZE);
                    break;
                }
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!((oc.f) obj).f30508k) {
                    accessibilityNodeInfo.setDismissable(false);
                    break;
                } else {
                    fVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    break;
                }
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, fVar.f23651a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i11 = MaterialButtonToggleGroup.f20402q;
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i12) == view) {
                                i10 = i13;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i12).getVisibility() != 8) {
                                    i13++;
                                }
                                i12++;
                            }
                        }
                    }
                }
                fVar.m(f4.e.a(0, 1, i10, 1, ((MaterialButton) view).f20390o));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f23651a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f20534e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f20533d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = fVar.f23651a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f20539x);
                break;
        }
    }

    @Override // e4.b
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.f20460d) {
            case 1:
                ViewPager viewPager = (ViewPager) this.f20461e;
                if (!super.g(view, i4, bundle)) {
                    if (i4 == 4096) {
                        if (viewPager.canScrollHorizontally(1)) {
                            viewPager.setCurrentItem(viewPager.f1578f + 1);
                            break;
                        }
                    } else if (i4 == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f1578f - 1);
                        break;
                    }
                    break;
                }
                break;
            case 2:
                if (i4 == 1048576) {
                    oc.f fVar = (oc.f) this.f20461e;
                    if (fVar.f30508k) {
                        fVar.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i4, bundle);
    }
}
