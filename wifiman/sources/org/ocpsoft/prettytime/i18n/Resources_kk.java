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
public class Resources_kk extends ListResourceBundle implements Cj.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f57091a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    private static class KkTimeFormat implements f {

        /* renamed from: a, reason: collision with root package name */
        private final int f57093a = 50;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f57094b;

        public KkTimeFormat(String... strArr) {
            if (strArr.length != 2) {
                throw new IllegalArgumentException("Future and past forms must be provided for kazakh language!");
            }
            this.f57094b = strArr;
        }

        private String c(boolean z10, boolean z11, long j10, String str) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = !z10 ? 1 : 0;
            sb2.append(str);
            sb2.append(' ');
            sb2.append(this.f57094b[i10]);
            sb2.append(' ');
            if (z10) {
                sb2.append("бұрын");
            }
            if (z11) {
                sb2.append("кейін");
            }
            return sb2.toString();
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
            return new f() { // from class: org.ocpsoft.prettytime.i18n.Resources_kk.1
                private String c(Aj.a aVar) {
                    if (aVar.b()) {
                        return "дәл қазір";
                    }
                    if (aVar.e()) {
                        return "жана ғана";
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
            return new KkTimeFormat("ғасыр", "ғасырдан");
        }
        if (gVar instanceof Day) {
            return new KkTimeFormat("күн", "күннен");
        }
        if (gVar instanceof Decade) {
            return new KkTimeFormat("онжылдық", "онжылдықтан");
        }
        if (gVar instanceof Hour) {
            return new KkTimeFormat("сағат", "сағаттан");
        }
        if (gVar instanceof Millennium) {
            return new KkTimeFormat("мыңжылдық", "мыңжылдықтан");
        }
        if (gVar instanceof Millisecond) {
            return new KkTimeFormat("миллисекунд", "миллисекундтан");
        }
        if (gVar instanceof Minute) {
            return new KkTimeFormat("минут", "минуттан");
        }
        if (gVar instanceof Month) {
            return new KkTimeFormat("ай", "айдан");
        }
        if (gVar instanceof Second) {
            return new KkTimeFormat("секунд", "секундтан");
        }
        if (gVar instanceof Week) {
            return new KkTimeFormat("апта", "аптадан");
        }
        if (gVar instanceof Year) {
            return new KkTimeFormat("жыл", "жылдан");
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    protected Object[][] getContents() {
        return f57091a;
    }
}
