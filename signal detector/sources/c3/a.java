package C3;

import android.R;
import android.content.res.ColorStateList;
import com.bumptech.glide.e;
import o.C2750z;

/* loaded from: classes.dex */
public final class a extends C2750z {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f1147g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1148e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1149f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1148e == null) {
            int iM = e.m(com.apm.insight.R.attr.colorControlActivated, this);
            int iM2 = e.m(com.apm.insight.R.attr.colorOnSurface, this);
            int iM3 = e.m(com.apm.insight.R.attr.colorSurface, this);
            this.f1148e = new ColorStateList(f1147g, new int[]{e.t(1.0f, iM3, iM), e.t(0.54f, iM3, iM2), e.t(0.38f, iM3, iM2), e.t(0.38f, iM3, iM2)});
        }
        return this.f1148e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1149f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f1149f = z6;
        if (z6) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
