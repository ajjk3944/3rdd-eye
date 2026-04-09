package Fh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class e {
    public static final Class a(ClassLoader classLoader, String fqName) {
        AbstractC6492s.i(classLoader, "<this>");
        AbstractC6492s.i(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
