package t2;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import q2.C2841s;

/* renamed from: t2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2912H extends p1.e {
    @Override // p1.e
    public final boolean n(Activity activity, Configuration configuration) {
        E9 e9 = H9.P5;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (!((Boolean) g9.a(e9)).booleanValue()) {
            return false;
        }
        if (((Boolean) g92.a(H9.R5)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        u2.f fVar = q2.r.f23260g.f23261a;
        int iB = u2.f.b(activity, configuration.screenHeightDp);
        int iN = u2.f.n(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        C2911G c2911g = p2.j.f22785C.f22790c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) g92.a(H9.N5)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return Math.abs(i - (iB + dimensionPixelSize)) > iIntValue || Math.abs(i3 - iN) > iIntValue;
    }
}
