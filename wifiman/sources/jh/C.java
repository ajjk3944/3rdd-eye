package Jh;

import Yg.C3667k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10079d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final C f10080e = new C(O.STRICT, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    private final O f10081a;

    /* renamed from: b, reason: collision with root package name */
    private final C3667k f10082b;

    /* renamed from: c, reason: collision with root package name */
    private final O f10083c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f10080e;
        }

        private a() {
        }
    }

    public C(O reportLevelBefore, C3667k c3667k, O reportLevelAfter) {
        AbstractC6492s.i(reportLevelBefore, "reportLevelBefore");
        AbstractC6492s.i(reportLevelAfter, "reportLevelAfter");
        this.f10081a = reportLevelBefore;
        this.f10082b = c3667k;
        this.f10083c = reportLevelAfter;
    }

    public final O b() {
        return this.f10083c;
    }

    public final O c() {
        return this.f10081a;
    }

    public final C3667k d() {
        return this.f10082b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f10081a == c10.f10081a && AbstractC6492s.d(this.f10082b, c10.f10082b) && this.f10083c == c10.f10083c;
    }

    public int hashCode() {
        int iHashCode = this.f10081a.hashCode() * 31;
        C3667k c3667k = this.f10082b;
        return ((iHashCode + (c3667k == null ? 0 : c3667k.hashCode())) * 31) + this.f10083c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f10081a + ", sinceVersion=" + this.f10082b + ", reportLevelAfter=" + this.f10083c + ')';
    }

    public /* synthetic */ C(O o10, C3667k c3667k, O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? new C3667k(1, 0) : c3667k, (i10 & 4) != 0 ? o10 : o11);
    }
}
