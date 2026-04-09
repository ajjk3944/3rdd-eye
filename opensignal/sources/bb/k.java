package bb;

import android.os.Bundle;
import android.text.TextUtils;
import cc.s;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;
import zc.c1;
import zc.j0;
import zc.s3;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2532a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2533b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2534c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2535d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2536e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2537f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2538g;

    public /* synthetic */ k(long j, Object obj, Object obj2, Object obj3, long j7, Object obj4, int i10) {
        this.f2532a = i10;
        this.f2533b = j;
        this.f2536e = obj;
        this.f2537f = obj2;
        this.f2534c = j7;
        this.f2535d = obj3;
        this.f2538g = obj4;
    }

    public k a(long j, Representation representation) throws ya.b {
        long segmentNum;
        long segmentNum2;
        DashSegmentIndex index = ((Representation) this.f2536e).getIndex();
        DashSegmentIndex index2 = representation.getIndex();
        if (index == null) {
            return new k(j, representation, (cb.b) this.f2537f, (ab.e) this.f2535d, this.f2534c, index, 0);
        }
        if (!index.isExplicit()) {
            return new k(j, representation, (cb.b) this.f2537f, (ab.e) this.f2535d, this.f2534c, index2, 0);
        }
        long segmentCount = index.getSegmentCount(j);
        if (segmentCount == 0) {
            return new k(j, representation, (cb.b) this.f2537f, (ab.e) this.f2535d, this.f2534c, index2, 0);
        }
        long firstSegmentNum = index.getFirstSegmentNum();
        long timeUs = index.getTimeUs(firstSegmentNum);
        long j7 = segmentCount + firstSegmentNum;
        long j10 = j7 - 1;
        long durationUs = index.getDurationUs(j10, j) + index.getTimeUs(j10);
        long firstSegmentNum2 = index2.getFirstSegmentNum();
        long timeUs2 = index2.getTimeUs(firstSegmentNum2);
        long j11 = this.f2534c;
        if (durationUs == timeUs2) {
            segmentNum = j7 - firstSegmentNum2;
        } else {
            if (durationUs < timeUs2) {
                throw new ya.b();
            }
            if (timeUs2 < timeUs) {
                segmentNum2 = j11 - (index2.getSegmentNum(timeUs, j) - firstSegmentNum);
                return new k(j, representation, (cb.b) this.f2537f, (ab.e) this.f2535d, segmentNum2, index2, 0);
            }
            segmentNum = index.getSegmentNum(timeUs2, j) - firstSegmentNum2;
        }
        segmentNum2 = segmentNum + j11;
        return new k(j, representation, (cb.b) this.f2537f, (ab.e) this.f2535d, segmentNum2, index2, 0);
    }

    public k b(long j, h5.l lVar) throws o5.b {
        long segmentNum;
        long segmentNum2;
        androidx.media3.exoplayer.dash.DashSegmentIndex dashSegmentIndexB = ((h5.l) this.f2536e).b();
        androidx.media3.exoplayer.dash.DashSegmentIndex dashSegmentIndexB2 = lVar.b();
        if (dashSegmentIndexB == null) {
            return new k(j, lVar, (h5.b) this.f2537f, (p5.f) this.f2535d, this.f2534c, dashSegmentIndexB, 1);
        }
        if (!dashSegmentIndexB.isExplicit()) {
            return new k(j, lVar, (h5.b) this.f2537f, (p5.f) this.f2535d, this.f2534c, dashSegmentIndexB2, 1);
        }
        long segmentCount = dashSegmentIndexB.getSegmentCount(j);
        if (segmentCount == 0) {
            return new k(j, lVar, (h5.b) this.f2537f, (p5.f) this.f2535d, this.f2534c, dashSegmentIndexB2, 1);
        }
        long firstSegmentNum = dashSegmentIndexB.getFirstSegmentNum();
        long timeUs = dashSegmentIndexB.getTimeUs(firstSegmentNum);
        long j7 = segmentCount + firstSegmentNum;
        long j10 = j7 - 1;
        long durationUs = dashSegmentIndexB.getDurationUs(j10, j) + dashSegmentIndexB.getTimeUs(j10);
        long firstSegmentNum2 = dashSegmentIndexB2.getFirstSegmentNum();
        long timeUs2 = dashSegmentIndexB2.getTimeUs(firstSegmentNum2);
        long j11 = this.f2534c;
        if (durationUs == timeUs2) {
            segmentNum = j7 - firstSegmentNum2;
        } else {
            if (durationUs < timeUs2) {
                throw new o5.b();
            }
            if (timeUs2 < timeUs) {
                segmentNum2 = j11 - (dashSegmentIndexB2.getSegmentNum(timeUs, j) - firstSegmentNum);
                return new k(j, lVar, (h5.b) this.f2537f, (p5.f) this.f2535d, segmentNum2, dashSegmentIndexB2, 1);
            }
            segmentNum = dashSegmentIndexB.getSegmentNum(timeUs2, j) - firstSegmentNum2;
        }
        segmentNum2 = segmentNum + j11;
        return new k(j, lVar, (h5.b) this.f2537f, (p5.f) this.f2535d, segmentNum2, dashSegmentIndexB2, 1);
    }

    public long c(long j) {
        long firstAvailableSegmentNum;
        long availableSegmentCount;
        switch (this.f2532a) {
            case 0:
                DashSegmentIndex dashSegmentIndex = (DashSegmentIndex) this.f2538g;
                long j7 = this.f2533b;
                firstAvailableSegmentNum = dashSegmentIndex.getFirstAvailableSegmentNum(j7, j) + this.f2534c;
                availableSegmentCount = dashSegmentIndex.getAvailableSegmentCount(j7, j);
                break;
            default:
                androidx.media3.exoplayer.dash.DashSegmentIndex dashSegmentIndex2 = (androidx.media3.exoplayer.dash.DashSegmentIndex) this.f2538g;
                long j10 = this.f2533b;
                firstAvailableSegmentNum = dashSegmentIndex2.getFirstAvailableSegmentNum(j10, j) + this.f2534c;
                availableSegmentCount = dashSegmentIndex2.getAvailableSegmentCount(j10, j);
                break;
        }
        return (availableSegmentCount + firstAvailableSegmentNum) - 1;
    }

    public long d(long j) {
        long jE;
        long durationUs;
        switch (this.f2532a) {
            case 0:
                jE = e(j);
                durationUs = ((DashSegmentIndex) this.f2538g).getDurationUs(j - this.f2534c, this.f2533b);
                break;
            default:
                jE = e(j);
                durationUs = ((androidx.media3.exoplayer.dash.DashSegmentIndex) this.f2538g).getDurationUs(j - this.f2534c, this.f2533b);
                break;
        }
        return durationUs + jE;
    }

    public long e(long j) {
        switch (this.f2532a) {
            case 0:
                return ((DashSegmentIndex) this.f2538g).getTimeUs(j - this.f2534c);
            default:
                return ((androidx.media3.exoplayer.dash.DashSegmentIndex) this.f2538g).getTimeUs(j - this.f2534c);
        }
    }

    public k f(c1 c1Var, long j) {
        return new k(c1Var, (String) this.f2537f, (String) this.f2535d, (String) this.f2536e, this.f2533b, j, (zzbe) this.f2538g);
    }

    public String toString() {
        switch (this.f2532a) {
            case 2:
                String string = ((zzbe) this.f2538g).toString();
                String str = (String) this.f2535d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f2536e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                w.g.q(sb2, "Event{appId='", str, "', name='", str2);
                return h0.b.s(sb2, "', params=", string, "}");
            default:
                return super.toString();
        }
    }

    public k(c1 c1Var, String str, String str2, String str3, long j, long j7, Bundle bundle) {
        zzbe zzbeVar;
        this.f2532a = 2;
        s.e(str2);
        s.e(str3);
        this.f2535d = str2;
        this.f2536e = str3;
        this.f2537f = true == TextUtils.isEmpty(str) ? null : str;
        this.f2533b = j;
        this.f2534c = j7;
        if (j7 != 0 && j7 > j) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.F.c(j0.A1(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    j0 j0Var2 = c1Var.f26889y;
                    c1.g(j0Var2);
                    j0Var2.B.b("Param name can't be null");
                    it.remove();
                } else {
                    s3 s3Var = c1Var.E;
                    c1.e(s3Var);
                    Object objZ1 = s3Var.z1(bundle2.get(next), next);
                    if (objZ1 == null) {
                        j0 j0Var3 = c1Var.f26889y;
                        c1.g(j0Var3);
                        j0Var3.F.c(c1Var.F.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        s3 s3Var2 = c1Var.E;
                        c1.e(s3Var2);
                        s3Var2.H1(bundle2, next, objZ1);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f2538g = zzbeVar;
    }

    public k(c1 c1Var, String str, String str2, String str3, long j, long j7, zzbe zzbeVar) {
        this.f2532a = 2;
        s.e(str2);
        s.e(str3);
        s.h(zzbeVar);
        this.f2535d = str2;
        this.f2536e = str3;
        this.f2537f = true == TextUtils.isEmpty(str) ? null : str;
        this.f2533b = j;
        this.f2534c = j7;
        if (j7 != 0 && j7 > j) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.F.d(j0.A1(str2), j0.A1(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f2538g = zzbeVar;
    }
}
