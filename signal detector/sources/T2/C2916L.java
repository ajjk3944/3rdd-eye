package t2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C0538Hf;
import com.google.android.gms.internal.ads.H9;
import java.util.Locale;
import q2.C2841s;

/* renamed from: t2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2916L extends C2914J {
    @Override // p1.e
    public final void t(final Activity activity) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8577D1)).booleanValue() && p2.j.f22785C.f22795h.i().B() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: t2.K
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    C0538Hf c0538Hf = p2.j.f22785C.f22795h;
                    if (c0538Hf.i().B() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = "";
                        if (displayCutout != null) {
                            C2909E c2909eI = c0538Hf.i();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                int i = rect.left;
                                int i3 = rect.top;
                                int i6 = rect.right;
                                int i7 = rect.bottom;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append(",");
                                sb.append(i3);
                                sb.append(",");
                                sb.append(i6);
                                String strI = A.f.i(i7, ",", sb);
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(strI);
                            }
                            c2909eI.C(strConcat);
                        } else {
                            c0538Hf.i().C("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // p1.e
    public final int u(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
