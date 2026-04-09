package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import yf.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
final class SqlDateTypeAdapter extends w {

    /* renamed from: b, reason: collision with root package name */
    public static final x f20871b = new x() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            if (aVar.f37087a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f20872a;

    public /* synthetic */ SqlDateTypeAdapter(int i4) {
        this();
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        Date date;
        if (bVar.Z() == 9) {
            bVar.V();
            return null;
        }
        String strX = bVar.X();
        synchronized (this) {
            TimeZone timeZone = this.f20872a.getTimeZone();
            try {
                try {
                    date = new Date(this.f20872a.parse(strX).getTime());
                } catch (ParseException e2) {
                    throw new q("Failed parsing '" + strX + "' as SQL Date; at path " + bVar.y(true), e2);
                }
            } finally {
                this.f20872a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.w
    public final void c(c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.A();
            return;
        }
        synchronized (this) {
            str = this.f20872a.format((java.util.Date) date);
        }
        cVar.U(str);
    }

    private SqlDateTypeAdapter() {
        this.f20872a = new SimpleDateFormat("MMM d, yyyy");
    }
}
