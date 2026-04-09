package ya;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.zw;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class j0 extends h0 {
    public static final WindowInsets Q(Activity activity, View view, WindowInsets windowInsets) {
        ua.j jVar = ua.j.C;
        zw zwVar = jVar.f35265h;
        zw zwVar2 = jVar.f35265h;
        if (zwVar.i().B() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                c0 c0VarI = zwVar2.i();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    int i4 = rect.left;
                    int i10 = rect.top;
                    int i11 = rect.right;
                    int i12 = rect.bottom;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i4);
                    sb2.append(",");
                    sb2.append(i10);
                    sb2.append(",");
                    sb2.append(i11);
                    String strQ = d.h.q(i12, ",", sb2);
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(strQ);
                }
                c0VarI.C(strConcat);
            } else {
                zwVar2.i().C("");
            }
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (2 != attributes.layoutInDisplayCutoutMode) {
            attributes.layoutInDisplayCutoutMode = 2;
            window.setAttributes(attributes);
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    @Override // ja.c
    public final void N(final Activity activity) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.D1)).booleanValue() && ua.j.C.f35265h.i().B() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ya.i0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return j0.Q(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // ja.c
    public final int O(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
