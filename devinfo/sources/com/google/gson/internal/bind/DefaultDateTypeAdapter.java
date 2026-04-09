package com.google.gson.internal.bind;

import com.google.gson.internal.h;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends w {

    /* renamed from: c, reason: collision with root package name */
    public static final x f20754c = new x() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            if (aVar.f37087a == Date.class) {
                return new DefaultDateTypeAdapter();
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a f20755a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20756b;

    public DefaultDateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f20756b = arrayList;
        this.f20755a = b.f20799a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (h.f20843a >= 9) {
            arrayList.add(new SimpleDateFormat(d.h.E("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        Date dateB;
        if (bVar.Z() == 9) {
            bVar.V();
            return null;
        }
        String strX = bVar.X();
        synchronized (this.f20756b) {
            try {
                ArrayList arrayList = this.f20756b;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        try {
                            dateB = vf.a.b(strX, new ParsePosition(0));
                            break;
                        } catch (ParseException e2) {
                            StringBuilder sbA = d.h.A("Failed parsing '", strX, "' as Date; at path ");
                            sbA.append(bVar.y(true));
                            throw new q(sbA.toString(), e2);
                        }
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strX);
                            break;
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20755a.getClass();
        return dateB;
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.A();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f20756b.get(0);
        synchronized (this.f20756b) {
            str = dateFormat.format(date);
        }
        cVar.U(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f20756b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
