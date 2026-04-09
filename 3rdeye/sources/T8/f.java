package t8;

import androidx.work.s;
import java.util.LinkedList;
import kotlin.jvm.internal.l;

/* compiled from: PurchasesPerformanceTracker.kt */
/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46455b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static f f46456c;

    /* renamed from: a, reason: collision with root package name */
    public b f46457a;

    /* compiled from: PurchasesPerformanceTracker.kt */
    public static final class a {
        public static f a() {
            f fVar = f.f46456c;
            if (fVar != null) {
                return fVar;
            }
            f fVar2 = new f();
            f.f46456c = fVar2;
            return fVar2;
        }
    }

    /* compiled from: PurchasesPerformanceTracker.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public long f46458a;

        /* renamed from: b, reason: collision with root package name */
        public long f46459b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46460c;

        /* renamed from: d, reason: collision with root package name */
        public String f46461d;

        /* renamed from: e, reason: collision with root package name */
        public long f46462e;

        /* renamed from: f, reason: collision with root package name */
        public long f46463f;

        /* renamed from: g, reason: collision with root package name */
        public final LinkedList<String> f46464g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f46465h;

        public b() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46458a == bVar.f46458a && this.f46459b == bVar.f46459b && this.f46460c == bVar.f46460c && l.b(this.f46461d, bVar.f46461d) && this.f46462e == bVar.f46462e && this.f46463f == bVar.f46463f && l.b(this.f46464g, bVar.f46464g) && this.f46465h == bVar.f46465h;
        }

        public final int hashCode() {
            long j4 = this.f46458a;
            long j10 = this.f46459b;
            int iHashCode = (((this.f46461d.hashCode() + (((((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f46460c ? 1231 : 1237)) * 31)) * 31) + 1237) * 31;
            long j11 = this.f46462e;
            int i = (iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f46463f;
            return ((this.f46464g.hashCode() + ((i + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + (this.f46465h ? 1231 : 1237);
        }

        public final String toString() {
            long j4 = this.f46458a;
            long j10 = this.f46459b;
            boolean z10 = this.f46460c;
            String str = this.f46461d;
            long j11 = this.f46462e;
            long j12 = this.f46463f;
            boolean z11 = this.f46465h;
            StringBuilder sbJ = s.j("SkuLoadingData(offersStartLoadTime=", ", offersEndLoadTime=", j4);
            sbJ.append(j10);
            sbJ.append(", offersCacheHit=");
            sbJ.append(z10);
            sbJ.append(", screenName=");
            sbJ.append(str);
            sbJ.append(", isOneTimeOffer=false, updateOffersCacheStart=");
            sbJ.append(j11);
            sbJ.append(", updateOffersCacheEnd=");
            sbJ.append(j12);
            sbJ.append(", failedSkuList=");
            sbJ.append(this.f46464g);
            sbJ.append(", cachePrepared=");
            sbJ.append(z11);
            sbJ.append(")");
            return sbJ.toString();
        }

        public b(Object obj) {
            LinkedList<String> linkedList = new LinkedList<>();
            this.f46458a = 0L;
            this.f46459b = 0L;
            this.f46460c = false;
            this.f46461d = "";
            this.f46462e = 0L;
            this.f46463f = 0L;
            this.f46464g = linkedList;
            this.f46465h = false;
        }
    }

    public final void b() {
        b bVar = this.f46457a;
        if (bVar != null) {
            bVar.f46459b = System.currentTimeMillis();
        }
        b bVar2 = this.f46457a;
        if (bVar2 != null) {
            this.f46457a = null;
            e.a(new H8.e(bVar2, 4));
        }
    }
}
