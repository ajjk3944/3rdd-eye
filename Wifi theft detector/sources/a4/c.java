package a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f137c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f138a;

    /* renamed from: b, reason: collision with root package name */
    public final List f139b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f140a = "";

        /* renamed from: b, reason: collision with root package name */
        public List f141b = new ArrayList();

        public c a() {
            return new c(this.f140a, Collections.unmodifiableList(this.f141b));
        }

        public a b(List list) {
            this.f141b = list;
            return this;
        }

        public a c(String str) {
            this.f140a = str;
            return this;
        }
    }

    public c(String str, List list) {
        this.f138a = str;
        this.f139b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f139b;
    }

    public String b() {
        return this.f138a;
    }
}
