package com.bytedance.sdk.openadsdk.core.sup.xq;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
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
    public enum EnumC0072emc {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum ypw {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point emc(Context context, int i, int i3, ypw ypwVar) {
        if (context == null) {
            context = aa.emc();
        }
        Point point = new Point(i, i3);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iYpw = vw.ypw(context, i);
        int iYpw2 = vw.ypw(context, i3);
        if (iYpw > width || iYpw2 > height) {
            Point point2 = new Point();
            if (ypw.HTML_RESOURCE == ypwVar) {
                point2.x = Math.min(width, iYpw);
                point2.y = Math.min(height, iYpw2);
            } else {
                float f2 = iYpw;
                float f5 = f2 / width;
                float f6 = iYpw2;
                float f7 = f6 / height;
                if (f5 >= f7) {
                    point2.x = width;
                    point2.y = (int) (f6 / f5);
                } else {
                    point2.x = (int) (f2 / f7);
                    point2.y = height;
                }
            }
            int i6 = point2.x;
            if (i6 >= 0 && point2.y >= 0) {
                point2.x = vw.xq(context, i6);
                point2.y = vw.xq(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
