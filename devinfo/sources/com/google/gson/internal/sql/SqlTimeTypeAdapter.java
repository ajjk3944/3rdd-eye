package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import yf.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
final class SqlTimeTypeAdapter extends w {

    /* renamed from: b, reason: collision with root package name */
    public static final x f20873b = new x() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            if (aVar.f37087a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f20874a;

    public /* synthetic */ SqlTimeTypeAdapter(int i4) {
        this();
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        Time time;
        if (bVar.Z() == 9) {
            bVar.V();
            return null;
        }
        String strX = bVar.X();
        synchronized (this) {
            TimeZone timeZone = this.f20874a.getTimeZone();
            try {
                try {
                    time = new Time(this.f20874a.parse(strX).getTime());
                } catch (ParseException e2) {
                    throw new q("Failed parsing '" + strX + "' as SQL Time; at path " + bVar.y(true), e2);
                }
            } finally {
                this.f20874a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.w
    public final void c(c cVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            cVar.A();
            return;
        }
        synchronized (this) {
            str = this.f20874a.format((Date) time);
        }
        cVar.U(str);
    }

    private SqlTimeTypeAdapter() {
        this.f20874a = new SimpleDateFormat("hh:mm:ss a");
    }
}
