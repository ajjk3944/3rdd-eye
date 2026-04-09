package org.ocpsoft.prettytime.i18n;

import Aj.f;
import Aj.g;
import java.lang.reflect.Array;
import java.util.ListResourceBundle;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes2.dex */
public class Resources_uk extends ListResourceBundle implements Cj.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f57127a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    private static class TimeFormatAided implements f {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f57129a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length != 3) {
                throw new IllegalArgumentException("Wrong plural forms number for slavic language!");
            }
            this.f57129a = strArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String c(boolean r12, boolean r13, long r14, java.lang.String r16) {
            /*
                r11 = this;
                r0 = 10
                long r2 = r14 % r0
                r4 = 1
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 100
                if (r4 != 0) goto L16
                long r7 = r14 % r5
                r9 = 11
                int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r4 == 0) goto L16
                r0 = 0
                goto L31
            L16:
                r7 = 2
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 < 0) goto L30
                r7 = 4
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 > 0) goto L30
                long r2 = r14 % r5
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 < 0) goto L2e
                r0 = 20
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 < 0) goto L30
            L2e:
                r0 = 1
                goto L31
            L30:
                r0 = 2
            L31:
                r1 = 3
                if (r0 > r1) goto L5e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                if (r13 == 0) goto L40
                java.lang.String r2 = "через "
                r1.append(r2)
            L40:
                r2 = r16
                r1.append(r2)
                r2 = 32
                r1.append(r2)
                r2 = r11
                java.lang.String[] r3 = r2.f57129a
                r0 = r3[r0]
                r1.append(r0)
                if (r12 == 0) goto L59
                java.lang.String r0 = " тому"
                r1.append(r0)
            L59:
                java.lang.String r0 = r1.toString()
                return r0
            L5e:
                r2 = r11
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Wrong plural index was calculated somehow for slavic language"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_uk.TimeFormatAided.c(boolean, boolean, long, java.lang.String):java.lang.String");
        }

        @Override // Aj.f
        public String a(Aj.a aVar, String str) {
            return c(aVar.e(), aVar.b(), aVar.d(50), str);
        }

        @Override // Aj.f
        public String b(Aj.a aVar) {
            long jD = aVar.d(50);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jD);
            return sb2.toString();
        }
    }

    @Override // Cj.b
    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() { // from class: org.ocpsoft.prettytime.i18n.Resources_uk.1
                private String c(Aj.a aVar) {
                    if (aVar.b()) {
                        return "зараз";
                    }
                    if (aVar.e()) {
                        return "щойно";
                    }
                    return null;
                }

                @Override // Aj.f
                public String a(Aj.a aVar, String str) {
                    return str;
                }

                @Override // Aj.f
                public String b(Aj.a aVar) {
                    return c(aVar);
                }
            };
        }
        if (gVar instanceof Century) {
            return new TimeFormatAided("століття", "століття", "столітть");
        }
        if (gVar instanceof Day) {
            return new TimeFormatAided("день", "дні", "днів");
        }
        if (gVar instanceof Decade) {
            return new TimeFormatAided("десятиліття", "десятиліття", "десятиліть");
        }
        if (gVar instanceof Hour) {
            return new TimeFormatAided("годину", "години", "годин");
        }
        if (gVar instanceof Millennium) {
            return new TimeFormatAided("тисячоліття", "тисячоліття", "тисячоліть");
        }
        if (gVar instanceof Millisecond) {
            return new TimeFormatAided("мілісекунду", "мілісекунди", "мілісекунд");
        }
        if (gVar instanceof Minute) {
            return new TimeFormatAided("хвилину", "хвилини", "хвилин");
        }
        if (gVar instanceof Month) {
            return new TimeFormatAided("місяць", "місяці", "місяців");
        }
        if (gVar instanceof Second) {
            return new TimeFormatAided("секунду", "секунди", "секунд");
        }
        if (gVar instanceof Week) {
            return new TimeFormatAided("тиждень", "тижні", "тижнів");
        }
        if (gVar instanceof Year) {
            return new TimeFormatAided("рік", "роки", "років");
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f57127a;
    }
}
