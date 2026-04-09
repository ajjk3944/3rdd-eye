package th;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final a f62641c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final r f62642d = new r(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final s f62643a;

    /* renamed from: b, reason: collision with root package name */
    private final p f62644b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(p type) {
            AbstractC6492s.i(type, "type");
            return new r(s.IN, type);
        }

        public final r b(p type) {
            AbstractC6492s.i(type, "type");
            return new r(s.OUT, type);
        }

        public final r c() {
            return r.f62642d;
        }

        public final r d(p type) {
            AbstractC6492s.i(type, "type");
            return new r(s.INVARIANT, type);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62645a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62645a = iArr;
        }
    }

    public r(s sVar, p pVar) {
        String str;
        this.f62643a = sVar;
        this.f62644b = pVar;
        if ((sVar == null) == (pVar == null)) {
            return;
        }
        if (sVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + sVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final s a() {
        return this.f62643a;
    }

    public final p b() {
        return this.f62644b;
    }

    public final p c() {
        return this.f62644b;
    }

    public final s d() {
        return this.f62643a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f62643a == rVar.f62643a && AbstractC6492s.d(this.f62644b, rVar.f62644b);
    }

    public int hashCode() {
        s sVar = this.f62643a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        p pVar = this.f62644b;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        s sVar = this.f62643a;
        int i10 = sVar == null ? -1 : b.f62645a[sVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f62644b);
        }
        if (i10 == 2) {
            return "in " + this.f62644b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f62644b;
    }
}
