package Z5;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.l;

/* compiled from: SystemLocaleInfo.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    @Override // Z5.a
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        l.e(language, "getDefault().language");
        return language;
    }

    @Override // Z5.a
    public String getTimeZoneId() {
        String id = TimeZone.getDefault().getID();
        l.e(id, "getDefault().id");
        return id;
    }
}
