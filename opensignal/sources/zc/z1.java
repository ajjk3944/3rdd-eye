package zc;

import android.app.job.JobParameters;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27283a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27284d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27285g;

    public /* synthetic */ z1(Object obj, int i10, Object obj2) {
        this.f27283a = i10;
        this.f27285g = obj2;
        this.f27284d = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.z1.run():void");
    }

    public /* synthetic */ z1(z7.b bVar, JobParameters jobParameters) {
        this.f27283a = 10;
        this.f27285g = bVar;
        this.f27284d = jobParameters;
    }

    public z1(z7.b bVar, p3 p3Var, Runnable runnable) {
        this.f27283a = 9;
        this.f27285g = p3Var;
        this.f27284d = runnable;
    }

    public z1(d2 d2Var, com.google.android.gms.internal.measurement.m0 m0Var) {
        this.f27283a = 0;
        this.f27285g = m0Var;
        Objects.requireNonNull(d2Var);
        this.f27284d = d2Var;
    }

    public z1(x2 x2Var, l2 l2Var) {
        this.f27283a = 6;
        this.f27285g = l2Var;
        Objects.requireNonNull(x2Var);
        this.f27284d = x2Var;
    }
}
