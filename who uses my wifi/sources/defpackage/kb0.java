package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kb0 extends ArrayAdapter {
    public ColorStateList f;
    public ColorStateList g;
    public final /* synthetic */ lb0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(lb0 lb0Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.h = lb0Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        lb0 lb0Var = this.h;
        ColorStateList colorStateList2 = lb0Var.q;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.g = colorStateList;
        if (lb0Var.p != 0 && lb0Var.q != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{hg.b(lb0Var.q.getColorForState(iArr3, 0), lb0Var.p), hg.b(lb0Var.q.getColorForState(iArr2, 0), lb0Var.p), lb0Var.p});
        }
        this.f = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            lb0 lb0Var = this.h;
            Drawable rippleDrawable = null;
            if (lb0Var.getText().toString().contentEquals(textView.getText()) && lb0Var.p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(lb0Var.p);
                if (this.g != null) {
                    colorDrawable.setTintList(this.f);
                    rippleDrawable = new RippleDrawable(this.g, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
