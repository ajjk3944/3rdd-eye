package b5;

import Z4.g;
import a5.InterfaceC1651a;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes2.dex */
public final class d implements InterfaceC1651a<d> {

    /* renamed from: e, reason: collision with root package name */
    public static final C1852a f17183e = new C1852a();

    /* renamed from: f, reason: collision with root package name */
    public static final b f17184f = new b();

    /* renamed from: g, reason: collision with root package name */
    public static final c f17185g = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final a f17186h = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17187a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17188b;

    /* renamed from: c, reason: collision with root package name */
    public final C1852a f17189c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17190d;

    /* compiled from: JsonDataEncoderBuilder.java */
    public static final class a implements Z4.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f17191a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f17191a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // Z4.a
        public final void a(Object obj, g gVar) throws IOException {
            gVar.add(f17191a.format((Date) obj));
        }
    }

    public d() {
        HashMap map = new HashMap();
        this.f17187a = map;
        HashMap map2 = new HashMap();
        this.f17188b = map2;
        this.f17189c = f17183e;
        this.f17190d = false;
        map2.put(String.class, f17184f);
        map.remove(String.class);
        map2.put(Boolean.class, f17185g);
        map.remove(Boolean.class);
        map2.put(Date.class, f17186h);
        map.remove(Date.class);
    }

    public final InterfaceC1651a a(Class cls, Z4.d dVar) {
        this.f17187a.put(cls, dVar);
        this.f17188b.remove(cls);
        return this;
    }
}
