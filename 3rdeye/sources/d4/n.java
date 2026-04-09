package d4;

import L0.I;
import L0.S;
import android.graphics.PorterDuff;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class n {

    /* compiled from: ViewUtils.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f37522a;

        /* renamed from: b, reason: collision with root package name */
        public int f37523b;

        /* renamed from: c, reason: collision with root package name */
        public int f37524c;
    }

    public static boolean a(View view) {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
