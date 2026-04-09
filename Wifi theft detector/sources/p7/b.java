package p7;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements a {
    @Override // p7.a
    @NotNull
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        p.d(language, "getDefault().language");
        return language;
    }

    @Override // p7.a
    @NotNull
    public String getTimeZoneId() {
        String id = TimeZone.getDefault().getID();
        p.d(id, "getDefault().id");
        return id;
    }
}
