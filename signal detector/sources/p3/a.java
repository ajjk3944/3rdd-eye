package P3;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.apm.insight.R;
import o.q1;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3127b;

    public /* synthetic */ a(int i, Object obj) {
        this.f3126a = i;
        this.f3127b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = this.f3126a;
        Object obj = this.f3127b;
        switch (i12) {
            case 0:
                b bVar = (b) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                bVar.f3139h0 = iArr[0];
                view.getWindowVisibleDisplayFrame(bVar.f3133a0);
                return;
            case 1:
                throw null;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f4899D;
                View view2 = searchView.f4907L;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f4901F.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z6 = q1.f22618a;
                    boolean z7 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.f4922f0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(z7 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
