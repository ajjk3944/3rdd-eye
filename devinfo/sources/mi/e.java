package mi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.liuzh.deviceinfo.view.togglebuttongroup.SingleSelectToggleGroup;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29391a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f29392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f29393c;

    public /* synthetic */ e(ViewGroup viewGroup, int i4) {
        this.f29391a = i4;
        this.f29393c = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.f29391a) {
            case 0:
                SingleSelectToggleGroup singleSelectToggleGroup = (SingleSelectToggleGroup) this.f29393c;
                if (view == singleSelectToggleGroup && (view2 instanceof Checkable)) {
                    if (view2.getId() == -1) {
                        view2.setId(View.generateViewId());
                    }
                    if (view2 instanceof ni.b) {
                        singleSelectToggleGroup.setStateTracker((ni.b) view2);
                    } else if (view2 instanceof CompoundButton) {
                        singleSelectToggleGroup.setStateTracker((CompoundButton) view2);
                    }
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f29392b;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            default:
                ChipGroup chipGroup = (ChipGroup) this.f29393c;
                if (view == chipGroup && (view2 instanceof Chip)) {
                    if (view2.getId() == -1) {
                        view2.setId(View.generateViewId());
                    }
                    ur0 ur0Var = chipGroup.f20434h;
                    Chip chip = (Chip) view2;
                    ((HashMap) ur0Var.f17304d).put(Integer.valueOf(chip.getId()), chip);
                    if (chip.isChecked()) {
                        ur0Var.a(chip);
                    }
                    chip.setInternalOnCheckedChangeListener(new z2.f(ur0Var));
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.f29392b;
                if (onHierarchyChangeListener2 != null) {
                    onHierarchyChangeListener2.onChildViewAdded(view, view2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.f29391a) {
            case 0:
                if (view == ((SingleSelectToggleGroup) this.f29393c) && (view2 instanceof Checkable)) {
                    if (view2 instanceof ni.b) {
                        ((ni.a) ((ni.b) view2)).setOnCheckedChangeListener(null);
                    } else if (view2 instanceof CompoundButton) {
                        ((CompoundButton) view2).setOnCheckedChangeListener(null);
                    }
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f29392b;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
            default:
                ChipGroup chipGroup = (ChipGroup) this.f29393c;
                if (view == chipGroup && (view2 instanceof Chip)) {
                    ur0 ur0Var = chipGroup.f20434h;
                    Chip chip = (Chip) view2;
                    ur0Var.getClass();
                    chip.setInternalOnCheckedChangeListener(null);
                    ((HashMap) ur0Var.f17304d).remove(Integer.valueOf(chip.getId()));
                    ((HashSet) ur0Var.f17305e).remove(Integer.valueOf(chip.getId()));
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.f29392b;
                if (onHierarchyChangeListener2 != null) {
                    onHierarchyChangeListener2.onChildViewRemoved(view, view2);
                    break;
                }
                break;
        }
    }
}
