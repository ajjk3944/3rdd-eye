package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    public final String f26211a;

    static {
        Duration.i(31556952L, 0);
        Duration.i(7889238L, 0);
    }

    i(String str) {
        this.f26211a = str;
    }

    @Override // j$.time.temporal.s
    public final m i(m mVar, long j) {
        int i4 = c.f26207a[ordinal()];
        if (i4 == 1) {
            return mVar.c(j$.com.android.tools.r8.a.x(mVar.i(r0), j), j.f26214c);
        }
        if (i4 == 2) {
            return mVar.d(j / 4, b.YEARS).d((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26211a;
    }
}
