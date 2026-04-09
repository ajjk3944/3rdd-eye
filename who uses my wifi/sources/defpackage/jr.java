package defpackage;

import android.content.Context;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jr {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public jr(Context context) {
        boolean zO = qb1.o(context, R.attr.elevationOverlayEnabled, false);
        int iH = i41.h(context, R.attr.elevationOverlayColor, 0);
        int iH2 = i41.h(context, R.attr.elevationOverlayAccentColor, 0);
        int iH3 = i41.h(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zO;
        this.b = iH;
        this.c = iH2;
        this.d = iH3;
        this.e = f2;
    }
}
