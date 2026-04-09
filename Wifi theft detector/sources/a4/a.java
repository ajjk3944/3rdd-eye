package a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x3.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f125e = new C0001a().b();

    /* renamed from: a, reason: collision with root package name */
    public final e f126a;

    /* renamed from: b, reason: collision with root package name */
    public final List f127b;

    /* renamed from: c, reason: collision with root package name */
    public final b f128c;

    /* renamed from: d, reason: collision with root package name */
    public final String f129d;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    public static final class C0001a {

        /* renamed from: a, reason: collision with root package name */
        public e f130a = null;

        /* renamed from: b, reason: collision with root package name */
        public List f131b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public b f132c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f133d = "";

        public C0001a a(c cVar) {
            this.f131b.add(cVar);
            return this;
        }

        public a b() {
            return new a(this.f130a, Collections.unmodifiableList(this.f131b), this.f132c, this.f133d);
        }

        public C0001a c(String str) {
            this.f133d = str;
            return this;
        }

        public C0001a d(b bVar) {
            this.f132c = bVar;
            return this;
        }

        public C0001a e(e eVar) {
            this.f130a = eVar;
            return this;
        }
    }

    public a(e eVar, List list, b bVar, String str) {
        this.f126a = eVar;
        this.f127b = list;
        this.f128c = bVar;
        this.f129d = str;
    }

    public static C0001a e() {
        return new C0001a();
    }

    public String a() {
        return this.f129d;
    }

    public b b() {
        return this.f128c;
    }

    public List c() {
        return this.f127b;
    }

    public e d() {
        return this.f126a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
