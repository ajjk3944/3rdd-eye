package J3;

import A2.C0117e;
import R.C0175b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class e extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2090e;

    public /* synthetic */ e(int i, Object obj) {
        this.f2089d = i;
        this.f2090e = obj;
    }

    @Override // R.C0175b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2089d) {
            case 4:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f2090e).f18384d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        int i;
        int i3 = this.f2089d;
        Object obj = this.f2090e;
        View.AccessibilityDelegate accessibilityDelegate = this.f3302a;
        switch (i3) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                dVar.b(new S.c(16, jVar.v0.getVisibility() == 0 ? jVar.r(R.string.mtrl_picker_toggle_to_year_selection) : jVar.r(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f3446a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((k3.e) obj).f21795j) {
                    dVar.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    break;
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                    break;
                }
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i6 = MaterialButtonToggleGroup.f18199E;
                if (view instanceof MaterialButton) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < materialButtonToggleGroup.getChildCount(); i8++) {
                        if (materialButtonToggleGroup.getChildAt(i8) == view) {
                            i = i7;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i8).getVisibility() != 8) {
                                i7++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                dVar.j(C0117e.w(false, ((MaterialButton) view).f18173C, 0, 1, i, 1));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo3 = dVar.f3446a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.f18385e);
                accessibilityNodeInfo3.setChecked(checkableImageButton.f18384d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = dVar.f3446a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f18391L);
                break;
        }
    }

    @Override // R.C0175b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f2089d) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((k) ((i) this.f2090e)).a(3);
                    break;
                }
            case 2:
                if (i == 1048576) {
                    k3.e eVar = (k3.e) this.f2090e;
                    if (eVar.f21795j) {
                        eVar.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
