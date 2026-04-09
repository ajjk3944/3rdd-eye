package i9;

import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class c {
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        p.d(string, "toString(...)");
        return string;
    }
}
