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
public class Resources_pl extends ListResourceBundle implements Cj.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f57102a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    private static class TimeFormatAided implements f {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f57104a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length != 3) {
                throw new IllegalArgumentException("Wrong plural forms number for Polish language!");
            }
            this.f57104a = strArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String c(boolean r7, boolean r8, long r9, java.lang.String r11) {
            /*
                r6 = this;
                r0 = 1
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L8
                r9 = 0
                goto L28
            L8:
                r0 = 10
                long r2 = r9 % r0
                r4 = 2
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 < 0) goto L27
                r4 = 4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L27
                r2 = 100
                long r9 = r9 % r2
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 < 0) goto L25
                r0 = 20
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 < 0) goto L27
            L25:
                r9 = 1
                goto L28
            L27:
                r9 = 2
            L28:
                r10 = 3
                if (r9 > r10) goto L52
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                if (r8 == 0) goto L37
                java.lang.String r8 = "za "
                r10.append(r8)
            L37:
                r10.append(r11)
                r8 = 32
                r10.append(r8)
                java.lang.String[] r8 = r6.f57104a
                r8 = r8[r9]
                r10.append(r8)
                if (r7 == 0) goto L4d
                java.lang.String r7 = " temu"
                r10.append(r7)
            L4d:
                java.lang.String r7 = r10.toString()
                return r7
            L52:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "Wrong plural index was calculated somehow for Polish language"
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_pl.TimeFormatAided.c(boolean, boolean, long, java.lang.String):java.lang.String");
        }

        @Override // Aj.f
        public String a(Aj.a aVar, String str) {
            return c(aVar.e(), aVar.b(), aVar.d(50), str);
        }

        @Override // Aj.f
        public String b(Aj.a aVar) {
            return String.valueOf(aVar.d(50));
        }
    }

    @Override // Cj.b
    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() { // from class: org.ocpsoft.prettytime.i18n.Resources_pl.1
                private String c(Aj.a aVar) {
                    if (aVar.b()) {
                        return "za chwilę";
                    }
                    if (aVar.e()) {
                        return "przed chwilą";
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
            return new TimeFormatAided("wiek", "wieki", "wieków");
        }
        if (gVar instanceof Day) {
            return new TimeFormatAided("dzień", "dni", "dni");
        }
        if (gVar instanceof Decade) {
            return new TimeFormatAided("dekadę", "dekady", "dekad");
        }
        if (gVar instanceof Hour) {
            return new TimeFormatAided("godzinę", "godziny", "godzin");
        }
        if (gVar instanceof Millennium) {
            return new TimeFormatAided("milenium", "milenia", "mileniów");
        }
        if (gVar instanceof Millisecond) {
            return new TimeFormatAided("milisekundę", "milisekundy", "milisekund");
        }
        if (gVar instanceof Minute) {
            return new TimeFormatAided("minutę", "minuty", "minut");
        }
        if (gVar instanceof Month) {
            return new TimeFormatAided("miesiąc", "miesiące", "miesięcy");
        }
        if (gVar instanceof Second) {
            return new TimeFormatAided("sekundę", "sekundy", "sekund");
        }
        if (gVar instanceof Week) {
            return new TimeFormatAided("tydzień", "tygodnie", "tygodni");
        }
        if (gVar instanceof Year) {
            return new TimeFormatAided("rok", "lata", "lat");
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f57102a;
    }
}
