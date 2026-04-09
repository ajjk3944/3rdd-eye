package E1;

import E.f;
import H1.g;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f1360d;

    /* renamed from: a, reason: collision with root package name */
    public final View f1361a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1362b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public f f1363c;

    public d(ImageView imageView) {
        this.f1361a = imageView;
    }

    public final int a(int i, int i3, int i6) {
        int i7 = i3 - i6;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i - i6;
        if (i8 > 0) {
            return i8;
        }
        View view = this.f1361a;
        if (view.isLayoutRequested() || i3 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f1360d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            g.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f1360d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f1360d.intValue();
    }
}
