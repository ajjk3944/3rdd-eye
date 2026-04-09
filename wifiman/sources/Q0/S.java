package Q0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3434k f19009a;

    /* renamed from: b, reason: collision with root package name */
    private final A f19010b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19011c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19012d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19013e;

    public /* synthetic */ S(AbstractC3434k abstractC3434k, A a10, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3434k, a10, i10, i11, obj);
    }

    public static /* synthetic */ S b(S s10, AbstractC3434k abstractC3434k, A a10, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC3434k = s10.f19009a;
        }
        if ((i12 & 2) != 0) {
            a10 = s10.f19010b;
        }
        A a11 = a10;
        if ((i12 & 4) != 0) {
            i10 = s10.f19011c;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = s10.f19012d;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = s10.f19013e;
        }
        return s10.a(abstractC3434k, a11, i13, i14, obj);
    }

    public final S a(AbstractC3434k abstractC3434k, A a10, int i10, int i11, Object obj) {
        return new S(abstractC3434k, a10, i10, i11, obj, null);
    }

    public final AbstractC3434k c() {
        return this.f19009a;
    }

    public final int d() {
        return this.f19011c;
    }

    public final int e() {
        return this.f19012d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return AbstractC6492s.d(this.f19009a, s10.f19009a) && AbstractC6492s.d(this.f19010b, s10.f19010b) && v.f(this.f19011c, s10.f19011c) && w.h(this.f19012d, s10.f19012d) && AbstractC6492s.d(this.f19013e, s10.f19013e);
    }

    public final A f() {
        return this.f19010b;
    }

    public int hashCode() {
        AbstractC3434k abstractC3434k = this.f19009a;
        int iHashCode = (((((((abstractC3434k == null ? 0 : abstractC3434k.hashCode()) * 31) + this.f19010b.hashCode()) * 31) + v.g(this.f19011c)) * 31) + w.i(this.f19012d)) * 31;
        Object obj = this.f19013e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f19009a + ", fontWeight=" + this.f19010b + ", fontStyle=" + ((Object) v.h(this.f19011c)) + ", fontSynthesis=" + ((Object) w.l(this.f19012d)) + ", resourceLoaderCacheKey=" + this.f19013e + ')';
    }

    private S(AbstractC3434k abstractC3434k, A a10, int i10, int i11, Object obj) {
        this.f19009a = abstractC3434k;
        this.f19010b = a10;
        this.f19011c = i10;
        this.f19012d = i11;
        this.f19013e = obj;
    }
}
