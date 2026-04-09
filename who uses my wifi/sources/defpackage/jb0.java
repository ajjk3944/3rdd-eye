package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jb0 extends t3 {
    public final nc0 i;
    public final Rect j;

    /* JADX WARN: Illegal instructions before constructor call */
    public jb0(Context context) {
        TypedValue typedValueN = qb1.n(context, R.attr.materialAlertDialogTheme);
        int i = typedValueN == null ? 0 : typedValueN.data;
        Context contextA = um.A(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        contextA = i != 0 ? new nj(contextA, i) : contextA;
        TypedValue typedValueN2 = qb1.n(context, R.attr.materialAlertDialogTheme);
        super(contextA, typedValueN2 == null ? 0 : typedValueN2.data);
        ContextThemeWrapper contextThemeWrapper = ((p3) this.h).a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        uk2.h(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = gn0.p;
        uk2.i(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.j = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        TypedValue typedValueP = qb1.p(R.attr.colorSurface, contextThemeWrapper, jb0.class.getCanonicalName());
        int i2 = typedValueP.resourceId;
        int iA = i2 != 0 ? kj.a(contextThemeWrapper, i2) : typedValueP.data;
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iA);
        typedArrayObtainStyledAttributes2.recycle();
        nc0 nc0Var = new nc0(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        nc0Var.m(contextThemeWrapper);
        nc0Var.q(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((p3) this.h).a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                f2 f2VarF = nc0Var.g.a.f();
                f2VarF.e = new l(dimension);
                f2VarF.f = new l(dimension);
                f2VarF.g = new l(dimension);
                f2VarF.h = new l(dimension);
                nc0Var.setShapeAppearanceModel(f2VarF.a());
            }
        }
        this.i = nc0Var;
    }

    @Override // defpackage.t3
    public final u3 b() {
        u3 u3VarB = super.b();
        Window window = u3VarB.getWindow();
        View decorView = window.getDecorView();
        nc0 nc0Var = this.i;
        if (nc0Var != null) {
            nc0Var.p(decorView.getElevation());
        }
        Rect rect = this.j;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) nc0Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new w20(u3VarB, rect));
        return u3VarB;
    }

    @Override // defpackage.t3
    public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.g(null, null);
    }
}
