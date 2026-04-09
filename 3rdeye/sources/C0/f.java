package C0;

import android.graphics.BlendMode;
import android.graphics.Paint;

/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f805a = 0;

    /* compiled from: PaintCompat.java */
    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* compiled from: PaintCompat.java */
    public static class b {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }
}
