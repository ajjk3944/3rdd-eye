package com.apm.insight.l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Writer f5122a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f5123b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5124a = new a("EMPTY_ARRAY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f5125b = new a("NONEMPTY_ARRAY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f5126c = new a("EMPTY_OBJECT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f5127d = new a("DANGLING_KEY", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f5128e = new a("NONEMPTY_OBJECT", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f5129f = new a("NULL", 5);

        private a(String str, int i10) {
        }
    }

    private h(Writer writer) {
        this.f5122a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f5124a, "[");
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f5124a;
        return a("]");
    }

    private h c() throws JSONException, IOException {
        return a(a.f5126c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f5124a;
        return a("}");
    }

    private a e() throws JSONException {
        return this.f5123b.get(r0.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f5123b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f5124a) {
            a(a.f5125b);
            return;
        }
        if (aVarE == a.f5125b) {
            this.f5122a.write(44);
        } else if (aVarE == a.f5127d) {
            this.f5122a.write(":");
            a(a.f5128e);
        } else if (aVarE != a.f5129f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f5123b.add(aVar);
        this.f5122a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f5122a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f5122a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f5122a.write("\\b");
                            continue;
                        case '\t':
                            this.f5122a.write("\\t");
                            continue;
                        case '\n':
                            this.f5122a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f5122a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f5122a.write(92);
                }
                this.f5122a.write(cCharAt);
            } else {
                this.f5122a.write("\\r");
            }
        }
        this.f5122a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f5128e) {
            this.f5122a.write(44);
        } else if (aVarE != a.f5126c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f5127d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        this.f5123b.remove(r0.size() - 1);
        this.f5122a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f5123b.set(r0.size() - 1, aVar);
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
                this.f5122a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f5122a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f5122a.write("null");
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
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}
