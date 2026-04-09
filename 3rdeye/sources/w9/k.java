package w9;

import kotlin.jvm.internal.A;

/* compiled from: KTypeProjection.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47593c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l f47594a;

    /* renamed from: b, reason: collision with root package name */
    public final A f47595b;

    /* compiled from: KTypeProjection.kt */
    public static final class a {
        public static k a(A a10) {
            return new k(l.INVARIANT, a10);
        }
    }

    /* compiled from: KTypeProjection.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47596a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47596a = iArr;
        }
    }

    static {
        new k(null, null);
    }

    public k(l lVar, A a10) {
        String str;
        this.f47594a = lVar;
        this.f47595b = a10;
        if ((lVar == null) == (a10 == null)) {
            return;
        }
        if (lVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + lVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f47594a == kVar.f47594a && kotlin.jvm.internal.l.b(this.f47595b, kVar.f47595b);
    }

    public final int hashCode() {
        l lVar = this.f47594a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        A a10 = this.f47595b;
        return iHashCode + (a10 != null ? a10.hashCode() : 0);
    }

    public final String toString() {
        l lVar = this.f47594a;
        int i = lVar == null ? -1 : b.f47596a[lVar.ordinal()];
        if (i == -1) {
            return "*";
        }
        A a10 = this.f47595b;
        if (i == 1) {
            return String.valueOf(a10);
        }
        if (i == 2) {
            return "in " + a10;
        }
        if (i != 3) {
            throw new b9.j();
        }
        return "out " + a10;
    }
}
