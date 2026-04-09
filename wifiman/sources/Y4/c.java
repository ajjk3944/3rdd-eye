package y4;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o4.k;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final C8610a f66364a;

    /* renamed from: b, reason: collision with root package name */
    private final List f66365b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f66366c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList f66367a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private C8610a f66368b = C8610a.f66361b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f66369c = null;

        private boolean c(int i10) {
            Iterator it = this.f66367a.iterator();
            while (it.hasNext()) {
                if (((C2355c) it.next()).a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b a(k kVar, int i10, String str, String str2) {
            ArrayList arrayList = this.f66367a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C2355c(kVar, i10, str, str2));
            return this;
        }

        public c b() throws GeneralSecurityException {
            if (this.f66367a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f66369c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f66368b, Collections.unmodifiableList(this.f66367a), this.f66369c);
            this.f66367a = null;
            return cVar;
        }

        public b d(C8610a c8610a) {
            if (this.f66367a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f66368b = c8610a;
            return this;
        }

        public b e(int i10) {
            if (this.f66367a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f66369c = Integer.valueOf(i10);
            return this;
        }
    }

    /* renamed from: y4.c$c, reason: collision with other inner class name */
    public static final class C2355c {

        /* renamed from: a, reason: collision with root package name */
        private final k f66370a;

        /* renamed from: b, reason: collision with root package name */
        private final int f66371b;

        /* renamed from: c, reason: collision with root package name */
        private final String f66372c;

        /* renamed from: d, reason: collision with root package name */
        private final String f66373d;

        public int a() {
            return this.f66371b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2355c)) {
                return false;
            }
            C2355c c2355c = (C2355c) obj;
            return this.f66370a == c2355c.f66370a && this.f66371b == c2355c.f66371b && this.f66372c.equals(c2355c.f66372c) && this.f66373d.equals(c2355c.f66373d);
        }

        public int hashCode() {
            return Objects.hash(this.f66370a, Integer.valueOf(this.f66371b), this.f66372c, this.f66373d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f66370a, Integer.valueOf(this.f66371b), this.f66372c, this.f66373d);
        }

        private C2355c(k kVar, int i10, String str, String str2) {
            this.f66370a = kVar;
            this.f66371b = i10;
            this.f66372c = str;
            this.f66373d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66364a.equals(cVar.f66364a) && this.f66365b.equals(cVar.f66365b) && Objects.equals(this.f66366c, cVar.f66366c);
    }

    public int hashCode() {
        return Objects.hash(this.f66364a, this.f66365b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f66364a, this.f66365b, this.f66366c);
    }

    private c(C8610a c8610a, List list, Integer num) {
        this.f66364a = c8610a;
        this.f66365b = list;
        this.f66366c = num;
    }
}
