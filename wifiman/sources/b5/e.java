package b5;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class e implements Z4.d, Z4.f {

    /* renamed from: a, reason: collision with root package name */
    private e f32941a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f32942b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f32943c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f32944d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f32945e;

    /* renamed from: f, reason: collision with root package name */
    private final Z4.c f32946f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f32947g;

    e(Writer writer, Map map, Map map2, Z4.c cVar, boolean z10) {
        this.f32943c = new JsonWriter(writer);
        this.f32944d = map;
        this.f32945e = map2;
        this.f32946f = cVar;
        this.f32947g = z10;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) throws IOException {
        y();
        this.f32943c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f32943c.nullValue();
        return this;
    }

    private e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f32943c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f32942b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f32941a;
        if (eVar != null) {
            eVar.y();
            this.f32941a.f32942b = false;
            this.f32941a = null;
            this.f32943c.endObject();
        }
    }

    @Override // Z4.d
    public Z4.d b(Z4.b bVar, Object obj) {
        return p(bVar.b(), obj);
    }

    @Override // Z4.d
    public Z4.d c(Z4.b bVar, long j10) {
        return o(bVar.b(), j10);
    }

    @Override // Z4.d
    public Z4.d d(Z4.b bVar, int i10) {
        return n(bVar.b(), i10);
    }

    @Override // Z4.d
    public Z4.d e(Z4.b bVar, double d10) {
        return m(bVar.b(), d10);
    }

    @Override // Z4.d
    public Z4.d f(Z4.b bVar, boolean z10) {
        return q(bVar.b(), z10);
    }

    public e h(double d10) throws IOException {
        y();
        this.f32943c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f32943c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f32943c.value(j10);
        return this;
    }

    e k(Object obj, boolean z10) {
        if (z10 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f32943c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f32943c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f32943c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f32943c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f32943c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f32943c.endObject();
                return this;
            }
            Z4.c cVar = (Z4.c) this.f32944d.get(obj.getClass());
            if (cVar != null) {
                return v(cVar, obj, z10);
            }
            Z4.e eVar = (Z4.e) this.f32945e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f32946f, obj, z10);
            }
            if (obj instanceof f) {
                i(((f) obj).getNumber());
            } else {
                a(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f32943c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f32943c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f32943c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f32943c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f32943c.endArray();
        return this;
    }

    @Override // Z4.f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e a(String str) throws IOException {
        y();
        this.f32943c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f32943c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f32943c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f32943c.name(str);
        return j(j10);
    }

    public e p(String str, Object obj) {
        return this.f32947g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z10) throws IOException {
        y();
        this.f32943c.name(str);
        return g(z10);
    }

    @Override // Z4.f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z10) throws IOException {
        y();
        this.f32943c.value(z10);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f32943c.nullValue();
        } else {
            this.f32943c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void u() {
        y();
        this.f32943c.flush();
    }

    e v(Z4.c cVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f32943c.beginObject();
        }
        cVar.a(obj, this);
        if (!z10) {
            this.f32943c.endObject();
        }
        return this;
    }
}
