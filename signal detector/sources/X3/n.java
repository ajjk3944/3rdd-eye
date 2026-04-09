package x3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.i0;
import com.google.android.material.internal.NavigationMenuView;

/* loaded from: classes.dex */
public final class n extends i0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f24129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f24129f = qVar;
    }

    @Override // androidx.recyclerview.widget.i0, R.C0175b
    public final void d(View view, S.d dVar) {
        super.d(view, dVar);
        q qVar = this.f24129f.f24148e.f24124d;
        int i = 0;
        for (int i3 = 0; i3 < qVar.f24148e.f24121a.size(); i3++) {
            int itemViewType = qVar.f24148e.getItemViewType(i3);
            if (itemViewType == 0 || itemViewType == 1) {
                i++;
            }
        }
        dVar.f3446a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
