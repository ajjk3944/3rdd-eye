package m9;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* compiled from: Exceptions.kt */
/* renamed from: m9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5337b extends IOException {
    public C5337b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        l.e(string, "toString(...)");
        super(string);
    }
}
