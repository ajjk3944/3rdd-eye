package s3;

import android.accounts.Account;
import android.view.View;
import f.AbstractC5487d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C7011b;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7889d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f61243a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f61244b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f61245c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f61246d;

    /* renamed from: e, reason: collision with root package name */
    private final int f61247e;

    /* renamed from: f, reason: collision with root package name */
    private final View f61248f;

    /* renamed from: g, reason: collision with root package name */
    private final String f61249g;

    /* renamed from: h, reason: collision with root package name */
    private final String f61250h;

    /* renamed from: i, reason: collision with root package name */
    private final M3.a f61251i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f61252j;

    /* renamed from: s3.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f61253a;

        /* renamed from: b, reason: collision with root package name */
        private C7011b f61254b;

        /* renamed from: c, reason: collision with root package name */
        private String f61255c;

        /* renamed from: d, reason: collision with root package name */
        private String f61256d;

        /* renamed from: e, reason: collision with root package name */
        private final M3.a f61257e = M3.a.f12469k;

        public C7889d a() {
            return new C7889d(this.f61253a, this.f61254b, null, 0, null, this.f61255c, this.f61256d, this.f61257e, false);
        }

        public a b(String str) {
            this.f61255c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f61254b == null) {
                this.f61254b = new C7011b();
            }
            this.f61254b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f61253a = account;
            return this;
        }

        public final a e(String str) {
            this.f61256d = str;
            return this;
        }
    }

    public C7889d(Account account, Set set, Map map, int i10, View view, String str, String str2, M3.a aVar, boolean z10) {
        this.f61243a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f61244b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f61246d = map;
        this.f61248f = view;
        this.f61247e = i10;
        this.f61249g = str;
        this.f61250h = str2;
        this.f61251i = aVar == null ? M3.a.f12469k : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
        this.f61245c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f61243a;
    }

    public Account b() {
        Account account = this.f61243a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f61245c;
    }

    public String d() {
        return this.f61249g;
    }

    public Set e() {
        return this.f61244b;
    }

    public final M3.a f() {
        return this.f61251i;
    }

    public final Integer g() {
        return this.f61252j;
    }

    public final String h() {
        return this.f61250h;
    }

    public final void i(Integer num) {
        this.f61252j = num;
    }
}
