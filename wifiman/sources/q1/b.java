package Q1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String name) {
        AbstractC6492s.i(context, "<this>");
        AbstractC6492s.i(name, "name");
        return N1.a.a(context, AbstractC6492s.p(name, ".preferences_pb"));
    }
}
