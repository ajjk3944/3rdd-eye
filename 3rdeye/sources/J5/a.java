package J5;

import android.view.View;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2801a = new int[2];

    public final JSONObject a(View view) {
        if (view == null) {
            return L5.a.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.f2801a;
        view.getLocationOnScreen(iArr);
        return L5.a.a(iArr[0], iArr[1], width, height);
    }
}
