package b1;

import android.util.Log;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4044a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4044a f32683a = new C4044a();

    private C4044a() {
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "top";
        }
        if (i10 == 1) {
            return "bottom";
        }
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    public final String b(int i10) {
        if (i10 == -2) {
            return "start";
        }
        if (i10 == -1) {
            return "end";
        }
        if (i10 == 0) {
            return "left";
        }
        if (i10 == 1) {
            return "right";
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return "start";
    }
}
