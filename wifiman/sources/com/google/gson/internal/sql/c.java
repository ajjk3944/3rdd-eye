package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.p;
import com.google.gson.q;
import java.sql.Timestamp;
import java.util.Date;
import w5.C8268a;
import w5.C8270c;

/* loaded from: classes3.dex */
class c extends p {

    /* renamed from: b, reason: collision with root package name */
    static final q f39118b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final p f39119a;

    class a implements q {
        a() {
        }

        @Override // com.google.gson.q
        public p b(e eVar, com.google.gson.reflect.a aVar) {
            a aVar2 = null;
            if (aVar.c() == Timestamp.class) {
                return new c(eVar.m(Date.class), aVar2);
            }
            return null;
        }
    }

    /* synthetic */ c(p pVar, a aVar) {
        this(pVar);
    }

    @Override // com.google.gson.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(C8268a c8268a) {
        Date date = (Date) this.f39119a.b(c8268a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(C8270c c8270c, Timestamp timestamp) {
        this.f39119a.d(c8270c, timestamp);
    }

    private c(p pVar) {
        this.f39119a = pVar;
    }
}
