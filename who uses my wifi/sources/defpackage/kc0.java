package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kc0 extends s6 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int i = i41.i(this, com.phuongpn.whousemywifi.networkscanner.R.attr.colorControlActivated);
            int i2 = i41.i(this, com.phuongpn.whousemywifi.networkscanner.R.attr.colorOnSurface);
            int i3 = i41.i(this, com.phuongpn.whousemywifi.networkscanner.R.attr.colorSurface);
            this.j = new ColorStateList(l, new int[]{i41.n(1.0f, i3, i), i41.n(0.54f, i3, i2), i41.n(0.38f, i3, i2), i41.n(0.38f, i3, i2)});
        }
        return this.j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && gh.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k = z;
        if (z) {
            gh.c(this, getMaterialThemeColorsTintList());
        } else {
            gh.c(this, null);
        }
    }
}
