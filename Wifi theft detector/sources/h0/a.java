package h0;

import android.content.LocusId;
import android.os.Build;
import r0.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21378a;

    /* renamed from: b, reason: collision with root package name */
    public final LocusId f21379b;

    /* renamed from: h0.a$a, reason: collision with other inner class name */
    public static class C0405a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public a(String str) {
        this.f21378a = (String) i.j(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21379b = C0405a.a(str);
        } else {
            this.f21379b = null;
        }
    }

    public static a c(LocusId locusId) {
        i.h(locusId, "locusId cannot be null");
        return new a((String) i.j(C0405a.b(locusId), "id cannot be empty"));
    }

    public final String a() {
        return this.f21378a.length() + "_chars";
    }

    public LocusId b() {
        return this.f21379b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f21378a;
        return str == null ? aVar.f21378a == null : str.equals(aVar.f21378a);
    }

    public int hashCode() {
        String str = this.f21378a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }
}
