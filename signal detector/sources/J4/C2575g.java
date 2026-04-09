package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import k4.AbstractC2627a;
import o4.AbstractC2763b;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2575g extends g4.z {

    /* renamed from: c, reason: collision with root package name */
    public static final C2573e f21418c = new C2573e();

    /* renamed from: a, reason: collision with root package name */
    public final C2574f f21419a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21420b;

    public C2575g() {
        ArrayList arrayList = new ArrayList();
        this.f21420b = arrayList;
        this.f21419a = C2574f.f21417a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (i4.j.f20606a >= 9) {
            arrayList.add(new SimpleDateFormat(AbstractC2763b.f("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        Date dateB;
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        synchronized (this.f21420b) {
            try {
                ArrayList arrayList = this.f21420b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            dateB = AbstractC2627a.b(strZ, new ParsePosition(0));
                            break;
                        } catch (ParseException e6) {
                            StringBuilder sbQ = AbstractC1135f5.q("Failed parsing '", strZ, "' as Date; at path ");
                            sbQ.append(c2762a.n(true));
                            throw new g4.p(sbQ.toString(), e6);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strZ);
                            break;
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21419a.getClass();
        return dateB;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c2764c.o();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f21420b.get(0);
        synchronized (this.f21420b) {
            str = dateFormat.format(date);
        }
        c2764c.w(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f21420b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
