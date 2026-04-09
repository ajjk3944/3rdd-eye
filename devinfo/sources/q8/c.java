package q8;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f32217d;

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f32218a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32219b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public b f32220c;

    public c(ImageView imageView) {
        this.f32218a = imageView;
    }

    public final int a(int i4, int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i4 - i11;
        if (i13 > 0) {
            return i13;
        }
        ImageView imageView = this.f32218a;
        if (imageView.isLayoutRequested() || i10 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f32217d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            t8.f.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f32217d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f32217d.intValue();
    }
}
