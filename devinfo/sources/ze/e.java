package ze;

import j$.util.DesugarCollections;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements we.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f38250f = Charset.forName("UTF-8");
    public static final we.c g;

    /* renamed from: h, reason: collision with root package name */
    public static final we.c f38251h;

    /* renamed from: i, reason: collision with root package name */
    public static final ye.a f38252i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f38253a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38254b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f38255c;

    /* renamed from: d, reason: collision with root package name */
    public final we.d f38256d;

    /* renamed from: e, reason: collision with root package name */
    public final g f38257e = new g(this);

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(d.class, aVar);
        g = new we.c("key", DesugarCollections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(d.class, aVar2);
        f38251h = new we.c("value", DesugarCollections.unmodifiableMap(new HashMap(map2)));
        f38252i = new ye.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, we.d dVar) {
        this.f38253a = byteArrayOutputStream;
        this.f38254b = map;
        this.f38255c = map2;
        this.f38256d = dVar;
    }

    public static int j(we.c cVar) {
        d dVar = (d) ((Annotation) cVar.f36634b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f38246a;
        }
        throw new we.b("Field has no @Protobuf config");
    }

    @Override // we.e
    public final we.e a(we.c cVar, boolean z3) {
        g(cVar, z3 ? 1 : 0, true);
        return this;
    }

    @Override // we.e
    public final we.e b(we.c cVar, double d10) throws IOException {
        f(cVar, d10, true);
        return this;
    }

    @Override // we.e
    public final we.e c(we.c cVar, int i4) {
        g(cVar, i4, true);
        return this;
    }

    @Override // we.e
    public final we.e d(we.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f36634b.get(d.class));
        if (dVar == null) {
            throw new we.b("Field has no @Protobuf config");
        }
        k(((a) dVar).f38246a << 3);
        l(j);
        return this;
    }

    @Override // we.e
    public final we.e e(we.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void f(we.c cVar, double d10, boolean z3) throws IOException {
        if (z3 && d10 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f38253a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void g(we.c cVar, int i4, boolean z3) {
        if (z3 && i4 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f36634b.get(d.class));
        if (dVar == null) {
            throw new we.b("Field has no @Protobuf config");
        }
        k(((a) dVar).f38246a << 3);
        k(i4);
    }

    public final void h(we.c cVar, Object obj, boolean z3) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f38250f);
            k(bytes.length);
            this.f38253a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f38252i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(cVar, ((Double) obj).doubleValue(), z3);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z3 && fFloatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f38253a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z3 && jLongValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f36634b.get(d.class));
            if (dVar == null) {
                throw new we.b("Field has no @Protobuf config");
            }
            k(((a) dVar).f38246a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f38253a.write(bArr);
            return;
        }
        we.d dVar2 = (we.d) this.f38254b.get(obj.getClass());
        if (dVar2 != null) {
            i(dVar2, cVar, obj, z3);
            return;
        }
        we.f fVar = (we.f) this.f38255c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f38257e;
            gVar.f38259a = false;
            gVar.f38261c = cVar;
            gVar.f38260b = z3;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof ha.c) {
            g(cVar, ((ha.c) obj).f25029a, true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f38256d, cVar, obj, z3);
        }
    }

    public final void i(we.d dVar, we.c cVar, Object obj, boolean z3) throws IOException {
        b bVar = new b();
        bVar.f38247a = 0L;
        try {
            OutputStream outputStream = this.f38253a;
            this.f38253a = bVar;
            try {
                dVar.a(obj, this);
                this.f38253a = outputStream;
                long j = bVar.f38247a;
                bVar.close();
                if (z3 && j == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f38253a = outputStream;
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

    public final void k(int i4) throws IOException {
        while ((i4 & (-128)) != 0) {
            this.f38253a.write((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.f38253a.write(i4 & 127);
    }

    public final void l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f38253a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f38253a.write(((int) j) & 127);
    }
}
