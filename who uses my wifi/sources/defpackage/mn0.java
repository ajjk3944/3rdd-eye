package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class mn0 extends ConstraintLayout {
    public final e2 v;
    public int w;
    public final nc0 x;

    public mn0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        nc0 nc0Var = new nc0();
        this.x = nc0Var;
        fp0 fp0Var = new fp0(0.5f);
        f2 f2VarF = nc0Var.g.a.f();
        f2VarF.e = fp0Var;
        f2VarF.f = fp0Var;
        f2VarF.g = fp0Var;
        f2VarF.h = fp0Var;
        nc0Var.setShapeAppearanceModel(f2VarF.a());
        this.x.q(ColorStateList.valueOf(-1));
        setBackground(this.x);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.F, R.attr.materialClockStyle, 0);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = new e2(14, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e2 e2Var = this.v;
            handler.removeCallbacks(e2Var);
            handler.post(e2Var);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e2 e2Var = this.v;
            handler.removeCallbacks(e2Var);
            handler.post(e2Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x.q(ColorStateList.valueOf(i));
    }
}
