package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sb extends p0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sb(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.p0
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).i);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.p0
    public final void d(View view, a1 a1Var) {
        int i;
        RecyclerView recyclerView;
        int i2 = this.d;
        int iF = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        Object obj = this.e;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = a1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((vb) obj).p) {
                    a1Var.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    break;
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                    break;
                }
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = a1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.j);
                accessibilityNodeInfo2.setChecked(checkableImageButton.i);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = a1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.v;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).t));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, a1Var.a);
                cc0 cc0Var = (cc0) obj;
                a1Var.b(new v0(cc0Var.k0.getVisibility() == 0 ? cc0Var.l().getString(R.string.mtrl_picker_toggle_to_year_selection) : cc0Var.l().getString(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo4 = a1Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).C);
                break;
            default:
                hm0 hm0Var = (hm0) obj;
                hm0Var.g.d(view, a1Var);
                RecyclerView recyclerView2 = hm0Var.f;
                recyclerView2.getClass();
                wo0 wo0VarI = RecyclerView.I(view);
                if (wo0VarI != null && (recyclerView = wo0VarI.r) != null) {
                    iF = recyclerView.F(wo0VarI);
                }
                ao0 adapter = recyclerView2.getAdapter();
                if (adapter instanceof em0) {
                    ((em0) adapter).i(iF);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p0
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i == 1048576) {
                    vb vbVar = (vb) this.e;
                    if (vbVar.p) {
                        vbVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 5:
                return ((hm0) this.e).g.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}
