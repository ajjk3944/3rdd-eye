package org.ocpsoft.prettytime.i18n;

import Aj.f;
import Aj.g;
import java.lang.reflect.Array;
import java.util.Arrays;
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
public class Resources_ru extends ListResourceBundle implements Cj.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f57107a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    private class TimeFormatAided implements f {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f57109a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length != 4) {
                throw new IllegalArgumentException(String.format("Wrong plural forms number for russian language! Expected %s, got %s\nPlurals: %s", 4, Integer.valueOf(strArr.length), Arrays.toString(strArr)));
            }
            this.f57109a = strArr;
        }

        @Override // Aj.f
        public String a(Aj.a aVar, String str) {
            return e(aVar, true) ? c(aVar, d(Math.abs(aVar.d(50)), false)) : c(aVar, str);
        }

        @Override // Aj.f
        public String b(Aj.a aVar) {
            return d(Math.abs(aVar.d(50)), true);
        }

        public String c(Aj.a aVar, String str) {
            if (aVar.b()) {
                return "через " + str;
            }
            if (!aVar.e()) {
                return str;
            }
            return str + " назад";
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String d(long r12, boolean r14) {
            /*
                r11 = this;
                r0 = 10
                long r2 = r12 % r0
                r4 = 1
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 100
                if (r4 != 0) goto L16
                long r7 = r12 % r5
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
                long r2 = r12 % r5
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
                r1 = 4
                if (r0 > r1) goto L58
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r12 = java.lang.String.valueOf(r12)
                r1.append(r12)
                r12 = 32
                r1.append(r12)
                java.lang.String[] r12 = r11.f57109a
                if (r14 == 0) goto L4c
                if (r0 != 0) goto L4c
                goto L4e
            L4c:
                int r0 = r0 + 1
            L4e:
                r12 = r12[r0]
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                return r12
            L58:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "Wrong plural index was calculated somehow for russian language"
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_ru.TimeFormatAided.d(long, boolean):java.lang.String");
        }

        public boolean e(Aj.a aVar, boolean z10) {
            return Math.abs(z10 ? aVar.d(50) : aVar.c()) == 1;
        }
    }

    @Override // Cj.b
    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() { // from class: org.ocpsoft.prettytime.i18n.Resources_ru.1
                private String c(Aj.a aVar) {
                    if (aVar.b()) {
                        return "сейчас";
                    }
                    if (aVar.e()) {
                        return "только что";
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
            return new TimeFormatAided("век", "век", "века", "веков");
        }
        if (gVar instanceof Day) {
            return new TimeFormatAided("день", "день", "дня", "дней");
        }
        if (gVar instanceof Decade) {
            return new TimeFormatAided("десятилетие", "десятилетие", "десятилетия", "десятилетий");
        }
        if (gVar instanceof Hour) {
            return new TimeFormatAided("час", "час", "часа", "часов");
        }
        if (gVar instanceof Millennium) {
            return new TimeFormatAided("тысячелетие", "тысячелетие", "тысячелетия", "тысячелетий");
        }
        if (gVar instanceof Millisecond) {
            return new TimeFormatAided("миллисекунда", "миллисекунду", "миллисекунды", "миллисекунд");
        }
        if (gVar instanceof Minute) {
            return new TimeFormatAided("минута", "минуту", "минуты", "минут");
        }
        if (gVar instanceof Month) {
            return new TimeFormatAided("месяц", "месяц", "месяца", "месяцев");
        }
        if (gVar instanceof Second) {
            return new TimeFormatAided("секунда", "секунду", "секунды", "секунд");
        }
        if (gVar instanceof Week) {
            return new TimeFormatAided("неделя", "неделю", "недели", "недель");
        }
        if (gVar instanceof Year) {
            return new TimeFormatAided("год", "год", "года", "лет");
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f57107a;
    }
}
