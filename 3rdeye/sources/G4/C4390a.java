package g4;

import B7.d;
import R0.b;
import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* compiled from: MaterialRadioButton.java */
/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4390a extends AppCompatRadioButton {

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f37952h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f37953f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37954g;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f37953f == null) {
            int iM = d.m(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlActivated, this);
            int iM2 = d.m(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorOnSurface, this);
            int iM3 = d.m(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSurface, this);
            this.f37953f = new ColorStateList(f37952h, new int[]{d.s(1.0f, iM3, iM), d.s(0.54f, iM3, iM2), d.s(0.38f, iM3, iM2), d.s(0.38f, iM3, iM2)});
        }
        return this.f37953f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37954g && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f37954g = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
