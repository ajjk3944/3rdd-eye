package bc;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes.dex */
public final class t implements dd.c {

    /* renamed from: a, reason: collision with root package name */
    public final d f2647a;

    /* renamed from: d, reason: collision with root package name */
    public final int f2648d;

    /* renamed from: g, reason: collision with root package name */
    public final a f2649g;

    /* renamed from: r, reason: collision with root package name */
    public final long f2650r;

    /* renamed from: x, reason: collision with root package name */
    public final long f2651x;

    public t(d dVar, int i10, a aVar, long j, long j7) {
        this.f2647a = dVar;
        this.f2648d = i10;
        this.f2649g = aVar;
        this.f2650r = j;
        this.f2651x = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration a(bc.n r4, cc.e r5, int r6) {
        /*
            com.google.android.gms.common.internal.zzj r5 = r5.f3635w
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r5 = r5.f4867r
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f4826d
            if (r1 == 0) goto L35
            int[] r1 = r5.f4828r
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f4830y
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.f2632o
            int r6 = r5.f4829x
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.t.a(bc.n, cc.e, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    @Override // dd.c
    public final void s(dd.r rVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        long j7;
        d dVar = this.f2647a;
        if (dVar.f()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) cc.h.b().f3652a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f4844d) {
                n nVar = (n) dVar.F.get(this.f2649g);
                if (nVar != null) {
                    Object obj = nVar.f2624e;
                    if (obj instanceof cc.e) {
                        cc.e eVar = (cc.e) obj;
                        long j10 = this.f2650r;
                        int i15 = 0;
                        boolean z10 = j10 > 0;
                        int i16 = eVar.f3629q;
                        if (rootTelemetryConfiguration != null) {
                            z10 &= rootTelemetryConfiguration.f4845g;
                            i10 = rootTelemetryConfiguration.f4846r;
                            i12 = rootTelemetryConfiguration.f4847x;
                            i11 = rootTelemetryConfiguration.f4843a;
                            if (eVar.f3635w != null && !eVar.r()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(nVar, eVar, this.f2648d);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z11 = connectionTelemetryConfigurationA.f4827g && j10 > 0;
                                i12 = connectionTelemetryConfigurationA.f4829x;
                                z10 = z11;
                            }
                        } else {
                            i10 = 5000;
                            i11 = 0;
                            i12 = 100;
                        }
                        int i17 = i10;
                        int iElapsedRealtime = -1;
                        if (rVar.j()) {
                            i14 = 0;
                        } else if (rVar.f7321d) {
                            i15 = -1;
                            i14 = 100;
                        } else {
                            Exception excG = rVar.g();
                            if (excG instanceof ac.d) {
                                Status status = ((ac.d) excG).f323a;
                                i13 = status.f4819a;
                                ConnectionResult connectionResult = status.f4822r;
                                if (connectionResult != null) {
                                    i14 = i13;
                                    i15 = connectionResult.f4807d;
                                }
                            } else {
                                i13 = 101;
                            }
                            i14 = i13;
                            i15 = -1;
                        }
                        if (z10) {
                            long j11 = this.f2651x;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j11);
                            j7 = jCurrentTimeMillis;
                            j = j10;
                        } else {
                            j = 0;
                            j7 = 0;
                        }
                        u uVar = new u(new MethodInvocation(this.f2648d, i14, i15, j, j7, null, null, i16, iElapsedRealtime), i11, i17, i12);
                        yh.a aVar = dVar.J;
                        aVar.sendMessage(aVar.obtainMessage(18, uVar));
                    }
                }
            }
        }
    }
}
