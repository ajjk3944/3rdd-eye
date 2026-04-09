package f;

import a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f2550a;

    private a(Context context) {
        this.f2550a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f2550a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f2550a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f2550a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f2550a.getResources().getDimensionPixelSize(a.d.f35b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f2550a.obtainStyledAttributes(null, j.f133a, a.a.f2c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f151j, 0);
        Resources resources = this.f2550a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.d.f34a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f2550a.getResources().getBoolean(a.b.f26a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f2550a).hasPermanentMenuKey();
    }
}
