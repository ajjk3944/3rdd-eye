package qd;

import android.R;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import ed.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends b4.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f20847q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f20847q = chip;
    }

    @Override // b4.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        int i10 = Chip.S;
        Chip chip = this.f20847q;
        if (!chip.c() || (eVar = chip.f5570x) == null || !eVar.f20874q0 || chip.D == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // b4.b
    public final void o(int i10, v3.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.T);
            return;
        }
        Chip chip = this.f20847q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(j.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        cVar.b(v3.b.f23825e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        cVar.i(Button.class.getName());
    }

    @Override // b4.b
    public final void p(int i10, boolean z10) {
        Chip chip = this.f20847q;
        if (i10 == 1) {
            chip.I = z10;
        }
        e eVar = chip.f5570x;
        boolean z11 = chip.I;
        boolean zW = false;
        if (eVar.f20875r0 != null) {
            zW = eVar.W(z11 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : e.f20848l1);
        }
        if (zW) {
            chip.refreshDrawableState();
        }
    }
}
