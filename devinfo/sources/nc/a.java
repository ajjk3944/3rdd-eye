package nc;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.google.android.gms.internal.consent_sdk.a0;
import com.liuzh.deviceinfo.R;
import nk.k;
import p.v3;
import p.z2;
import th.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29940b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f29939a = i4;
        this.f29940b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.f29939a;
        Object obj = this.f29940b;
        switch (i17) {
            case 0:
                throw null;
            case 1:
                nd.a aVar = (nd.a) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aVar.T = iArr[0];
                view.getWindowVisibleDisplayFrame(aVar.M);
                return;
            case 2:
                z2 z2Var = (z2) obj;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = z2Var.f30931p;
                View view2 = z2Var.f30939x;
                if (view2.getWidth() > 1) {
                    Resources resources = z2Var.getContext().getResources();
                    int paddingLeft = z2Var.f30933r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z3 = v3.f30896a;
                    boolean z10 = z2Var.getLayoutDirection() == 1;
                    int dimensionPixelSize = z2Var.O ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchView$SearchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchView$SearchAutoComplete.setDropDownHorizontalOffset(z10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchView$SearchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                f fVar = (f) obj;
                a0 a0Var = fVar.Z;
                if (a0Var == null) {
                    k.k("binding");
                    throw null;
                }
                if (((AppCompatSpinner) a0Var.f19261i).getMeasuredWidth() >= 0) {
                    a0 a0Var2 = fVar.Z;
                    if (a0Var2 == null) {
                        k.k("binding");
                        throw null;
                    }
                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a0Var2.f19261i;
                    if (a0Var2 != null) {
                        appCompatSpinner.setDropDownWidth(appCompatSpinner.getMeasuredWidth());
                        return;
                    } else {
                        k.k("binding");
                        throw null;
                    }
                }
                return;
        }
    }
}
