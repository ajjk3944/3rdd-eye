package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class pg2 implements Runnable {
    public final /* synthetic */ qg2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ pg2(qg2 qg2Var, int i, int i2, boolean z, boolean z2) {
        this.f = qg2Var;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ?? r10;
        ?? r2;
        wy2 wy2Var;
        wy2 wy2Var2;
        wy2 wy2Var3;
        qg2 qg2Var = this.f;
        int i2 = this.g;
        int i3 = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        synchronized (qg2Var.g) {
            try {
                boolean z3 = qg2Var.l;
                if (z3 || i3 != 1) {
                    i = i3;
                    r10 = false;
                } else {
                    i3 = 1;
                    i = 1;
                    r10 = true;
                }
                ?? r1 = i2 != i3;
                if (r1 == true && i == 1) {
                    r2 = true;
                    i = 1;
                } else {
                    r2 = false;
                }
                ?? r12 = r1 == true && i == 2;
                ?? r13 = r1 == true && i == 3;
                qg2Var.l = z3 || r10 == true;
                if (r10 != false) {
                    try {
                        wy2 wy2Var4 = qg2Var.k;
                        if (wy2Var4 != null) {
                            wy2Var4.b();
                        }
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                    }
                }
                if (r2 != false && (wy2Var3 = qg2Var.k) != null) {
                    wy2Var3.M0(wy2Var3.U(), 2);
                }
                if (r12 != false && (wy2Var2 = qg2Var.k) != null) {
                    wy2Var2.e();
                }
                if (r13 != false) {
                    wy2 wy2Var5 = qg2Var.k;
                    if (wy2Var5 != null) {
                        wy2Var5.f();
                    }
                    qg2Var.f.b0();
                }
                if (z != z2 && (wy2Var = qg2Var.k) != null) {
                    Parcel parcelU = wy2Var.U();
                    ClassLoader classLoader = iv1.a;
                    parcelU.writeInt(z2 ? 1 : 0);
                    wy2Var.M0(parcelU, 5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
