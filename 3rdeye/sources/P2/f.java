package P2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f10573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10575c;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f10576e;

        /* renamed from: a, reason: collision with root package name */
        public final Context f10577a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityManager f10578b;

        /* renamed from: c, reason: collision with root package name */
        public final b f10579c;

        /* renamed from: d, reason: collision with root package name */
        public final float f10580d;

        static {
            f10576e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f10580d = f10576e;
            this.f10577a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f10578b = activityManager;
            this.f10579c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
                return;
            }
            this.f10580d = 0.0f;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f10581a;

        public b(DisplayMetrics displayMetrics) {
            this.f10581a = displayMetrics;
        }
    }

    public f(a aVar) {
        Context context = aVar.f10577a;
        ActivityManager activityManager = aVar.f10578b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f10575c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f10579c.f10581a;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = aVar.f10580d;
        int iRound2 = Math.round(f10 * f11);
        int iRound3 = Math.round(f10 * 2.0f);
        int i10 = iRound - i;
        int i11 = iRound3 + iRound2;
        if (i11 <= i10) {
            this.f10574b = iRound3;
            this.f10573a = iRound2;
        } else {
            float f12 = i10 / (f11 + 2.0f);
            this.f10574b = Math.round(2.0f * f12);
            this.f10573a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f10574b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f10573a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i11 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
