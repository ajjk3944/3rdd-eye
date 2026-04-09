package ya;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.sk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class g0 extends ja.c {
    @Override // ja.c
    public final boolean I(Activity activity, Configuration configuration) {
        pk pkVar = sk.P5;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((Boolean) rkVar.a(pkVar)).booleanValue()) {
            return false;
        }
        if (((Boolean) rkVar2.a(sk.R5)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        za.d dVar = va.r.g.f36157a;
        int iB = za.d.b(configuration.screenHeightDp, activity);
        int iN = za.d.n(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        f0 f0Var = ua.j.C.f35261c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i4 = displayMetrics.heightPixels;
        int i10 = displayMetrics.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) rkVar2.a(sk.N5)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return Math.abs(i4 - (iB + dimensionPixelSize)) > iIntValue || Math.abs(i10 - iN) > iIntValue;
    }
}
