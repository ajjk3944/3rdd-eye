package zf;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xf.f;
import xf.g;

/* loaded from: classes.dex */
public final class d implements xf.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27375a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f27376b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f27377c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f27378d;

    /* renamed from: e, reason: collision with root package name */
    public final xf.d f27379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27380f;

    public d(Writer writer, HashMap map, HashMap map2, ag.g gVar, boolean z10) {
        this.f27376b = new JsonWriter(writer);
        this.f27377c = map;
        this.f27378d = map2;
        this.f27379e = gVar;
        this.f27380f = z10;
    }

    @Override // xf.e
    public final xf.e a(xf.c cVar, boolean z10) throws IOException {
        String str = cVar.f25307a;
        j();
        JsonWriter jsonWriter = this.f27376b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override // xf.e
    public final xf.e b(xf.c cVar, double d6) throws IOException {
        String str = cVar.f25307a;
        j();
        JsonWriter jsonWriter = this.f27376b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d6);
        return this;
    }

    @Override // xf.e
    public final xf.e c(xf.c cVar, long j) throws IOException {
        String str = cVar.f25307a;
        j();
        JsonWriter jsonWriter = this.f27376b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // xf.e
    public final xf.e d(xf.c cVar, int i10) throws IOException {
        String str = cVar.f25307a;
        j();
        JsonWriter jsonWriter = this.f27376b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override // xf.e
    public final xf.e e(xf.c cVar, Object obj) throws IOException {
        i(obj, cVar.f25307a);
        return this;
    }

    @Override // xf.g
    public final g f(String str) throws IOException {
        j();
        this.f27376b.value(str);
        return this;
    }

    @Override // xf.g
    public final g g(boolean z10) throws IOException {
        j();
        this.f27376b.value(z10);
        return this;
    }

    public final d h(Object obj) {
        JsonWriter jsonWriter = this.f27376b;
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
                    } catch (ClassCastException e4) {
                        throw new xf.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            xf.d dVar = (xf.d) this.f27377c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f27378d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f27379e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof e) {
                int number = ((e) obj).getNumber();
                j();
                jsonWriter.value(number);
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
        int i10 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                jsonWriter.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j = jArr[i10];
                j();
                jsonWriter.value(j);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                h(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                h(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final d i(Object obj, String str) throws IOException {
        boolean z10 = this.f27380f;
        JsonWriter jsonWriter = this.f27376b;
        if (z10) {
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
        if (!this.f27375a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
