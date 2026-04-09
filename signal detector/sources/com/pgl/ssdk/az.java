package com.pgl.ssdk;

import java.util.Calendar;

/* loaded from: classes.dex */
public class az {
    public static void a(long j6) {
        try {
            Thread.currentThread();
            Thread.sleep(j6);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j6, long j7) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar2.setTimeInMillis(j7);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }
}
