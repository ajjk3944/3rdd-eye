package l2;

import androidx.appcompat.app.z;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s, reason: collision with root package name */
    public static final String f23090s = androidx.work.k.f("WorkSpec");

    /* renamed from: t, reason: collision with root package name */
    public static final l.a f23091t = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f23092a;

    /* renamed from: b, reason: collision with root package name */
    public WorkInfo$State f23093b;

    /* renamed from: c, reason: collision with root package name */
    public String f23094c;

    /* renamed from: d, reason: collision with root package name */
    public String f23095d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.d f23096e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.d f23097f;

    /* renamed from: g, reason: collision with root package name */
    public long f23098g;

    /* renamed from: h, reason: collision with root package name */
    public long f23099h;

    /* renamed from: i, reason: collision with root package name */
    public long f23100i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.b f23101j;

    /* renamed from: k, reason: collision with root package name */
    public int f23102k;

    /* renamed from: l, reason: collision with root package name */
    public BackoffPolicy f23103l;

    /* renamed from: m, reason: collision with root package name */
    public long f23104m;

    /* renamed from: n, reason: collision with root package name */
    public long f23105n;

    /* renamed from: o, reason: collision with root package name */
    public long f23106o;

    /* renamed from: p, reason: collision with root package name */
    public long f23107p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23108q;

    /* renamed from: r, reason: collision with root package name */
    public OutOfQuotaPolicy f23109r;

    public class a implements l.a {
        @Override // l.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List apply(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            z.a(it.next());
            throw null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f23110a;

        /* renamed from: b, reason: collision with root package name */
        public WorkInfo$State f23111b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f23111b != bVar.f23111b) {
                return false;
            }
            return this.f23110a.equals(bVar.f23110a);
        }

        public int hashCode() {
            return (this.f23110a.hashCode() * 31) + this.f23111b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f23093b = WorkInfo$State.ENQUEUED;
        androidx.work.d dVar = androidx.work.d.f4374c;
        this.f23096e = dVar;
        this.f23097f = dVar;
        this.f23101j = androidx.work.b.f4353i;
        this.f23103l = BackoffPolicy.EXPONENTIAL;
        this.f23104m = 30000L;
        this.f23107p = -1L;
        this.f23109r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f23092a = str;
        this.f23094c = str2;
    }

    public long a() {
        if (c()) {
            return this.f23105n + Math.min(18000000L, this.f23103l == BackoffPolicy.LINEAR ? this.f23104m * this.f23102k : (long) Math.scalb(this.f23104m, this.f23102k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f23105n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f23098g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f23105n;
        long j11 = j10 == 0 ? jCurrentTimeMillis2 + this.f23098g : j10;
        long j12 = this.f23100i;
        long j13 = this.f23099h;
        if (j12 != j13) {
            return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j10 != 0 ? j13 : 0L);
    }

    public boolean b() {
        return !androidx.work.b.f4353i.equals(this.f23101j);
    }

    public boolean c() {
        return this.f23093b == WorkInfo$State.ENQUEUED && this.f23102k > 0;
    }

    public boolean d() {
        return this.f23099h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f23098g != pVar.f23098g || this.f23099h != pVar.f23099h || this.f23100i != pVar.f23100i || this.f23102k != pVar.f23102k || this.f23104m != pVar.f23104m || this.f23105n != pVar.f23105n || this.f23106o != pVar.f23106o || this.f23107p != pVar.f23107p || this.f23108q != pVar.f23108q || !this.f23092a.equals(pVar.f23092a) || this.f23093b != pVar.f23093b || !this.f23094c.equals(pVar.f23094c)) {
                return false;
            }
            String str = this.f23095d;
            if (str == null ? pVar.f23095d != null : !str.equals(pVar.f23095d)) {
                return false;
            }
            if (this.f23096e.equals(pVar.f23096e) && this.f23097f.equals(pVar.f23097f) && this.f23101j.equals(pVar.f23101j) && this.f23103l == pVar.f23103l && this.f23109r == pVar.f23109r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f23092a.hashCode() * 31) + this.f23093b.hashCode()) * 31) + this.f23094c.hashCode()) * 31;
        String str = this.f23095d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f23096e.hashCode()) * 31) + this.f23097f.hashCode()) * 31;
        long j10 = this.f23098g;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f23099h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f23100i;
        int iHashCode3 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f23101j.hashCode()) * 31) + this.f23102k) * 31) + this.f23103l.hashCode()) * 31;
        long j13 = this.f23104m;
        int i12 = (iHashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f23105n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f23106o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f23107p;
        return ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f23108q ? 1 : 0)) * 31) + this.f23109r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f23092a + "}";
    }

    public p(p pVar) {
        this.f23093b = WorkInfo$State.ENQUEUED;
        androidx.work.d dVar = androidx.work.d.f4374c;
        this.f23096e = dVar;
        this.f23097f = dVar;
        this.f23101j = androidx.work.b.f4353i;
        this.f23103l = BackoffPolicy.EXPONENTIAL;
        this.f23104m = 30000L;
        this.f23107p = -1L;
        this.f23109r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f23092a = pVar.f23092a;
        this.f23094c = pVar.f23094c;
        this.f23093b = pVar.f23093b;
        this.f23095d = pVar.f23095d;
        this.f23096e = new androidx.work.d(pVar.f23096e);
        this.f23097f = new androidx.work.d(pVar.f23097f);
        this.f23098g = pVar.f23098g;
        this.f23099h = pVar.f23099h;
        this.f23100i = pVar.f23100i;
        this.f23101j = new androidx.work.b(pVar.f23101j);
        this.f23102k = pVar.f23102k;
        this.f23103l = pVar.f23103l;
        this.f23104m = pVar.f23104m;
        this.f23105n = pVar.f23105n;
        this.f23106o = pVar.f23106o;
        this.f23107p = pVar.f23107p;
        this.f23108q = pVar.f23108q;
        this.f23109r = pVar.f23109r;
    }
}
