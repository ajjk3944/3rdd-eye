package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final o f23419b = new o() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            if (aVar.f1061a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f23420a = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.TypeAdapter
    public final Date b(E5.a aVar) throws IOException {
        synchronized (this) {
            if (aVar.C0() == E5.b.NULL) {
                aVar.v0();
                return null;
            }
            try {
                return new Date(this.f23420a.parse(aVar.y0()).getTime());
            } catch (ParseException e4) {
                throw new m(e4);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            cVar.p0(date2 == null ? null : this.f23420a.format((java.util.Date) date2));
        }
    }
}
