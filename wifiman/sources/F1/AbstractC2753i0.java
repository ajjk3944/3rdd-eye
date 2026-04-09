package F1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.conscrypt.PSKKeyManager;

/* renamed from: F1.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2753i0 {

    /* renamed from: F1.i0$a */
    static class a {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: F1.i0$b */
    static class b {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* renamed from: F1.i0$c */
    static class c {
        static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static V0 a(Window window, View view) {
        return new V0(window, view);
    }

    public static void b(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.a(window, z10);
        } else if (i10 >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
