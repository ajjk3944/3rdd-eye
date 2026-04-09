package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final o f23421b = new o() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            if (aVar.f1061a == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f23422a = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.TypeAdapter
    public final Time b(E5.a aVar) throws IOException {
        synchronized (this) {
            if (aVar.C0() == E5.b.NULL) {
                aVar.v0();
                return null;
            }
            try {
                return new Time(this.f23422a.parse(aVar.y0()).getTime());
            } catch (ParseException e4) {
                throw new m(e4);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, Time time) throws IOException {
        Time time2 = time;
        synchronized (this) {
            cVar.p0(time2 == null ? null : this.f23422a.format((Date) time2));
        }
    }
}
