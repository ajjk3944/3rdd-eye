package qf;

import Li.N;
import Yg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import ze.AbstractC8735d;

/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7474a extends AbstractC8735d {

    /* renamed from: qf.a$a, reason: collision with other inner class name */
    public static final class C2066a {

        /* renamed from: a, reason: collision with root package name */
        private final String f58659a;

        /* renamed from: b, reason: collision with root package name */
        private final String f58660b;

        /* renamed from: c, reason: collision with root package name */
        private final String f58661c;

        public C2066a(String url, String ubicAuth, String str) {
            AbstractC6492s.i(url, "url");
            AbstractC6492s.i(ubicAuth, "ubicAuth");
            this.f58659a = url;
            this.f58660b = ubicAuth;
            this.f58661c = str;
        }

        public final List a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(z.a(".ui.com", "UBIC_AUTH=" + this.f58660b));
            String str = this.f58661c;
            if (str != null) {
                arrayList.add(z.a(".ui.com", "X-UI-CODE-VERIFIER=" + str));
            }
            return arrayList;
        }

        public final String b() {
            return this.f58659a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2066a)) {
                return false;
            }
            C2066a c2066a = (C2066a) obj;
            return AbstractC6492s.d(this.f58659a, c2066a.f58659a) && AbstractC6492s.d(this.f58660b, c2066a.f58660b) && AbstractC6492s.d(this.f58661c, c2066a.f58661c);
        }

        public int hashCode() {
            int iHashCode = ((this.f58659a.hashCode() * 31) + this.f58660b.hashCode()) * 31;
            String str = this.f58661c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "WebviewConfig(url=" + this.f58659a + ", ubicAuth=" + this.f58660b + ", pkceVerifier=" + this.f58661c + ")";
        }
    }

    public abstract N n0();
}
