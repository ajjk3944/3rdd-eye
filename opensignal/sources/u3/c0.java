package u3;

import android.view.View;

/* loaded from: classes.dex */
public abstract class c0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i10) {
        view.setImportantForAutofill(i10);
    }
}
