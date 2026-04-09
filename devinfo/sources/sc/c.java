package sc;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends n4.a {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f33527q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f33527q = chip;
    }

    @Override // n4.a
    public final int n(float f10, float f11) {
        Rect rect = Chip.f20412x;
        Chip chip = this.f33527q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
    }

    @Override // n4.a
    public final void o(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.f20412x;
        Chip chip = this.f33527q;
        if (!chip.d() || (eVar = chip.f20415e) == null || !eVar.U || chip.f20417h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // n4.a
    public final boolean s(int i4, int i10, Bundle bundle) {
        boolean z3 = false;
        if (i10 == 16) {
            Chip chip = this.f33527q;
            if (i4 == 0) {
                return chip.performClick();
            }
            if (i4 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f20417h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z3 = true;
                }
                if (chip.f20428t) {
                    chip.f20427s.x(1, 1);
                }
            }
        }
        return z3;
    }

    @Override // n4.a
    public final void t(f4.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
        Chip chip = this.f33527q;
        e eVar = chip.f20415e;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f33528a0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        fVar.k(chip.getAccessibilityClassName());
        fVar.w(chip.getText());
    }

    @Override // n4.a
    public final void u(int i4, f4.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f23651a;
        if (i4 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f20412x);
            return;
        }
        Chip chip = this.f33527q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        fVar.b(f4.c.f23632e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        fVar.k(Button.class.getName());
    }

    @Override // n4.a
    public final void v(int i4, boolean z3) {
        Chip chip = this.f33527q;
        if (i4 == 1) {
            chip.f20422n = z3;
        }
        e eVar = chip.f20415e;
        boolean z10 = chip.f20422n;
        boolean zU = false;
        if (eVar.V != null) {
            zU = eVar.U(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : e.P0);
        }
        if (zU) {
            chip.refreshDrawableState();
        }
    }
}
