package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4892q8;
import io.appmetrica.analytics.impl.C4917r8;
import io.appmetrica.analytics.impl.C5032vl;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Um;
import io.appmetrica.analytics.impl.Vk;
import io.appmetrica.analytics.impl.W2;
import io.appmetrica.analytics.impl.Yn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final L6 f42462a = new L6("appmetrica_birth_date", new C4917r8(), new C5032vl());

    public final UserProfileUpdate a(Calendar calendar, String str, W2 w22) {
        return new UserProfileUpdate(new Um(this.f42462a.f39744c, new SimpleDateFormat(str).format(calendar.getTime()), new C4892q8(), new C4917r8(), w22));
    }

    public UserProfileUpdate<? extends Yn> withAge(int i) {
        int i10 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new N4(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withAgeIfUndefined(int i) {
        int i10 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new Vk(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new N4(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Vk(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withValueReset() {
        return new UserProfileUpdate<>(new Li(0, this.f42462a.f39744c, new C4917r8(), new C5032vl()));
    }

    public UserProfileUpdate<? extends Yn> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new N4(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new Vk(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDate(int i, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new N4(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDateIfUndefined(int i, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Vk(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDate(int i, int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i11);
        return a(gregorianCalendar, "yyyy-MM-dd", new N4(this.f42462a.f39743b));
    }

    public UserProfileUpdate<? extends Yn> withBirthDateIfUndefined(int i, int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i11);
        return a(gregorianCalendar, "yyyy-MM-dd", new Vk(this.f42462a.f39743b));
    }
}
