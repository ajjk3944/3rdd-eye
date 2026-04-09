package W;

import N7.C1094a9;
import W.F;
import java.util.concurrent.Executor;

/* compiled from: AutoValue_Recorder_RecordingRecord.java */
/* renamed from: W.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1623k extends F.h {
    public final C1631t i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f13275j;

    /* renamed from: k, reason: collision with root package name */
    public final K0.b<a0> f13276k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13277l;

    /* renamed from: m, reason: collision with root package name */
    public final long f13278m;

    public C1623k(C1631t c1631t, Executor executor, K0.b bVar, boolean z10, long j4) {
        if (c1631t == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.i = c1631t;
        this.f13275j = executor;
        this.f13276k = bVar;
        this.f13277l = z10;
        this.f13278m = j4;
    }

    @Override // W.F.h
    public final boolean B() {
        return false;
    }

    @Override // W.F.h
    public final Executor d() {
        return this.f13275j;
    }

    @Override // W.F.h
    public final K0.b<a0> e() {
        return this.f13276k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.h)) {
            return false;
        }
        F.h hVar = (F.h) obj;
        if (!this.i.equals(hVar.k())) {
            return false;
        }
        Executor executor = this.f13275j;
        if (executor == null) {
            if (hVar.d() != null) {
                return false;
            }
        } else if (!executor.equals(hVar.d())) {
            return false;
        }
        K0.b<a0> bVar = this.f13276k;
        if (bVar == null) {
            if (hVar.e() != null) {
                return false;
            }
        } else if (!bVar.equals(hVar.e())) {
            return false;
        }
        return this.f13277l == hVar.n() && !hVar.B() && this.f13278m == hVar.l();
    }

    public final int hashCode() {
        int iHashCode = (this.i.f13299b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f13275j;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        K0.b<a0> bVar = this.f13276k;
        int iHashCode3 = (iHashCode2 ^ (bVar != null ? bVar.hashCode() : 0)) * 1000003;
        int i = this.f13277l ? 1231 : 1237;
        long j4 = this.f13278m;
        return ((((iHashCode3 ^ i) * 1000003) ^ 1237) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    @Override // W.F.h
    public final AbstractC1632u k() {
        return this.i;
    }

    @Override // W.F.h
    public final long l() {
        return this.f13278m;
    }

    @Override // W.F.h
    public final boolean n() {
        return this.f13277l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.i);
        sb.append(", getCallbackExecutor=");
        sb.append(this.f13275j);
        sb.append(", getEventListener=");
        sb.append(this.f13276k);
        sb.append(", hasAudioEnabled=");
        sb.append(this.f13277l);
        sb.append(", isPersistent=false, getRecordingId=");
        return C1094a9.f(sb, this.f13278m, "}");
    }
}
