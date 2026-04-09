package G2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.ar.core.ImageMetadata;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f6838a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6839b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6840c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6841d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f6842i = 1;

        /* renamed from: a, reason: collision with root package name */
        final Context f6843a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f6844b;

        /* renamed from: c, reason: collision with root package name */
        c f6845c;

        /* renamed from: e, reason: collision with root package name */
        float f6847e;

        /* renamed from: d, reason: collision with root package name */
        float f6846d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f6848f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f6849g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f6850h = 4194304;

        public a(Context context) {
            this.f6847e = f6842i;
            this.f6843a = context;
            this.f6844b = (ActivityManager) context.getSystemService("activity");
            this.f6845c = new b(context.getResources().getDisplayMetrics());
            if (i.e(this.f6844b)) {
                this.f6847e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f6851a;

        b(DisplayMetrics displayMetrics) {
            this.f6851a = displayMetrics;
        }

        @Override // G2.i.c
        public int a() {
            return this.f6851a.heightPixels;
        }

        @Override // G2.i.c
        public int b() {
            return this.f6851a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f6840c = aVar.f6843a;
        int i10 = e(aVar.f6844b) ? aVar.f6850h / 2 : aVar.f6850h;
        this.f6841d = i10;
        int iC = c(aVar.f6844b, aVar.f6848f, aVar.f6849g);
        float fB = aVar.f6845c.b() * aVar.f6845c.a() * 4;
        int iRound = Math.round(aVar.f6847e * fB);
        int iRound2 = Math.round(fB * aVar.f6846d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f6839b = iRound2;
            this.f6838a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f6847e;
            float f12 = aVar.f6846d;
            float f13 = f10 / (f11 + f12);
            this.f6839b = Math.round(f12 * f13);
            this.f6838a = Math.round(f13 * aVar.f6847e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f6839b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f6838a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f6844b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f6844b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * ImageMetadata.SHADING_MODE;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f6840c, i10);
    }

    public int a() {
        return this.f6841d;
    }

    public int b() {
        return this.f6838a;
    }

    public int d() {
        return this.f6839b;
    }
}
