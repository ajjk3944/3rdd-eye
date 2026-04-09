package X;

import R.O;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends A0.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f4105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(12);
        this.f4105c = bVar;
    }

    @Override // A0.e
    public final S.d n(int i) {
        return new S.d(AccessibilityNodeInfo.obtain(this.f4105c.r(i).f3446a));
    }

    @Override // A0.e
    public final S.d o(int i) {
        b bVar = this.f4105c;
        int i3 = i == 2 ? bVar.f4115k : bVar.f4116l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return n(i3);
    }

    @Override // A0.e
    public final boolean r(int i, int i3, Bundle bundle) {
        int i6;
        b bVar = this.f4105c;
        View view = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = O.f3270a;
            return view.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 1) {
            return bVar.w(i);
        }
        if (i3 == 2) {
            return bVar.j(i);
        }
        if (i3 != 64) {
            if (i3 != 128) {
                return bVar.s(i, i3, bundle);
            }
            if (bVar.f4115k != i) {
                return false;
            }
            bVar.f4115k = LinearLayoutManager.INVALID_OFFSET;
            view.invalidate();
            bVar.x(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = bVar.f4113h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i6 = bVar.f4115k) == i) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            bVar.f4115k = LinearLayoutManager.INVALID_OFFSET;
            view.invalidate();
            bVar.x(i6, 65536);
        }
        bVar.f4115k = i;
        view.invalidate();
        bVar.x(i, 32768);
        return true;
    }
}
