package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import u5.AbstractC8135a;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class c extends p {

    /* renamed from: c, reason: collision with root package name */
    public static final q f38989c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f38990a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38991b;

    class a implements q {
        a() {
        }

        @Override // com.google.gson.q
        public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            a aVar2 = null;
            if (aVar.c() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new c(b.f38992b, i10, i10, aVar2);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f38992b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class f38993a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.c.b
            protected Date a(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f38993a = cls;
        }

        protected abstract Date a(Date date);
    }

    /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    private Date e(C8268a c8268a) throws IOException {
        String strT0 = c8268a.t0();
        synchronized (this.f38991b) {
            try {
                for (DateFormat dateFormat : this.f38991b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            return dateFormat.parse(strT0);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return AbstractC8135a.c(strT0, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strT0 + "' as Date; at path " + c8268a.P(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(C8268a c8268a) throws IOException {
        if (c8268a.v0() == EnumC8269b.NULL) {
            c8268a.r0();
            return null;
        }
        return this.f38990a.a(e(c8268a));
    }

    @Override // com.google.gson.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(C8270c c8270c, Date date) throws IOException {
        String str;
        if (date == null) {
            c8270c.b0();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f38991b.get(0);
        synchronized (this.f38991b) {
            str = dateFormat.format(date);
        }
        c8270c.x0(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f38991b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private c(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f38991b = arrayList;
        Objects.requireNonNull(bVar);
        this.f38990a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (t5.e.c()) {
            arrayList.add(t5.k.c(i10, i11));
        }
    }
}
