package ag;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements xf.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f350f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final xf.c f351g;

    /* renamed from: h, reason: collision with root package name */
    public static final xf.c f352h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f353i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f354a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f355b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f356c;

    /* renamed from: d, reason: collision with root package name */
    public final xf.d f357d;

    /* renamed from: e, reason: collision with root package name */
    public final k f358e = new k(this);

    static {
        b bVarC = b.c();
        bVarC.f345d = 1;
        f351g = new xf.c("key", h0.b.w(h0.b.v(f.class, bVarC.b())));
        b bVarC2 = b.c();
        bVarC2.f345d = 2;
        f352h = new xf.c("value", h0.b.w(h0.b.v(f.class, bVarC2.b())));
        f353i = new g(0);
    }

    public i(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, xf.d dVar) {
        this.f354a = byteArrayOutputStream;
        this.f355b = map;
        this.f356c = map2;
        this.f357d = dVar;
    }

    public static int k(xf.c cVar) {
        f fVar = (f) ((Annotation) cVar.f25308b.get(f.class));
        if (fVar != null) {
            return ((a) fVar).f342a;
        }
        throw new xf.b("Field has no @Protobuf config");
    }

    @Override // xf.e
    public final xf.e a(xf.c cVar, boolean z10) {
        g(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // xf.e
    public final xf.e b(xf.c cVar, double d6) throws IOException {
        f(cVar, d6, true);
        return this;
    }

    @Override // xf.e
    public final xf.e c(xf.c cVar, long j) throws IOException {
        h(cVar, j, true);
        return this;
    }

    @Override // xf.e
    public final xf.e d(xf.c cVar, int i10) {
        g(cVar, i10, true);
        return this;
    }

    @Override // xf.e
    public final xf.e e(xf.c cVar, Object obj) {
        i(cVar, obj, true);
        return this;
    }

    public final void f(xf.c cVar, double d6, boolean z10) throws IOException {
        if (z10 && d6 == 0.0d) {
            return;
        }
        l((k(cVar) << 3) | 1);
        this.f354a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d6).array());
    }

    public final void g(xf.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        f fVar = (f) ((Annotation) cVar.f25308b.get(f.class));
        if (fVar == null) {
            throw new xf.b("Field has no @Protobuf config");
        }
        int[] iArr = h.f349a;
        a aVar = (a) fVar;
        int i11 = aVar.f342a;
        int i12 = iArr[aVar.f343b.ordinal()];
        if (i12 == 1) {
            l(i11 << 3);
            l(i10);
        } else if (i12 == 2) {
            l(i11 << 3);
            l((i10 << 1) ^ (i10 >> 31));
        } else {
            if (i12 != 3) {
                return;
            }
            l((i11 << 3) | 5);
            this.f354a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    public final void h(xf.c cVar, long j, boolean z10) throws IOException {
        if (z10 && j == 0) {
            return;
        }
        f fVar = (f) ((Annotation) cVar.f25308b.get(f.class));
        if (fVar == null) {
            throw new xf.b("Field has no @Protobuf config");
        }
        int[] iArr = h.f349a;
        a aVar = (a) fVar;
        int i10 = aVar.f342a;
        int i11 = iArr[aVar.f343b.ordinal()];
        if (i11 == 1) {
            l(i10 << 3);
            m(j);
        } else if (i11 == 2) {
            l(i10 << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (i11 != 3) {
                return;
            }
            l((i10 << 3) | 1);
            this.f354a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(xf.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f350f);
            l(bytes.length);
            this.f354a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f353i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            l((k(cVar) << 3) | 5);
            this.f354a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(cVar, ((Number) obj).longValue(), z10);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.f354a.write(bArr);
            return;
        }
        xf.d dVar = (xf.d) this.f355b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        xf.f fVar = (xf.f) this.f356c.get(obj.getClass());
        if (fVar != null) {
            k kVar = this.f358e;
            kVar.f360a = false;
            kVar.f362c = cVar;
            kVar.f361b = z10;
            fVar.a(obj, kVar);
            return;
        }
        if (obj instanceof d) {
            g(cVar, ((d) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.f357d, cVar, obj, z10);
        }
    }

    public final void j(xf.d dVar, xf.c cVar, Object obj, boolean z10) throws IOException {
        c cVar2 = new c();
        cVar2.f347a = 0L;
        try {
            OutputStream outputStream = this.f354a;
            this.f354a = cVar2;
            try {
                dVar.a(obj, this);
                this.f354a = outputStream;
                long j = cVar2.f347a;
                cVar2.close();
                if (z10 && j == 0) {
                    return;
                }
                l((k(cVar) << 3) | 2);
                m(j);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f354a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                cVar2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void l(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f354a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f354a.write(i10 & 127);
    }

    public final void m(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f354a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f354a.write(((int) j) & 127);
    }
}
