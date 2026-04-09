package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import r3.C7564b;
import s3.AbstractC7888c;
import s3.C7890e;
import s3.C7899n;
import s3.C7902q;

/* loaded from: classes.dex */
final class I implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    private final C4276e f34761a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34762b;

    /* renamed from: c, reason: collision with root package name */
    private final C4273b f34763c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34764d;

    /* renamed from: e, reason: collision with root package name */
    private final long f34765e;

    I(C4276e c4276e, int i10, C4273b c4273b, long j10, long j11, String str, String str2) {
        this.f34761a = c4276e;
        this.f34762b = i10;
        this.f34763c = c4273b;
        this.f34764d = j10;
        this.f34765e = j11;
    }

    static I a(C4276e c4276e, int i10, C4273b c4273b) {
        boolean zG;
        if (!c4276e.d()) {
            return null;
        }
        s3.r rVarA = C7902q.b().a();
        if (rVarA == null) {
            zG = true;
        } else {
            if (!rVarA.f()) {
                return null;
            }
            zG = rVarA.g();
            C4296z c4296zS = c4276e.s(c4273b);
            if (c4296zS != null) {
                if (!(c4296zS.v() instanceof AbstractC7888c)) {
                    return null;
                }
                AbstractC7888c abstractC7888c = (AbstractC7888c) c4296zS.v();
                if (abstractC7888c.H() && !abstractC7888c.c()) {
                    C7890e c7890eB = b(c4296zS, abstractC7888c, i10);
                    if (c7890eB == null) {
                        return null;
                    }
                    c4296zS.G();
                    zG = c7890eB.i();
                }
            }
        }
        return new I(c4276e, i10, c4273b, zG ? System.currentTimeMillis() : 0L, zG ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C7890e b(C4296z c4296z, AbstractC7888c abstractC7888c, int i10) {
        int[] iArrE;
        int[] iArrF;
        C7890e c7890eF = abstractC7888c.F();
        if (c7890eF == null || !c7890eF.g() || ((iArrE = c7890eF.e()) != null ? !com.google.android.gms.common.util.b.a(iArrE, i10) : !((iArrF = c7890eF.f()) == null || !com.google.android.gms.common.util.b.a(iArrF, i10))) || c4296z.t() >= c7890eF.b()) {
            return null;
        }
        return c7890eF;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C4296z c4296zS;
        int i10;
        int i11;
        int i12;
        int iB;
        long j10;
        long j11;
        int iElapsedRealtime;
        if (this.f34761a.d()) {
            s3.r rVarA = C7902q.b().a();
            if ((rVarA == null || rVarA.f()) && (c4296zS = this.f34761a.s(this.f34763c)) != null && (c4296zS.v() instanceof AbstractC7888c)) {
                AbstractC7888c abstractC7888c = (AbstractC7888c) c4296zS.v();
                int i13 = 0;
                boolean zG = this.f34764d > 0;
                int iX = abstractC7888c.x();
                int iE = 100;
                if (rVarA != null) {
                    zG &= rVarA.g();
                    int iB2 = rVarA.b();
                    int iE2 = rVarA.e();
                    i10 = rVarA.i();
                    if (abstractC7888c.H() && !abstractC7888c.c()) {
                        C7890e c7890eB = b(c4296zS, abstractC7888c, this.f34762b);
                        if (c7890eB == null) {
                            return;
                        }
                        boolean z10 = c7890eB.i() && this.f34764d > 0;
                        iE2 = c7890eB.b();
                        zG = z10;
                    }
                    i12 = iB2;
                    i11 = iE2;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                C4276e c4276e = this.f34761a;
                if (task.isSuccessful()) {
                    iB = 0;
                } else if (task.isCanceled()) {
                    i13 = iE;
                    iB = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        iE = status.e();
                        C7564b c7564bB = status.b();
                        if (c7564bB != null) {
                            iB = c7564bB.b();
                            i13 = iE;
                        }
                        i13 = iE;
                        iB = -1;
                    } else {
                        i13 = 101;
                        iB = -1;
                    }
                }
                if (zG) {
                    long j12 = this.f34764d;
                    long j13 = this.f34765e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                    iElapsedRealtime = -1;
                }
                c4276e.A(new C7899n(this.f34762b, i13, iB, j10, j11, null, null, iX, iElapsedRealtime), i10, i12, i11);
            }
        }
    }
}
