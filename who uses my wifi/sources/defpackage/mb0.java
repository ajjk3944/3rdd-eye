package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class mb0 {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public f9 f;

    public mb0(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = wl2.t(context, R.attr.motionDurationMedium2, 300);
        this.d = wl2.t(context, R.attr.motionDurationShort3, 150);
        this.e = wl2.t(context, R.attr.motionDurationShort2, 100);
    }
}
