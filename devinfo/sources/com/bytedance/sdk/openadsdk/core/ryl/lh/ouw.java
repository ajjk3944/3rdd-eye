package com.bytedance.sdk.openadsdk.core.ryl.lh;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static final Set<String> ouw = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> vt = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.2
        {
            add("application/x-javascript");
        }
    };

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw, reason: collision with other inner class name */
    public enum EnumC0095ouw {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum vt {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point ouw(Context context, int i4, int i10, vt vtVar) {
        if (context == null) {
            context = zih.ouw();
        }
        Point point = new Point(i4, i10);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iOuw = osn.ouw(context, i4);
        int iOuw2 = osn.ouw(context, i10);
        if (iOuw > width || iOuw2 > height) {
            Point point2 = new Point();
            if (vt.HTML_RESOURCE == vtVar) {
                point2.x = Math.min(width, iOuw);
                point2.y = Math.min(height, iOuw2);
            } else {
                float f10 = iOuw;
                float f11 = f10 / width;
                float f12 = iOuw2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i11 = point2.x;
            if (i11 >= 0 && point2.y >= 0) {
                point2.x = osn.vt(context, i11);
                point2.y = osn.vt(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
