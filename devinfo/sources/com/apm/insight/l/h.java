package com.apm.insight.l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Writer f3341a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f3342b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3343a = new a("EMPTY_ARRAY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f3344b = new a("NONEMPTY_ARRAY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f3345c = new a("EMPTY_OBJECT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f3346d = new a("DANGLING_KEY", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f3347e = new a("NONEMPTY_OBJECT", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f3348f = new a("NULL", 5);

        private a(String str, int i4) {
        }
    }

    private h(Writer writer) {
        this.f3341a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f3343a, "[");
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f3343a;
        return a("]");
    }

    private h c() throws JSONException, IOException {
        return a(a.f3345c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f3343a;
        return a("}");
    }

    private a e() throws JSONException {
        return this.f3342b.get(r0.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f3342b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f3343a) {
            a(a.f3344b);
            return;
        }
        if (aVarE == a.f3344b) {
            this.f3341a.write(44);
        } else if (aVarE == a.f3346d) {
            this.f3341a.write(":");
            a(a.f3347e);
        } else if (aVarE != a.f3348f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f3342b.add(aVar);
        this.f3341a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f3341a.write("\"");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\f') {
                this.f3341a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f3341a.write("\\b");
                            continue;
                        case '\t':
                            this.f3341a.write("\\t");
                            continue;
                        case '\n':
                            this.f3341a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f3341a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f3341a.write(92);
                }
                this.f3341a.write(cCharAt);
            } else {
                this.f3341a.write("\\r");
            }
        }
        this.f3341a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f3347e) {
            this.f3341a.write(44);
        } else if (aVarE != a.f3345c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f3346d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        this.f3342b.remove(r0.size() - 1);
        this.f3341a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f3342b.set(r0.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f3341a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f3341a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f3341a.write("null");
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            a(jSONArray.get(i4));
        }
        b();
    }
}
