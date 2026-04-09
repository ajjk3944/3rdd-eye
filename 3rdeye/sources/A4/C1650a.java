package a4;

import B7.d;
import android.content.Context;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h4.C4414b;

/* compiled from: ElevationOverlayProvider.java */
/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1650a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f14158f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14160b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14161c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14162d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14163e;

    public C1650a(Context context) {
        boolean zB = C4414b.b(R.attr.elevationOverlayEnabled, context, false);
        int iO = d.o(context, R.attr.elevationOverlayColor, 0);
        int iO2 = d.o(context, R.attr.elevationOverlayAccentColor, 0);
        int iO3 = d.o(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f14159a = zB;
        this.f14160b = iO;
        this.f14161c = iO2;
        this.f14162d = iO3;
        this.f14163e = f10;
    }
}
