package p3;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.apm.insight.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2773b extends X.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f22815q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2773b(Chip chip, Chip chip2) {
        super(chip2);
        this.f22815q = chip;
    }

    @Override // X.b
    public final int n(float f2, float f5) {
        Rect rect = Chip.f18237K;
        Chip chip = this.f22815q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f2, f5)) ? 1 : 0;
    }

    @Override // X.b
    public final void o(ArrayList arrayList) {
        d dVar;
        arrayList.add(0);
        Rect rect = Chip.f18237K;
        Chip chip = this.f22815q;
        if (!chip.d() || (dVar = chip.f18247e) == null || !dVar.f22859i0 || chip.f18250h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // X.b
    public final boolean s(int i, int i3, Bundle bundle) {
        boolean z6 = false;
        if (i3 == 16) {
            Chip chip = this.f22815q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f18250h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z6 = true;
                }
                if (chip.f18243G) {
                    chip.f18242F.x(1, 1);
                }
            }
        }
        return z6;
    }

    @Override // X.b
    public final void t(S.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
        Chip chip = this.f22815q;
        d dVar2 = chip.f18247e;
        accessibilityNodeInfo.setCheckable(dVar2 != null && dVar2.f22865o0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        dVar.i(chip.getAccessibilityClassName());
        dVar.l(chip.getText());
    }

    @Override // X.b
    public final void u(int i, S.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f18237K);
            return;
        }
        Chip chip = this.f22815q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        dVar.b(S.c.f3433g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        dVar.i(Button.class.getName());
    }

    @Override // X.b
    public final void v(int i, boolean z6) {
        Chip chip = this.f22815q;
        if (i == 1) {
            chip.f18254m = z6;
        }
        d dVar = chip.f18247e;
        boolean z7 = chip.f18254m;
        boolean zY = false;
        if (dVar.f22860j0 != null) {
            zY = dVar.Y(z7 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : d.f22816d1);
        }
        if (zY) {
            chip.refreshDrawableState();
        }
    }
}
