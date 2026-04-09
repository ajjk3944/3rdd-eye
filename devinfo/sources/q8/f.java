package q8;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f32221d;

    /* renamed from: a, reason: collision with root package name */
    public final View f32222a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32223b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public b f32224c;

    public f(ImageView imageView) {
        this.f32222a = imageView;
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
        View view = this.f32222a;
        if (view.isLayoutRequested() || i10 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f32221d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            t8.f.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f32221d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f32221d.intValue();
    }
}
