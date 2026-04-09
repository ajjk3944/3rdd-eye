package N1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String fileName) {
        AbstractC6492s.i(context, "<this>");
        AbstractC6492s.i(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), AbstractC6492s.p("datastore/", fileName));
    }
}
