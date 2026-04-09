package ud;

import android.content.Context;
import ed.b;
import xu.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23539f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23542c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23543d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23544e;

    public a(Context context) {
        boolean zD0 = d.d0(context, b.elevationOverlayEnabled, false);
        int iU = io.sentry.config.a.U(context, b.elevationOverlayColor, 0);
        int iU2 = io.sentry.config.a.U(context, b.elevationOverlayAccentColor, 0);
        int iU3 = io.sentry.config.a.U(context, b.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f23540a = zD0;
        this.f23541b = iU;
        this.f23542c = iU2;
        this.f23543d = iU3;
        this.f23544e = f10;
    }
}
