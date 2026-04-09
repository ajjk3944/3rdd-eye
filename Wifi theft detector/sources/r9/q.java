package r9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f24180c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final q f24181d = new q(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final KVariance f24182a;

    /* renamed from: b, reason: collision with root package name */
    public final p f24183b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final q a(p type) {
            kotlin.jvm.internal.p.e(type, "type");
            return new q(KVariance.f22068a, type);
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24184a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f22068a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f22069b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.f22070c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24184a = iArr;
        }
    }

    public q(KVariance kVariance, p pVar) {
        String str;
        this.f24182a = kVariance;
        this.f24183b = pVar;
        if ((kVariance == null) == (pVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final p a() {
        return this.f24183b;
    }

    public final KVariance b() {
        return this.f24182a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f24182a == qVar.f24182a && kotlin.jvm.internal.p.a(this.f24183b, qVar.f24183b);
    }

    public int hashCode() {
        KVariance kVariance = this.f24182a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        p pVar = this.f24183b;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        KVariance kVariance = this.f24182a;
        int i10 = kVariance == null ? -1 : b.f24184a[kVariance.ordinal()];
        if (i10 == -1) {
            return Marker.ANY_MARKER;
        }
        if (i10 == 1) {
            return String.valueOf(this.f24183b);
        }
        if (i10 == 2) {
            return "in " + this.f24183b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f24183b;
    }
}
