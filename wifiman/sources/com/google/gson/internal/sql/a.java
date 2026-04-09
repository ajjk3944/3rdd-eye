package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.e;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
final class a extends p {

    /* renamed from: b, reason: collision with root package name */
    static final q f39114b = new C1226a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f39115a;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C1226a implements q {
        C1226a() {
        }

        @Override // com.google.gson.q
        public p b(e eVar, com.google.gson.reflect.a aVar) {
            C1226a c1226a = null;
            if (aVar.c() == Date.class) {
                return new a(c1226a);
            }
            return null;
        }
    }

    /* synthetic */ a(C1226a c1226a) {
        this();
    }

    @Override // com.google.gson.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(C8268a c8268a) throws IOException {
        Date date;
        if (c8268a.v0() == EnumC8269b.NULL) {
            c8268a.r0();
            return null;
        }
        String strT0 = c8268a.t0();
        synchronized (this) {
            TimeZone timeZone = this.f39115a.getTimeZone();
            try {
                try {
                    date = new Date(this.f39115a.parse(strT0).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as SQL Date; at path " + c8268a.P(), e10);
                }
            } finally {
                this.f39115a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(C8270c c8270c, Date date) throws IOException {
        String str;
        if (date == null) {
            c8270c.b0();
            return;
        }
        synchronized (this) {
            str = this.f39115a.format((java.util.Date) date);
        }
        c8270c.x0(str);
    }

    private a() {
        this.f39115a = new SimpleDateFormat("MMM d, yyyy");
    }
}
