package J7;

import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* compiled from: RawJson.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: RawJson.kt */
    /* renamed from: J7.a$a, reason: collision with other inner class name */
    public static final class C0050a implements a {

        /* renamed from: b, reason: collision with root package name */
        public final String f2805b;

        /* renamed from: c, reason: collision with root package name */
        public final JSONObject f2806c;

        public C0050a(String id, JSONObject data) {
            l.f(id, "id");
            l.f(data, "data");
            this.f2805b = id;
            this.f2806c = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0050a)) {
                return false;
            }
            C0050a c0050a = (C0050a) obj;
            return l.b(this.f2805b, c0050a.f2805b) && l.b(this.f2806c, c0050a.f2806c);
        }

        @Override // J7.a
        public final JSONObject getData() {
            return this.f2806c;
        }

        @Override // J7.a
        public final String getId() {
            return this.f2805b;
        }

        public final int hashCode() {
            return this.f2806c.hashCode() + (this.f2805b.hashCode() * 31);
        }

        public final String toString() {
            return "Ready(id=" + this.f2805b + ", data=" + this.f2806c + ')';
        }
    }

    JSONObject getData();

    String getId();
}
