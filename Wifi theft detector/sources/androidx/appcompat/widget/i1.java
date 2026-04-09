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
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1178a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1179b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1180c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f1181d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1182e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1183f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1184g;

    public i1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1181d = layoutParams;
        this.f1182e = new Rect();
        this.f1183f = new int[2];
        this.f1184g = new int[2];
        this.f1178a = context;
        View viewInflate = LayoutInflater.from(context).inflate(c.g.abc_tooltip, (ViewGroup) null);
        this.f1179b = viewInflate;
        this.f1180c = (TextView) viewInflate.findViewById(c.f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = c.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1178a.getResources().getDimensionPixelOffset(c.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1178a.getResources().getDimensionPixelOffset(c.d.tooltip_precise_anchor_extra_offset);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1178a.getResources().getDimensionPixelOffset(z10 ? c.d.tooltip_y_offset_touch : c.d.tooltip_y_offset_non_touch);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1182e);
        Rect rect = this.f1182e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1178a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1182e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f1184g);
        view.getLocationOnScreen(this.f1183f);
        int[] iArr = this.f1183f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1184g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1179b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1179b.getMeasuredHeight();
        int i15 = this.f1183f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f1182e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f1178a.getSystemService("window")).removeView(this.f1179b);
        }
    }

    public boolean d() {
        return this.f1179b.getParent() != null;
    }

    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) throws Resources.NotFoundException {
        if (d()) {
            c();
        }
        this.f1180c.setText(charSequence);
        a(view, i10, i11, z10, this.f1181d);
        ((WindowManager) this.f1178a.getSystemService("window")).addView(this.f1179b, this.f1181d);
    }
}
