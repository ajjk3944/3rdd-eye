package b5;

import a5.InterfaceC3765a;
import a5.InterfaceC3766b;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class d implements InterfaceC3766b {

    /* renamed from: e, reason: collision with root package name */
    private static final Z4.c f32931e = new Z4.c() { // from class: b5.a
        @Override // Z4.c
        public final void a(Object obj, Object obj2) {
            d.l(obj, (Z4.d) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final Z4.e f32932f = new Z4.e() { // from class: b5.b
        @Override // Z4.e
        public final void a(Object obj, Object obj2) {
            ((Z4.f) obj2).a((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final Z4.e f32933g = new Z4.e() { // from class: b5.c
        @Override // Z4.e
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (Z4.f) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f32934h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f32935a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f32936b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Z4.c f32937c = f32931e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32938d = false;

    class a implements Z4.a {
        a() {
        }

        @Override // Z4.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f32935a, d.this.f32936b, d.this.f32937c, d.this.f32938d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // Z4.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements Z4.e {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f32940a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f32940a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // Z4.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Z4.f fVar) {
            fVar.a(f32940a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f32932f);
        p(Boolean.class, f32933g);
        p(Date.class, f32934h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, Z4.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, Z4.f fVar) {
        fVar.g(bool.booleanValue());
    }

    public Z4.a i() {
        return new a();
    }

    public d j(InterfaceC3765a interfaceC3765a) {
        interfaceC3765a.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f32938d = z10;
        return this;
    }

    @Override // a5.InterfaceC3766b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, Z4.c cVar) {
        this.f32935a.put(cls, cVar);
        this.f32936b.remove(cls);
        return this;
    }

    public d p(Class cls, Z4.e eVar) {
        this.f32936b.put(cls, eVar);
        this.f32935a.remove(cls);
        return this;
    }
}
