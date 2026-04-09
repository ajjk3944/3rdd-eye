package d7;

import b9.C2001h;
import b9.i;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import y9.q;

/* compiled from: DateTime.kt */
/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4279b implements Comparable<C4279b> {

    /* renamed from: f, reason: collision with root package name */
    public static final SimpleTimeZone f37527f = new SimpleTimeZone(0, "UTC");

    /* renamed from: b, reason: collision with root package name */
    public final long f37528b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeZone f37529c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f37530d = C2001h.a(i.NONE, new a());

    /* renamed from: e, reason: collision with root package name */
    public final long f37531e;

    /* compiled from: DateTime.kt */
    /* renamed from: d7.b$a */
    public static final class a extends m implements InterfaceC5480a<Calendar> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final Calendar invoke() {
            Calendar calendar = Calendar.getInstance(C4279b.f37527f);
            calendar.setTimeInMillis(C4279b.this.f37528b);
            return calendar;
        }
    }

    public C4279b(long j4, TimeZone timeZone) {
        this.f37528b = j4;
        this.f37529c = timeZone;
        this.f37531e = j4 - ((timeZone.getRawOffset() / 60) * 60000);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C4279b c4279b) {
        C4279b other = c4279b;
        l.f(other, "other");
        long j4 = this.f37531e;
        long j10 = other.f37531e;
        if (j4 < j10) {
            return -1;
        }
        return j4 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4279b) {
            return this.f37531e == ((C4279b) obj).f37531e;
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f37531e;
        return (int) (j4 ^ (j4 >>> 32));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    public final String toString() {
        Calendar calendar = (Calendar) this.f37530d.getValue();
        l.e(calendar, "calendar");
        return String.valueOf(calendar.get(1)) + '-' + q.l0(2, String.valueOf(calendar.get(2) + 1)) + '-' + q.l0(2, String.valueOf(calendar.get(5))) + ' ' + q.l0(2, String.valueOf(calendar.get(11))) + ':' + q.l0(2, String.valueOf(calendar.get(12))) + ':' + q.l0(2, String.valueOf(calendar.get(13)));
    }
}
