package c5;

import a5.InterfaceC3765a;
import a5.InterfaceC3766b;
import c5.h;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f33876a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f33877b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.c f33878c;

    public static final class a implements InterfaceC3766b {

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.c f33879d = new Z4.c() { // from class: c5.g
            @Override // Z4.c
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (Z4.d) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f33880a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f33881b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private Z4.c f33882c = f33879d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, Z4.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f33880a), new HashMap(this.f33881b), this.f33882c);
        }

        public a d(InterfaceC3765a interfaceC3765a) {
            interfaceC3765a.a(this);
            return this;
        }

        @Override // a5.InterfaceC3766b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, Z4.c cVar) {
            this.f33880a.put(cls, cVar);
            this.f33881b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, Z4.c cVar) {
        this.f33876a = map;
        this.f33877b = map2;
        this.f33878c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f33876a, this.f33877b, this.f33878c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
