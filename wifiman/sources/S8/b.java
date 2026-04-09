package S8;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class b {
    public static final String a(a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        String lowerCase = aVar.name().toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return "802.11" + lowerCase;
    }
}
