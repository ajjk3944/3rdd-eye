package wc;

import android.content.Context;
import com.liuzh.deviceinfo.R;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f36598f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36599a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36601c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36602d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36603e;

    public a(Context context) {
        boolean z3 = ii.a.z(context, R.attr.elevationOverlayEnabled, false);
        int iJ = i0.j(context, R.attr.elevationOverlayColor, 0);
        int iJ2 = i0.j(context, R.attr.elevationOverlayAccentColor, 0);
        int iJ3 = i0.j(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f36599a = z3;
        this.f36600b = iJ;
        this.f36601c = iJ2;
        this.f36602d = iJ3;
        this.f36603e = f10;
    }
}
