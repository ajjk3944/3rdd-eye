package A3;

import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.apm.insight.R;
import com.google.android.material.internal.NavigationMenuItemView;
import h.C2346d;
import j3.C2562b;
import o.d1;
import s2.BinderC2894d;
import x3.C3004i;

/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f443b;

    public /* synthetic */ o(int i, Object obj) {
        this.f442a = i;
        this.f443b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f442a) {
            case 0:
                n.m itemData = ((k) view).getItemData();
                C2562b c2562b = (C2562b) this.f443b;
                boolean zQ = c2562b.f472d0.f437a.q(itemData, c2562b.f470c0, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!zQ || itemData.isChecked()) {
                        c2562b.setCheckedItem(itemData);
                        break;
                    }
                }
                break;
            case 1:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f443b;
                int i = jVar.f18284o0;
                if (i != 2) {
                    if (i == 1) {
                        jVar.Y(2);
                        jVar.f18286q0.announceForAccessibility(jVar.r(R.string.mtrl_picker_toggled_to_year_selection));
                        break;
                    }
                } else {
                    jVar.Y(1);
                    jVar.f18287r0.announceForAccessibility(jVar.r(R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                }
                break;
            case 2:
                C2346d c2346d = (C2346d) this.f443b;
                c2346d.f20337v.obtainMessage(1, c2346d.f20318b).sendToTarget();
                break;
            case 3:
                ((i2.k) this.f443b).f20578v.showPrivacyActivity();
                break;
            case 4:
                k3.e eVar = (k3.e) this.f443b;
                if (eVar.f21795j && eVar.isShowing()) {
                    if (!eVar.f21797l) {
                        TypedArray typedArrayObtainStyledAttributes = eVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        eVar.f21796k = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        eVar.f21797l = true;
                    }
                    if (eVar.f21796k) {
                        eVar.cancel();
                        break;
                    }
                }
                break;
            case 5:
                ((m.a) this.f443b).a();
                break;
            case 6:
                d1 d1Var = ((Toolbar) this.f443b).f5011d0;
                n.m mVar = d1Var == null ? null : d1Var.f22503b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            case 7:
                BinderC2894d binderC2894d = (BinderC2894d) this.f443b;
                binderC2894d.f23458K = 2;
                binderC2894d.f23460b.finish();
                break;
            default:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                x3.q qVar = (x3.q) this.f443b;
                C3004i c3004i = qVar.f24148e;
                boolean z6 = true;
                if (c3004i != null) {
                    c3004i.f24123c = true;
                }
                n.m itemData2 = navigationMenuItemView.getItemData();
                boolean zQ2 = qVar.f24146c.q(itemData2, qVar, 0);
                if (itemData2 != null && itemData2.isCheckable() && zQ2) {
                    qVar.f24148e.b(itemData2);
                } else {
                    z6 = false;
                }
                C3004i c3004i2 = qVar.f24148e;
                if (c3004i2 != null) {
                    c3004i2.f24123c = false;
                }
                if (z6) {
                    qVar.b(false);
                    break;
                }
                break;
        }
    }
}
