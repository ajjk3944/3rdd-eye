package b5;

import Z4.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes2.dex */
public final class e implements Z4.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17192a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f17194c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f17195d;

    /* renamed from: e, reason: collision with root package name */
    public final C1852a f17196e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17197f;

    public e(Writer writer, HashMap map, HashMap map2, C1852a c1852a, boolean z10) {
        this.f17193b = new JsonWriter(writer);
        this.f17194c = map;
        this.f17195d = map2;
        this.f17196e = c1852a;
        this.f17197f = z10;
    }

    @Override // Z4.e
    public final Z4.e a(Z4.c cVar, Object obj) throws IOException {
        h(obj, cVar.f14014a);
        return this;
    }

    @Override // Z4.g
    public final g add(String str) throws IOException {
        i();
        this.f17193b.value(str);
        return this;
    }

    @Override // Z4.e
    public final Z4.e b(Z4.c cVar, long j4) throws IOException {
        String str = cVar.f14014a;
        i();
        JsonWriter jsonWriter = this.f17193b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j4);
        return this;
    }

    @Override // Z4.e
    public final Z4.e c(Z4.c cVar, int i) throws IOException {
        String str = cVar.f14014a;
        i();
        JsonWriter jsonWriter = this.f17193b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i);
        return this;
    }

    @Override // Z4.e
    public final Z4.e d(Z4.c cVar, double d10) throws IOException {
        String str = cVar.f14014a;
        i();
        JsonWriter jsonWriter = this.f17193b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(d10);
        return this;
    }

    @Override // Z4.e
    public final Z4.e e(Z4.c cVar, boolean z10) throws IOException {
        String str = cVar.f14014a;
        i();
        JsonWriter jsonWriter = this.f17193b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z10);
        return this;
    }

    @Override // Z4.g
    public final g f(boolean z10) throws IOException {
        i();
        this.f17193b.value(z10);
        return this;
    }

    public final e g(Object obj) throws IOException {
        int i = 0;
        JsonWriter jsonWriter = this.f17193b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e4) {
                        throw new Z4.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            Z4.d dVar = (Z4.d) this.f17194c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            Z4.f fVar = (Z4.f) this.f17195d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f17196e.a(obj, this);
                throw null;
            }
            if (obj instanceof f) {
                int number = ((f) obj).getNumber();
                i();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            i();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r8[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j4 = jArr[i];
                i();
                jsonWriter.value(j4);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                g(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                g(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e h(Object obj, String str) throws IOException {
        boolean z10 = this.f17197f;
        JsonWriter jsonWriter = this.f17193b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            g(obj);
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        g(obj);
        return this;
    }

    public final void i() throws IOException {
        if (!this.f17192a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
