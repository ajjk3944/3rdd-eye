package ae;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;
import ed.b;
import ed.k;

/* loaded from: classes.dex */
public final class a extends AppCompatRadioButton {
    public static final int B = k.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] D = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f340x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f341y;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f340x == null) {
            int iV = io.sentry.config.a.V(this, h.a.colorControlActivated);
            int iV2 = io.sentry.config.a.V(this, b.colorOnSurface);
            int iV3 = io.sentry.config.a.V(this, b.colorSurface);
            this.f340x = new ColorStateList(D, new int[]{io.sentry.config.a.b0(iV3, 1.0f, iV), io.sentry.config.a.b0(iV3, 0.54f, iV2), io.sentry.config.a.b0(iV3, 0.38f, iV2), io.sentry.config.a.b0(iV3, 0.38f, iV2)});
        }
        return this.f340x;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f341y && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f341y = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
