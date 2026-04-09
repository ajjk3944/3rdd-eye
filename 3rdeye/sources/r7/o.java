package r7;

import O6.B;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;
import b9.C1992A;
import kotlin.KotlinVersion;
import z0.C5848a;

/* compiled from: SwitchView.kt */
/* loaded from: classes.dex */
public class o extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f45816f = {new int[]{-16842910}, new int[]{R.attr.state_checked}, new int[0]};

    /* renamed from: b, reason: collision with root package name */
    public final SwitchCompat f45817b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f45818c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f45819d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f45820e;

    public o(Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context, null);
        this.f45817b = switchCompat;
        int[] iArr = {Color.argb((int) (0.1f * f), Color.red(iA), Color.green(iA), Color.blue(iA)), Color.argb((int) (Color.alpha(iA) * 0.3f), Color.red(iA), Color.green(iA), Color.blue(iA)), Color.argb((int) (0.3f * f), Color.red(iA), Color.green(iA), Color.blue(iA))};
        this.f45819d = iArr;
        int[] iArr2 = {C0.d.b(0.5f, iA, -1), iA, iA};
        this.f45820e = iArr2;
        switchCompat.setShowText(false);
        switchCompat.setBackground(P6.a.f10657a);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new D8.f((B) this, 9));
        TypedValue typedValue = new TypedValue();
        int iA = a(R.attr.colorForeground, typedValue, false);
        int iA2 = a(R.attr.colorControlActivated, typedValue, false);
        int iA3 = a(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSwitchThumbNormal, typedValue, true);
        float f10 = KotlinVersion.MAX_COMPONENT_VALUE;
        int[][] iArr3 = f45816f;
        switchCompat.setTrackTintList(new ColorStateList(iArr3, iArr));
        switchCompat.setThumbTintList(new ColorStateList(iArr3, iArr2));
    }

    public final int a(int i, TypedValue typedValue, boolean z10) {
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return (!z10 || typedValue.resourceId == 0) ? typedValue.data : C5848a.getColor(getContext(), typedValue.resourceId);
        }
        return 0;
    }

    public final Integer getColorOn() {
        return this.f45818c;
    }

    public final ColorStateList getThumbTintList$div_release() {
        return this.f45817b.getThumbTintList();
    }

    public final ColorStateList getTrackTintList$div_release() {
        return this.f45817b.getTrackTintList();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.f45817b.isEnabled();
    }

    public final void setChecked(boolean z10) {
        this.f45817b.setChecked(z10);
    }

    public final void setColorOn(Integer num) {
        this.f45818c = num;
        if (num != null) {
            int iIntValue = num.intValue();
            int[] iArr = this.f45820e;
            iArr[1] = iIntValue;
            int iArgb = Color.argb((int) (Color.alpha(iIntValue) * 0.3f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
            int[] iArr2 = this.f45819d;
            iArr2[1] = iArgb;
            int[][] iArr3 = f45816f;
            ColorStateList colorStateList = new ColorStateList(iArr3, iArr2);
            SwitchCompat switchCompat = this.f45817b;
            switchCompat.setTrackTintList(colorStateList);
            switchCompat.setThumbTintList(new ColorStateList(iArr3, iArr));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        this.f45817b.setEnabled(z10);
    }

    public final void setOnCheckedChangeListener(p9.l<? super Boolean, C1992A> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f45817b.setOnCheckedChangeListener(new B2.k(listener, 1));
    }

    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }
}
