package androidx.work;

import java.util.HashSet;
import java.util.UUID;

/* compiled from: WorkInfo.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f17021a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17022b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f17023c;

    /* renamed from: d, reason: collision with root package name */
    public final e f17024d;

    /* renamed from: e, reason: collision with root package name */
    public final e f17025e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17026f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17027g;

    /* renamed from: h, reason: collision with root package name */
    public final d f17028h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final a f17029j;

    /* renamed from: k, reason: collision with root package name */
    public final long f17030k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17031l;

    /* compiled from: WorkInfo.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f17032a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17033b;

        public a(long j4, long j10) {
            this.f17032a = j4;
            this.f17033b = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class.equals(obj.getClass())) {
                a aVar = (a) obj;
                if (aVar.f17032a == this.f17032a && aVar.f17033b == this.f17033b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            long j4 = this.f17032a;
            int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
            long j10 = this.f17033b;
            return i + ((int) ((j10 >>> 32) ^ j10));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.f17032a);
            sb.append(", flexIntervalMillis=");
            return s.f(sb, this.f17033b, '}');
        }
    }

    /* compiled from: WorkInfo.kt */
    public enum b {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public t() {
        throw null;
    }

    public t(UUID uuid, b state, HashSet hashSet, e outputData, e progress, int i, int i10, d constraints, long j4, a aVar, long j10, int i11) {
        kotlin.jvm.internal.l.f(state, "state");
        kotlin.jvm.internal.l.f(outputData, "outputData");
        kotlin.jvm.internal.l.f(progress, "progress");
        kotlin.jvm.internal.l.f(constraints, "constraints");
        this.f17021a = uuid;
        this.f17022b = state;
        this.f17023c = hashSet;
        this.f17024d = outputData;
        this.f17025e = progress;
        this.f17026f = i;
        this.f17027g = i10;
        this.f17028h = constraints;
        this.i = j4;
        this.f17029j = aVar;
        this.f17030k = j10;
        this.f17031l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t.class.equals(obj.getClass())) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f17026f == tVar.f17026f && this.f17027g == tVar.f17027g && kotlin.jvm.internal.l.b(this.f17021a, tVar.f17021a) && this.f17022b == tVar.f17022b && kotlin.jvm.internal.l.b(this.f17024d, tVar.f17024d) && kotlin.jvm.internal.l.b(this.f17028h, tVar.f17028h) && this.i == tVar.i && kotlin.jvm.internal.l.b(this.f17029j, tVar.f17029j) && this.f17030k == tVar.f17030k && this.f17031l == tVar.f17031l && kotlin.jvm.internal.l.b(this.f17023c, tVar.f17023c)) {
            return kotlin.jvm.internal.l.b(this.f17025e, tVar.f17025e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17028h.hashCode() + ((((((this.f17025e.hashCode() + ((this.f17023c.hashCode() + ((this.f17024d.hashCode() + ((this.f17022b.hashCode() + (this.f17021a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f17026f) * 31) + this.f17027g) * 31)) * 31;
        long j4 = this.i;
        int i = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        a aVar = this.f17029j;
        int iHashCode2 = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
        long j10 = this.f17030k;
        return ((iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f17031l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f17021a + "', state=" + this.f17022b + ", outputData=" + this.f17024d + ", tags=" + this.f17023c + ", progress=" + this.f17025e + ", runAttemptCount=" + this.f17026f + ", generation=" + this.f17027g + ", constraints=" + this.f17028h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.f17029j + ", nextScheduleTimeMillis=" + this.f17030k + "}, stopReason=" + this.f17031l;
    }
}
