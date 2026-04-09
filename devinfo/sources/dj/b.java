package dj;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import cm.g;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import nk.k;
import t6.i0;
import wb.e;
import wi.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f22274a = new HashMap();

    public static final int a(float f10, int i4, int i10) {
        float f11 = 1.0f - f10;
        return Color.rgb((int) ((Color.red(i10) * f11) + (Color.red(i4) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i4) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i4) * f10)));
    }

    public static final ColorStateList b(int i4, Context context) {
        k.e(context, "context");
        boolean zN = i0.n(context);
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        iArr[0] = new int[]{-16842910};
        if (zN) {
            iArr2[0] = context.getColor(R.color.md_grey_700);
        } else {
            iArr2[0] = a(0.95f, context.getColor(R.color.md_grey_300), -16777216);
        }
        iArr[1] = new int[]{android.R.attr.state_checked};
        iArr2[1] = i4;
        iArr[2] = new int[0];
        if (zN) {
            iArr2[2] = context.getColor(R.color.md_grey_400);
        } else {
            iArr2[2] = context.getColor(R.color.md_grey_600);
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static final ColorStateList c(int i4) {
        return new ColorStateList(new int[][]{new int[]{0}}, new int[]{i4});
    }

    public static final ColorStateList d(int i4, int i10) {
        return new ColorStateList(new int[][]{new int[]{android.R.attr.state_checkable, android.R.attr.state_checked, android.R.attr.state_enabled}, new int[]{android.R.attr.state_checkable, -16842912, android.R.attr.state_enabled}, new int[]{android.R.attr.state_enabled}, new int[0]}, new int[]{g.H(i4, 1.0f), g.H(i10, 0.6f), g.H(i4, 1.0f), g.H(i10, 0.38f)});
    }

    public static void e(int i4, Chip chip) throws Resources.NotFoundException {
        k.e(chip, "chip");
        Context context = chip.getContext();
        k.d(context, "getContext(...)");
        chip.setTextColor(d(i4, g.l(R.attr.colorOnSurface, context)));
        Context context2 = chip.getContext();
        k.d(context2, "getContext(...)");
        int iL = g.l(R.attr.colorOnSurface, context2);
        chip.setChipBackgroundColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled, android.R.attr.state_selected}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled}, new int[0]}, new int[]{g.H(i4, 0.24f), g.H(i4, 0.24f), g.H(iL, 0.1f), g.H(iL, 0.12f)}));
        Context context3 = chip.getContext();
        k.d(context3, "getContext(...)");
        int iL2 = g.l(R.attr.colorOnSurface, context3);
        TypedValue typedValue = new TypedValue();
        context3.getResources().getValue(R.dimen.mtrl_low_ripple_pressed_alpha, typedValue, true);
        int iH = g.H(i4, typedValue.getFloat());
        TypedValue typedValue2 = new TypedValue();
        context3.getResources().getValue(R.dimen.mtrl_low_ripple_focused_alpha, typedValue2, true);
        int iH2 = g.H(iL2, typedValue2.getFloat());
        int iH3 = g.H(iL2, typedValue2.getFloat());
        TypedValue typedValue3 = new TypedValue();
        context3.getResources().getValue(R.dimen.mtrl_low_ripple_hovered_alpha, typedValue3, true);
        int iH4 = g.H(iL2, typedValue3.getFloat());
        TypedValue typedValue4 = new TypedValue();
        context3.getResources().getValue(R.dimen.mtrl_low_ripple_default_alpha, typedValue4, true);
        chip.setRippleColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused, android.R.attr.state_hovered}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_hovered}, new int[0]}, new int[]{iH, iH2, iH3, iH4, g.H(iL2, typedValue4.getFloat())}));
    }

    public static void f(ViewGroup viewGroup, Class cls, int i4, String... strArr) throws NoSuchFieldException, SecurityException {
        for (String str : strArr) {
            try {
                String str2 = cls.getSimpleName() + "_" + str;
                HashMap map = f22274a;
                Field declaredField = (Field) map.get(str2);
                if (declaredField == null) {
                    declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    map.put(str2, declaredField);
                }
                EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(viewGroup);
                if (edgeEffect != null) {
                    edgeEffect.setColor(i4);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void g(int i4, EditText... editTextArr) {
        int color = editTextArr[0].getContext().getColor(R.color.md_grey_200);
        int[][] iArr = {new int[]{-16842910}, new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_checked}, new int[]{0}};
        int[] iArr2 = {color, i4, i4, i4, i4, editTextArr[0].getContext().getColor(R.color.md_grey_500)};
        for (EditText editText : editTextArr) {
            editText.setBackgroundTintList(new ColorStateList(iArr, iArr2));
            if (h.f36760e) {
                Drawable textCursorDrawable = editText.getTextCursorDrawable();
                editText.setTextCursorDrawable(textCursorDrawable != null ? e.M(textCursorDrawable, i4) : null);
            } else {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    int i10 = declaredField.getInt(editText);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(editText);
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    Drawable[] drawableArr = {editText.getContext().getDrawable(i10), editText.getContext().getDrawable(i10)};
                    Drawable drawable = drawableArr[0];
                    if (drawable != null) {
                        drawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
                    }
                    Drawable drawable2 = drawableArr[1];
                    if (drawable2 != null) {
                        drawable2.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
                    }
                    declaredField3.set(obj, drawableArr);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static final void h(MaterialButton materialButton, int i4) throws Resources.NotFoundException {
        k.e(materialButton, "button");
        Context context = materialButton.getContext();
        k.b(context);
        materialButton.setStrokeColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{i4, g.H(g.l(R.attr.colorOnSurface, context), 0.12f)}));
        q(materialButton, i4);
    }

    public static final void i(ProgressBar progressBar, int i4) {
        k.e(progressBar, "progress");
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            progressBar.setIndeterminateDrawable(e.M(indeterminateDrawable, i4));
        }
        Drawable progressDrawable = progressBar.getProgressDrawable();
        if (progressDrawable != null) {
            progressBar.setProgressDrawable(e.M(progressDrawable, i4));
        }
    }

    public static final void j(ProgressBar progressBar, z2.k kVar) {
        k.e(progressBar, "progress");
        k.e(kVar, "handler");
        i(progressBar, kVar.b(progressBar.getContext()));
    }

    public static final void k(RecyclerView recyclerView, int i4) {
        k.e(recyclerView, "rv");
        recyclerView.setEdgeEffectFactory(new a(i4));
    }

    public static final void l(RecyclerView recyclerView, z2.k kVar) {
        k.e(recyclerView, "rv");
        k.e(kVar, "handler");
        k(recyclerView, kVar.b(recyclerView.getContext()));
    }

    public static final void m(ScrollView scrollView, int i4) throws NoSuchFieldException, SecurityException {
        k.e(scrollView, "sv");
        if (h.f36760e) {
            scrollView.setEdgeEffectColor(i4);
        } else {
            f(scrollView, ScrollView.class, i4, "mEdgeGlowTop", "mEdgeGlowBottom");
        }
    }

    public static final void n(ScrollView scrollView, z2.k kVar) throws NoSuchFieldException, SecurityException {
        k.e(scrollView, "sv");
        m(scrollView, kVar.b(scrollView.getContext()));
    }

    public static final void o(Slider slider, int i4) {
        k.e(slider, "slider");
        slider.setTrackActiveTintList(c(i4));
        slider.setTrackInactiveTintList(c(g.H(i4, 0.24f)));
        slider.setThumbTintList(c(i4));
        slider.setHaloTintList(c(g.H(i4, 0.24f)));
    }

    public static final void p(SwitchCompat switchCompat, int i4) {
        k.e(switchCompat, "switchWidget");
        Context context = switchCompat.getContext();
        k.d(context, "getContext(...)");
        boolean zN = i0.n(context);
        int[] iArr = new int[3];
        if (zN) {
            iArr[0] = context.getColor(R.color.md_grey_700);
        } else {
            iArr[0] = a(0.85f, context.getColor(R.color.md_grey_400), -1);
        }
        iArr[1] = i4;
        int[][] iArr2 = {new int[]{-16842910}, new int[]{android.R.attr.state_checked}, new int[0]};
        if (zN) {
            iArr[2] = context.getColor(R.color.md_grey_400);
        } else {
            iArr[2] = context.getColor(R.color.md_grey_100);
        }
        switchCompat.setThumbTintList(new ColorStateList(iArr2, iArr));
        Context context2 = switchCompat.getContext();
        k.d(context2, "getContext(...)");
        boolean zN2 = i0.n(context2);
        int[] iArr3 = new int[3];
        if (zN2) {
            iArr3[0] = context2.getColor(R.color.md_grey_800);
        } else {
            iArr3[0] = a(0.4f, context2.getColor(R.color.md_grey_400), -1);
        }
        if (zN2) {
            iArr3[1] = a(0.5f, i4, -16777216);
        } else {
            iArr3[1] = a(0.45f, i4, -1);
        }
        int[][] iArr4 = {new int[]{-16842910}, new int[]{android.R.attr.state_checked}, new int[0]};
        if (zN2) {
            iArr3[2] = context2.getColor(R.color.md_grey_600);
        } else {
            iArr3[2] = context2.getColor(R.color.md_grey_500);
        }
        switchCompat.setTrackTintList(new ColorStateList(iArr4, iArr3));
    }

    public static final void q(MaterialButton materialButton, int i4) throws Resources.NotFoundException {
        k.e(materialButton, "button");
        Context context = materialButton.getContext();
        k.b(context);
        int iL = g.l(R.attr.colorOnSurface, context);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.mtrl_low_ripple_pressed_alpha, typedValue, true);
        int iH = g.H(i4, typedValue.getFloat());
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(R.dimen.mtrl_low_ripple_focused_alpha, typedValue2, true);
        int iH2 = g.H(i4, typedValue2.getFloat());
        int iH3 = g.H(i4, typedValue2.getFloat());
        TypedValue typedValue3 = new TypedValue();
        context.getResources().getValue(R.dimen.mtrl_low_ripple_hovered_alpha, typedValue3, true);
        int iH4 = g.H(i4, typedValue3.getFloat());
        TypedValue typedValue4 = new TypedValue();
        context.getResources().getValue(R.dimen.mtrl_low_ripple_default_alpha, typedValue4, true);
        materialButton.setRippleColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused, android.R.attr.state_hovered}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_hovered}, new int[0]}, new int[]{iH, iH2, iH3, iH4, g.H(i4, typedValue4.getFloat())}));
        materialButton.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{g.H(i4, 0.08f), 0}));
        materialButton.setTextColor(d(i4, iL));
    }

    public static final void r(ViewPager viewPager, int i4) throws NoSuchFieldException, SecurityException {
        k.e(viewPager, "sv");
        f(viewPager, ViewPager.class, i4, "mLeftEdge", "mRightEdge");
    }

    public static final void s(Dialog dialog, int i4) throws Resources.NotFoundException {
        i.e eVar = (i.e) dialog;
        Button buttonF = eVar.f(-1);
        if (buttonF != null) {
            buttonF.setTextColor(i4);
            if (buttonF instanceof MaterialButton) {
                q((MaterialButton) buttonF, i4);
            }
        }
        Button buttonF2 = eVar.f(-2);
        if (buttonF2 != null) {
            buttonF2.setTextColor(i4);
            if (buttonF2 instanceof MaterialButton) {
                q((MaterialButton) buttonF2, i4);
            }
        }
        Button buttonF3 = eVar.f(-3);
        if (buttonF3 != null) {
            buttonF3.setTextColor(i4);
            if (buttonF3 instanceof MaterialButton) {
                q((MaterialButton) buttonF3, i4);
            }
        }
    }

    public static final void t(Dialog dialog, int i4) {
        try {
            s(dialog, i4);
            Window window = dialog.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                k.d(decorView, "getDecorView(...)");
                u(i4, decorView);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(int i4, View view) throws NoSuchFieldException, SecurityException {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof CheckedTextView) {
                return;
            }
            if (view instanceof ProgressBar) {
                i((ProgressBar) view, i4);
                return;
            }
            if (view instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) view;
                textInputLayout.setHintTextColor(c(i4));
                textInputLayout.setBoxStrokeColor(i4);
                return;
            } else {
                if (view instanceof EditText) {
                    g(i4, view);
                    return;
                }
                return;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup instanceof RecyclerView) {
            k((RecyclerView) view, i4);
        } else if (viewGroup instanceof ScrollView) {
            m((ScrollView) view, i4);
        } else if (viewGroup instanceof ViewPager) {
            r((ViewPager) view, i4);
        } else if (viewGroup instanceof NestedScrollView) {
            f((NestedScrollView) view, NestedScrollView.class, i4, "mEdgeGlowTop", "mEdgeGlowBottom");
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            k.d(childAt, "getChildAt(...)");
            u(i4, childAt);
        }
    }
}
