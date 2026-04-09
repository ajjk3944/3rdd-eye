package ag;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final pi.a f358a;

    /* renamed from: b, reason: collision with root package name */
    public static final pi.a f359b;

    /* renamed from: c, reason: collision with root package name */
    public static final pi.a f360c;

    /* renamed from: d, reason: collision with root package name */
    public static final pi.a f361d;

    static {
        pi.a aVar = new pi.a();
        aVar.f32004b = 4;
        aVar.f32005c = 1;
        aVar.f32007e = new Point();
        aVar.f32003a = "3192732627297269";
        aVar.f32008f = R.layout.ad_native_dashboard_gdt;
        aVar.f32006d = 1;
        aVar.f32009h.putInt("paddingPx", a4.a.b(8.0f));
        a(aVar);
        f358a = aVar;
        pi.a aVar2 = new pi.a();
        aVar2.f32004b = 1;
        aVar2.f32009h.putString("collapsible", "bottom");
        aVar2.f32003a = DeviceInfoApp.f21145f.getString(R.string.admob_banner_collapsible_appinfo);
        aVar2.f32005c = 2;
        pi.a aVar3 = new pi.a();
        aVar3.f32004b = 1;
        aVar3.f32005c = 2;
        aVar3.f32003a = "ca-app-pub-3724073793374078/8700177126";
        aVar2.g = aVar3;
        f359b = aVar2;
        pi.a aVar4 = new pi.a();
        aVar4.f32004b = 1;
        aVar4.f32005c = 4;
        aVar4.f32003a = "ca-app-pub-3724073793374078/5725695273";
        f360c = aVar4;
        new Bundle();
        DeviceInfoApp.f21145f.getString(R.string.gdt_splash_splash);
        new Bundle();
        String string = DeviceInfoApp.f21145f.getString(R.string.admob_banner_collapsible_satellite);
        k.e(string, "adId");
        pi.a aVar5 = new pi.a();
        aVar5.f32003a = string;
        aVar5.f32004b = 1;
        aVar5.f32005c = 2;
        aVar5.f32009h.putString("collapsible", "bottom");
        pi.a aVar6 = new pi.a();
        aVar6.f32004b = 1;
        aVar6.f32005c = 2;
        aVar6.f32003a = "ca-app-pub-3724073793374078/8700177126";
        aVar5.g = aVar6;
        f361d = aVar5;
        d();
    }

    public static void a(pi.a aVar) throws Resources.NotFoundException {
        if (aVar == null) {
            return;
        }
        Resources resources = DeviceInfoApp.f21145f.getResources();
        int iM = a4.a.m(DeviceInfoApp.f21145f);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        boolean z3 = d.f21252a;
        int i4 = (int) (iM / (displayMetrics.densityDpi / 160.0f));
        boolean zV = a4.a.v(resources);
        int dimensionPixelSize = (int) (i4 - ((resources.getDimensionPixelSize(R.dimen.content_padding) / (resources.getDisplayMetrics().densityDpi / 160.0f)) * 2.0f));
        if (dimensionPixelSize > 620) {
            dimensionPixelSize = 620;
        }
        while (aVar != null) {
            if (aVar.f32004b == 4) {
                if (aVar.f32007e == null) {
                    aVar.f32007e = new Point();
                }
                Point point = aVar.f32007e;
                point.x = dimensionPixelSize;
                if ((!zV || dimensionPixelSize > 450) && dimensionPixelSize > 450) {
                    point.x = 450;
                }
            }
            aVar = aVar.g;
        }
    }

    public static pi.a b(String str) {
        pi.a aVar = new pi.a();
        aVar.f32004b = 1;
        aVar.f32005c = 3;
        aVar.f32003a = str;
        return aVar;
    }

    public static pi.a c(int i4) {
        pi.a aVar = new pi.a();
        aVar.f32004b = 1;
        aVar.f32005c = 1;
        aVar.f32008f = i4;
        aVar.f32003a = "ca-app-pub-3724073793374078/9984961335";
        return aVar;
    }

    public static void d() {
        a(f358a);
        int iM = a4.a.m(DeviceInfoApp.f21145f);
        Resources resources = DeviceInfoApp.f21145f.getResources();
        int i4 = (int) (iM / (resources.getDisplayMetrics().densityDpi / 160.0f));
        Point point = new Point();
        point.x = i4;
        int iRound = Math.round(i4 / 6.4f);
        point.y = iRound;
        if (iRound > 80) {
            point.y = 80;
            point.x = 512;
        }
        for (pi.a aVar = f359b; aVar != null; aVar = aVar.g) {
            if (aVar.f32004b == 4) {
                int i10 = aVar.f32005c;
                if (i10 == 2) {
                    aVar.f32007e = point;
                } else if (i10 == 1) {
                    Point point2 = new Point();
                    aVar.f32007e = point2;
                    point2.x = i4;
                    if (!a4.a.v(resources) || aVar.f32007e.x > 450) {
                        Point point3 = aVar.f32007e;
                        if (point3.x > 450) {
                            point3.x = 450;
                        }
                    }
                }
            }
        }
    }
}
