package h3;

import android.content.Intent;

/* loaded from: classes.dex */
public abstract class e {
    public static Object a(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }
}
