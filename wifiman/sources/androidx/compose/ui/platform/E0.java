package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class E0 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f51694a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        AbstractC6492s.h(str2, "format(format, *args)");
        sb2.append(str2);
        return sb2.toString();
    }
}
