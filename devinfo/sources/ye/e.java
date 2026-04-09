package ye;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import we.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements we.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37581a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f37582b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f37583c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f37584d;

    /* renamed from: e, reason: collision with root package name */
    public final we.d f37585e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37586f;

    public e(Writer writer, HashMap map, HashMap map2, a aVar, boolean z3) {
        this.f37582b = new JsonWriter(writer);
        this.f37583c = map;
        this.f37584d = map2;
        this.f37585e = aVar;
        this.f37586f = z3;
    }

    @Override // we.e
    public final we.e a(we.c cVar, boolean z3) throws IOException {
        String str = cVar.f36633a;
        j();
        JsonWriter jsonWriter = this.f37582b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z3);
        return this;
    }

    @Override // we.e
    public final we.e b(we.c cVar, double d10) throws IOException {
        String str = cVar.f36633a;
        j();
        JsonWriter jsonWriter = this.f37582b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d10);
        return this;
    }

    @Override // we.e
    public final we.e c(we.c cVar, int i4) throws IOException {
        String str = cVar.f36633a;
        j();
        JsonWriter jsonWriter = this.f37582b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i4);
        return this;
    }

    @Override // we.e
    public final we.e d(we.c cVar, long j) throws IOException {
        String str = cVar.f36633a;
        j();
        JsonWriter jsonWriter = this.f37582b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // we.e
    public final we.e e(we.c cVar, Object obj) throws IOException {
        i(obj, cVar.f36633a);
        return this;
    }

    @Override // we.g
    public final g f(String str) throws IOException {
        j();
        this.f37582b.value(str);
        return this;
    }

    @Override // we.g
    public final g g(boolean z3) throws IOException {
        j();
        this.f37582b.value(z3);
        return this;
    }

    public final e h(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f37582b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i4 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e2) {
                        throw new we.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            we.d dVar = (we.d) this.f37583c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            we.f fVar = (we.f) this.f37584d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f37585e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int iA = ((f) obj).a();
                j();
                jsonWriter.value(iA);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i4 < length) {
                jsonWriter.value(r7[i4]);
                i4++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i4 < length2) {
                long j = jArr[i4];
                j();
                jsonWriter.value(j);
                i4++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i4 < length3) {
                jsonWriter.value(dArr[i4]);
                i4++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i4 < length4) {
                jsonWriter.value(zArr[i4]);
                i4++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i4 < length5) {
                h(numberArr[i4]);
                i4++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i4 < length6) {
                h(objArr[i4]);
                i4++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) throws IOException {
        boolean z3 = this.f37586f;
        JsonWriter jsonWriter = this.f37582b;
        if (z3) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f37581a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
