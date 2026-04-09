package f4;

import android.content.Context;
import br.l;

/* loaded from: classes.dex */
public abstract class a {
    public static final boolean a(Context context, String str) {
        l.e(context, "context");
        l.e(str, "name");
        return context.deleteSharedPreferences(str);
    }
}
