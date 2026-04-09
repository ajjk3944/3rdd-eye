package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f884a;

    /* renamed from: b, reason: collision with root package name */
    private final View f885b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f886c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f887d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f888e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f889f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f890g;

    a1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f887d = layoutParams;
        this.f888e = new Rect();
        this.f889f = new int[2];
        this.f890g = new int[2];
        this.f884a = context;
        View viewInflate = LayoutInflater.from(context).inflate(a.g.f116s, (ViewGroup) null);
        this.f885b = viewInflate;
        this.f886c = (TextView) viewInflate.findViewById(a.f.f90s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.i.f130a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i2, int i3, boolean z2, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f884a.getResources().getDimensionPixelOffset(a.d.f43j);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f884a.getResources().getDimensionPixelOffset(a.d.f42i);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f884a.getResources().getDimensionPixelOffset(z2 ? a.d.f45l : a.d.f44k);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f888e);
        Rect rect = this.f888e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f884a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f888e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f890g);
        view.getLocationOnScreen(this.f889f);
        int[] iArr = this.f889f;
        int i5 = iArr[0];
        int[] iArr2 = this.f890g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f885b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f885b.getMeasuredHeight();
        int[] iArr3 = this.f889f;
        int i6 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z2 ? measuredHeight + i7 <= this.f888e.height() : i6 < 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f884a.getSystemService("window")).removeView(this.f885b);
        }
    }

    boolean d() {
        return this.f885b.getParent() != null;
    }

    void e(View view, int i2, int i3, boolean z2, CharSequence charSequence) throws Resources.NotFoundException {
        if (d()) {
            c();
        }
        this.f886c.setText(charSequence);
        a(view, i2, i3, z2, this.f887d);
        ((WindowManager) this.f884a.getSystemService("window")).addView(this.f885b, this.f887d);
    }
}
