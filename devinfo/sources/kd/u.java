package kd;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f28231a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f28232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f28233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, int i4, String[] strArr) {
        super(context, i4, strArr);
        this.f28233c = vVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        v vVar = this.f28233c;
        ColorStateList colorStateList2 = vVar.f28239l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f28232b = colorStateList;
        if (vVar.f28238k != 0 && vVar.f28239l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{v3.a.b(vVar.f28239l.getColorForState(iArr3, 0), vVar.f28238k), v3.a.b(vVar.f28239l.getColorForState(iArr2, 0), vVar.f28238k), vVar.f28238k});
        }
        this.f28231a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            v vVar = this.f28233c;
            Drawable rippleDrawable = null;
            if (vVar.getText().toString().contentEquals(textView.getText()) && vVar.f28238k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(vVar.f28238k);
                if (this.f28232b != null) {
                    colorDrawable.setTintList(this.f28231a);
                    rippleDrawable = new RippleDrawable(this.f28232b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
