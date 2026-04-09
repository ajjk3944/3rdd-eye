package p4;

import D0.a;
import L0.I;
import L0.S;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import h4.C4415c;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import l4.C5287f;
import o.C5380H;
import o.C5385c;
import r4.C5522a;

/* compiled from: MaterialAutoCompleteTextView.java */
/* renamed from: p4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5463m extends C5385c {

    /* renamed from: f, reason: collision with root package name */
    public final C5380H f45186f;

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f45187g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f45188h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f45189j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f45190k;

    /* renamed from: l, reason: collision with root package name */
    public int f45191l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f45192m;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* renamed from: p4.m$a */
    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: b, reason: collision with root package name */
        public ColorStateList f45193b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f45194c;

        public a(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            a();
        }

        public final void a() {
            ColorStateList colorStateList;
            C5463m c5463m = C5463m.this;
            ColorStateList colorStateList2 = c5463m.f45192m;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f45194c = colorStateList;
            if (c5463m.f45191l != 0 && c5463m.f45192m != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C0.d.c(c5463m.f45192m.getColorForState(iArr3, 0), c5463m.f45191l), C0.d.c(c5463m.f45192m.getColorForState(iArr2, 0), c5463m.f45191l), c5463m.f45191l});
            }
            this.f45193b = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C5463m c5463m = C5463m.this;
                Drawable rippleDrawable = null;
                if (c5463m.getText().toString().contentEquals(textView.getText()) && c5463m.f45191l != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(c5463m.f45191l);
                    if (this.f45194c != null) {
                        a.C0009a.h(colorDrawable, this.f45193b);
                        rippleDrawable = new RippleDrawable(this.f45194c, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    public C5463m(Context context, AttributeSet attributeSet) {
        super(C5522a.a(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f45188h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = d4.j.d(context2, attributeSet, K3.a.f3123k, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle, 2132018022, new int[0]);
        if (typedArrayD.hasValue(0) && typedArrayD.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.i = typedArrayD.getResourceId(3, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.mtrl_auto_complete_simple_item);
        this.f45189j = typedArrayD.getDimensionPixelOffset(1, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(2)) {
            this.f45190k = ColorStateList.valueOf(typedArrayD.getColor(2, 0));
        }
        this.f45191l = typedArrayD.getColor(4, 0);
        this.f45192m = C4415c.a(context2, typedArrayD, 5);
        this.f45187g = (AccessibilityManager) context2.getSystemService("accessibility");
        C5380H c5380h = new C5380H(context2, null, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.listPopupWindowStyle);
        this.f45186f = c5380h;
        c5380h.f44555z = true;
        c5380h.f44531A.setFocusable(true);
        c5380h.f44545p = this;
        c5380h.f44531A.setInputMethodMode(2);
        c5380h.o(getAdapter());
        c5380h.f44546q = new C5462l(this);
        if (typedArrayD.hasValue(6)) {
            setSimpleItems(typedArrayD.getResourceId(6, 0));
        }
        typedArrayD.recycle();
    }

    public static void a(C5463m c5463m, Object obj) {
        c5463m.setText(c5463m.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f45187g;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f45186f.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f45190k;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f23054F) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f45189j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f45191l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f45192m;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f23054F && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45186f.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C5380H c5380h = this.f45186f;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c5380h.f44531A.isShowing() ? -1 : c5380h.f44534d.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c5380h.f44531A.getBackground();
                if (background != null) {
                    Rect rect = this.f45188h;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f45186f.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C5380H c5380h = this.f45186f;
        if (c5380h != null) {
            c5380h.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f45190k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C5287f) {
            ((C5287f) dropDownBackground).k(this.f45190k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f45186f.f44547r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f45191l = i;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f45192m = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f45186f.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.i, strArr));
    }
}
