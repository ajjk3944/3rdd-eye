package com.bytedance.sdk.openadsdk.core.sup.xq;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class emc {
    public static final Set<String> emc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.emc.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> ypw = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.emc.2
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.sup.xq.emc$emc, reason: collision with other inner class name */
    public enum EnumC0157emc {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum ypw {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    @NonNull
    public static Point emc(Context context, int i10, int i11, ypw ypwVar) {
        if (context == null) {
            context = aa.emc();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iYpw = vw.ypw(context, i10);
        int iYpw2 = vw.ypw(context, i11);
        if (iYpw > width || iYpw2 > height) {
            Point point2 = new Point();
            if (ypw.HTML_RESOURCE == ypwVar) {
                point2.x = Math.min(width, iYpw);
                point2.y = Math.min(height, iYpw2);
            } else {
                float f10 = iYpw;
                float f11 = f10 / width;
                float f12 = iYpw2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = vw.xq(context, i12);
                point2.y = vw.xq(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
