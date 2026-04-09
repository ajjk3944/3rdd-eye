package je;

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

/* loaded from: classes.dex */
public final class s extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f13684a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f13685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f13686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f13686c = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f13686c;
        ColorStateList colorStateList2 = tVar.H;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f13685b = colorStateList;
        if (tVar.G != 0 && tVar.H != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{k3.c.b(tVar.H.getColorForState(iArr3, 0), tVar.G), k3.c.b(tVar.H.getColorForState(iArr2, 0), tVar.G), tVar.G});
        }
        this.f13684a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f13686c;
            Drawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText()) && tVar.G != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(tVar.G);
                if (this.f13685b != null) {
                    colorDrawable.setTintList(this.f13684a);
                    rippleDrawable = new RippleDrawable(this.f13685b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
