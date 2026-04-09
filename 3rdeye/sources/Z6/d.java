package Z6;

import N7.C1154e9;
import android.net.Uri;
import androidx.work.s;
import b9.C1992A;
import b9.j;
import d7.C4278a;
import h7.C4420a;
import j6.C5195A;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.l;
import y9.q;

/* compiled from: Variable.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final C5195A<l<d, C1992A>> f14034a = new C5195A<>();

    /* compiled from: Variable.kt */
    public static class a extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14035b;

        /* renamed from: c, reason: collision with root package name */
        public JSONArray f14036c;

        public a(String name, JSONArray defaultValue) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
            this.f14035b = name;
            this.f14036c = defaultValue;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14035b;
        }

        public final void g(JSONArray value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (kotlin.jvm.internal.l.b(this.f14036c, value)) {
                return;
            }
            this.f14036c = value;
            c(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class b extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14037b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14038c;

        public b(String name, boolean z10) {
            kotlin.jvm.internal.l.f(name, "name");
            this.f14037b = name;
            this.f14038c = z10;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14037b;
        }
    }

    /* compiled from: Variable.kt */
    public static class c extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14039b;

        /* renamed from: c, reason: collision with root package name */
        public int f14040c;

        public c(String name, int i) {
            kotlin.jvm.internal.l.f(name, "name");
            this.f14039b = name;
            this.f14040c = i;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14039b;
        }
    }

    /* compiled from: Variable.kt */
    /* renamed from: Z6.d$d, reason: collision with other inner class name */
    public static class C0207d extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14041b;

        /* renamed from: c, reason: collision with root package name */
        public JSONObject f14042c;

        public C0207d(String name, JSONObject defaultValue) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
            this.f14041b = name;
            this.f14042c = defaultValue;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14041b;
        }

        public final void g(JSONObject value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (kotlin.jvm.internal.l.b(this.f14042c, value)) {
                return;
            }
            this.f14042c = value;
            c(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14043b;

        /* renamed from: c, reason: collision with root package name */
        public double f14044c;

        public e(String name, double d10) {
            kotlin.jvm.internal.l.f(name, "name");
            this.f14043b = name;
            this.f14044c = d10;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14043b;
        }

        public final void g(double d10) {
            if (this.f14044c == d10) {
                return;
            }
            this.f14044c = d10;
            c(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14045b;

        /* renamed from: c, reason: collision with root package name */
        public long f14046c;

        public f(String name, long j4) {
            kotlin.jvm.internal.l.f(name, "name");
            this.f14045b = name;
            this.f14046c = j4;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14045b;
        }

        public final void g(long j4) {
            if (this.f14046c == j4) {
                return;
            }
            this.f14046c = j4;
            c(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class g extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14047b;

        /* renamed from: c, reason: collision with root package name */
        public String f14048c;

        public g(String name, String defaultValue) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
            this.f14047b = name;
            this.f14048c = defaultValue;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14047b;
        }

        public final void g(String value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (kotlin.jvm.internal.l.b(this.f14048c, value)) {
                return;
            }
            this.f14048c = value;
            c(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class h extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f14049b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f14050c;

        public h(String name, Uri defaultValue) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
            this.f14049b = name;
            this.f14050c = defaultValue;
        }

        @Override // Z6.d
        public final String a() {
            return this.f14049b;
        }

        public final void g(Uri value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (kotlin.jvm.internal.l.b(this.f14050c, value)) {
                return;
            }
            this.f14050c = value;
            c(this);
        }
    }

    public abstract String a();

    public final Object b() {
        if (this instanceof g) {
            return ((g) this).f14048c;
        }
        if (this instanceof f) {
            return Long.valueOf(((f) this).f14046c);
        }
        if (this instanceof b) {
            return Boolean.valueOf(((b) this).f14038c);
        }
        if (this instanceof e) {
            return Double.valueOf(((e) this).f14044c);
        }
        if (this instanceof c) {
            return new C4278a(((c) this).f14040c);
        }
        if (this instanceof h) {
            return ((h) this).f14050c;
        }
        if (this instanceof C0207d) {
            return ((C0207d) this).f14042c;
        }
        if (this instanceof a) {
            return ((a) this).f14036c;
        }
        throw new j();
    }

    public final void c(d dVar) {
        C4420a.a();
        C5195A<l<d, C1992A>> c5195a = this.f14034a;
        c5195a.getClass();
        C5195A.a aVar = new C5195A.a();
        while (aVar.hasNext()) {
            ((l) aVar.next()).invoke(dVar);
        }
    }

    public final void d(String newValue) throws NumberFormatException, Z6.f {
        boolean zBooleanValue;
        kotlin.jvm.internal.l.f(newValue, "newValue");
        if (this instanceof g) {
            ((g) this).g(newValue);
            return;
        }
        if (this instanceof f) {
            try {
                ((f) this).g(Long.parseLong(newValue));
                return;
            } catch (NumberFormatException e4) {
                throw new Z6.f(1, null, e4);
            }
        }
        if (this instanceof b) {
            b bVar = (b) this;
            Boolean boolV0 = q.v0(newValue);
            if (boolV0 != null) {
                zBooleanValue = boolV0.booleanValue();
            } else {
                try {
                    int i = Integer.parseInt(newValue);
                    Boolean bool = i != 0 ? i != 1 ? null : Boolean.TRUE : Boolean.FALSE;
                    if (bool == null) {
                        throw new Z6.f(2, C1154e9.i("Unable to convert ", newValue, " to boolean"), null);
                    }
                    zBooleanValue = bool.booleanValue();
                } catch (NumberFormatException e10) {
                    throw new Z6.f(1, null, e10);
                }
            }
            if (bVar.f14038c == zBooleanValue) {
                return;
            }
            bVar.f14038c = zBooleanValue;
            bVar.c(bVar);
            return;
        }
        if (this instanceof e) {
            try {
                ((e) this).g(Double.parseDouble(newValue));
                return;
            } catch (NumberFormatException e11) {
                throw new Z6.f(1, null, e11);
            }
        }
        if (this instanceof c) {
            c cVar = (c) this;
            Integer num = (Integer) l7.h.f43881b.invoke(newValue);
            if (num == null) {
                throw new Z6.f(2, s.e("Wrong value format for color variable: '", newValue, '\''), null);
            }
            int iIntValue = num.intValue();
            if (cVar.f14040c == iIntValue) {
                return;
            }
            cVar.f14040c = iIntValue;
            cVar.c(cVar);
            return;
        }
        if (this instanceof h) {
            h hVar = (h) this;
            try {
                Uri uri = Uri.parse(newValue);
                kotlin.jvm.internal.l.e(uri, "{\n            Uri.parse(this)\n        }");
                hVar.g(uri);
                return;
            } catch (IllegalArgumentException e12) {
                throw new Z6.f(1, null, e12);
            }
        }
        if (this instanceof C0207d) {
            try {
                ((C0207d) this).g(new JSONObject(newValue));
            } catch (JSONException e13) {
                throw new Z6.f(1, null, e13);
            }
        } else {
            if (!(this instanceof a)) {
                throw new j();
            }
            try {
                ((a) this).g(new JSONArray(newValue));
            } catch (JSONException e14) {
                throw new Z6.f(1, null, e14);
            }
        }
    }

    public final void e(d from) throws Z6.f {
        kotlin.jvm.internal.l.f(from, "from");
        if ((this instanceof g) && (from instanceof g)) {
            ((g) this).g(((g) from).f14048c);
            return;
        }
        if ((this instanceof f) && (from instanceof f)) {
            ((f) this).g(((f) from).f14046c);
            return;
        }
        if ((this instanceof b) && (from instanceof b)) {
            b bVar = (b) this;
            boolean z10 = ((b) from).f14038c;
            if (bVar.f14038c == z10) {
                return;
            }
            bVar.f14038c = z10;
            bVar.c(bVar);
            return;
        }
        if ((this instanceof e) && (from instanceof e)) {
            ((e) this).g(((e) from).f14044c);
            return;
        }
        if ((this instanceof c) && (from instanceof c)) {
            c cVar = (c) this;
            int i = ((c) from).f14040c;
            if (cVar.f14040c == i) {
                return;
            }
            cVar.f14040c = i;
            cVar.c(cVar);
            return;
        }
        if ((this instanceof h) && (from instanceof h)) {
            ((h) this).g(((h) from).f14050c);
            return;
        }
        if ((this instanceof C0207d) && (from instanceof C0207d)) {
            ((C0207d) this).g(((C0207d) from).f14042c);
            return;
        }
        if ((this instanceof a) && (from instanceof a)) {
            ((a) this).g(((a) from).f14036c);
            return;
        }
        throw new Z6.f(2, "Setting value to " + this + " from " + from + " not supported!", null);
    }

    public final void f(Object obj) throws Z6.f {
        try {
            if (this instanceof g) {
                ((g) this).g((String) obj);
                return;
            }
            if (this instanceof f) {
                ((f) this).g(((Number) obj).longValue());
                return;
            }
            if (this instanceof b) {
                b bVar = (b) this;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (bVar.f14038c == zBooleanValue) {
                    return;
                }
                bVar.f14038c = zBooleanValue;
                bVar.c(bVar);
                return;
            }
            if (this instanceof e) {
                ((e) this).g(((Number) obj).doubleValue());
                return;
            }
            if (this instanceof c) {
                c cVar = (c) this;
                int i = ((C4278a) obj).f37526a;
                if (cVar.f14040c == i) {
                    return;
                }
                cVar.f14040c = i;
                cVar.c(cVar);
                return;
            }
            if (this instanceof h) {
                ((h) this).g((Uri) obj);
            } else if (this instanceof C0207d) {
                ((C0207d) this).g((JSONObject) obj);
            } else {
                if (!(this instanceof a)) {
                    throw new j();
                }
                ((a) this).g((JSONArray) obj);
            }
        } catch (ClassCastException unused) {
            throw new Z6.f(2, "Unable to set value with type " + obj.getClass() + " to " + this, null);
        }
    }
}
