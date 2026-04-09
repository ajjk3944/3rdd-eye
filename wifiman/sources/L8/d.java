package L8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.m;
import Yg.n;
import android.content.Context;
import android.content.res.Resources;
import com.ubnt.usurvey.R;
import j$.time.DesugarDuration;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.q;
import s9.d;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11260a = new d();

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11262b;

        a(int i10, int i11) {
            this.f11261a = i10;
            this.f11262b = i11;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-362880561);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-362880561, i10, -1, "com.ubnt.usurvey.ui.util.DurationText.new.<anonymous> (DurationText.kt:58)");
            }
            String quantityString = context.getResources().getQuantityString(this.f11261a, this.f11262b);
            AbstractC6492s.h(quantityString, "getQuantityString(...)");
            String str = String.format(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(this.f11262b)}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration c(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        Duration durationBetween = Duration.between(localDateTime, localDateTime2);
        return durationBetween.minusDays(DesugarDuration.toDaysPart(durationBetween));
    }

    private static final Duration d(m mVar) {
        return (Duration) mVar.getValue();
    }

    public final s9.d b(long j10) {
        int minutesPart;
        int i10;
        long j11 = j10 / 1000;
        final LocalDateTime localDateTimeNow = LocalDateTime.now();
        final LocalDateTime localDateTimeMinusSeconds = LocalDateTime.now().minusSeconds(j11);
        Period periodBetween = Period.between(localDateTimeMinusSeconds.toLocalDate(), localDateTimeNow.toLocalDate());
        m mVarB = n.b(new InterfaceC6824a() { // from class: L8.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return d.c(localDateTimeMinusSeconds, localDateTimeNow);
            }
        });
        if (periodBetween.getYears() > 0) {
            minutesPart = periodBetween.getYears();
            i10 = R.plurals.unit_duration_year;
        } else if (periodBetween.getMonths() > 0) {
            minutesPart = periodBetween.getMonths();
            i10 = R.plurals.unit_duration_month;
        } else if (periodBetween.getDays() > 0) {
            minutesPart = periodBetween.getDays();
            i10 = R.plurals.unit_duration_day;
        } else if (d(mVarB).toHours() > 0) {
            minutesPart = DesugarDuration.toHoursPart(d(mVarB));
            i10 = R.plurals.unit_duration_hour;
        } else if (d(mVarB).toMinutes() > 0) {
            minutesPart = DesugarDuration.toMinutesPart(d(mVarB));
            i10 = R.plurals.unit_duration_minute;
        } else {
            minutesPart = (int) j11;
            i10 = R.plurals.unit_duration_second;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(minutesPart);
        return new d.a(sb2.toString(), new a(i10, minutesPart));
    }
}
