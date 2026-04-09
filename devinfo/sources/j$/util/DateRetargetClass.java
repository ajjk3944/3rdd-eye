package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: classes2.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.f26037c;
        long j = 1000;
        return Instant.C(j$.com.android.tools.r8.a.B(time, j), ((int) j$.com.android.tools.r8.a.A(time, j)) * 1000000);
    }
}
