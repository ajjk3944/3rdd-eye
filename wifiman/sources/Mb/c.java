package Mb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f13081e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f13082a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13083b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f13084c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13085d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(int i10, int i11, Long l10, boolean z10) {
        this.f13082a = i10;
        this.f13083b = i11;
        this.f13084c = l10;
        this.f13085d = z10;
    }

    public static /* synthetic */ c b(c cVar, int i10, int i11, Long l10, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = cVar.f13082a;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.f13083b;
        }
        if ((i12 & 4) != 0) {
            l10 = cVar.f13084c;
        }
        if ((i12 & 8) != 0) {
            z10 = cVar.f13085d;
        }
        return cVar.a(i10, i11, l10, z10);
    }

    public final c a(int i10, int i11, Long l10, boolean z10) {
        return new c(i10, i11, l10, z10);
    }

    public final int c() {
        return this.f13083b;
    }

    public final boolean d() {
        return this.f13085d;
    }

    public final int e() {
        return this.f13082a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13082a == cVar.f13082a && this.f13083b == cVar.f13083b && AbstractC6492s.d(this.f13084c, cVar.f13084c) && this.f13085d == cVar.f13085d;
    }

    public final Long f() {
        return this.f13084c;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f13082a) * 31) + Integer.hashCode(this.f13083b)) * 31;
        Long l10 = this.f13084c;
        return ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + Boolean.hashCode(this.f13085d);
    }

    public String toString() {
        return "RoomAppReviewState(id=" + this.f13082a + ", appLaunchedDaysCount=" + this.f13083b + ", lastAppLaunchTimestamp=" + this.f13084c + ", appReviewFlowDisplayed=" + this.f13085d + ")";
    }
}
