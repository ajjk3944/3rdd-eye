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
    private Writer f6299a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f6300b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6301a = new a("EMPTY_ARRAY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f6302b = new a("NONEMPTY_ARRAY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f6303c = new a("EMPTY_OBJECT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f6304d = new a("DANGLING_KEY", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f6305e = new a("NONEMPTY_OBJECT", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f6306f = new a("NULL", 5);

        private a(String str, int i) {
        }
    }

    private h(Writer writer) {
        this.f6299a = writer;
    }

    private h a() {
        return a(a.f6301a, "[");
    }

    private h b() {
        a aVar = a.f6301a;
        return a("]");
    }

    private h c() {
        return a(a.f6303c, "{");
    }

    private h d() {
        a aVar = a.f6301a;
        return a("}");
    }

    private a e() {
        return this.f6300b.get(r0.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f6300b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f6301a) {
            a(a.f6302b);
            return;
        }
        if (aVarE == a.f6302b) {
            this.f6299a.write(44);
        } else if (aVarE == a.f6304d) {
            this.f6299a.write(":");
            a(a.f6305e);
        } else if (aVarE != a.f6306f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f6300b.add(aVar);
        this.f6299a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f6299a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                this.f6299a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f6299a.write("\\b");
                            continue;
                        case '\t':
                            this.f6299a.write("\\t");
                            continue;
                        case '\n':
                            this.f6299a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f6299a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f6299a.write(92);
                }
                this.f6299a.write(cCharAt);
            } else {
                this.f6299a.write("\\r");
            }
        }
        this.f6299a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f6305e) {
            this.f6299a.write(44);
        } else if (aVarE != a.f6303c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f6304d);
        b(str);
        return this;
    }

    private h a(String str) throws IOException {
        e();
        this.f6300b.remove(r0.size() - 1);
        this.f6299a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f6300b.set(r0.size() - 1, aVar);
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
                this.f6299a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f6299a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f6299a.write("null");
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws JSONException, IOException {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws IOException {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) {
        a();
        for (int i = 0; i < jSONArray.length(); i++) {
            a(jSONArray.get(i));
        }
        b();
    }
}
