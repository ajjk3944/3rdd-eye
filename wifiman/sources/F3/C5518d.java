package f3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5518d {

    /* renamed from: c, reason: collision with root package name */
    private static final C5518d f46974c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f46975a;

    /* renamed from: b, reason: collision with root package name */
    private final List f46976b;

    /* renamed from: f3.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f46977a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f46978b = new ArrayList();

        a() {
        }

        public C5518d a() {
            return new C5518d(this.f46977a, Collections.unmodifiableList(this.f46978b));
        }

        public a b(List list) {
            this.f46978b = list;
            return this;
        }

        public a c(String str) {
            this.f46977a = str;
            return this;
        }
    }

    C5518d(String str, List list) {
        this.f46975a = str;
        this.f46976b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f46976b;
    }

    public String b() {
        return this.f46975a;
    }
}
