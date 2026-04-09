package a1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String fileName) {
        p.e(context, "<this>");
        p.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), p.m("datastore/", fileName));
    }
}
