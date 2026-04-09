package f3;

import c3.AbstractC4212m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5515a {

    /* renamed from: e, reason: collision with root package name */
    private static final C5515a f46957e = new C1758a().b();

    /* renamed from: a, reason: collision with root package name */
    private final C5520f f46958a;

    /* renamed from: b, reason: collision with root package name */
    private final List f46959b;

    /* renamed from: c, reason: collision with root package name */
    private final C5516b f46960c;

    /* renamed from: d, reason: collision with root package name */
    private final String f46961d;

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    public static final class C1758a {

        /* renamed from: a, reason: collision with root package name */
        private C5520f f46962a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f46963b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C5516b f46964c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f46965d = "";

        C1758a() {
        }

        public C1758a a(C5518d c5518d) {
            this.f46963b.add(c5518d);
            return this;
        }

        public C5515a b() {
            return new C5515a(this.f46962a, Collections.unmodifiableList(this.f46963b), this.f46964c, this.f46965d);
        }

        public C1758a c(String str) {
            this.f46965d = str;
            return this;
        }

        public C1758a d(C5516b c5516b) {
            this.f46964c = c5516b;
            return this;
        }

        public C1758a e(C5520f c5520f) {
            this.f46962a = c5520f;
            return this;
        }
    }

    C5515a(C5520f c5520f, List list, C5516b c5516b, String str) {
        this.f46958a = c5520f;
        this.f46959b = list;
        this.f46960c = c5516b;
        this.f46961d = str;
    }

    public static C1758a e() {
        return new C1758a();
    }

    public String a() {
        return this.f46961d;
    }

    public C5516b b() {
        return this.f46960c;
    }

    public List c() {
        return this.f46959b;
    }

    public C5520f d() {
        return this.f46958a;
    }

    public byte[] f() {
        return AbstractC4212m.a(this);
    }
}
