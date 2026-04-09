package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.e;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
final class b extends p {

    /* renamed from: b, reason: collision with root package name */
    static final q f39116b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f39117a;

    class a implements q {
        a() {
        }

        @Override // com.google.gson.q
        public p b(e eVar, com.google.gson.reflect.a aVar) {
            a aVar2 = null;
            if (aVar.c() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(C8268a c8268a) throws IOException {
        Time time;
        if (c8268a.v0() == EnumC8269b.NULL) {
            c8268a.r0();
            return null;
        }
        String strT0 = c8268a.t0();
        synchronized (this) {
            TimeZone timeZone = this.f39117a.getTimeZone();
            try {
                try {
                    time = new Time(this.f39117a.parse(strT0).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as SQL Time; at path " + c8268a.P(), e10);
                }
            } finally {
                this.f39117a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(C8270c c8270c, Time time) throws IOException {
        String str;
        if (time == null) {
            c8270c.b0();
            return;
        }
        synchronized (this) {
            str = this.f39117a.format((Date) time);
        }
        c8270c.x0(str);
    }

    private b() {
        this.f39117a = new SimpleDateFormat("hh:mm:ss a");
    }
}
