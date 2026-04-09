package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;
import java.sql.Timestamp;
import java.util.Date;
import yf.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class SqlTimestampTypeAdapter extends w {

    /* renamed from: b, reason: collision with root package name */
    public static final x f20875b = new x() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            if (aVar.f37087a != Timestamp.class) {
                return null;
            }
            jVar.getClass();
            return new SqlTimestampTypeAdapter(jVar.d(new xf.a(Date.class)));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final w f20876a;

    public SqlTimestampTypeAdapter(w wVar) {
        this.f20876a = wVar;
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) {
        Date date = (Date) this.f20876a.b(bVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.w
    public final void c(c cVar, Object obj) {
        this.f20876a.c(cVar, (Timestamp) obj);
    }
}
