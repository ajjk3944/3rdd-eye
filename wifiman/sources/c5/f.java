package c5;

import c5.d;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.snmp4j.asn1.BER;

/* loaded from: classes3.dex */
final class f implements Z4.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f33866f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final Z4.b f33867g = Z4.b.a("key").b(C4225a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final Z4.b f33868h = Z4.b.a("value").b(C4225a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final Z4.c f33869i = new Z4.c() { // from class: c5.e
        @Override // Z4.c
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (Z4.d) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f33870a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f33871b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f33872c;

    /* renamed from: d, reason: collision with root package name */
    private final Z4.c f33873d;

    /* renamed from: e, reason: collision with root package name */
    private final i f33874e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33875a;

        static {
            int[] iArr = new int[d.a.values().length];
            f33875a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33875a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33875a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, Z4.c cVar) {
        this.f33870a = outputStream;
        this.f33871b = map;
        this.f33872c = map2;
        this.f33873d = cVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(Z4.c cVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f33870a;
            this.f33870a = bVar;
            try {
                cVar.a(obj, this);
                this.f33870a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th2) {
                this.f33870a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private f r(Z4.c cVar, Z4.b bVar, Object obj, boolean z10) throws IOException {
        long jQ = q(cVar, obj);
        if (z10 && jQ == 0) {
            return this;
        }
        x((v(bVar) << 3) | 2);
        y(jQ);
        cVar.a(obj, this);
        return this;
    }

    private f s(Z4.e eVar, Z4.b bVar, Object obj, boolean z10) {
        this.f33874e.c(bVar, z10);
        eVar.a(obj, this.f33874e);
        return this;
    }

    private static d u(Z4.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(Z4.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, Z4.d dVar) {
        dVar.b(f33867g, entry.getKey());
        dVar.b(f33868h, entry.getValue());
    }

    private void x(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f33870a.write((i10 & BER.MAX_OID_LENGTH) | 128);
            i10 >>>= 7;
        }
        this.f33870a.write(i10 & BER.MAX_OID_LENGTH);
    }

    private void y(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f33870a.write((((int) j10) & BER.MAX_OID_LENGTH) | 128);
            j10 >>>= 7;
        }
        this.f33870a.write(((int) j10) & BER.MAX_OID_LENGTH);
    }

    @Override // Z4.d
    public Z4.d b(Z4.b bVar, Object obj) {
        return i(bVar, obj, true);
    }

    @Override // Z4.d
    public Z4.d e(Z4.b bVar, double d10) {
        return g(bVar, d10, true);
    }

    Z4.d g(Z4.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        x((v(bVar) << 3) | 1);
        this.f33870a.write(p(8).putDouble(d10).array());
        return this;
    }

    Z4.d h(Z4.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        x((v(bVar) << 3) | 5);
        this.f33870a.write(p(4).putFloat(f10).array());
        return this;
    }

    Z4.d i(Z4.b bVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            x((v(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f33866f);
            x(bytes.length);
            this.f33870a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(bVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f33869i, bVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return g(bVar, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return h(bVar, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m(bVar, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return o(bVar, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            Z4.c cVar = (Z4.c) this.f33871b.get(obj.getClass());
            if (cVar != null) {
                return r(cVar, bVar, obj, z10);
            }
            Z4.e eVar = (Z4.e) this.f33872c.get(obj.getClass());
            return eVar != null ? s(eVar, bVar, obj, z10) : obj instanceof c ? d(bVar, ((c) obj).getNumber()) : obj instanceof Enum ? d(bVar, ((Enum) obj).ordinal()) : r(this.f33873d, bVar, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        x((v(bVar) << 3) | 2);
        x(bArr.length);
        this.f33870a.write(bArr);
        return this;
    }

    @Override // Z4.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f d(Z4.b bVar, int i10) {
        return k(bVar, i10, true);
    }

    f k(Z4.b bVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d dVarU = u(bVar);
        int i11 = a.f33875a[dVarU.intEncoding().ordinal()];
        if (i11 == 1) {
            x(dVarU.tag() << 3);
            x(i10);
        } else if (i11 == 2) {
            x(dVarU.tag() << 3);
            x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            x((dVarU.tag() << 3) | 5);
            this.f33870a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    @Override // Z4.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f c(Z4.b bVar, long j10) {
        return m(bVar, j10, true);
    }

    f m(Z4.b bVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d dVarU = u(bVar);
        int i10 = a.f33875a[dVarU.intEncoding().ordinal()];
        if (i10 == 1) {
            x(dVarU.tag() << 3);
            y(j10);
        } else if (i10 == 2) {
            x(dVarU.tag() << 3);
            y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            x((dVarU.tag() << 3) | 1);
            this.f33870a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    @Override // Z4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f f(Z4.b bVar, boolean z10) {
        return o(bVar, z10, true);
    }

    f o(Z4.b bVar, boolean z10, boolean z11) {
        return k(bVar, z10 ? 1 : 0, z11);
    }

    f t(Object obj) {
        if (obj == null) {
            return this;
        }
        Z4.c cVar = (Z4.c) this.f33871b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
