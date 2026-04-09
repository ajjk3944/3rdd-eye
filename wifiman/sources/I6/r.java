package I6;

import G6.D;
import G6.Q;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class r implements Q {

    /* renamed from: d, reason: collision with root package name */
    public static final r f8674d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f8675e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f8676f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f8677g;

    /* renamed from: a, reason: collision with root package name */
    final String f8678a;

    /* renamed from: b, reason: collision with root package name */
    final int f8679b;

    /* renamed from: c, reason: collision with root package name */
    final int f8680c;

    static {
        r rVar = new r("PHY_1M", 1, 1);
        f8674d = rVar;
        r rVar2 = new r("PHY_2M", 2, 2);
        f8675e = rVar2;
        r rVar3 = new r("PHY_CODED", 4, 3);
        f8676f = rVar3;
        HashSet hashSet = new HashSet();
        hashSet.add(rVar);
        hashSet.add(rVar2);
        hashSet.add(rVar3);
        f8677g = Collections.unmodifiableSet(hashSet);
    }

    private r(String str, int i10, int i11) {
        this.f8678a = str;
        this.f8679b = i10;
        this.f8680c = i11;
    }

    private static Q b(int i10) {
        for (Q q10 : f8677g) {
            if (q10.getValue() == i10) {
                return q10;
            }
        }
        q.d("Encountered an unexpected PHY value=%d. Please consider making a PR to the library.", Integer.valueOf(i10));
        return new r(0, i10);
    }

    public static D c(int i10, int i11) {
        return new h(b(i10), b(i11));
    }

    @Override // G6.Q
    public int a() {
        return this.f8679b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f8679b == q10.a() && this.f8680c == q10.getValue();
    }

    @Override // G6.Q
    public int getValue() {
        return this.f8680c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8679b), Integer.valueOf(this.f8680c));
    }

    public String toString() {
        String str = this.f8678a;
        if (str != null) {
            return str;
        }
        return "RxBlePhy{[CUSTOM] mask=" + this.f8679b + ", value=" + this.f8680c + '}';
    }

    private r(int i10, int i11) {
        this.f8678a = null;
        this.f8679b = i10;
        this.f8680c = i11;
    }
}
