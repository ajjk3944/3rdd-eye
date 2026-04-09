package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f9123a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9124b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9125c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9126d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9127e;

    public t(d dVar, int i4, a aVar, long j, long j8) {
        this.f9123a = dVar;
        this.f9124b = i4;
        this.f9125c = aVar;
        this.f9126d = j;
        this.f9127e = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pb.f a(com.google.android.gms.common.api.internal.n r4, pb.e r5, int r6) {
        /*
            pb.g0 r5 = r5.f31586v
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            pb.f r5 = r5.f31612d
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f31590b
            if (r1 == 0) goto L35
            int[] r1 = r5.f31592d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f31594f
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
            int r4 = r4.f9110l
            int r6 = r5.f31593e
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.t.a(com.google.android.gms.common.api.internal.n, pb.e, int):pb.f");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i4;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j8;
        long j9 = this.f9126d;
        d dVar = this.f9123a;
        if (dVar.a()) {
            pb.l lVar = (pb.l) pb.k.b().f31634a;
            if (lVar == null || lVar.f31644b) {
                n nVar = (n) dVar.j.get(this.f9125c);
                if (nVar != null) {
                    Object obj = nVar.f9102b;
                    if (obj instanceof pb.e) {
                        pb.e eVar = (pb.e) obj;
                        int i14 = 0;
                        boolean z3 = j9 > 0;
                        int i15 = eVar.f31581q;
                        if (lVar != null) {
                            z3 &= lVar.f31645c;
                            i4 = lVar.f31646d;
                            int i16 = lVar.f31647e;
                            int i17 = lVar.f31643a;
                            if (eVar.f31586v == null || eVar.c()) {
                                i10 = i17;
                                i11 = i16;
                            } else {
                                pb.f fVarA = a(nVar, eVar, this.f9124b);
                                if (fVarA == null) {
                                    return;
                                }
                                boolean z10 = fVarA.f31591c && j9 > 0;
                                i10 = i17;
                                i11 = fVarA.f31593e;
                                z3 = z10;
                            }
                        } else {
                            i4 = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i18 = i4;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else if (task.isCanceled()) {
                            i14 = -1;
                            i13 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ob.d) {
                                Status status = ((ob.d) exception).f30482a;
                                i12 = status.f9060a;
                                nb.b bVar = status.f9063d;
                                if (bVar != null) {
                                    i13 = i12;
                                    i14 = bVar.f29885b;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i14 = -1;
                        }
                        if (z3) {
                            long j10 = this.f9127e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j10);
                            j8 = jCurrentTimeMillis;
                            j = j9;
                        } else {
                            j = 0;
                            j8 = 0;
                        }
                        u uVar = new u(new pb.j(this.f9124b, i13, i14, j, j8, null, null, i15, iElapsedRealtime), i10, i18, i11);
                        ac.k kVar = dVar.f9092m;
                        kVar.sendMessage(kVar.obtainMessage(18, uVar));
                    }
                }
            }
        }
    }
}
