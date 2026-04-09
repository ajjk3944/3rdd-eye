package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nt extends z71 {
    public final /* synthetic */ ze p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(ze zeVar) {
        super(3);
        this.p = zeVar;
    }

    @Override // defpackage.z71
    public final a1 d(int i) {
        return new a1(AccessibilityNodeInfo.obtain(this.p.n(i).a));
    }

    @Override // defpackage.z71
    public final a1 e(int i) {
        ze zeVar = this.p;
        int i2 = i == 2 ? zeVar.k : zeVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return d(i2);
    }

    @Override // defpackage.z71
    public final boolean h(int i, int i2, Bundle bundle) {
        int i3;
        ze zeVar = this.p;
        Chip chip = zeVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = e61.a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return zeVar.p(i);
        }
        if (i2 == 2) {
            return zeVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = zeVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = zeVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                zeVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                zeVar.q(i3, 65536);
            }
            zeVar.k = i;
            chip.invalidate();
            zeVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (zeVar.k != i) {
                return false;
            }
            zeVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            zeVar.q(i, 65536);
            return true;
        }
        Chip chip2 = zeVar.n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.x) {
                    chip2.w.q(1, 1);
                }
            }
        }
        return z;
    }
}
