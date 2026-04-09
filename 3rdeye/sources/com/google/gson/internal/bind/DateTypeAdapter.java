package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.o;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final o f23398b = new o() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            if (aVar.f1061a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23399a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f23399a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.f23483a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r3 = B5.a.b(r3, new java.text.ParsePosition(0));
     */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date b(E5.a r3) throws java.io.IOException {
        /*
            r2 = this;
            E5.b r0 = r3.C0()
            E5.b r1 = E5.b.NULL
            if (r0 != r1) goto Ld
            r3.v0()
            r3 = 0
            return r3
        Ld:
            java.lang.String r3 = r3.y0()
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.f23399a     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L2a
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L2a
            monitor-exit(r2)
            goto L37
        L2a:
            r3 = move-exception
            goto L3f
        L2c:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            java.util.Date r3 = B5.a.b(r3, r0)     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            monitor-exit(r2)
        L37:
            return r3
        L38:
            r0 = move-exception
            com.google.gson.m r1 = new com.google.gson.m     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.DateTypeAdapter.b(E5.a):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                cVar.B();
            } else {
                cVar.p0(((DateFormat) this.f23399a.get(0)).format(date2));
            }
        }
    }
}
