package zc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f38234a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f38235b = {R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.recyclerview.widget.m f38236c = new androidx.recyclerview.widget.m(26);

    public static void a(Context context, AttributeSet attributeSet, int i4, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.M, i4, i10);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f38235b, "Theme.MaterialComponents");
            }
        }
        c(context, f38234a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i10, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.M, i4, i10);
        boolean z3 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i10);
            for (int i11 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i11, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z3 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z3 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z3) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i4)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(d.h.t("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float d(int i4, Context context) {
        return TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup e(gd.e eVar) {
        View rootView = eVar.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == eVar || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ArrayList f(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < materialToolbar.getChildCount(); i4++) {
            View childAt = materialToolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TypedArray g(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i10, int... iArr2) {
        a(context, attributeSet, i4, i10);
        b(context, attributeSet, iArr, i4, i10, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i10);
    }

    public static PorterDuff.Mode h(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
