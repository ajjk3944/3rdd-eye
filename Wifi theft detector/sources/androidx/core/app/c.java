package androidx.core.app;

import android.app.Person;
import androidx.annotation.DoNotInline;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2474a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f2475b;

    /* renamed from: c, reason: collision with root package name */
    public String f2476c;

    /* renamed from: d, reason: collision with root package name */
    public String f2477d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2479f;

    public static class a {
        @DoNotInline
        public static c a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        @DoNotInline
        public static Person b(c cVar) {
            return new Person.Builder().setName(cVar.d()).setIcon(cVar.b() != null ? cVar.b().r() : null).setUri(cVar.e()).setKey(cVar.c()).setBot(cVar.f()).setImportant(cVar.g()).build();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f2480a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f2481b;

        /* renamed from: c, reason: collision with root package name */
        public String f2482c;

        /* renamed from: d, reason: collision with root package name */
        public String f2483d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2484e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2485f;

        public c a() {
            return new c(this);
        }

        public b b(boolean z10) {
            this.f2484e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f2481b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f2485f = z10;
            return this;
        }

        public b e(String str) {
            this.f2483d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f2480a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f2482c = str;
            return this;
        }
    }

    public c(b bVar) {
        this.f2474a = bVar.f2480a;
        this.f2475b = bVar.f2481b;
        this.f2476c = bVar.f2482c;
        this.f2477d = bVar.f2483d;
        this.f2478e = bVar.f2484e;
        this.f2479f = bVar.f2485f;
    }

    public static c a(Person person) {
        return a.a(person);
    }

    public IconCompat b() {
        return this.f2475b;
    }

    public String c() {
        return this.f2477d;
    }

    public CharSequence d() {
        return this.f2474a;
    }

    public String e() {
        return this.f2476c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String strC = c();
        String strC2 = cVar.c();
        return (strC == null && strC2 == null) ? Objects.equals(Objects.toString(d()), Objects.toString(cVar.d())) && Objects.equals(e(), cVar.e()) && Boolean.valueOf(f()).equals(Boolean.valueOf(cVar.f())) && Boolean.valueOf(g()).equals(Boolean.valueOf(cVar.g())) : Objects.equals(strC, strC2);
    }

    public boolean f() {
        return this.f2478e;
    }

    public boolean g() {
        return this.f2479f;
    }

    public String h() {
        String str = this.f2476c;
        if (str != null) {
            return str;
        }
        if (this.f2474a == null) {
            return "";
        }
        return "name:" + ((Object) this.f2474a);
    }

    public int hashCode() {
        String strC = c();
        return strC != null ? strC.hashCode() : Objects.hash(d(), e(), Boolean.valueOf(f()), Boolean.valueOf(g()));
    }

    public Person i() {
        return a.b(this);
    }
}
