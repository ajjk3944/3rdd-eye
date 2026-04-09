package zc;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o extends j1 {

    /* renamed from: r, reason: collision with root package name */
    public long f27047r;

    /* renamed from: x, reason: collision with root package name */
    public String f27048x;

    @Override // zc.j1
    public final boolean t1() {
        Calendar calendar = Calendar.getInstance();
        this.f27047r = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f27048x = h0.b.s(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long w1() {
        u1();
        return this.f27047r;
    }

    public final String x1() {
        u1();
        return this.f27048x;
    }
}
