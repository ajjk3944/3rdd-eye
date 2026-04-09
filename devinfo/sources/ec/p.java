package ec;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends v1 {

    /* renamed from: d, reason: collision with root package name */
    public long f22984d;

    /* renamed from: e, reason: collision with root package name */
    public String f22985e;

    @Override // ec.v1
    public final boolean C() {
        Calendar calendar = Calendar.getInstance();
        this.f22984d = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f22985e = r5.c.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long F() {
        D();
        return this.f22984d;
    }

    public final String G() {
        D();
        return this.f22985e;
    }
}
